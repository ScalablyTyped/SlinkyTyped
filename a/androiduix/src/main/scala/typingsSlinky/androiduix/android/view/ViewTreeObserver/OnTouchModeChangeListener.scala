package typingsSlinky.androiduix.android.view.ViewTreeObserver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnTouchModeChangeListener extends js.Object {
  def onTouchModeChanged(isInTouchMode: Boolean): js.Any = js.native
}

object OnTouchModeChangeListener {
  @scala.inline
  def apply(onTouchModeChanged: Boolean => js.Any): OnTouchModeChangeListener = {
    val __obj = js.Dynamic.literal(onTouchModeChanged = js.Any.fromFunction1(onTouchModeChanged))
    __obj.asInstanceOf[OnTouchModeChangeListener]
  }
  @scala.inline
  implicit class OnTouchModeChangeListenerOps[Self <: OnTouchModeChangeListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnTouchModeChanged(value: Boolean => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onTouchModeChanged")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

