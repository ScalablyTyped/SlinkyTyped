package typingsSlinky.jqueryTimepicker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimePickerOptions extends StObject {
  
  /** Selector for an alternate field to store selected time into */
  var altField: js.UndefOr[String] = js.native
  
  /** Define the locale text for periods. */
  var amPmText: js.UndefOr[js.Tuple2[String, String]] = js.native
  
  /** Display text following the input box, e.g. showing the format */
  var appendText: js.UndefOr[String] = js.native
  
  /**
    * Position of the input element to match
    *
    * Note : if the position utility is not loaded, the timepicker will attach left top to left bottom
    * See the position utility for more info : http://jqueryui.com/demos/position/
    */
  var atPosition: js.UndefOr[String] = js.native
  
  /** Define a callback function executed before the timepicker is shown */
  var beforeShow: js.UndefOr[js.Function0[_]] = js.native
  
  /**
    * 'button' element that will trigger the timepicker.
    *
    * "button" for trigger button, or "both" for either (not yet implemented).
    */
  var button: js.UndefOr[String] = js.native
  
  /** Text for the confirmation button (ok button).*/
  var closeButtonText: js.UndefOr[String] = js.native
  
  /**
    * Used as default time when input field is empty or for inline timePicker
    * (set to 'now' for the current time, '' for no highlighted time)
    **/
  var defaultTime: js.UndefOr[String] = js.native
  
  /** Text for the deselect button */
  var deselectButtonText: js.UndefOr[String] = js.native
  
  // Localization
  /** Define the locale text for "Hours" */
  var hourText: js.UndefOr[String] = js.native
  
  var hours: js.UndefOr[TimePickerHour] = js.native
  
  /** Define the locale text for "Minute" */
  var minuteText: js.UndefOr[String] = js.native
  
  var minutes: js.UndefOr[TimePickerMinutes] = js.native
  
  /**
    * Position of the dialog relative to the input.
    *
    * See the position utility for more info : http://jqueryui.com/demos/position/
    */
  var myPosition: js.UndefOr[String] = js.native
  
  /** Text for the 'now' button.*/
  var nowButtonText: js.UndefOr[String] = js.native
  
  /** Define a callback function when the timepicker is closed */
  var onClose: js.UndefOr[js.Function2[/* timeText */ String, /* inst */ js.Any, _]] = js.native
  
  //NEW: 2011-02-03
  /** callback for enabling / disabling on selectable hours  ex : function(hour) { return true; } */
  var onHourShow: js.UndefOr[js.Function0[_]] = js.native
  
  /** callback for enabling / disabling on time selection  ex : function(hour,minute) { return true; } */
  var onMinuteShow: js.UndefOr[js.Function0[_]] = js.native
  
  /** Define a callback function when a hour / minutes is selected */
  var onSelect: js.UndefOr[js.Function2[/* timeText */ String, /* inst */ js.Any, _]] = js.native
  
  /** optionally parse inputs of whole hours with minutes omitted */
  var optionalMinutes: js.UndefOr[Boolean] = js.native
  
  /** The character to use to separate the time from the time period. */
  var periodSeparator: js.UndefOr[String] = js.native
  
  /** number of rows for the input tables, minimum 2, makes more sense if you use multiple of 2 */
  var rows: js.UndefOr[Double] = js.native
  
  /** Name of jQuery animation for popup */
  var showAnim: js.UndefOr[String] = js.native
  
  // buttons
  /** shows an OK button to confirm the edit */
  var showCloseButton: js.UndefOr[Boolean] = js.native
  
  /** Shows the deselect time button */
  var showDeselectButton: js.UndefOr[Boolean] = js.native
  
  // 2011-08-05 0.2.4
  /** display the hours section of the dialog */
  var showHours: js.UndefOr[Boolean] = js.native
  
  /** Define whether or not to show a leading zero for hours < 10. [true/false] */
  var showLeadingZero: js.UndefOr[Boolean] = js.native
  
  /** display the minute section of the dialog */
  var showMinutes: js.UndefOr[Boolean] = js.native
  
  /** Define whether or not to show a leading zero for minutes < 10. */
  var showMinutesLeadingZero: js.UndefOr[Boolean] = js.native
  
  /** Shows the 'now' button */
  var showNowButton: js.UndefOr[Boolean] = js.native
  
  /** 'focus' for popup on focus, */
  var showOn: js.UndefOr[String] = js.native
  
  /** Options for enhanced animations */
  var showOptions: js.UndefOr[js.Any] = js.native
  
  /** Define whether or not to show AM/PM with selected time */
  var showPeriod: js.UndefOr[Boolean] = js.native
  
  /** Show the AM/PM labels on the left of the time picker */
  var showPeriodLabels: js.UndefOr[Boolean] = js.native
  
  /** The character to use to separate hours and minutes. */
  var timeSeparator: js.UndefOr[String] = js.native
}
object TimePickerOptions {
  
