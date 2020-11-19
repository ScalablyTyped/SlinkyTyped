package typingsSlinky.fundamentalReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fundamentalReact.anon.State
import typingsSlinky.fundamentalReact.inputGroupMod.InputGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InputGroup {
  
  @JSImport("fundamental-react", "InputGroup")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.fundamentalReact.mod.InputGroup] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def compact(value: Boolean): this.type = set("compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableStyles(value: Boolean): this.type = set("disableStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def props(value: js.Any): this.type = set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def validationState(value: State): this.type = set("validationState", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: InputGroupProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: InputGroup.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
