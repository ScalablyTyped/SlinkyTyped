package typingsSlinky.reactFlagsSelect.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.reactFlagsSelect.mod.Props
import typingsSlinky.reactFlagsSelect.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactFlagsSelect {
  
  @JSImport("react-flags-select", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def alignOptions(value: String): this.type = set("alignOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def blackList(value: Boolean): this.type = set("blackList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def countriesVarargs(value: String*): this.type = set("countries", js.Array(value :_*))
    
    @scala.inline
    def countries(value: js.Array[String]): this.type = set("countries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultCountry(value: String): this.type = set("defaultCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def onSelect(value: /* countryCode */ String => Unit): this.type = set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def optionsSize(value: Double): this.type = set("optionsSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def searchable(value: Boolean): this.type = set("searchable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def selectedSize(value: Double): this.type = set("selectedSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showOptionLabel(value: Boolean): this.type = set("showOptionLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def showSelectedLabel(value: Boolean): this.type = set("showSelectedLabel", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: ReactFlagsSelect.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
