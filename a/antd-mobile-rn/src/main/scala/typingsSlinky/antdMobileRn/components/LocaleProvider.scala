package typingsSlinky.antdMobileRn.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.antdMobileRn.AnonDatePicker
import typingsSlinky.antdMobileRn.localeProviderMod.LocaleProviderProps
import typingsSlinky.antdMobileRn.localeProviderMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object LocaleProvider {
  @JSImport("antd-mobile-rn/lib/locale-provider/locale-provider", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: LocaleProviderProps): Default[tag.type, default] = new Default[tag.type, default](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(locale: AnonDatePicker): Default[tag.type, default] = {
    val __props = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    new Default[tag.type, default](js.Array(this.component, __props.asInstanceOf[LocaleProviderProps]))
  }
}

