package typingsSlinky.androiduix.android.widget.AdapterView

import typingsSlinky.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnItemLongClickListener extends js.Object {
  def onItemLongClick(
    parent: typingsSlinky.androiduix.android.widget.AdapterView[_],
    view: View,
    position: Double,
    id: Double
  ): Boolean = js.native
}

object OnItemLongClickListener {
  @scala.inline
  def apply(
    onItemLongClick: (typingsSlinky.androiduix.android.widget.AdapterView[_], View, Double, Double) => Boolean
  ): OnItemLongClickListener = {
    val __obj = js.Dynamic.literal(onItemLongClick = js.Any.fromFunction4(onItemLongClick))
    __obj.asInstanceOf[OnItemLongClickListener]
  }
  @scala.inline
  implicit class OnItemLongClickListenerOps[Self <: OnItemLongClickListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnItemLongClick(value: (typingsSlinky.androiduix.android.widget.AdapterView[_], View, Double, Double) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onItemLongClick")(js.Any.fromFunction4(value))
        ret
    }
  }
  
}

