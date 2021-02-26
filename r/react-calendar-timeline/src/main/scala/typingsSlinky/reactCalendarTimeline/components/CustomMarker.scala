package typingsSlinky.reactCalendarTimeline.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactCalendarTimeline.mod.CustomMarkerChildrenProps
import typingsSlinky.reactCalendarTimeline.mod.MarkerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CustomMarker {
  
  @scala.inline
  def apply(date: js.Date | Double): Builder = {
    val __props = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MarkerProps]))
  }
  
  @JSImport("react-calendar-timeline", "CustomMarker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactCalendarTimeline.mod.CustomMarker] {
    
    @scala.inline
    def children(value: /* props */ CustomMarkerChildrenProps => ReactElement): this.type = set("children", js.Any.fromFunction1(value))
  }
  
  def withProps(p: MarkerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
