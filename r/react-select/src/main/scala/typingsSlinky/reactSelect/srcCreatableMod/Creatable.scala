package typingsSlinky.reactSelect.srcCreatableMod

import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactSelect.typesMod.ActionMeta
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import typingsSlinky.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-select/src/Creatable", "Creatable")
@js.native
class Creatable[OptionType /* <: OptionTypeBase */] ()
  extends Component[Props[OptionType], State[OptionType], js.Any] {
  
  def blur(): Unit = js.native
  
  def focus(): Unit = js.native
  
  def onChange(newValue: ValueType[OptionType], actionMeta: ActionMeta[OptionType]): Unit = js.native
  
  var select: Ref[_] = js.native
}
/* static members */
@JSImport("react-select/src/Creatable", "Creatable")
@js.native
object Creatable extends js.Object {
  
  var defaultProps: Props[_] = js.native
}
