package typingsSlinky.antdMobileRn.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.antdMobileRn.localeProviderMod.LocaleProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LocaleProvider {
  
  @scala.inline
  def apply(locale: typingsSlinky.antdMobileRn.anon.DatePicker): Default[tag.type, typingsSlinky.antdMobileRn.mod.LocaleProvider] = {
    val __props = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.antdMobileRn.mod.LocaleProvider](js.Array(this.component, __props.asInstanceOf[LocaleProviderProps]))
  }
  
  @JSImport("antd-mobile-rn", "LocaleProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: LocaleProviderProps): Default[tag.type, typingsSlinky.antdMobileRn.mod.LocaleProvider] = new Default[tag.type, typingsSlinky.antdMobileRn.mod.LocaleProvider](js.Array(this.component, p.asInstanceOf[js.Any]))
}
