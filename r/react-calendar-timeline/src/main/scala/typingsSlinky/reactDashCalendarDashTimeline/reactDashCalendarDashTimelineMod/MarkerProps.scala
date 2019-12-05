package typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerProps extends js.Object {
  var children: js.UndefOr[js.Function1[/* props */ CustomMarkerChildrenProps, TagMod[Any]]] = js.undefined
  var date: js.Date | Double
}

object MarkerProps {
  @scala.inline
  def apply(date: js.Date | Double, children: /* props */ CustomMarkerChildrenProps => TagMod[Any] = null): MarkerProps = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    __obj.asInstanceOf[MarkerProps]
  }
}

