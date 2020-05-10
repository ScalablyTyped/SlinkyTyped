package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopupWindowResizeEventArgs extends PopupWindowEventArgs {
  val resizeState: Double = js.native
}

object PopupWindowResizeEventArgs {
  @scala.inline
  def apply(resizeState: Double, sender: Control, window: BootstrapPopupWindow): PopupWindowResizeEventArgs = {
    val __obj = js.Dynamic.literal(resizeState = resizeState.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupWindowResizeEventArgs]
  }
  @scala.inline
  implicit class PopupWindowResizeEventArgsOps[Self <: PopupWindowResizeEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResizeState(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resizeState")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

