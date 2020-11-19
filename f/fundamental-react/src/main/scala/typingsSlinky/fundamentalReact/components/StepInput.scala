package typingsSlinky.fundamentalReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fundamentalReact.anon.State
import typingsSlinky.fundamentalReact.stepInputMod.StepInputProps
import typingsSlinky.react.mod.PropsWithChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StepInput {
  
  @JSImport("fundamental-react", "StepInput")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableStyles(value: Boolean): this.type = set("disableStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def localizedText(value: js.Any): this.type = set("localizedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def validationState(value: State): this.type = set("validationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: Double): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PropsWithChildren[StepInputProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: StepInput.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
