package typingsSlinky.igniteUi

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IgDateEditor
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
  	 * Gets visibility of the spin and clear buttons. That option can be set only on initialization. Combinations like 'spin,clear' are supported too.
  	 *
  	 *
  	 * Valid values:
  	 * "clear" A button to clear the value is located on the right side of the editor.
  	 * "spin" Spin buttons are located on the right side of the editor
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
  	 * This option is inherited from a parent widget and it's not applicable for igDateEditor
  	 */
  var dropDownAttachedToBody: js.UndefOr[Boolean] = js.native
  /**
  	 * This event is inherited from a parent widget and it's not triggered in igDateEditor
  	 */
  var dropDownItemSelected: js.UndefOr[DropDownItemSelectedEvent] = js.native
  /**
  	 * This event is inherited from a parent widget and it's not triggered in igDateEditor
  	 */
  var dropDownItemSelecting: js.UndefOr[DropDownItemSelectingEvent] = js.native
  /**
  	 * This event is inherited from a parent widget and it's not triggered in igDateEditor
  	 */
  var dropDownListClosed: js.UndefOr[DropDownListClosedEvent] = js.native
  /**
  	 * This event is inherited from a parent widget and it's not triggered in igDateEditor
  	 */
  var dropDownListClosing: js.UndefOr[DropDownListClosingEvent] = js.native
  /**
  	 * This event is inherited from a parent widget and it's not triggered in igDateEditor
  	 */
  var dropDownListOpened: js.UndefOr[DropDownListOpenedEvent] = js.native
  /**
  	 * This event is inherited from a parent widget and it's not triggered in igDateEditor
  	 */
  var dropDownListOpening: js.UndefOr[DropDownListOpeningEvent] = js.native
  /**
  	 * This option is inherited from a parent widget and it's not applicable for igDateEditor
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
  	 * This option is inherited from a parent widget and it's not applicable for igDateEditor
  	 */
  var isLimitedToListValues: js.UndefOr[Boolean] = js.native
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
  	 * This option is inherited from a parent widget and it's not applicable for igDateEditor
  	 */
  var listItemHoverDuration: js.UndefOr[Double] = js.native
  /**
  	 * This option is inherited from a parent widget and it's not applicable for igDateEditor
  	 */
  var listItems: js.UndefOr[js.Any] = js.native
  /**
  	 * This option is inherited from a parent widget and it's not applicable for igDateEditor
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
  	 * Gets/Sets if the editor should prevent form submition when enter key is pressed.
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
  	 * Gets/Sets if the editor should revert it's value to the previously valid value in case the value on blur, or enter key is not valid. If the opiton is set to false, editor calls clear functionality.
  	 *
  	 */
  var revertIfNotValid: js.UndefOr[Boolean] = js.native
  /**
  	 * Gets/Sets the action when the editor gets focused. The default value is selectAll.
  	 *
  	 *
  	 * Valid values:
  	 * "selectAll" Setting this option will select all the text into the editor when the edit mode gets enetered.
  	 * "atStart" Setting this option will move the cursor at the begining the text into the editor when the edit mode gets enetered.
  	 * "atEnd" Setting this option will move the cursor at the end the text into the editor when the edit mode gets enetered.
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
  	 * Gets/Sets the ability of the editor to automatically change the hoverd item into the opened dropdown list to its oposide side.
  	 */
  var spinWrapAround: js.UndefOr[Boolean] = js.native
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

