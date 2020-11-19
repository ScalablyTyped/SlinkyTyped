package typingsSlinky.officeUiFabricReact.datePickerBaseMod

import typingsSlinky.officeUiFabricReact.datePickerTypesMod.IDatePicker
import typingsSlinky.officeUiFabricReact.datePickerTypesMod.IDatePickerProps
import typingsSlinky.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("office-ui-fabric-react/lib/components/DatePicker/DatePicker.base", "DatePickerBase")
@js.native
class DatePickerBase protected ()
  extends Component[IDatePickerProps, IDatePickerState, js.Any]
     with IDatePicker {
  def this(props: IDatePickerProps) = this()
  
  @JSName("UNSAFE_componentWillReceiveProps")
  def UNSAFE_componentWillReceiveProps_MDatePickerBase(nextProps: IDatePickerProps): Unit = js.native
  
  var _calendar: js.Any = js.native
  
  /**
    * Callback for closing the calendar callout
    */
  var _calendarDismissed: js.Any = js.native
  
  var _datePickerDiv: js.Any = js.native
  
  var _dismissDatePickerPopup: js.Any = js.native
  
  var _getDefaultState: js.Any = js.native
  
  var _getErrorMessage: js.Any = js.native
  
  var _handleEscKey: js.Any = js.native
  
  var _id: js.Any = js.native
  
  var _isDateOutOfBounds: js.Any = js.native
  
  var _onCalloutPositioned: js.Any = js.native
  
  var _onIconClick: js.Any = js.native
  
  var _onSelectDate: js.Any = js.native
  
  var _onTextFieldBlur: js.Any = js.native
  
  var _onTextFieldChanged: js.Any = js.native
  
  var _onTextFieldClick: js.Any = js.native
  
  var _onTextFieldFocus: js.Any = js.native
  
  var _onTextFieldKeyDown: js.Any = js.native
  
  var _preventFocusOpeningPicker: js.Any = js.native
  
  var _setErrorMessage: js.Any = js.native
  
  var _showDatePickerPopup: js.Any = js.native
  
  var _textField: js.Any = js.native
  
  var _validateTextInput: js.Any = js.native
  
  @JSName("componentDidUpdate")
  def componentDidUpdate_MDatePickerBase(prevProps: IDatePickerProps, prevState: IDatePickerState): Unit = js.native
}
/* static members */
@JSImport("office-ui-fabric-react/lib/components/DatePicker/DatePicker.base", "DatePickerBase")
@js.native
object DatePickerBase extends js.Object {
  
  var defaultProps: IDatePickerProps = js.native
}
