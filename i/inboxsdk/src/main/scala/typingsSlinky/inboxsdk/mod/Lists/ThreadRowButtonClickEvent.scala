package typingsSlinky.inboxsdk.mod.Lists

import typingsSlinky.inboxsdk.mod.Common.DropdownView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThreadRowButtonClickEvent extends js.Object {
  var dropdown: js.UndefOr[DropdownView] = js.native
  var threadRowView: ThreadRowView = js.native
}

object ThreadRowButtonClickEvent {
  @scala.inline
  def apply(threadRowView: ThreadRowView): ThreadRowButtonClickEvent = {
    val __obj = js.Dynamic.literal(threadRowView = threadRowView.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreadRowButtonClickEvent]
  }
  @scala.inline
  implicit class ThreadRowButtonClickEventOps[Self <: ThreadRowButtonClickEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withThreadRowView(value: ThreadRowView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threadRowView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDropdown(value: DropdownView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropdown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropdown")(js.undefined)
        ret
    }
  }
  
}

