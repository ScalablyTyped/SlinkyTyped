package typingsSlinky.linguiReact.components

import typingsSlinky.linguiReact.selectMod.PluralPropsWithoutI18n
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Plural {
  
  @scala.inline
  def apply(value: Double | String): SharedBuilder_PluralPropsWithoutI18n_801860557[typingsSlinky.linguiReact.mod.Plural] = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new SharedBuilder_PluralPropsWithoutI18n_801860557[typingsSlinky.linguiReact.mod.Plural](js.Array(this.component, __props.asInstanceOf[PluralPropsWithoutI18n]))
  }
  
  @JSImport("@lingui/react", "Plural")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: PluralPropsWithoutI18n): SharedBuilder_PluralPropsWithoutI18n_801860557[typingsSlinky.linguiReact.mod.Plural] = new SharedBuilder_PluralPropsWithoutI18n_801860557[typingsSlinky.linguiReact.mod.Plural](js.Array(this.component, p.asInstanceOf[js.Any]))
}
