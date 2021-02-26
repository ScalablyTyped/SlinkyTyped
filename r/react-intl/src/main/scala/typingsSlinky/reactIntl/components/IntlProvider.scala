package typingsSlinky.reactIntl.components

import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.reactIntl.componentsProviderMod.OptionalIntlConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IntlProvider {
  
  @scala.inline
  def apply(locale: String): SharedBuilder_PropsWithChildren797446672[typingsSlinky.reactIntl.mod.IntlProvider] = {
    val __props = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    new SharedBuilder_PropsWithChildren797446672[typingsSlinky.reactIntl.mod.IntlProvider](js.Array(this.component, __props.asInstanceOf[PropsWithChildren[OptionalIntlConfig]]))
  }
  
  @JSImport("react-intl", "IntlProvider")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: PropsWithChildren[OptionalIntlConfig]): SharedBuilder_PropsWithChildren797446672[typingsSlinky.reactIntl.mod.IntlProvider] = new SharedBuilder_PropsWithChildren797446672[typingsSlinky.reactIntl.mod.IntlProvider](js.Array(this.component, p.asInstanceOf[js.Any]))
}
