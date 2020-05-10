package typingsSlinky.androiduix.android.widget.AbsListView

import typingsSlinky.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecyclerListener extends js.Object {
  def onMovedToScrapHeap(view: View): Unit = js.native
}

object RecyclerListener {
  @scala.inline
  def apply(onMovedToScrapHeap: View => Unit): RecyclerListener = {
    val __obj = js.Dynamic.literal(onMovedToScrapHeap = js.Any.fromFunction1(onMovedToScrapHeap))
    __obj.asInstanceOf[RecyclerListener]
  }
  @scala.inline
  implicit class RecyclerListenerOps[Self <: RecyclerListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnMovedToScrapHeap(value: View => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMovedToScrapHeap")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

