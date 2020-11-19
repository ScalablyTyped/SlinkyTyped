package typingsSlinky.reactSelect.srcAsyncMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactSelect.typesMod.InputActionMeta
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import typingsSlinky.reactSelect.typesMod.OptionsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-select/src/Async", "Async")
@js.native
class Async[OptionType /* <: OptionTypeBase */] ()
  extends Component[Props[OptionType], State[OptionType], js.Any] {
  
  def blur(): Unit = js.native
  
  def focus(): Unit = js.native
  
  def handleInputChange(newValue: String, actionMeta: InputActionMeta): String = js.native
  
  def loadOptions(inputValue: String, callback: js.Function1[/* options */ OptionsType[OptionType], Unit]): Unit = js.native
  
  var mounted: Boolean = js.native
  
  var optionsCache: StringDictionary[OptionsType[OptionType]] = js.native
  
  var select: Ref[_] = js.native
}
/* static members */
@JSImport("react-select/src/Async", "Async")
@js.native
object Async extends js.Object {
  
  var defaultProps: Props[_] = js.native
}
