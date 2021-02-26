package typingsSlinky.reactIntl.components

import typingsSlinky.react.mod.PropsWithChildren
import typingsSlinky.reactIntl.componentsProviderMod.OptionalIntlConfig
import typingsSlinky.reactIntl.componentsProviderMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Provider {
  
  @scala.inline
  def apply(locale: String): SharedBuilder_PropsWithChildren797446672[default] = {
    val __props = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    new SharedBuilder_PropsWithChildren797446672[default](js.Array(this.component, __props.asInstanceOf[PropsWithChildren[OptionalIntlConfig]]))
  }
  
  @JSImport("react-intl/src/components/provider", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: PropsWithChildren[OptionalIntlConfig]): SharedBuilder_PropsWithChildren797446672[default] = new SharedBuilder_PropsWithChildren797446672[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
