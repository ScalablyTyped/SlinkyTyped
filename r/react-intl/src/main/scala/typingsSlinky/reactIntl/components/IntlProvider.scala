package typingsSlinky.reactIntl.components

import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.reactIntl.componentsProviderMod.OptionalIntlConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object IntlProvider {
  
  @JSImport("react-intl", "IntlProvider")
  @js.native
  object component extends js.Object
  
  def withProps(p: PropsWithChildren[OptionalIntlConfig]): SharedBuilder_PropsWithChildren797446672[typingsSlinky.reactIntl.mod.IntlProvider] = new SharedBuilder_PropsWithChildren797446672[typingsSlinky.reactIntl.mod.IntlProvider](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: IntlProvider.type): SharedBuilder_PropsWithChildren797446672[typingsSlinky.reactIntl.mod.IntlProvider] = new SharedBuilder_PropsWithChildren797446672[typingsSlinky.reactIntl.mod.IntlProvider](js.Array(this.component, js.Dictionary.empty))()
}
