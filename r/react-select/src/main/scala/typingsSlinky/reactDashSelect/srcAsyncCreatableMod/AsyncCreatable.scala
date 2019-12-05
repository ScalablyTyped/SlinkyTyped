package typingsSlinky.reactDashSelect.srcAsyncCreatableMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.react.reactMod.Component
import typingsSlinky.react.reactMod.Ref
import typingsSlinky.reactDashSelect.srcTypesMod.ActionMeta
import typingsSlinky.reactDashSelect.srcTypesMod.InputActionMeta
import typingsSlinky.reactDashSelect.srcTypesMod.OptionTypeBase
import typingsSlinky.reactDashSelect.srcTypesMod.OptionsType
import typingsSlinky.reactDashSelect.srcTypesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/AsyncCreatable", "AsyncCreatable")
@js.native
class AsyncCreatable[OptionType /* <: OptionTypeBase */] ()
  extends Component[Props[OptionType], State[OptionType], js.Any] {
  var mounted: Boolean = js.native
  var optionsCache: StringDictionary[OptionsType[OptionType]] = js.native
  var select: Ref[_] = js.native
  def blur(): Unit = js.native
  def focus(): Unit = js.native
  def handleInputChange(newValue: String, actionMeta: InputActionMeta): String = js.native
  def loadOptions(inputValue: String, callback: js.Function1[/* options */ OptionsType[OptionType], Unit]): Unit = js.native
  def onChange(newValue: ValueType[OptionType], actionMeta: ActionMeta): Unit = js.native
}

/* static members */
@JSImport("react-select/src/AsyncCreatable", "AsyncCreatable")
@js.native
object AsyncCreatable extends js.Object {
  var defaultProps: Props[_] = js.native
}

