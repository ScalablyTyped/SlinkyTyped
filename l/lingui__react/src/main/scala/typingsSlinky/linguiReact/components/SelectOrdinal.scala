package typingsSlinky.linguiReact.components

import typingsSlinky.linguiReact.selectMod.PluralPropsWithoutI18n
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SelectOrdinal {
  
  @JSImport("@lingui/react", "SelectOrdinal")
  @js.native
  object component extends js.Object
  
  def withProps(p: PluralPropsWithoutI18n): SharedBuilder_PluralPropsWithoutI18n_801860557[typingsSlinky.linguiReact.mod.SelectOrdinal] = new SharedBuilder_PluralPropsWithoutI18n_801860557[typingsSlinky.linguiReact.mod.SelectOrdinal](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @scala.inline
  def apply(value: Double | String): SharedBuilder_PluralPropsWithoutI18n_801860557[typingsSlinky.linguiReact.mod.SelectOrdinal] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new SharedBuilder_PluralPropsWithoutI18n_801860557[typingsSlinky.linguiReact.mod.SelectOrdinal](js.Array(this.component, __props.asInstanceOf[PluralPropsWithoutI18n]))
  }
}
