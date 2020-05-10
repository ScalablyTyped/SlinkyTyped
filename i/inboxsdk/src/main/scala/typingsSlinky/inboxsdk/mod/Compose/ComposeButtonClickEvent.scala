package typingsSlinky.inboxsdk.mod.Compose

import typingsSlinky.inboxsdk.mod.Common.DropdownView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComposeButtonClickEvent extends js.Object {
  var composeView: ComposeView = js.native
  var dropdown: DropdownView = js.native
}

object ComposeButtonClickEvent {
  @scala.inline
  def apply(composeView: ComposeView, dropdown: DropdownView): ComposeButtonClickEvent = {
    val __obj = js.Dynamic.literal(composeView = composeView.asInstanceOf[js.Any], dropdown = dropdown.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposeButtonClickEvent]
  }
  @scala.inline
  implicit class ComposeButtonClickEventOps[Self <: ComposeButtonClickEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComposeView(value: ComposeView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("composeView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropdown(value: DropdownView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdown")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

