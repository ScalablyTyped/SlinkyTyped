package typingsSlinky.reactCalendarTimeline.mod

import slinky.core.TagMod
import typingsSlinky.reactCalendarTimeline.reactCalendarTimelineStrings.left
import typingsSlinky.reactCalendarTimeline.reactCalendarTimelineStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SidebarHeaderProps[Data] extends js.Object {
  var headerData: js.UndefOr[Data] = js.native
  var variant: js.UndefOr[left | right] = js.native
  def children(props: SidebarHeaderChildrenFnProps[Data]): TagMod[Any] = js.native
}

object SidebarHeaderProps {
  @scala.inline
  def apply[Data](children: SidebarHeaderChildrenFnProps[Data] => TagMod[Any]): SidebarHeaderProps[Data] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[SidebarHeaderProps[Data]]
  }
  @scala.inline
  implicit class SidebarHeaderPropsOps[Self[data] <: SidebarHeaderProps[data], Data] (val x: Self[Data]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Data] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Data]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[Data] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[Data] with Other]
    @scala.inline
    def withChildren(value: SidebarHeaderChildrenFnProps[Data] => TagMod[Any]): Self[Data] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withHeaderData(value: Data): Self[Data] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeaderData: Self[Data] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headerData")(js.undefined)
        ret
    }
    @scala.inline
    def withVariant(value: left | right): Self[Data] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariant: Self[Data] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variant")(js.undefined)
        ret
    }
  }
  
}

