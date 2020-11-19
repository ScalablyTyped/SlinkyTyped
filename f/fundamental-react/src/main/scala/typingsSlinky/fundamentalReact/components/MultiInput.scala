package typingsSlinky.fundamentalReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.fundamentalReact.anon.Text
import typingsSlinky.fundamentalReact.multiInputMod.MultiInputProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MultiInput {
  
  @JSImport("fundamental-react", "MultiInput")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.fundamentalReact.mod.MultiInput] {
    
    @scala.inline
    def buttonProps(value: js.Any): this.type = set("buttonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def compact(value: Boolean): this.type = set("compact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disableStyles(value: Boolean): this.type = set("disableStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def inputProps(value: js.Any): this.type = set("inputProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def listProps(value: js.Any): this.type = set("listProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onTagsUpdate(value: /* repeated */ js.Any => _): this.type = set("onTagsUpdate", js.Any.fromFunction1(value))
    
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def popoverProps(value: js.Any): this.type = set("popoverProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def tagProps(value: js.Any): this.type = set("tagProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def validationState(value: Text): this.type = set("validationState", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MultiInputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(data: js.Array[_]): Builder = {
    val __props = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MultiInputProps]))
  }
}
