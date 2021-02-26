package typingsSlinky.materialUiStyles.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.jss.mod.Jss
import typingsSlinky.jss.mod.Rule
import typingsSlinky.jss.mod.StyleSheet
import typingsSlinky.materialUiStyles.stylesProviderStylesProviderMod.StylesProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StylesProvider {
  
  @JSImport("@material-ui/styles", "StylesProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def disableGeneration(value: Boolean): this.type = set("disableGeneration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def generateClassName(value: (/* rule */ Rule, /* sheet */ js.UndefOr[StyleSheet[String]]) => String): this.type = set("generateClassName", js.Any.fromFunction2(value))
    
    @scala.inline
    def injectFirst(value: Boolean): this.type = set("injectFirst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def jss(value: Jss): this.type = set("jss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sheetsCache(value: js.Object): this.type = set("sheetsCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sheetsManager(value: js.Object): this.type = set("sheetsManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def sheetsRegistry(value: js.Object): this.type = set("sheetsRegistry", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: StylesProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: StylesProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
