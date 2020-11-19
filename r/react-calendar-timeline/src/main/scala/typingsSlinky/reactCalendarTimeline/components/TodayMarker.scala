package typingsSlinky.reactCalendarTimeline.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactCalendarTimeline.mod.CustomMarkerChildrenProps
import typingsSlinky.reactCalendarTimeline.mod.TodayMarkerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TodayMarker {
  
  @JSImport("react-calendar-timeline", "TodayMarker")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactCalendarTimeline.mod.TodayMarker] {
    
    @scala.inline
    def children(value: /* props */ CustomMarkerChildrenProps => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def interval(value: Double): this.type = set("interval", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TodayMarkerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(date: js.Date | Double): Builder = {
    val __props = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TodayMarkerProps]))
  }
}
