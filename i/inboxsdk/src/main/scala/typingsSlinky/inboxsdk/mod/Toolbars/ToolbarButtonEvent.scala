package typingsSlinky.inboxsdk.mod.Toolbars

import typingsSlinky.inboxsdk.mod.Common.DropdownView
import typingsSlinky.inboxsdk.mod.Conversations.ThreadView
import typingsSlinky.inboxsdk.mod.Lists.ThreadRowView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToolbarButtonEvent extends js.Object {
  var dropdown: js.UndefOr[DropdownView] = js.native
  var position: ToolbarButtonPosition = js.native
  var selectedThreadRowViews: js.Array[ThreadRowView] = js.native
  var selectedThreadViews: js.Array[ThreadView] = js.native
}

object ToolbarButtonEvent {
  @scala.inline
  def apply(
    position: ToolbarButtonPosition,
    selectedThreadRowViews: js.Array[ThreadRowView],
    selectedThreadViews: js.Array[ThreadView]
  ): ToolbarButtonEvent = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], selectedThreadRowViews = selectedThreadRowViews.asInstanceOf[js.Any], selectedThreadViews = selectedThreadViews.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToolbarButtonEvent]
  }
  @scala.inline
  implicit class ToolbarButtonEventOps[Self <: ToolbarButtonEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPosition(value: ToolbarButtonPosition): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("position")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedThreadRowViews(value: js.Array[ThreadRowView]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedThreadRowViews")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectedThreadViews(value: js.Array[ThreadView]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedThreadViews")(value.asInstanceOf[js.Any])
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

