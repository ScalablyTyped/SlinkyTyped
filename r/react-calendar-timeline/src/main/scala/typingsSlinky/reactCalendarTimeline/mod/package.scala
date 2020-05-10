package typingsSlinky.reactCalendarTimeline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Id = scala.Double | java.lang.String
  type ReactCalendarTimeline[CustomItem /* <: typingsSlinky.reactCalendarTimeline.mod.TimelineItemBase[_] */, CustomGroup /* <: typingsSlinky.reactCalendarTimeline.mod.TimelineGroupBase */] = slinky.core.ReactComponentClass[
    typingsSlinky.reactCalendarTimeline.mod.ReactCalendarTimelineProps[CustomItem, CustomGroup]
  ]
  type TimelineGroup[CustomGroupFields] = typingsSlinky.reactCalendarTimeline.mod.TimelineGroupBase with CustomGroupFields
  type TimelineHeaderProps = typingsSlinky.reactCalendarTimeline.mod.TimelineHeadersProps
  type TimelineItem[CustomItemFields, DateType] = typingsSlinky.reactCalendarTimeline.mod.TimelineItemBase[DateType] with CustomItemFields
}
