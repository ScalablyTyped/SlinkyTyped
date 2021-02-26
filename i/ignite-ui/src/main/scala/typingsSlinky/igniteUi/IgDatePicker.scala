package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgDatePicker
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  
  /**
    * Gets/Sets whether the editor value can become null.
    * If that option is false, and editor has no value, then value is set to an empty string.
    *
    */
  var allowNullValue: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets visibility of the spin, clear and drop-down button. That option can be set only on initialization. Combinations like 'dropdown,spin' or 'spin,clear' are supported too.
    *
    *
    * Valid values:
    * "dropdown" A button to open/close the list is located on the right side of the editor.
    * "clear" A button to clear the value is located on the right side of the editor.
    * "spin" Spin buttons are located on the right side of the editor.
    */
  var buttonType: js.UndefOr[String] = js.native
  
  /**
    * Gets/Sets year for auto detection of 20th and 21st centuries.
    * That option is used to automatically fill century when the user entered only 1 or 2 digits into the year field or when the date pattern contains only 1 or 2 year positions, e.g. "yy" or "y".
    * If user entered value larger than value of this option, then 20th century is used, otherwise the 21st.
    *
    */
  var centuryThreshold: js.UndefOr[Double] = js.native
  
  /**
    * Gets the value type returned by the get of value() method and option. Also affects how the value is stored for form submit.
    * The [enableUTCDates](ui.%%WidgetNameLowered%%#options:enableUTCDates) option can be used to output an UTC ISO string instead.
    * For example 10:00 AM from a client with local offset of 5 hours ahead of GMT will be serialized as:
    * "2016-11-11T10:00:00+05:00"
    *
    *
    * Valid values:
    * "date" The value method returns a Date object. When this mode is set the value sent to the server on submit is serialized as ISO 8061 string with local time and zone values by default.
    * "displayModeText" The "text" in display mode (no focus) format (pattern) is used to be send to the server and is returned from the value() method (returns a string object).
    * "editModeText" The "text" in edit mode (focus) format (pattern) is used to be send to the server and is returned from the value() method (returns a string object).
    */
  var dataMode: js.UndefOr[String] = js.native
  
  /**
    * Gets/Sets format of date while editor has no focus.
    * Value of that option can be set to a specific date pattern or to a flag defined by regional settings.
    * If value is not set, then the dateInputFormat is used automatically.
    * If value is set to explicit date pattern and pattern besides date-flags has explicit characters which match with date-flags or mask-flags, then the "escape" character should be used in front of them.
    * List of predefined regional flags:
    * "date": the datePattern member of regional option is used
    * "dateLong": the dateLongPattern member of regional option is used
    * "time": the timePattern member of regional option is used
    * "timeLong": the timeLongPattern member of regional option is used
    * "dateTime": the dateTimePattern member of regional option is used
    * List of explicit characters, which should have escape \\ character in front of them:
    * C, &, a, A, ?, L, 9, 0, #, >, <, y, M, d, h, H, m, s, t, f.
    * List of date-flags when explicit date pattern is used:
    * "y": year field without century and without leading zero
    * "yy": year field without century and with leading zero
    * "yyyy": year field with leading zeros
    * "M": month field as digit without leading zero
    * "MM": month field as digit with leading zero
    * "MMM": month field as short month name
    * "MMMM": month field as long month name
    * "d": day of month field without leading zero
    * "dd": day of month field with leading zero
    * "ddd": day of the week as short name
    * "dddd": day of the week as long name
    * "t": first character of string which represents AM/PM field
    * "tt": 2 characters of string which represents AM/PM field
    * "h": hours field in 12-hours format without leading zero
    * "hh": hours field in 12-hours format with leading zero
    * "H": hours field in 24-hours format without leading zero
    * "HH": hours field in 24-hours format with leading zero
    * "m": minutes field without leading zero
    * "mm": minutes field with leading zero
    * "s": seconds field without leading zero
    * "ss": seconds field with leading zero
    * "f": milliseconds field in hundreds
    * "ff": milliseconds field in tenths
    * "fff": milliseconds field
    *
    */
  var dateDisplayFormat: js.UndefOr[String] = js.native
  
  /**
    * Gets format of date while editor has focus.
    * Value of that option can be set to explicit date pattern or to a flag defined by regional settings.
    * If value is set to explicit date pattern and pattern besides date-flags has explicit characters which match with date-flags or mask-flags, then the "escape" character should be used in front of them.
    * If option is not set, then the "date" is used automatically.
    * List of predefined regional flags:
    * "date": the datePattern member of regional option is used
    * "dateLong": the dateLongPattern member of regional option is used
    * "time": the timePattern member of regional option is used
    * "timeLong": the timeLongPattern member of regional option is used
    * "dateTime": the dateTimePattern member of regional option is used
    * List of explicit characters, which should have escape \\ character in front of them: C, &, a, A, ?, L, 9, 0, #, >, <, y, M, d, h, H, m, s, t, f.
    * List of date-flags when explicit date pattern is used:
    * "yy": year field without century and with leading zero
    * "yyyy": year field with leading zeros
    * "MM": month field as digit with leading zero
    * "dd": day of month field with leading zero
    * "t": first character of string which represents AM/PM field
    * "tt": 2 characters of string which represents AM/PM field
    * "hh": hours field in 12-hours format with leading zero
    * "HH": hours field in 24-hours format with leading zero
    * "mm": minutes field with leading zero
    * "ss": seconds field with leading zero
    * "f": milliseconds field in hundreds
    * "ff": milliseconds field in tenths
    * "fff": milliseconds field
    * Note! This option can not be set runtime.
    *
    */
  var dateInputFormat: js.UndefOr[String] = js.native
  
  /**
    * Gets/Sets the options supported by the [jquery.ui.datepicker](http://api.jqueryui.com/datepicker/). Only options related to the drop-down calendar are supported.
    *
    */
  var datepickerOptions: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets/Sets the disabled attribute for the input. If set to true the input is disabled, and all buttons and interactions are disabled. On submitting the form the editor belongs to, the value is not submitted.
    *
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets/Sets time zone offset from UTC, in minutes. The client date values are displayed with this offset instead of the local one.
    * Note: It is recommended that this option is used with an UTC value (e.g. "2016-11-03T14:08:08.504Z") so the outcome is consistent.
    * Values with ambiguous time zone could map to unpredictable times depending on the user agent local zone.
    *
    */
  var displayTimeOffset: js.UndefOr[js.Any] = js.native
  
  /**
    * This option is inherited from a parent widget and it's not applicable for igDateEditor
    */
  var dropDownAnimationDuration: js.UndefOr[Double] = js.native
  
  /**
    * This option is inherited from a parent widget and it's not applicable for igDatePicker
    */
  var dropDownAttachedToBody: js.UndefOr[Boolean] = js.native
  
  /**
    * This event is inherited from a parent widget and it's not triggered in igDatePicker
    */
  var dropDownItemSelected: js.UndefOr[DropDownItemSelectedEvent] = js.native
  
  /**
    * This event is inherited from a parent widget and it's not triggered in igDatePicker
    */
  var dropDownItemSelecting: js.UndefOr[DropDownItemSelectingEvent] = js.native
  
  /**
    * Fired after the drop down (calendar) is closed.
    */
  var dropDownListClosed: js.UndefOr[DropDownListClosedEvent] = js.native
  
  /**
    * This event is inherited from a parent widget and it's not triggered in igDatePicker
    */
  var dropDownListClosing: js.UndefOr[DropDownListClosingEvent] = js.native
  
  /**
    * Fired after the drop down is opened.
    */
  var dropDownListOpened: js.UndefOr[DropDownListOpenedEvent] = js.native
  
  /**
    * Fired when the drop down is opening.
    */
  var dropDownListOpening: js.UndefOr[DropDownListOpeningEvent] = js.native
  
  /**
    * Gets the ability to limit igDatePicker to be used only as s calendar. When set to true the editor input is not editable.
    * Note! This option can not be set runtime.
    *
    */
  var dropDownOnReadOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * This option is inherited from a parent widget and it's not applicable for igMaskEditor
    */
  var dropDownOrientation: js.UndefOr[String] = js.native
  
  /**
    * This option is inherited from a parent widget and it's not applicable for igDateEditor
    */
  var emptyChar: js.UndefOr[String] = js.native
  
  /**
    * Enables/Disables serializing client date as UTC ISO 8061 string instead of using the local time and zone values.
    * The option is only applied in "date" [dataMode](ui.%%WidgetNameLowered%%#options:dataMode).
    *
    */
  var enableUTCDates: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets ability to prevent entering specific characters from keyboard or on paste.
    * Notes:
    * If a character is specified in "includeKeys" option also, then "excludeKeys" has priority.
    * Note! This option can not be se runtime.
    *
    */
  var excludeKeys: js.UndefOr[String] = js.native
  
  /**
    * Gets/Sets the height of the control.
    *
    *
    * Valid values:
    * "null" will fit the editor inside its parent container, if no other heights are defined.
    */
  var height: js.UndefOr[String | Double] = js.native
  
  /**
    * Gets ability to enter only specific characters in input-field from keyboard and on paste.
    * Notes:
    * If "excludeKeys" option contains same characters as this option, then "excludeKeys" has priority.
    * Note! This option can not be se runtime.
    *
    */
  var includeKeys: js.UndefOr[String] = js.native
  
  /**
    * This option is inherited from a parent widget and it's not applicable for igDateEditor
    */
  var inputMask: js.UndefOr[String] = js.native
  
  /**
    * Gets/Sets the name attribute of the value input. This input is used to sent the value to the server. In case the target element is input and it has name attribute, but the developer has set the inputName option, so this option overwrites the value input and removes the attribute from the element.
    *
    */
  var inputName: js.UndefOr[String] = js.native
  
  /**
    * This option is inherited from a parent widget and it's not applicable for igDatePicker
    */
  var isLimitedToListValues: js.UndefOr[Boolean] = js.native
  
  /**
    * Fired after a date selection in the calendar.
    */
  var itemSelected: js.UndefOr[ItemSelectedEvent] = js.native
  
  /**
    * Set/Get the locale language setting for the widget.
    *
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * Gets/Sets ability to modify only 1 date field on spin events.
    * Value false enables changes of other date fields when incremented or decremented date-field reaches its limits.
    * Value true modifies only value of one field.
    *
    */
  var limitSpinToCurrentField: js.UndefOr[Boolean] = js.native
  
  /**
    * This option is inherited from a parent widget and it's not applicable for igDatePicker
    */
  var listItemHoverDuration: js.UndefOr[Double] = js.native
  
  /**
    * This option is inherited from a parent widget and it's not applicable for igDatePicker
    */
  var listItems: js.UndefOr[js.Any] = js.native
  
  /**
    * This option is inherited from a parent widget and it's not applicable for igDatePicker
    */
  var listWidth: js.UndefOr[Double] = js.native
  
  /**
    * Set/Get the locale setting for the widget.
    *
    */
  var locale: js.UndefOr[js.Any] = js.native
  
  /**
    * This option is inherited from a parent widget and it's not applicable for igMaskEditor
    */
  var maxLength: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets the maximum value which can be entered in editor by user. Date object can be set as value. String value can be passed and the editor will use the javascript Date object constructor to create date object and will use it for the comparison. MVC date format can be used too.
    * Note! This option doesn't use the dateInputFormat to extract the date.
    *
    */
  var maxValue: js.UndefOr[js.Date] = js.native
  
  /**
    * Gets the minimum value which can be entered in editor by user. Date object can be set as value. String value can be passed and the editor will use the javascript Date object constructor to create date object and will use it for the comparison. MVC date format can be used too.
    * Note! This option doesn't use the dateInputFormat to extract the date.
    *
    */
  var minValue: js.UndefOr[js.Date] = js.native
  
  /**
    * Gets/Sets the representation of null value. In case of default the value for the input is set to null, which makes the input to hold an empty string
    *
    */
  var nullValue: js.UndefOr[String | Double | js.Date] = js.native
  
  /**
    * This option is inherited from a parent widget and it's not applicable for igDateEditor
    */
  var padChar: js.UndefOr[String] = js.native
  
  /**
    * Gets/Sets the text which appears in the editor when it has no focus and the "value" is null or empty string.
    *
    */
  var placeHolder: js.UndefOr[String] = js.native
  
  /**
    * Gets/Sets if the editor should prevent form submit when enter key is pressed.
    *
    */
  var preventSubmitOnEnter: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets/Sets the readonly attribute for the input. If set to true the input is readonly, and all buttons and interactions are disabled. On submitting the form the editor belongs to, the value is submitted.
    *
    */
  var readOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Set/Get the regional setting for the widget.
    *
    */
  var regional: js.UndefOr[String | js.Object] = js.native
  
  /**
    * Gets/Sets if the editor should revert it's value to the previously valid value in case the value on blur, or enter key is not valid. If the option is set to false, editor calls clear functionality.
    *
    */
  var revertIfNotValid: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets/Sets the action when the editor gets focused. The default value is selectAll.
    *
    *
    * Valid values:
    * "selectAll" Setting this option will select all the text into the editor when the edit mode gets entered.
    * "atStart" Setting this option will move the cursor at the beginning the text into the editor when the edit mode gets entered.
    * "atEnd" Setting this option will move the cursor at the end the text into the editor when the edit mode gets entered.
    * "browserDefault" Setting this option won't do any extra logic, but proceed with the browser default behavior.
    */
  var selectionOnFocus: js.UndefOr[String] = js.native
  
  /**
    * Gets/Sets delta-value which is used to increment or decrement the editor date on spin actions.When not editing (focused) the delta is applied on the day if available in the input mask or the lowest available period.
    * When in edit mode the time period, where the cursor is positioned, is incremented or decremented with the defined delta value.
    * Accepted values for deltas are positive integer numbers, and the fractional portion of floating point numbers is ignored.
    * spinDelta: {
    * year: 4,
    * month: 3,
    * day: 10,
    * hours: 12,
    * minutes: 15,
    * seconds: 10,
    * milliseconds: 100
    * }
    * Time periods that don't have values use 1 as default.
    *
    *
    * Valid values:
    * "number" Value this value it is applied to all time periods - years, days, minutes, etc.
    * "object" A configuration object, which defines specific values for each time period. The option can accept the following format:
    */
  var spinDelta: js.UndefOr[Double | js.Object] = js.native
  
  /**
    * Gets/Sets the ability of the editor to automatically change the hovered item into the opened dropdown list to its opposite side.
    */
  var spinWrapAround: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets/Sets whether the onscreen keyboard (if available on device) should be shown when the dropdown button is clicked/tapped. This option prevents initial focus or removes it when the drop button is clicked/tapped.
    * Note: The option does not perform device detection so its behavior is always active if enabled.
    *
    */
  var suppressKeyboard: js.UndefOr[Boolean] = js.native
  
  /**
    * Disables/Enables default notifications for basic validation scenarios built in the editors such as required list selection, value wrapping around or spin limits.
    *
    */
  var suppressNotifications: js.UndefOr[Boolean] = js.native
  
  /**
    * Gets/Sets tabIndex attribute for the editor input.
    *
    */
  var tabIndex: js.UndefOr[Double] = js.native
  
  /**
    * Gets/Sets the horizontal alignment of the text in the editor.
    *
    *
    * Valid values:
    * "left" The text into the input gets aligned to the left.
    * "right" The text into the input gets aligned to the right.
    * "center" The text into the input gets aligned to the center.
    */
  var textAlign: js.UndefOr[String] = js.native
  
  var textMode: js.UndefOr[js.Any] = js.native
  
  /**
    * This option is inherited from a parent widget and it's not applicable for igDateEditor
    */
  var toLower: js.UndefOr[Boolean] = js.native
  
  /**
    * This option is inherited from a parent widget and it's not applicable for igDateEditor
    */
  var toUpper: js.UndefOr[Boolean] = js.native
  
  /**
    * This option is inherited from a parent widget and it's not applicable for igDateEditor
    */
  var unfilledCharsPrompt: js.UndefOr[String] = js.native
  
  /**
    * Gets/Sets options supported by the [igValidator](ui.igvalidator#options) widget.
    * Note: Validation rules of [igValidator](ui.igvalidator#options), such as min and max value/length are applied separately triggering errors,
    * while the corresponding options of the editor prevent values violating the defined rules from being entered.
    *
    */
  var validatorOptions: js.UndefOr[js.Any] = js.native
  
  /**
    * Gets/Sets the value of the editor. Date object can be set as value. String can be set and the editor will pass it to the Date object constructor and use the corresponding Date object as the value. MVC date format can be used too.
    * Note! This option doesn't use the dateInputFormat to extract the date.
    *
    */
  var value: js.UndefOr[js.Date] = js.native
  
  /**
    * Gets/Sets how many items should be shown at once.
    * Notes:
    * That option is overwritten if the number of list items is less than the value. In that case the height of the dropdown is adjusted to the number of items.
    * Note! This option can not be set runtime.
    */
  var visibleItemsCount: js.UndefOr[Double] = js.native
  
  /**
    * Gets/Sets the width of the control.
    *
    *
    * Valid values:
    * "null" will stretch to fit data, if no other widths are defined.
    */
  var width: js.UndefOr[String | Double] = js.native
  
  /**
    * Gets/Set value used to increase/decrease year part of the date, in order to set difference between year in Gregorian calendar and displayed year.
    *
    */
  var yearShift: js.UndefOr[Double] = js.native
}
object IgDatePicker {
  
