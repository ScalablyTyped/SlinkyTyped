package typingsSlinky.reactCalendarTimeline

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Id = scala.Double | java.lang.String
  
  type ReactCalendarTimeline[CustomItem /* <: typingsSlinky.reactCalendarTimeline.mod.TimelineItemBase[_] */, CustomGroup /* <: typingsSlinky.reactCalendarTimeline.mod.TimelineGroupBase */] = slinky.core.ReactComponentClass[
    typingsSlinky.reactCalendarTimeline.mod.ReactCalendarTimelineProps[CustomItem, CustomGroup]
  ]
  
  type TimelineGroup[CustomGroupFields] = typingsSlinky.reactCalendarTimeline.mod.TimelineGroupBase with CustomGroupFields
  
  type TimelineHeaderProps = typingsSlinky.reactCalendarTimeline.mod.TimelineHeadersProps
  
  type TimelineItem[CustomItemFields, DateType] = typingsSlinky.reactCalendarTimeline.mod.TimelineItemBase[DateType] with CustomItemFields
  
  @scala.inline
  def defaultHeaderFormats: typingsSlinky.reactCalendarTimeline.mod.LabelFormat = typingsSlinky.reactCalendarTimeline.mod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultHeaderFormats").asInstanceOf[typingsSlinky.reactCalendarTimeline.mod.LabelFormat]
  
  @scala.inline
  def defaultKeys: typingsSlinky.reactCalendarTimeline.mod.TimelineKeys = typingsSlinky.reactCalendarTimeline.mod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultKeys").asInstanceOf[typingsSlinky.reactCalendarTimeline.mod.TimelineKeys]
  
  @scala.inline
  def defaultTimeSteps: typingsSlinky.reactCalendarTimeline.mod.TimelineTimeSteps = typingsSlinky.reactCalendarTimeline.mod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultTimeSteps").asInstanceOf[typingsSlinky.reactCalendarTimeline.mod.TimelineTimeSteps]
}
