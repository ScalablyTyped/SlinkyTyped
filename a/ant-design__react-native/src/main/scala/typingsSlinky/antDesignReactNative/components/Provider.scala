package typingsSlinky.antDesignReactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.anon.PartialLocale
import typingsSlinky.antDesignReactNative.anon.PartialTheme
import typingsSlinky.antDesignReactNative.providerMod.ProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Provider {
  
  @JSImport("@ant-design/react-native", "Provider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.antDesignReactNative.mod.Provider] {
    
    @scala.inline
    def locale(value: PartialLocale): this.type = set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def theme(value: PartialTheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Provider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
