package typingsSlinky.gestalt.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.gestalt.anon.Value
import typingsSlinky.gestalt.gestaltStrings.lg
import typingsSlinky.gestalt.gestaltStrings.md
import typingsSlinky.gestalt.mod.SelectListProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SelectList {
  
  @JSImport("gestalt", "SelectList")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.gestalt.mod.SelectList] {
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def errorMessage(value: String): this.type = set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def helperText(value: String): this.type = set("helperText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def label(value: String): this.type = set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def size(value: md | lg): this.type = set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SelectListProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(id: String, onChange: Value => Unit, options: js.Array[typingsSlinky.gestalt.anon.Label]): Builder = {
    val __props = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), options = options.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SelectListProps]))
  }
}
