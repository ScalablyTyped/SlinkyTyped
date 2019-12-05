package typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineMod

import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.TagMod
import typingsSlinky.react.reactMod.CSSProperties
import typingsSlinky.react.reactMod.HTMLAttributes
import typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineStrings.both
import typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineStrings.left
import typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineItemBase[DateType] extends js.Object {
  var canChangeGroup: js.UndefOr[Boolean] = js.undefined
  var canMove: js.UndefOr[Boolean] = js.undefined
  var canResize: js.UndefOr[Boolean | left | right | both] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var end_time: DateType
  var group: Double
  var id: Double
  var itemProps: js.UndefOr[HTMLAttributes[HTMLDivElement]] = js.undefined
  var start_time: DateType
  var style: js.UndefOr[CSSProperties] = js.undefined
  var title: js.UndefOr[TagMod[Any]] = js.undefined
}

object TimelineItemBase {
  @scala.inline
  def apply[DateType](
    end_time: DateType,
    group: Double,
    id: Double,
    start_time: DateType,
    canChangeGroup: js.UndefOr[Boolean] = js.undefined,
    canMove: js.UndefOr[Boolean] = js.undefined,
    canResize: Boolean | left | right | both = null,
    className: String = null,
    itemProps: HTMLAttributes[HTMLDivElement] = null,
    style: CSSProperties = null,
    title: TagMod[Any] = null
  ): TimelineItemBase[DateType] = {
    val __obj = js.Dynamic.literal(end_time = end_time.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], start_time = start_time.asInstanceOf[js.Any])
    if (!js.isUndefined(canChangeGroup)) __obj.updateDynamic("canChangeGroup")(canChangeGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(canMove)) __obj.updateDynamic("canMove")(canMove.asInstanceOf[js.Any])
    if (canResize != null) __obj.updateDynamic("canResize")(canResize.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (itemProps != null) __obj.updateDynamic("itemProps")(itemProps.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimelineItemBase[DateType]]
  }
}

