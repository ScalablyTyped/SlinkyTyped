package typingsSlinky.baseui.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent.Default
import typingsSlinky.baseui.anon.PartialLocale
import typingsSlinky.baseui.mod.LocaleProviderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LocaleProvider {
  
  @JSImport("baseui", "LocaleProvider")
  @js.native
  object component extends js.Object
  
  def withProps(p: LocaleProviderProps): Default[tag.type, js.Object] = new Default[tag.type, js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(locale: PartialLocale): Default[tag.type, js.Object] = {
    val __props = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    new Default[tag.type, js.Object](js.Array(this.component, __props.asInstanceOf[LocaleProviderProps]))
  }
}
