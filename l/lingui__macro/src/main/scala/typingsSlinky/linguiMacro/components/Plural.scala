package typingsSlinky.linguiMacro.components

import typingsSlinky.linguiMacro.mod.Plural_
import typingsSlinky.linguiMacro.reactSelectMod.PluralPropsWithoutI18n
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Plural {
  
  @JSImport("@lingui/macro", "Plural")
  @js.native
  object component extends js.Object
  
  def withProps(p: PluralPropsWithoutI18n): SharedBuilder_PluralPropsWithoutI18n_1870042938[Plural_] = new SharedBuilder_PluralPropsWithoutI18n_1870042938[Plural_](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(value: Double | String): SharedBuilder_PluralPropsWithoutI18n_1870042938[Plural_] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new SharedBuilder_PluralPropsWithoutI18n_1870042938[Plural_](js.Array(this.component, __props.asInstanceOf[PluralPropsWithoutI18n]))
  }
}
