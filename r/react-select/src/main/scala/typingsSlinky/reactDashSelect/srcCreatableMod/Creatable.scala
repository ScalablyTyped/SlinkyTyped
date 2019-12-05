package typingsSlinky.reactDashSelect.srcCreatableMod

import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.Ref
import typingsSlinky.reactDashSelect.srcTypesMod.ActionMeta
import typingsSlinky.reactDashSelect.srcTypesMod.OptionTypeBase
import typingsSlinky.reactDashSelect.srcTypesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/Creatable", "Creatable")
@js.native
class Creatable[OptionType /* <: OptionTypeBase */] ()
  extends Component[Props[OptionType], State[OptionType], js.Any] {
  var select: Ref[_] = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def onChange(newValue: ValueType[OptionType], actionMeta: ActionMeta): Unit = js.native
}

/* static members */
@JSImport("react-select/src/Creatable", "Creatable")
@js.native
object Creatable extends js.Object {
  var defaultProps: Props[_] = js.native
}

