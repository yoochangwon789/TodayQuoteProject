package com.yoochangwonspro.todayquoteproject

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class QuotePagerAdapter(
    val quote: List<Quote>
): RecyclerView.Adapter<QuotePagerAdapter.QuoteViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuoteViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: QuoteViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    class QuoteViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    }
}