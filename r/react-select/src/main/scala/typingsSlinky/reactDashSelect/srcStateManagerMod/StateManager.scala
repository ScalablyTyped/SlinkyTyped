package typingsSlinky.reactDashSelect.srcStateManagerMod

import typingsSlinky.react.reactMod.Component
import typingsSlinky.reactDashSelect.srcTypesMod.ActionMeta
import typingsSlinky.reactDashSelect.srcTypesMod.InputActionMeta
import typingsSlinky.reactDashSelect.srcTypesMod.OptionTypeBase
import typingsSlinky.reactDashSelect.srcTypesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/stateManager", "StateManager")
@js.native
class StateManager[OptionType /* <: OptionTypeBase */, T /* <: typingsSlinky.reactDashSelect.srcSelectMod.default[OptionType] */] ()
  extends Component[
      StateProps[typingsSlinky.reactDashSelect.srcSelectMod.Props[OptionType]] with Props[OptionType] with typingsSlinky.reactDashSelect.srcSelectMod.Props[OptionType], 
      State[OptionType], 
      js.Any
    ] {
  var select: T = js.native
  def blur(): Unit = js.native
  def callProp(name: String, args: js.Any*): js.Any = js.native
  def focus(): Unit = js.native
  def getProp(key: String): js.Any = js.native
  def onChange(value: ValueType[OptionType], actionMeta: ActionMeta): Unit = js.native
  def onInputChange(value: ValueType[OptionType], actionMeta: InputActionMeta): Unit = js.native
  def onMenuClose(): Unit = js.native
  def onMenuOpen(): Unit = js.native
}

/* static members */
@JSImport("react-select/src/stateManager", "StateManager")
@js.native
object StateManager extends js.Object {
  var defaultProps: DefaultProps[_] = js.native
}

