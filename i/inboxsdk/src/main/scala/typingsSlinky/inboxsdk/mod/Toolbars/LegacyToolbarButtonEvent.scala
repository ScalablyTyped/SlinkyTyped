package typingsSlinky.inboxsdk.mod.Toolbars

import typingsSlinky.inboxsdk.mod.Common.DropdownView
import typingsSlinky.inboxsdk.mod.Conversations.ThreadView
import typingsSlinky.inboxsdk.mod.Lists.ThreadRowView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegacyToolbarButtonEvent extends js.Object {
  var dropdown: js.UndefOr[DropdownView] = js.native
  var selectedThreadRowViews: js.Array[ThreadRowView] = js.native
  var threadRowViews: js.Array[ThreadRowView] = js.native
  var threadView: ThreadView = js.native
}

object LegacyToolbarButtonEvent {
  @scala.inline
  def apply(
    selectedThreadRowViews: js.Array[ThreadRowView],
    threadRowViews: js.Array[ThreadRowView],
    threadView: ThreadView
  ): LegacyToolbarButtonEvent = {
    val __obj = js.Dynamic.literal(selectedThreadRowViews = selectedThreadRowViews.asInstanceOf[js.Any], threadRowViews = threadRowViews.asInstanceOf[js.Any], threadView = threadView.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegacyToolbarButtonEvent]
  }
  @scala.inline
  implicit class LegacyToolbarButtonEventOps[Self <: LegacyToolbarButtonEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSelectedThreadRowViews(value: js.Array[ThreadRowView]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedThreadRowViews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThreadRowViews(value: js.Array[ThreadRowView]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threadRowViews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThreadView(value: ThreadView): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threadView")(value.asInstanceOf[js.Any])
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

