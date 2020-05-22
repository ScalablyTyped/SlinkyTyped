package typingsSlinky.reactSelect.components

import typingsSlinky.reactSelect.selectMod.Props
import typingsSlinky.reactSelect.selectMod.default
import typingsSlinky.reactSelect.stateManagerMod.StateProps
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object StateManager {
  @JSImport("react-select/src/stateManager", "StateManager")
  @js.native
  object component extends js.Object
  
  def withProps[OptionType <: OptionTypeBase, T <: default[OptionType]](
    p: StateProps[Props[OptionType]] with typingsSlinky.reactSelect.stateManagerMod.Props[OptionType] with Props[OptionType]
  ): SharedBuilder_StatePropsPropsProps_1462585424[
    typingsSlinky.reactSelect.stateManagerMod.StateManager[js.Any, js.Any], 
    OptionType, 
    T
  ] = new SharedBuilder_StatePropsPropsProps_1462585424[
    typingsSlinky.reactSelect.stateManagerMod.StateManager[js.Any, js.Any], 
    OptionType, 
    T
  ](js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply[OptionType <: OptionTypeBase, T <: default[OptionType]](): SharedBuilder_StatePropsPropsProps_1462585424[
    typingsSlinky.reactSelect.stateManagerMod.StateManager[js.Any, js.Any], 
    OptionType, 
    T
  ] = {
    val __props = js.Dynamic.literal()
    new SharedBuilder_StatePropsPropsProps_1462585424[
      typingsSlinky.reactSelect.stateManagerMod.StateManager[js.Any, js.Any], 
      OptionType, 
      T
    ](js.Array(this.component, __props.asInstanceOf[StateProps[Props[OptionType]] with typingsSlinky.reactSelect.stateManagerMod.Props[OptionType] with Props[OptionType]]))
  }
  implicit def make[OptionType <: OptionTypeBase, T <: default[OptionType]](companion: StateManager.type): SharedBuilder_StatePropsPropsProps_1462585424[
    typingsSlinky.reactSelect.stateManagerMod.StateManager[js.Any, js.Any], 
    OptionType, 
    T
  ] = new SharedBuilder_StatePropsPropsProps_1462585424[
    typingsSlinky.reactSelect.stateManagerMod.StateManager[js.Any, js.Any], 
    OptionType, 
    T
  ](js.Array(this.component, js.Dictionary.empty))()
}

