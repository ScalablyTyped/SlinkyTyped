package typingsSlinky.linguiReact.components

import slinky.core.facade.ReactElement
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.linguiCore.i18nMod.Catalogs
import typingsSlinky.linguiCore.mod.I18n_
import typingsSlinky.linguiReact.i18nProviderMod.I18nProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object I18nProvider {
  
  @scala.inline
  def apply(language: String): Builder = {
    val __props = js.Dynamic.literal(language = language.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[I18nProviderProps]))
  }
  
  @JSImport("@lingui/react", "I18nProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.linguiReact.mod.I18nProvider] {
    
    @scala.inline
    def catalogs(value: Catalogs): this.type = set("catalogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultRender(value: ReactElement): this.type = set("defaultRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def defaultRenderReactElement(value: ReactElement): this.type = set("defaultRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def i18n(value: I18n_): this.type = set("i18n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def locales(value: String | js.Array[String]): this.type = set("locales", value.asInstanceOf[js.Any])
    
    @scala.inline
    def localesVarargs(value: String*): this.type = set("locales", js.Array(value :_*))
    
    @scala.inline
    def missing(value: String | (js.Function2[/* language */ String, /* id */ String, String])): this.type = set("missing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def missingFunction2(value: (/* language */ String, /* id */ String) => String): this.type = set("missing", js.Any.fromFunction2(value))
  }
  
  def withProps(p: I18nProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
