package typingsSlinky.antDesignReactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.libStyleMod.PartialTheme
import typingsSlinky.antDesignReactNative.libStyleMod.ThemeProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ThemeProvider {
  
  @JSImport("@ant-design/react-native/lib/style", "ThemeProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, js.Object] {
    
    @scala.inline
    def value(value: PartialTheme): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ThemeProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ThemeProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
