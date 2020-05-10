package typingsSlinky.reactCalendarTimeline.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.reactCalendarTimeline.mod.MarkerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CustomMarker {
  @JSImport("react-calendar-timeline", "CustomMarker")
  @js.native
  object component extends js.Object
  
  def withProps(p: MarkerProps): Default[tag.type, typingsSlinky.reactCalendarTimeline.mod.CustomMarker] = new Default[tag.type, typingsSlinky.reactCalendarTimeline.mod.CustomMarker](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(date: js.Date | Double): Default[tag.type, typingsSlinky.reactCalendarTimeline.mod.CustomMarker] = {
    val __props = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.reactCalendarTimeline.mod.CustomMarker](js.Array(this.component, __props.asInstanceOf[MarkerProps]))
  }
}

