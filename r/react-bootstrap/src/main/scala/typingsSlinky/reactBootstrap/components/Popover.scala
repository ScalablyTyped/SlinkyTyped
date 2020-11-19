package typingsSlinky.reactBootstrap.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactBootstrap.mod.Sizes
import typingsSlinky.reactBootstrap.popoverMod.PopoverProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Popover {
  
  @JSImport("react-bootstrap", "Popover")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactBootstrap.mod.Popover] {
    
    @scala.inline
    def arrowOffsetLeft(value: Double | String): this.type = set("arrowOffsetLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def arrowOffsetTop(value: Double | String): this.type = set("arrowOffsetTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bsClass(value: String): this.type = set("bsClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bsSize(value: Sizes): this.type = set("bsSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def bsStyle(value: String): this.type = set("bsStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placement(value: String): this.type = set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def positionLeft(value: Double | String): this.type = set("positionLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def positionTop(value: Double | String): this.type = set("positionTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def titleReactElement(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def title(value: ReactElement): this.type = set("title", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PopoverProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Popover.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
