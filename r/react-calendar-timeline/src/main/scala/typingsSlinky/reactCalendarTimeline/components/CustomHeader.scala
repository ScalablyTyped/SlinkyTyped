package typingsSlinky.reactCalendarTimeline.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactCalendarTimeline.mod.CustomHeaderProps
import typingsSlinky.reactCalendarTimeline.mod.Unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object CustomHeader {
  @JSImport("react-calendar-timeline", "CustomHeader")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder[Data] (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactCalendarTimeline.mod.CustomHeader[js.Any]] {
    @scala.inline
    def headerData(value: Data): this.type = set("headerData", value.asInstanceOf[js.Any])
    @scala.inline
    def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def unit(value: Unit): this.type = set("unit", value.asInstanceOf[js.Any])
  }
  
  def withProps[Data](p: CustomHeaderProps[Data]): Builder[Data] = new Builder[Data](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[Data](): Builder[Data] = {
    val __props = js.Dynamic.literal()
    new Builder[Data](js.Array(this.component, __props.asInstanceOf[CustomHeaderProps[Data]]))
  }
  implicit def make[Data](companion: CustomHeader.type): Builder[Data] = new Builder[Data](js.Array(this.component, js.Dictionary.empty))()
}

