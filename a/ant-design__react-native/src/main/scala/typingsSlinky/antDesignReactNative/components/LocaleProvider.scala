package typingsSlinky.antDesignReactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.anon.PartialLocale
import typingsSlinky.antDesignReactNative.localeProviderMod.LocaleProviderProps
import typingsSlinky.antDesignReactNative.localeProviderMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LocaleProvider {
  
  @JSImport("@ant-design/react-native/lib/locale-provider", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def locale(value: PartialLocale): this.type = set("locale", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LocaleProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: LocaleProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}
