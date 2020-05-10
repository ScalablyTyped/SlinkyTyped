package typingsSlinky.reactCalendarTimeline.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactCalendarTimeline.mod.SidebarHeaderProps
import typingsSlinky.reactCalendarTimeline.reactCalendarTimelineStrings.left
import typingsSlinky.reactCalendarTimeline.reactCalendarTimelineStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object SidebarHeader {
  @JSImport("react-calendar-timeline", "SidebarHeader")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[Data] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactCalendarTimeline.mod.SidebarHeader[js.Any]] {
    @scala.inline
    def headerData(value: Data): this.type = set("headerData", value.asInstanceOf[js.Any])
    @scala.inline
    def variant(value: left | right): this.type = set("variant", value.asInstanceOf[js.Any])
  }
  
  def withProps[Data](p: SidebarHeaderProps[Data]): Builder[Data] = new Builder[Data](js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make[Data](companion: SidebarHeader.type): Builder[Data] = new Builder[Data](js.Array(this.component, js.Dictionary.empty))()
}

