package typingsSlinky.reactIntl.components

import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.reactIntl.componentsProviderMod.OptionalIntlConfig
import typingsSlinky.reactIntl.componentsProviderMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Provider {
  
  @JSImport("react-intl/src/components/provider", JSImport.Default)
  @js.native
  object component extends js.Object
  
  def withProps(p: PropsWithChildren[OptionalIntlConfig]): SharedBuilder_PropsWithChildren797446672[default] = new SharedBuilder_PropsWithChildren797446672[default](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  implicit def make(companion: Provider.type): SharedBuilder_PropsWithChildren797446672[default] = new SharedBuilder_PropsWithChildren797446672[default](js.Array(this.component, js.Dictionary.empty))()
}
