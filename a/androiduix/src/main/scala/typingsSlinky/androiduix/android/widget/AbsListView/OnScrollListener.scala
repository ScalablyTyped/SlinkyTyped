package typingsSlinky.androiduix.android.widget.AbsListView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnScrollListener extends js.Object {
  
  def onScroll(
    view: typingsSlinky.androiduix.android.widget.AbsListView,
    firstVisibleItem: Double,
    visibleItemCount: Double,
    totalItemCount: Double
  ): Unit = js.native
  
  def onScrollStateChanged(view: typingsSlinky.androiduix.android.widget.AbsListView, scrollState: Double): Unit = js.native
}
object OnScrollListener {
  
  @scala.inline
  def apply(
    onScroll: (typingsSlinky.androiduix.android.widget.AbsListView, Double, Double, Double) => Unit,
    onScrollStateChanged: (typingsSlinky.androiduix.android.widget.AbsListView, Double) => Unit
  ): OnScrollListener = {
    val __obj = js.Dynamic.literal(onScroll = js.Any.fromFunction4(onScroll), onScrollStateChanged = js.Any.fromFunction2(onScrollStateChanged))
    __obj.asInstanceOf[OnScrollListener]
  }
  
  @scala.inline
  implicit class OnScrollListenerOps[Self <: OnScrollListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnScroll(value: (typingsSlinky.androiduix.android.widget.AbsListView, Double, Double, Double) => Unit): Self = this.set("onScroll", js.Any.fromFunction4(value))
    
    @scala.inline
    def setOnScrollStateChanged(value: (typingsSlinky.androiduix.android.widget.AbsListView, Double) => Unit): Self = this.set("onScrollStateChanged", js.Any.fromFunction2(value))
  }
}
