package typingsSlinky.reactDayPicker

import typingsSlinky.react.mod.Component
import typingsSlinky.reactDayPicker.propsMod.DayPickerInputProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-day-picker/types/DayPickerInput", JSImport.Namespace)
@js.native
object dayPickerInputMod extends js.Object {
  
  @js.native
  trait DayPickerInput
    extends Component[DayPickerInputProps, js.Any, js.Any] {
    
    def getDayPicker(): typingsSlinky.reactDayPicker.dayPickerMod.default = js.native
    
    def getInput(): js.Any = js.native
    
    def hideDayPicker(): Unit = js.native
    
    def showDayPicker(): Unit = js.native
  }
  
  @js.native
  class default () extends DayPickerInput
}
