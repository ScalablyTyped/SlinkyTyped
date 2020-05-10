package typingsSlinky.inboxsdk.mod.NavMenu

import typingsSlinky.inboxsdk.mod.Common.DropdownView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropdownButtonClickEvent extends js.Object {
  var dropdown: DropdownView = js.native
}

object DropdownButtonClickEvent {
  @scala.inline
  def apply(dropdown: DropdownView): DropdownButtonClickEvent = {
    val __obj = js.Dynamic.literal(dropdown = dropdown.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownButtonClickEvent]
  }
  @scala.inline
  implicit class DropdownButtonClickEventOps[Self <: DropdownButtonClickEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDropdown(value: DropdownView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdown")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

