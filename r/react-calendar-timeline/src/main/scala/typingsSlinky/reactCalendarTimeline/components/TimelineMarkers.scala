package typingsSlinky.reactCalendarTimeline.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TimelineMarkers {
  
  @JSImport("react-calendar-timeline", "TimelineMarkers")
  @js.native
  object component extends js.Object
  
  def withProps(p: js.Object): Default[tag.type, typingsSlinky.reactCalendarTimeline.mod.TimelineMarkers] = new Default[tag.type, typingsSlinky.reactCalendarTimeline.mod.TimelineMarkers](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: TimelineMarkers.type): Default[tag.type, typingsSlinky.reactCalendarTimeline.mod.TimelineMarkers] = new Default[tag.type, typingsSlinky.reactCalendarTimeline.mod.TimelineMarkers](js.Array(this.component, js.Dictionary.empty))()
}
