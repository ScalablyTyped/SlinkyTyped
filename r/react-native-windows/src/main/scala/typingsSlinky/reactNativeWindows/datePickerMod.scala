package typingsSlinky.reactNativeWindows

import typingsSlinky.react.mod.Component
import typingsSlinky.reactNativeWindows.datePickerPropsMod.IDatePickerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datePickerMod {
  
  @JSImport("react-native-windows/Libraries/Components/DatePicker/DatePicker", "DatePicker")
  @js.native
  class DatePicker protected ()
    extends Component[IDatePickerProps, js.Object, js.Any] {
    def this(props: IDatePickerProps) = this()
    
    var _onChange: js.Any = js.native
    
    var _rctDatePicker: js.Any = js.native
    
    var _setRef: js.Any = js.native
  }
  /* static members */
  object DatePicker {
    
    @JSImport("react-native-windows/Libraries/Components/DatePicker/DatePicker", "DatePicker")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-windows/Libraries/Components/DatePicker/DatePicker", "DatePicker.defaultProps")
    @js.native
    def defaultProps: IDatePickerProps = js.native
    @scala.inline
    def defaultProps_=(x: IDatePickerProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
}
