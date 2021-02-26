package typingsSlinky.reactCalendarTimeline.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactCalendarTimeline.mod.CustomHeaderProps
import typingsSlinky.reactCalendarTimeline.mod.CustomHeaderPropsChildrenFnProps
import typingsSlinky.reactCalendarTimeline.mod.Unit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CustomHeader {
  
  @scala.inline
  def apply[Data](children: js.UndefOr[CustomHeaderPropsChildrenFnProps[Data]] => ReactElement): Builder[Data] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Builder[Data](js.Array(this.component, __props.asInstanceOf[CustomHeaderProps[Data]]))
  }
  
  @JSImport("react-calendar-timeline", "CustomHeader")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[Data] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactCalendarTimeline.mod.CustomHeader[Data]] {
    
    @scala.inline
    def headerData(value: Data): this.type = set("headerData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def unit(value: Unit): this.type = set("unit", value.asInstanceOf[js.Any])
  }
  
  def withProps[Data](p: CustomHeaderProps[Data]): Builder[Data] = new Builder[Data](js.Array(this.component, p.asInstanceOf[js.Any]))
}
