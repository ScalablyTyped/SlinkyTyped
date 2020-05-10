package typingsSlinky.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PopupWindowPinnedChangedEventArgs extends PopupWindowEventArgs {
  val pinned: Boolean = js.native
}

object PopupWindowPinnedChangedEventArgs {
  @scala.inline
  def apply(pinned: Boolean, sender: Control, window: BootstrapPopupWindow): PopupWindowPinnedChangedEventArgs = {
    val __obj = js.Dynamic.literal(pinned = pinned.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], window = window.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupWindowPinnedChangedEventArgs]
  }
  @scala.inline
  implicit class PopupWindowPinnedChangedEventArgsOps[Self <: PopupWindowPinnedChangedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPinned(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pinned")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

