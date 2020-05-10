package typingsSlinky.baseui.toastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToastPrivateState extends js.Object {
  var isRendered: Boolean = js.native
  var isVisible: Boolean = js.native
}

object ToastPrivateState {
  @scala.inline
  def apply(isRendered: Boolean, isVisible: Boolean): ToastPrivateState = {
    val __obj = js.Dynamic.literal(isRendered = isRendered.asInstanceOf[js.Any], isVisible = isVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastPrivateState]
  }
  @scala.inline
  implicit class ToastPrivateStateOps[Self <: ToastPrivateState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIsRendered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRendered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsVisible(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isVisible")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