  @scala.inline
  def apply(): IgDatePicker = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgDatePicker]
  }
  
  @scala.inline
  implicit class IgDatePickerMutableBuilder[Self <: IgDatePicker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowNullValue(value: Boolean): Self = StObject.set(x, "allowNullValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowNullValueUndefined: Self = StObject.set(x, "allowNullValue", js.undefined)
    
    @scala.inline
    def setButtonType(value: String): Self = StObject.set(x, "buttonType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonTypeUndefined: Self = StObject.set(x, "buttonType", js.undefined)
    
    @scala.inline
    def setCenturyThreshold(value: Double): Self = StObject.set(x, "centuryThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenturyThresholdUndefined: Self = StObject.set(x, "centuryThreshold", js.undefined)
    
    @scala.inline
    def setDataMode(value: String): Self = StObject.set(x, "dataMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataModeUndefined: Self = StObject.set(x, "dataMode", js.undefined)
    
    @scala.inline
    def setDateDisplayFormat(value: String): Self = StObject.set(x, "dateDisplayFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateDisplayFormatUndefined: Self = StObject.set(x, "dateDisplayFormat", js.undefined)
    
    @scala.inline
    def setDateInputFormat(value: String): Self = StObject.set(x, "dateInputFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateInputFormatUndefined: Self = StObject.set(x, "dateInputFormat", js.undefined)
    
    @scala.inline
    def setDatepickerOptions(value: js.Any): Self = StObject.set(x, "datepickerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatepickerOptionsUndefined: Self = StObject.set(x, "datepickerOptions", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setDisplayTimeOffset(value: js.Any): Self = StObject.set(x, "displayTimeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayTimeOffsetUndefined: Self = StObject.set(x, "displayTimeOffset", js.undefined)
    
    @scala.inline
    def setDropDownAnimationDuration(value: Double): Self = StObject.set(x, "dropDownAnimationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropDownAnimationDurationUndefined: Self = StObject.set(x, "dropDownAnimationDuration", js.undefined)
    
    @scala.inline
    def setDropDownAttachedToBody(value: Boolean): Self = StObject.set(x, "dropDownAttachedToBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropDownAttachedToBodyUndefined: Self = StObject.set(x, "dropDownAttachedToBody", js.undefined)
    
    @scala.inline
    def setDropDownItemSelected(value: (/* event */ Event, /* ui */ DropDownItemSelectedEventUIParam) => Unit): Self = StObject.set(x, "dropDownItemSelected", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDropDownItemSelectedUndefined: Self = StObject.set(x, "dropDownItemSelected", js.undefined)
    
    @scala.inline
    def setDropDownItemSelecting(value: (/* event */ Event, /* ui */ DropDownItemSelectingEventUIParam) => Unit): Self = StObject.set(x, "dropDownItemSelecting", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDropDownItemSelectingUndefined: Self = StObject.set(x, "dropDownItemSelecting", js.undefined)
    
    @scala.inline
    def setDropDownListClosed(value: (/* event */ Event, /* ui */ DropDownListClosedEventUIParam) => Unit): Self = StObject.set(x, "dropDownListClosed", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDropDownListClosedUndefined: Self = StObject.set(x, "dropDownListClosed", js.undefined)
    
    @scala.inline
    def setDropDownListClosing(value: (/* event */ Event, /* ui */ DropDownListClosingEventUIParam) => Unit): Self = StObject.set(x, "dropDownListClosing", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDropDownListClosingUndefined: Self = StObject.set(x, "dropDownListClosing", js.undefined)
    
    @scala.inline
    def setDropDownListOpened(value: (/* event */ Event, /* ui */ DropDownListOpenedEventUIParam) => Unit): Self = StObject.set(x, "dropDownListOpened", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDropDownListOpenedUndefined: Self = StObject.set(x, "dropDownListOpened", js.undefined)
    
    @scala.inline
    def setDropDownListOpening(value: (/* event */ Event, /* ui */ DropDownListOpeningEventUIParam) => Unit): Self = StObject.set(x, "dropDownListOpening", js.Any.fromFunction2(value))
    
    @scala.inline
    def setDropDownListOpeningUndefined: Self = StObject.set(x, "dropDownListOpening", js.undefined)
    
    @scala.inline
    def setDropDownOnReadOnly(value: Boolean): Self = StObject.set(x, "dropDownOnReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropDownOnReadOnlyUndefined: Self = StObject.set(x, "dropDownOnReadOnly", js.undefined)
    
    @scala.inline
    def setDropDownOrientation(value: String): Self = StObject.set(x, "dropDownOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropDownOrientationUndefined: Self = StObject.set(x, "dropDownOrientation", js.undefined)
    
    @scala.inline
    def setEmptyChar(value: String): Self = StObject.set(x, "emptyChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmptyCharUndefined: Self = StObject.set(x, "emptyChar", js.undefined)
    
    @scala.inline
    def setEnableUTCDates(value: Boolean): Self = StObject.set(x, "enableUTCDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableUTCDatesUndefined: Self = StObject.set(x, "enableUTCDates", js.undefined)
    
    @scala.inline
    def setExcludeKeys(value: String): Self = StObject.set(x, "excludeKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeKeysUndefined: Self = StObject.set(x, "excludeKeys", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setIncludeKeys(value: String): Self = StObject.set(x, "includeKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeKeysUndefined: Self = StObject.set(x, "includeKeys", js.undefined)
    
    @scala.inline
    def setInputMask(value: String): Self = StObject.set(x, "inputMask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputMaskUndefined: Self = StObject.set(x, "inputMask", js.undefined)
    
    @scala.inline
    def setInputName(value: String): Self = StObject.set(x, "inputName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputNameUndefined: Self = StObject.set(x, "inputName", js.undefined)
    
    @scala.inline
    def setIsLimitedToListValues(value: Boolean): Self = StObject.set(x, "isLimitedToListValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLimitedToListValuesUndefined: Self = StObject.set(x, "isLimitedToListValues", js.undefined)
    
    @scala.inline
    def setItemSelected(value: (/* event */ Event, /* ui */ ItemSelectedEventUIParam) => Unit): Self = StObject.set(x, "itemSelected", js.Any.fromFunction2(value))
    
    @scala.inline
    def setItemSelectedUndefined: Self = StObject.set(x, "itemSelected", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    @scala.inline
    def setLimitSpinToCurrentField(value: Boolean): Self = StObject.set(x, "limitSpinToCurrentField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitSpinToCurrentFieldUndefined: Self = StObject.set(x, "limitSpinToCurrentField", js.undefined)
    
    @scala.inline
    def setListItemHoverDuration(value: Double): Self = StObject.set(x, "listItemHoverDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListItemHoverDurationUndefined: Self = StObject.set(x, "listItemHoverDuration", js.undefined)
    
    @scala.inline
    def setListItems(value: js.Any): Self = StObject.set(x, "listItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListItemsUndefined: Self = StObject.set(x, "listItems", js.undefined)
    
    @scala.inline
    def setListWidth(value: Double): Self = StObject.set(x, "listWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListWidthUndefined: Self = StObject.set(x, "listWidth", js.undefined)
    
    @scala.inline
    def setLocale(value: js.Any): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    @scala.inline
    def setMaxLength(value: js.Any): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    @scala.inline
    def setMaxValue(value: js.Date): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: js.Date): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    @scala.inline
    def setNullValue(value: String | Double | js.Date): Self = StObject.set(x, "nullValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullValueDate(value: js.Date): Self = StObject.set(x, "nullValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNullValueUndefined: Self = StObject.set(x, "nullValue", js.undefined)
    
    @scala.inline
    def setPadChar(value: String): Self = StObject.set(x, "padChar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadCharUndefined: Self = StObject.set(x, "padChar", js.undefined)
    
    @scala.inline
    def setPlaceHolder(value: String): Self = StObject.set(x, "placeHolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlaceHolderUndefined: Self = StObject.set(x, "placeHolder", js.undefined)
    
    @scala.inline
    def setPreventSubmitOnEnter(value: Boolean): Self = StObject.set(x, "preventSubmitOnEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventSubmitOnEnterUndefined: Self = StObject.set(x, "preventSubmitOnEnter", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setRegional(value: String | js.Object): Self = StObject.set(x, "regional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegionalUndefined: Self = StObject.set(x, "regional", js.undefined)
    
    @scala.inline
    def setRevertIfNotValid(value: Boolean): Self = StObject.set(x, "revertIfNotValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevertIfNotValidUndefined: Self = StObject.set(x, "revertIfNotValid", js.undefined)
    
    @scala.inline
    def setSelectionOnFocus(value: String): Self = StObject.set(x, "selectionOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionOnFocusUndefined: Self = StObject.set(x, "selectionOnFocus", js.undefined)
    
    @scala.inline
    def setSpinDelta(value: Double | js.Object): Self = StObject.set(x, "spinDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpinDeltaUndefined: Self = StObject.set(x, "spinDelta", js.undefined)
    
    @scala.inline
    def setSpinWrapAround(value: Boolean): Self = StObject.set(x, "spinWrapAround", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpinWrapAroundUndefined: Self = StObject.set(x, "spinWrapAround", js.undefined)
    
    @scala.inline
    def setSuppressKeyboard(value: Boolean): Self = StObject.set(x, "suppressKeyboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressKeyboardUndefined: Self = StObject.set(x, "suppressKeyboard", js.undefined)
    
    @scala.inline
    def setSuppressNotifications(value: Boolean): Self = StObject.set(x, "suppressNotifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressNotificationsUndefined: Self = StObject.set(x, "suppressNotifications", js.undefined)
    
    @scala.inline
    def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
    
    @scala.inline
    def setTextAlign(value: String): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
    
    @scala.inline
    def setTextMode(value: js.Any): Self = StObject.set(x, "textMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextModeUndefined: Self = StObject.set(x, "textMode", js.undefined)
    
    @scala.inline
    def setToLower(value: Boolean): Self = StObject.set(x, "toLower", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToLowerUndefined: Self = StObject.set(x, "toLower", js.undefined)
    
    @scala.inline
    def setToUpper(value: Boolean): Self = StObject.set(x, "toUpper", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUpperUndefined: Self = StObject.set(x, "toUpper", js.undefined)
    
    @scala.inline
    def setUnfilledCharsPrompt(value: String): Self = StObject.set(x, "unfilledCharsPrompt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnfilledCharsPromptUndefined: Self = StObject.set(x, "unfilledCharsPrompt", js.undefined)
    
    @scala.inline
    def setValidatorOptions(value: js.Any): Self = StObject.set(x, "validatorOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidatorOptionsUndefined: Self = StObject.set(x, "validatorOptions", js.undefined)
    
    @scala.inline
    def setValue(value: js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setVisibleItemsCount(value: Double): Self = StObject.set(x, "visibleItemsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleItemsCountUndefined: Self = StObject.set(x, "visibleItemsCount", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setYearShift(value: Double): Self = StObject.set(x, "yearShift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYearShiftUndefined: Self = StObject.set(x, "yearShift", js.undefined)
  }
}