object IgDateEditor {
  @scala.inline
  def apply(): IgDateEditor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgDateEditor]
  }
  @scala.inline
  implicit class IgDateEditorOps[Self <: IgDateEditor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowNullValue(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNullValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowNullValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowNullValue")(js.undefined)
        ret
    }
    @scala.inline
    def withButtonType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButtonType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buttonType")(js.undefined)
        ret
    }
    @scala.inline
    def withCenturyThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centuryThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCenturyThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("centuryThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withDataMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDataMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dataMode")(js.undefined)
        ret
    }
    @scala.inline
    def withDateDisplayFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateDisplayFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateDisplayFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateDisplayFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDateInputFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateInputFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateInputFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateInputFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayTimeOffset(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayTimeOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayTimeOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayTimeOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownAnimationDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownAnimationDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropDownAnimationDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownAnimationDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownAttachedToBody(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownAttachedToBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropDownAttachedToBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownAttachedToBody")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownItemSelected(value: (/* event */ Event, /* ui */ DropDownItemSelectedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownItemSelected")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDropDownItemSelected: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownItemSelected")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownItemSelecting(value: (/* event */ Event, /* ui */ DropDownItemSelectingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownItemSelecting")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDropDownItemSelecting: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownItemSelecting")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownListClosed(value: (/* event */ Event, /* ui */ DropDownListClosedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownListClosed")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDropDownListClosed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownListClosed")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownListClosing(value: (/* event */ Event, /* ui */ DropDownListClosingEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownListClosing")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDropDownListClosing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownListClosing")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownListOpened(value: (/* event */ Event, /* ui */ DropDownListOpenedEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownListOpened")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDropDownListOpened: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownListOpened")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownListOpening(value: (/* event */ Event, /* ui */ DropDownListOpeningEventUIParam) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownListOpening")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutDropDownListOpening: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownListOpening")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownOnReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownOnReadOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropDownOnReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownOnReadOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withDropDownOrientation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownOrientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDropDownOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dropDownOrientation")(js.undefined)
        ret
    }
    @scala.inline
    def withEmptyChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEmptyChar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("emptyChar")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableUTCDates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableUTCDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableUTCDates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableUTCDates")(js.undefined)
        ret
    }
    @scala.inline
    def withExcludeKeys(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExcludeKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("excludeKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("height")(js.undefined)
        ret
    }
    @scala.inline
    def withIncludeKeys(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIncludeKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("includeKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withInputMask(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputMask")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputMask: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputMask")(js.undefined)
        ret
    }
    @scala.inline
    def withInputName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputName")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLimitedToListValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLimitedToListValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsLimitedToListValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLimitedToListValues")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLimitSpinToCurrentField(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitSpinToCurrentField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimitSpinToCurrentField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limitSpinToCurrentField")(js.undefined)
        ret
    }
    @scala.inline
    def withListItemHoverDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listItemHoverDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListItemHoverDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listItemHoverDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withListItems(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listItems")(js.undefined)
        ret
    }
    @scala.inline
    def withListWidth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listWidth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listWidth")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxLength(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxLength")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxValue(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxValue")(js.undefined)
        ret
    }
    @scala.inline
    def withMinValue(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minValue")(js.undefined)
        ret
    }
    @scala.inline
    def withNullValueDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNullValue(value: String | Double | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNullValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nullValue")(js.undefined)
        ret
    }
    @scala.inline
    def withPadChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPadChar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("padChar")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceHolder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeHolder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceHolder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeHolder")(js.undefined)
        ret
    }
    @scala.inline
    def withPreventSubmitOnEnter(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventSubmitOnEnter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreventSubmitOnEnter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preventSubmitOnEnter")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withRegional(value: String | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegional: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("regional")(js.undefined)
        ret
    }
    @scala.inline
    def withRevertIfNotValid(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revertIfNotValid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRevertIfNotValid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("revertIfNotValid")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectionOnFocus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectionOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectionOnFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinDelta(value: Double | js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinDelta")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpinDelta: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinDelta")(js.undefined)
        ret
    }
    @scala.inline
    def withSpinWrapAround(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinWrapAround")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpinWrapAround: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spinWrapAround")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressKeyboard(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressKeyboard")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressKeyboard: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressKeyboard")(js.undefined)
        ret
    }
    @scala.inline
    def withSuppressNotifications(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressNotifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuppressNotifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("suppressNotifications")(js.undefined)
        ret
    }
    @scala.inline
    def withTabIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withTextAlign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextAlign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textAlign")(js.undefined)
        ret
    }
    @scala.inline
    def withTextMode(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textMode")(js.undefined)
        ret
    }
    @scala.inline
    def withToLower(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toLower")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToLower: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toLower")(js.undefined)
        ret
    }
    @scala.inline
    def withToUpper(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toUpper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToUpper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toUpper")(js.undefined)
        ret
    }
    @scala.inline
    def withUnfilledCharsPrompt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unfilledCharsPrompt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnfilledCharsPrompt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unfilledCharsPrompt")(js.undefined)
        ret
    }
    @scala.inline
    def withValidatorOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validatorOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidatorOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validatorOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
    @scala.inline
    def withVisibleItemsCount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleItemsCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVisibleItemsCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("visibleItemsCount")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: String | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWidth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("width")(js.undefined)
        ret
    }
    @scala.inline
    def withYearShift(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearShift")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYearShift: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearShift")(js.undefined)
        ret
    }
  }
  
}

