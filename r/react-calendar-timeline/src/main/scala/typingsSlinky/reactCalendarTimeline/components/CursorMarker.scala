package typingsSlinky.reactCalendarTimeline.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactCalendarTimeline.mod.CursorMarkerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CursorMarker {
  @JSImport("react-calendar-timeline", "CursorMarker")
  @js.native
  object component extends js.Object
  
  def withProps(p: CursorMarkerProps): Default[tag.type, typingsSlinky.reactCalendarTimeline.mod.CursorMarker] = new Default[tag.type, typingsSlinky.reactCalendarTimeline.mod.CursorMarker](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: CursorMarker.type): Default[tag.type, typingsSlinky.reactCalendarTimeline.mod.CursorMarker] = new Default[tag.type, typingsSlinky.reactCalendarTimeline.mod.CursorMarker](js.Array(this.component, js.Dictionary.empty))()
}

