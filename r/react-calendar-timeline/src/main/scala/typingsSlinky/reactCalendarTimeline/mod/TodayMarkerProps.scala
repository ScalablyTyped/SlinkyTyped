package typingsSlinky.reactCalendarTimeline.mod

import slinky.core.TagMod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TodayMarkerProps extends MarkerProps {
  var interval: js.UndefOr[Double] = js.undefined
}

object TodayMarkerProps {
  @scala.inline
  def apply(
    date: js.Date | Double,
    children: /* props */ CustomMarkerChildrenProps => TagMod[Any] = null,
    interval: js.UndefOr[Double] = js.undefined
  ): TodayMarkerProps = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(js.Any.fromFunction1(children))
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TodayMarkerProps]
  }
}

