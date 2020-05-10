package typingsSlinky.reactCalendarTimeline.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Omit<react-calendar-timeline.react-calendar-timeline.MarkerProps, 'date'> */
@js.native
trait CursorMarkerProps extends js.Object {
  var children: js.UndefOr[js.Function1[/* props */ CustomMarkerChildrenProps, TagMod[Any]]] = js.native
}

object CursorMarkerProps {
  @scala.inline
  def apply(): CursorMarkerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CursorMarkerProps]
  }
  @scala.inline
  implicit class CursorMarkerPropsOps[Self <: CursorMarkerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChildren(value: /* props */ CustomMarkerChildrenProps => TagMod[Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("children")(js.undefined)
        ret
    }
  }
  
}

