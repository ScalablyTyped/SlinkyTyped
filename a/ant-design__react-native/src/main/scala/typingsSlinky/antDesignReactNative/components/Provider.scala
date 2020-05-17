package typingsSlinky.antDesignReactNative.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antDesignReactNative.anon.PartialLocale
import typingsSlinky.antDesignReactNative.anon.PartialTheme
import typingsSlinky.antDesignReactNative.providerMod.ProviderProps
import typingsSlinky.antDesignReactNative.providerMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Provider {
  @JSImport("@ant-design/react-native/lib/provider", JSImport.Default)
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    @scala.inline
    def locale(value: PartialLocale): this.type = set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def theme(value: PartialTheme): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  implicit def make(companion: Provider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
}

