package typingsSlinky.reactNativeModalPopover.popoverControllerMod

import typingsSlinky.reactNativeModalPopover.popoverGeometryMod.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait State extends js.Object {
  var popoverAnchor: Rect = js.native
  var showPopover: Boolean = js.native
}

object State {
  @scala.inline
  def apply(popoverAnchor: Rect, showPopover: Boolean): State = {
    val __obj = js.Dynamic.literal(popoverAnchor = popoverAnchor.asInstanceOf[js.Any], showPopover = showPopover.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  @scala.inline
  implicit class StateOps[Self <: State] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPopoverAnchor(value: Rect): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popoverAnchor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowPopover(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPopover")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

