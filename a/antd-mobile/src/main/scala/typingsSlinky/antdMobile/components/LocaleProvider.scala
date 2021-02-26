package typingsSlinky.antdMobile.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.antdMobile.localeProviderLocaleProviderMod.LocaleProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LocaleProvider {
  
  @scala.inline
  def apply(locale: typingsSlinky.antdMobile.anon.DatePicker): Default[tag.type, typingsSlinky.antdMobile.mod.LocaleProvider] = {
    val __props = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    new Default[tag.type, typingsSlinky.antdMobile.mod.LocaleProvider](js.Array(this.component, __props.asInstanceOf[LocaleProviderProps]))
  }
  
  @JSImport("antd-mobile", "LocaleProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: LocaleProviderProps): Default[tag.type, typingsSlinky.antdMobile.mod.LocaleProvider] = new Default[tag.type, typingsSlinky.antdMobile.mod.LocaleProvider](js.Array(this.component, p.asInstanceOf[js.Any]))
}
