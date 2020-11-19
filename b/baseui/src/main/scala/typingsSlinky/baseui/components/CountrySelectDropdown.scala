package typingsSlinky.baseui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.baseui.anon.ReadonlyArrayReactNode
import typingsSlinky.baseui.phoneInputMod.Country
import typingsSlinky.baseui.phoneInputMod.CountrySelectDropdownProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CountrySelectDropdown {
  
  @JSImport("baseui/phone-input", "CountrySelectDropdown")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def children(value: ReadonlyArrayReactNode): this.type = set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def country(value: Country): this.type = set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def mapIsoToLabel(value: /* iso */ String => String): this.type = set("mapIsoToLabel", js.Any.fromFunction1(value))
    
    @scala.inline
    def maxDropdownHeight(value: String): this.type = set("maxDropdownHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def overrides(value: typingsSlinky.baseui.anon.CountrySelectDropdown): this.type = set("overrides", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: CountrySelectDropdownProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: CountrySelectDropdown.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
