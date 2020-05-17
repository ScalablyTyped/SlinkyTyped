package typingsSlinky.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the client-side equivalent of the ASPxCalendar control.
  */
@js.native
trait ASPxClientCalendar extends ASPxClientEdit {
  /**
    * Occurs when a callback for server-side processing is initiated.
    */
  var BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientCalendar]] = js.native
  /**
    * Fires on the client if any server error occurs during server-side processing of a callback sent by the ASPxClientCalendar.
    */
  var CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientCalendar]] = js.native
  /**
    * Occurs when an end user clicks a date cell.
    */
  var CellClick: ASPxClientEvent[ASPxClientCalendarCellClickEventHandler[ASPxClientCalendar]] = js.native
  /**
    * Allows you to disable the calendar's days.
    */
  var CustomDisabledDate: ASPxClientEvent[ASPxClientCalendarCustomDisabledDateEventHandler[ASPxClientCalendar]] = js.native
  /**
    * Occurs on the client side after the callback server-side processing has been completed.
    */
  var EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientCalendar]] = js.native
  /**
    * Occurs on the client-side when an end-user presses a key while the editor has focus.
    */
  var KeyDown: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientCalendar]] = js.native
  /**
    * Occurs on the client-side when an end-user presses and releases a key while the editor has focus.
    */
  var KeyPress: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientCalendar]] = js.native
  /**
    * Occurs on the client-side when an end-user releases a pressed key while the editor has focus.
    */
  var KeyUp: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientCalendar]] = js.native
  /**
    * Fires on the client side after the selected date has been changed within the calendar.
    */
  var SelectionChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientCalendar]] = js.native
  /**
    * Occurs on the client side when the month displayed within the calendar is changed.
    */
  var VisibleMonthChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientCalendar]] = js.native
  /**
    * Deselects all the selected dates within the calendar.
    */
  def ClearSelection(): Unit = js.native
  /**
    * Deselects the specified date within the calendar.
    * @param date A date-time value that specifies the date to deselect.
    */
  def DeselectDate(date: js.Date): Unit = js.native
  /**
    * Deselects the specified range of dates within the calendar.
    * @param start A date-time value that specifies the range's first date.
    * @param end A date-time value that specifies the range's last date.
    */
  def DeselectRange(start: js.Date, end: js.Date): Unit = js.native
  /**
    * Gets the maximum date on the calendar.
    */
  def GetMaxDate(): js.Date = js.native
  /**
    * Gets the minimum date on the calendar.
    */
  def GetMinDate(): js.Date = js.native
  /**
    * Returns the calendar's selected date.
    */
  def GetSelectedDate(): js.Date = js.native
  /**
    * Returns a list of dates which are selected within the calendar.
    */
  def GetSelectedDates(): js.Array[js.Date] = js.native
  /**
    * Gets the date that determines the month and year that are currently displayed in the calendar.
    */
  def GetVisibleDate(): js.Date = js.native
  /**
    * Tests whether the specified date is selected. true if the specified date is selected; otherwise, false.
    * @param date A date-time value that specifies the date to test.
    */
  def IsDateSelected(date: js.Date): Boolean = js.native
  /**
    * Selects the specified date within the calendar.
    * @param date A date-time value that specifies the selected date.
    */
  def SelectDate(date: js.Date): Unit = js.native
  /**
    * Selects the specified range of dates within the calendar.
    * @param start A date-time value that specifies the range's first date.
    * @param end A date-time value that specifies the range's last date.
    */
  def SelectRange(start: js.Date, end: js.Date): Unit = js.native
  /**
    * Sets the maximum date of the calendar.
    * @param date A DateTime object representing the maximum date.
    */
  def SetMaxDate(date: js.Date): Unit = js.native
  /**
    * Sets the minimum date of the calendar.
    * @param date A DateTime object representing the minimum date.
    */
  def SetMinDate(date: js.Date): Unit = js.native
  /**
    * Sets the calendar's selected date.
    * @param date A date object that specifies the calendar's selected date.
    */
  def SetSelectedDate(date: js.Date): Unit = js.native
  /**
    * Sets the date that specifies the month and year to be displayed in the calendar.
    * @param date The date that specifies calendar's visible month and year.
    */
  def SetVisibleDate(date: js.Date): Unit = js.native
}

