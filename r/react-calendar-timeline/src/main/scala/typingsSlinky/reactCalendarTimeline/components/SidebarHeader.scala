package typingsSlinky.reactCalendarTimeline.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactCalendarTimeline.mod.SidebarHeaderChildrenFnProps
import typingsSlinky.reactCalendarTimeline.mod.SidebarHeaderProps
import typingsSlinky.reactCalendarTimeline.reactCalendarTimelineStrings.left
import typingsSlinky.reactCalendarTimeline.reactCalendarTimelineStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SidebarHeader {
  
  @scala.inline
  def apply[Data](children: SidebarHeaderChildrenFnProps[Data] => ReactElement): Builder[Data] = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    new Builder[Data](js.Array(this.component, __props.asInstanceOf[SidebarHeaderProps[Data]]))
  }
  
  @JSImport("react-calendar-timeline", "SidebarHeader")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder[Data] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactCalendarTimeline.mod.SidebarHeader[Data]] {
    
    @scala.inline
    def headerData(value: Data): this.type = set("headerData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def variant(value: left | right): this.type = set("variant", value.asInstanceOf[js.Any])
  }
  
  def withProps[Data](p: SidebarHeaderProps[Data]): Builder[Data] = new Builder[Data](js.Array(this.component, p.asInstanceOf[js.Any]))
}
