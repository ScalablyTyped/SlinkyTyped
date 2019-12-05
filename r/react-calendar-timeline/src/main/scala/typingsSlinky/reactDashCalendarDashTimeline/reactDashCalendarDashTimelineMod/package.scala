package typingsSlinky.reactDashCalendarDashTimeline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashCalendarDashTimelineMod {
  import slinky.core.ReactComponentClass
  import typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineStrings.date
  import typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineStrings.key
  import typingsSlinky.reactDashCalendarDashTimeline.reactDashCalendarDashTimelineStrings.ref
  import typingsSlinky.std.Omit
  import typingsSlinky.std.Partial

  type CursorMarkerProps = Omit[MarkerProps, date]
  type GetItemsProps = Partial[Omit[ItemRendererGetItemPropsReturnType, key | ref]]
  type ReactCalendarTimeline[CustomItem /* <: TimelineItemBase[_] */, CustomGroup /* <: TimelineGroupBase */] = ReactComponentClass[ReactCalendarTimelineProps[CustomItem, CustomGroup]]
  type TimelineGroup[CustomGroupFields] = TimelineGroupBase with CustomGroupFields
  type TimelineItem[CustomItemFields, DateType] = TimelineItemBase[DateType] with CustomItemFields
}
