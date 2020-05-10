package typingsSlinky.reactSelect

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.react.mod.Component
import typingsSlinky.react.mod.Ref
import typingsSlinky.reactSelect.typesMod.ActionMeta
import typingsSlinky.reactSelect.typesMod.InputActionMeta
import typingsSlinky.reactSelect.typesMod.OptionTypeBase
import typingsSlinky.reactSelect.typesMod.OptionsType
import typingsSlinky.reactSelect.typesMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/AsyncCreatable", JSImport.Namespace)
@js.native
object srcAsyncCreatableMod extends js.Object {
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
    def onChange(newValue: ValueType[OptionType], actionMeta: ActionMeta[OptionType]): Unit = js.native
  }
  
  @js.native
  class default[OptionType /* <: OptionTypeBase */] () extends AsyncCreatable[OptionType]
  
  /* static members */
  @js.native
  object AsyncCreatable extends js.Object {
    var defaultProps: Props[_] = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: Props[_] = js.native
  }
  
  type Props[OptionType /* <: OptionTypeBase */] = typingsSlinky.reactSelect.srcAsyncMod.Props[OptionType] with typingsSlinky.reactSelect.srcCreatableMod.Props[OptionType]
  type State[OptionType /* <: OptionTypeBase */] = typingsSlinky.reactSelect.srcAsyncMod.State[OptionType] with typingsSlinky.reactSelect.srcCreatableMod.State[OptionType]
}

