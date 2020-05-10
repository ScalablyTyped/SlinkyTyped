package typingsSlinky.reactCalendarTimeline.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactCalendarGroupRendererProps[CustomGroup /* <: TimelineGroupBase */] extends js.Object {
  var group: CustomGroup = js.native
  var isRightSidebar: js.UndefOr[Boolean] = js.native
}

object ReactCalendarGroupRendererProps {
  @scala.inline
  def apply[CustomGroup](group: CustomGroup): ReactCalendarGroupRendererProps[CustomGroup] = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactCalendarGroupRendererProps[CustomGroup]]
  }
  @scala.inline
  implicit class ReactCalendarGroupRendererPropsOps[Self[customgroup] <: ReactCalendarGroupRendererProps[customgroup], CustomGroup] (val x: Self[CustomGroup]) extends AnyVal {
    @scala.inline
    def duplicate: Self[CustomGroup] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[CustomGroup]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[CustomGroup] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[CustomGroup] with Other]
    @scala.inline
    def withGroup(value: CustomGroup): Self[CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsRightSidebar(value: Boolean): Self[CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRightSidebar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsRightSidebar: Self[CustomGroup] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isRightSidebar")(js.undefined)
        ret
    }
  }
  
}

