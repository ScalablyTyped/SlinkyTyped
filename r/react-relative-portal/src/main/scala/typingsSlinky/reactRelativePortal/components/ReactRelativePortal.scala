package typingsSlinky.reactRelativePortal.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactRelativePortal.mod.Props
import typingsSlinky.reactRelativePortal.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactRelativePortal {
  
  @JSImport("react-relative-portal", JSImport.Namespace)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, ^] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def fullWidth(value: Boolean): this.type = set("fullWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def left(value: Double): this.type = set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onOutClick(value: () => Unit): this.type = set("onOutClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def right(value: Double): this.type = set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def top(value: Double): this.type = set("top", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(component: String): Builder = {
    val __props = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[Props]))
  }
}
