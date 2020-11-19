package typingsSlinky.antdMobileRn.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.antdMobileRn.localeProviderMod.LocaleProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LocaleProvider {
  
  @JSImport("antd-mobile-rn", "LocaleProvider")
  @js.native
  object component extends js.Object
  
  def withProps(p: LocaleProviderProps): Default[tag.type, typingsSlinky.antdMobileRn.mod.LocaleProvider] = new Default[tag.type, typingsSlinky.antdMobileRn.mod.LocaleProvider](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(locale: typingsSlinky.antdMobileRn.anon.DatePicker): Default[tag.type, typingsSlinky.antdMobileRn.mod.LocaleProvider] = {
    val __props = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.antdMobileRn.mod.LocaleProvider](js.Array(this.component, __props.asInstanceOf[LocaleProviderProps]))
  }
}
