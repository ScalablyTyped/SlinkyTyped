package typingsSlinky.reactSelect.components

import typingsSlinky.reactSelect.selectMod.Props
import typingsSlinky.reactSelect.selectMod.default
import typingsSlinky.reactSelect.stateManagerMod.StateProps
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactSelect {
  
  @scala.inline
  def apply[OptionType /* <: OptionTypeBase */, T /* <: default[OptionType] */](): SharedBuilder_StatePropsPropsProps_1231323545[typingsSlinky.reactSelect.mod.default[OptionType, T], OptionType, T] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_StatePropsPropsProps_1231323545[typingsSlinky.reactSelect.mod.default[OptionType, T], OptionType, T](js.Array(this.component, __props.asInstanceOf[StateProps[Props[OptionType]] with typingsSlinky.reactSelect.stateManagerMod.Props[OptionType] with Props[OptionType]]))
  }
  
  @JSImport("react-select", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make[OptionType /* <: OptionTypeBase */, T /* <: default[OptionType] */](companion: ReactSelect.type): SharedBuilder_StatePropsPropsProps_1231323545[typingsSlinky.reactSelect.mod.default[OptionType, T], OptionType, T] = new SharedBuilder_StatePropsPropsProps_1231323545[typingsSlinky.reactSelect.mod.default[OptionType, T], OptionType, T](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps[OptionType /* <: OptionTypeBase */, T /* <: default[OptionType] */](
    p: StateProps[Props[OptionType]] with typingsSlinky.reactSelect.stateManagerMod.Props[OptionType] with Props[OptionType]
  ): SharedBuilder_StatePropsPropsProps_1231323545[typingsSlinky.reactSelect.mod.default[OptionType, T], OptionType, T] = new SharedBuilder_StatePropsPropsProps_1231323545[typingsSlinky.reactSelect.mod.default[OptionType, T], OptionType, T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
