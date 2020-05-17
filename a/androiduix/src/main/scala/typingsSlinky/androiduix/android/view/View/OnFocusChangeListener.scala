package typingsSlinky.androiduix.android.view.View

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnFocusChangeListener extends js.Object {
  def onFocusChange(v: typingsSlinky.androiduix.android.view.View, hasFocus: Boolean): Unit = js.native
}

object OnFocusChangeListener {
  @scala.inline
  def apply(onFocusChange: (typingsSlinky.androiduix.android.view.View, Boolean) => Unit): OnFocusChangeListener = {
    val __obj = js.Dynamic.literal(onFocusChange = js.Any.fromFunction2(onFocusChange))
    __obj.asInstanceOf[OnFocusChangeListener]
  }
  @scala.inline
  implicit class OnFocusChangeListenerOps[Self <: OnFocusChangeListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnFocusChange(value: (typingsSlinky.androiduix.android.view.View, Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onFocusChange")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

