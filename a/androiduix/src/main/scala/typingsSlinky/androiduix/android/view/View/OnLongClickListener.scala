package typingsSlinky.androiduix.android.view.View

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnLongClickListener extends js.Object {
  def onLongClick(v: typingsSlinky.androiduix.android.view.View): Boolean = js.native
}

object OnLongClickListener {
  @scala.inline
  def apply(onLongClick: typingsSlinky.androiduix.android.view.View => Boolean): OnLongClickListener = {
    val __obj = js.Dynamic.literal(onLongClick = js.Any.fromFunction1(onLongClick))
    __obj.asInstanceOf[OnLongClickListener]
  }
  @scala.inline
  implicit class OnLongClickListenerOps[Self <: OnLongClickListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnLongClick(value: typingsSlinky.androiduix.android.view.View => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onLongClick")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

