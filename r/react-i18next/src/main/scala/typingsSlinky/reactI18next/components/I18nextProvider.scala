package typingsSlinky.reactI18next.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.i18next.mod.i18n
import typingsSlinky.reactI18next.mod.I18nextProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object I18nextProvider {
  
  @JSImport("react-i18next", "I18nextProvider")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def defaultNS(value: String): this.type = set("defaultNS", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: I18nextProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(i18n: i18n): Builder = {
    val __props = js.Dynamic.literal(i18n = i18n.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[I18nextProviderProps]))
  }
}
