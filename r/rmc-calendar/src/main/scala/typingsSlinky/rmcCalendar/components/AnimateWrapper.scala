package typingsSlinky.rmcCalendar.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.rmcCalendar.animateWrapperMod.PropsType
import typingsSlinky.rmcCalendar.animateWrapperMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AnimateWrapper {
  
  @JSImport("rmc-calendar/lib/calendar/AnimateWrapper", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def displayType(value: String): this.type = set("displayType", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PropsType): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(visible: Boolean): Builder = {
    val __props = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PropsType]))
  }
}
