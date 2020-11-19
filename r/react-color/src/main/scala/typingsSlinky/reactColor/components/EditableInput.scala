package typingsSlinky.reactColor.components

import org.scalajs.dom.raw.HTMLInputElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.react.mod.ChangeEvent
import typingsSlinky.reactColor.editableInputMod.EditableInputProps
import typingsSlinky.reactColor.editableInputMod.EditableInputStyles
import typingsSlinky.reactColor.mod.Color
import typingsSlinky.reactColor.mod.ColorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EditableInput {
  
  @JSImport("react-color/lib/components/common", "EditableInput")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.reactColor.commonMod.EditableInput] {
    
    @scala.inline
    def color(value: Color): this.type = set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dragLabel(value: String): this.type = set("dragLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def dragMax(value: String): this.type = set("dragMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onChange(value: (/* color */ ColorResult, /* event */ ChangeEvent[HTMLInputElement]) => Unit): this.type = set("onChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def style(value: EditableInputStyles): this.type = set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: js.Any): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: EditableInputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: EditableInput.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