object ASPxClientCalendar {
  @scala.inline
  def apply(
    AdjustControl: () => Unit,
    BeginCallback: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientCalendar]],
    CallbackError: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientCalendar]],
    CellClick: ASPxClientEvent[ASPxClientCalendarCellClickEventHandler[ASPxClientCalendar]],
    ClearSelection: () => Unit,
    CustomDisabledDate: ASPxClientEvent[ASPxClientCalendarCustomDisabledDateEventHandler[ASPxClientCalendar]],
    DeselectDate: js.Date => Unit,
    DeselectRange: (js.Date, js.Date) => Unit,
    EndCallback: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientCalendar]],
    Focus: () => Unit,
    GetCaption: () => String,
    GetClientVisible: () => Boolean,
    GetEnabled: () => Boolean,
    GetErrorText: () => String,
    GetHeight: () => Double,
    GetInputElement: () => js.Any,
    GetIsValid: () => Boolean,
    GetMainElement: () => js.Any,
    GetMaxDate: () => js.Date,
    GetMinDate: () => js.Date,
    GetParentControl: () => js.Any,
    GetReadOnly: () => Boolean,
    GetSelectedDate: () => js.Date,
    GetSelectedDates: () => js.Array[js.Date],
    GetValue: () => js.Any,
    GetVisible: () => Boolean,
    GetVisibleDate: () => js.Date,
    GetWidth: () => Double,
    GotFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    InCallback: () => Boolean,
    Init: ASPxClientEvent[ASPxClientEventHandler[ASPxClientControlBase]],
    IsDateSelected: js.Date => Boolean,
    KeyDown: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientCalendar]],
    KeyPress: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientCalendar]],
    KeyUp: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientCalendar]],
    LostFocus: ASPxClientEvent[ASPxClientEventHandler[ASPxClientEdit]],
    SelectDate: js.Date => Unit,
    SelectRange: (js.Date, js.Date) => Unit,
    SelectionChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientCalendar]],
    SendMessageToAssistiveTechnology: String => Unit,
    SetCaption: String => Unit,
    SetClientVisible: Boolean => Unit,
    SetEnabled: Boolean => Unit,
    SetErrorText: String => Unit,
    SetHeight: Double => Unit,
    SetIsValid: Boolean => Unit,
    SetMaxDate: js.Date => Unit,
    SetMinDate: js.Date => Unit,
    SetReadOnly: Boolean => Unit,
    SetSelectedDate: js.Date => Unit,
    SetValue: js.Any => Unit,
    SetVisible: Boolean => Unit,
    SetVisibleDate: js.Date => Unit,
    SetWidth: Double => Unit,
    Validate: () => Unit,
    Validation: ASPxClientEvent[ASPxClientEditValidationEventHandler[ASPxClientEdit]],
    ValueChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientEdit]],
    VisibleMonthChanged: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientCalendar]],
    name: String
  ): ASPxClientCalendar = {
    val __obj = js.Dynamic.literal(AdjustControl = js.Any.fromFunction0(AdjustControl), BeginCallback = BeginCallback.asInstanceOf[js.Any], CallbackError = CallbackError.asInstanceOf[js.Any], CellClick = CellClick.asInstanceOf[js.Any], ClearSelection = js.Any.fromFunction0(ClearSelection), CustomDisabledDate = CustomDisabledDate.asInstanceOf[js.Any], DeselectDate = js.Any.fromFunction1(DeselectDate), DeselectRange = js.Any.fromFunction2(DeselectRange), EndCallback = EndCallback.asInstanceOf[js.Any], Focus = js.Any.fromFunction0(Focus), GetCaption = js.Any.fromFunction0(GetCaption), GetClientVisible = js.Any.fromFunction0(GetClientVisible), GetEnabled = js.Any.fromFunction0(GetEnabled), GetErrorText = js.Any.fromFunction0(GetErrorText), GetHeight = js.Any.fromFunction0(GetHeight), GetInputElement = js.Any.fromFunction0(GetInputElement), GetIsValid = js.Any.fromFunction0(GetIsValid), GetMainElement = js.Any.fromFunction0(GetMainElement), GetMaxDate = js.Any.fromFunction0(GetMaxDate), GetMinDate = js.Any.fromFunction0(GetMinDate), GetParentControl = js.Any.fromFunction0(GetParentControl), GetReadOnly = js.Any.fromFunction0(GetReadOnly), GetSelectedDate = js.Any.fromFunction0(GetSelectedDate), GetSelectedDates = js.Any.fromFunction0(GetSelectedDates), GetValue = js.Any.fromFunction0(GetValue), GetVisible = js.Any.fromFunction0(GetVisible), GetVisibleDate = js.Any.fromFunction0(GetVisibleDate), GetWidth = js.Any.fromFunction0(GetWidth), GotFocus = GotFocus.asInstanceOf[js.Any], InCallback = js.Any.fromFunction0(InCallback), Init = Init.asInstanceOf[js.Any], IsDateSelected = js.Any.fromFunction1(IsDateSelected), KeyDown = KeyDown.asInstanceOf[js.Any], KeyPress = KeyPress.asInstanceOf[js.Any], KeyUp = KeyUp.asInstanceOf[js.Any], LostFocus = LostFocus.asInstanceOf[js.Any], SelectDate = js.Any.fromFunction1(SelectDate), SelectRange = js.Any.fromFunction2(SelectRange), SelectionChanged = SelectionChanged.asInstanceOf[js.Any], SendMessageToAssistiveTechnology = js.Any.fromFunction1(SendMessageToAssistiveTechnology), SetCaption = js.Any.fromFunction1(SetCaption), SetClientVisible = js.Any.fromFunction1(SetClientVisible), SetEnabled = js.Any.fromFunction1(SetEnabled), SetErrorText = js.Any.fromFunction1(SetErrorText), SetHeight = js.Any.fromFunction1(SetHeight), SetIsValid = js.Any.fromFunction1(SetIsValid), SetMaxDate = js.Any.fromFunction1(SetMaxDate), SetMinDate = js.Any.fromFunction1(SetMinDate), SetReadOnly = js.Any.fromFunction1(SetReadOnly), SetSelectedDate = js.Any.fromFunction1(SetSelectedDate), SetValue = js.Any.fromFunction1(SetValue), SetVisible = js.Any.fromFunction1(SetVisible), SetVisibleDate = js.Any.fromFunction1(SetVisibleDate), SetWidth = js.Any.fromFunction1(SetWidth), Validate = js.Any.fromFunction0(Validate), Validation = Validation.asInstanceOf[js.Any], ValueChanged = ValueChanged.asInstanceOf[js.Any], VisibleMonthChanged = VisibleMonthChanged.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientCalendar]
  }
  @scala.inline
  implicit class ASPxClientCalendarOps[Self <: ASPxClientCalendar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBeginCallback(value: ASPxClientEvent[ASPxClientBeginCallbackEventHandler[ASPxClientCalendar]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BeginCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCallbackError(value: ASPxClientEvent[ASPxClientCallbackErrorEventHandler[ASPxClientCalendar]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CallbackError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCellClick(value: ASPxClientEvent[ASPxClientCalendarCellClickEventHandler[ASPxClientCalendar]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CellClick")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClearSelection(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ClearSelection")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCustomDisabledDate(value: ASPxClientEvent[ASPxClientCalendarCustomDisabledDateEventHandler[ASPxClientCalendar]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomDisabledDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDeselectDate(value: js.Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeselectDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDeselectRange(value: (js.Date, js.Date) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DeselectRange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEndCallback(value: ASPxClientEvent[ASPxClientEndCallbackEventHandler[ASPxClientCalendar]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetMaxDate(value: () => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetMaxDate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetMinDate(value: () => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetMinDate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSelectedDate(value: () => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetSelectedDate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetSelectedDates(value: () => js.Array[js.Date]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetSelectedDates")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetVisibleDate(value: () => js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetVisibleDate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsDateSelected(value: js.Date => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsDateSelected")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withKeyDown(value: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientCalendar]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyDown")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyPress(value: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientCalendar]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyPress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withKeyUp(value: ASPxClientEvent[ASPxClientEditKeyEventHandler[ASPxClientCalendar]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("KeyUp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectDate(value: js.Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSelectRange(value: (js.Date, js.Date) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectRange")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withSelectionChanged(value: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientCalendar]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SelectionChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSetMaxDate(value: js.Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetMaxDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetMinDate(value: js.Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetMinDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetSelectedDate(value: js.Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetSelectedDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSetVisibleDate(value: js.Date => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SetVisibleDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withVisibleMonthChanged(value: ASPxClientEvent[ASPxClientProcessingModeEventHandler[ASPxClientCalendar]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VisibleMonthChanged")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