  @scala.inline
  def apply(): TimePickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimePickerOptions]
  }
  
  @scala.inline
  implicit class TimePickerOptionsMutableBuilder[Self <: TimePickerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltField(value: String): Self = StObject.set(x, "altField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltFieldUndefined: Self = StObject.set(x, "altField", js.undefined)
    
    @scala.inline
    def setAmPmText(value: js.Tuple2[String, String]): Self = StObject.set(x, "amPmText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAmPmTextUndefined: Self = StObject.set(x, "amPmText", js.undefined)
    
    @scala.inline
    def setAppendText(value: String): Self = StObject.set(x, "appendText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendTextUndefined: Self = StObject.set(x, "appendText", js.undefined)
    
    @scala.inline
    def setAtPosition(value: String): Self = StObject.set(x, "atPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAtPositionUndefined: Self = StObject.set(x, "atPosition", js.undefined)
    
    @scala.inline
    def setBeforeShow(value: () => _): Self = StObject.set(x, "beforeShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBeforeShowUndefined: Self = StObject.set(x, "beforeShow", js.undefined)
    
    @scala.inline
    def setButton(value: String): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    @scala.inline
    def setCloseButtonText(value: String): Self = StObject.set(x, "closeButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseButtonTextUndefined: Self = StObject.set(x, "closeButtonText", js.undefined)
    
    @scala.inline
    def setDefaultTime(value: String): Self = StObject.set(x, "defaultTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultTimeUndefined: Self = StObject.set(x, "defaultTime", js.undefined)
    
    @scala.inline
    def setDeselectButtonText(value: String): Self = StObject.set(x, "deselectButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeselectButtonTextUndefined: Self = StObject.set(x, "deselectButtonText", js.undefined)
    
    @scala.inline
    def setHourText(value: String): Self = StObject.set(x, "hourText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHourTextUndefined: Self = StObject.set(x, "hourText", js.undefined)
    
    @scala.inline
    def setHours(value: TimePickerHour): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoursUndefined: Self = StObject.set(x, "hours", js.undefined)
    
    @scala.inline
    def setMinuteText(value: String): Self = StObject.set(x, "minuteText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinuteTextUndefined: Self = StObject.set(x, "minuteText", js.undefined)
    
    @scala.inline
    def setMinutes(value: TimePickerMinutes): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinutesUndefined: Self = StObject.set(x, "minutes", js.undefined)
    
    @scala.inline
    def setMyPosition(value: String): Self = StObject.set(x, "myPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMyPositionUndefined: Self = StObject.set(x, "myPosition", js.undefined)
    
    @scala.inline
    def setNowButtonText(value: String): Self = StObject.set(x, "nowButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNowButtonTextUndefined: Self = StObject.set(x, "nowButtonText", js.undefined)
    
    @scala.inline
    def setOnClose(value: (/* timeText */ String, /* inst */ js.Any) => _): Self = StObject.set(x, "onClose", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
    
    @scala.inline
    def setOnHourShow(value: () => _): Self = StObject.set(x, "onHourShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnHourShowUndefined: Self = StObject.set(x, "onHourShow", js.undefined)
    
    @scala.inline
    def setOnMinuteShow(value: () => _): Self = StObject.set(x, "onMinuteShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnMinuteShowUndefined: Self = StObject.set(x, "onMinuteShow", js.undefined)
    
    @scala.inline
    def setOnSelect(value: (/* timeText */ String, /* inst */ js.Any) => _): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    @scala.inline
    def setOptionalMinutes(value: Boolean): Self = StObject.set(x, "optionalMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalMinutesUndefined: Self = StObject.set(x, "optionalMinutes", js.undefined)
    
    @scala.inline
    def setPeriodSeparator(value: String): Self = StObject.set(x, "periodSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeriodSeparatorUndefined: Self = StObject.set(x, "periodSeparator", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    @scala.inline
    def setShowAnim(value: String): Self = StObject.set(x, "showAnim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAnimUndefined: Self = StObject.set(x, "showAnim", js.undefined)
    
    @scala.inline
    def setShowCloseButton(value: Boolean): Self = StObject.set(x, "showCloseButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowCloseButtonUndefined: Self = StObject.set(x, "showCloseButton", js.undefined)
    
    @scala.inline
    def setShowDeselectButton(value: Boolean): Self = StObject.set(x, "showDeselectButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDeselectButtonUndefined: Self = StObject.set(x, "showDeselectButton", js.undefined)
    
    @scala.inline
    def setShowHours(value: Boolean): Self = StObject.set(x, "showHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowHoursUndefined: Self = StObject.set(x, "showHours", js.undefined)
    
    @scala.inline
    def setShowLeadingZero(value: Boolean): Self = StObject.set(x, "showLeadingZero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowLeadingZeroUndefined: Self = StObject.set(x, "showLeadingZero", js.undefined)
    
    @scala.inline
    def setShowMinutes(value: Boolean): Self = StObject.set(x, "showMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMinutesLeadingZero(value: Boolean): Self = StObject.set(x, "showMinutesLeadingZero", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMinutesLeadingZeroUndefined: Self = StObject.set(x, "showMinutesLeadingZero", js.undefined)
    
    @scala.inline
    def setShowMinutesUndefined: Self = StObject.set(x, "showMinutes", js.undefined)
    
    @scala.inline
    def setShowNowButton(value: Boolean): Self = StObject.set(x, "showNowButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowNowButtonUndefined: Self = StObject.set(x, "showNowButton", js.undefined)
    
    @scala.inline
    def setShowOn(value: String): Self = StObject.set(x, "showOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowOnUndefined: Self = StObject.set(x, "showOn", js.undefined)
    
    @scala.inline
    def setShowOptions(value: js.Any): Self = StObject.set(x, "showOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowOptionsUndefined: Self = StObject.set(x, "showOptions", js.undefined)
    
    @scala.inline
    def setShowPeriod(value: Boolean): Self = StObject.set(x, "showPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPeriodLabels(value: Boolean): Self = StObject.set(x, "showPeriodLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowPeriodLabelsUndefined: Self = StObject.set(x, "showPeriodLabels", js.undefined)
    
    @scala.inline
    def setShowPeriodUndefined: Self = StObject.set(x, "showPeriod", js.undefined)
    
    @scala.inline
    def setTimeSeparator(value: String): Self = StObject.set(x, "timeSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeSeparatorUndefined: Self = StObject.set(x, "timeSeparator", js.undefined)
  }
}
