package typingsSlinky.antd.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.antd.localeProviderMod.Locale
import typingsSlinky.antd.localeProviderMod.LocaleProviderProps
import typingsSlinky.antd.localeProviderMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LocaleProvider {
  
  @scala.inline
  def apply(locale: Locale): Builder = {
    val __props = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[LocaleProviderProps]))
  }
  
  @JSImport("antd/lib/locale-provider", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, default] {
    
    @scala.inline
    def _ANT_MARK__(value: String): this.type = set("_ANT_MARK__", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: LocaleProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
