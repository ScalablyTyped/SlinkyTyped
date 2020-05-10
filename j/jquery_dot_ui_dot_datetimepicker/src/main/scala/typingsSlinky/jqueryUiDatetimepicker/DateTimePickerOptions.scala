package typingsSlinky.jqueryUiDatetimepicker

import typingsSlinky.jqueryui.JQueryUI.DatepickerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateTimePickerOptions extends DatepickerOptions {
   //Default: true - Whether to show the timepicker within the datepicker.
  var addSliderAccess: js.UndefOr[Boolean] = js.native
   //Default: 'strict' - How to parse the time string. Two methods are provided: 'strict' which must match the timeFormat exactly, and 'loose' which uses javascript's new Date(timeString) to guess the time. You may also pass in a function(timeFormat, timeString, options) to handle the parsing yourself, returning a simple object:      
  // Alt field options
  var altFieldTimeOnly: js.UndefOr[Boolean] = js.native
    //Default: true - When altField is used from datepicker altField will only receive the formatted time and the original field only receives date.
  var altSeparator: js.UndefOr[String] = js.native
        //Default: (timeSuffix option) - String always placed after the formatted time in the altField.
  var altTimeFormat: js.UndefOr[String] = js.native
         //Default: (separator option) - String placed between formatted date and formatted time in the altField.
  var altTimeSuffix: js.UndefOr[String] = js.native
   //Default: null - Function to be called when a date is chosen or time has changed(parameters: datetimeText, datepickerInstance).
  var alwaysSetTime: js.UndefOr[Boolean] = js.native
        //Default: "Done", A Localization Setting - Text for the Close button.
  var amNames: js.UndefOr[String] = js.native
           //Default: false, A Localization Setting - Right to Left support. 
  // Timefield options
  var controlType: js.UndefOr[String] = js.native
   //Default: null - Object to pass to sliderAccess when used.
  var defaultValue: js.UndefOr[String] = js.native
     //Default: 1 - Microseconds per step the slider makes.
  var hour: js.UndefOr[Double] = js.native
      //Default: 999 - The maximum microsecond allowed for all dates.
  var hourGrid: js.UndefOr[Double] = js.native
      //Default: 0 - The minimum microsecond allowed for all dates.
  var hourMax: js.UndefOr[Double] = js.native
        //Default: null - Initial timezone set.This is the offset in minutes.If null the browser's local timezone will be used. If you're timezone is "-0400" you would use - 240. For backwards compatibility you may pass "-0400", however the timezone is stored in minutes and more reliable.
  var hourMin: js.UndefOr[Double] = js.native
         //Default: "Time", A Localization Setting - Label used within timepicker for the formatted time.
  var hourText: js.UndefOr[String] = js.native
   //Default: null - Date object of the minimum datetime allowed.Also available as minDate.
  var maxDateTime: js.UndefOr[js.Date] = js.native
         //Default: 0 - Initial millisecond set.
  var microsec: js.UndefOr[Double] = js.native
     //Default: 0 - When greater than 0 a label grid will be genereated under the slider.This number represents the units (in milliseconds) between labels.
  var microsecGrid: js.UndefOr[Double] = js.native
      //Default: 999 - The maximum millisecond allowed for all dates.
  var microsecMax: js.UndefOr[Double] = js.native
      //Default: 0 - The minimum millisecond allowed for all dates.
  var microsecMin: js.UndefOr[Double] = js.native
     //Default: "Millisecond", A Localization Setting - Label used to identify the millisecond slider.
  var microsecText: js.UndefOr[String] = js.native
           //Default: 0 - Initial second set.
  var millisec: js.UndefOr[Double] = js.native
       //Default: 0 - When greater than 0 a label grid will be genereated under the slider.This number represents the units (in seconds) between labels.
  var millisecGrid: js.UndefOr[Double] = js.native
        //Default: 59 - The maximum second allowed for all dates.
  var millisecMax: js.UndefOr[Double] = js.native
        //Default: 0 - The minimum second allowed for all dates.
  var millisecMin: js.UndefOr[Double] = js.native
       //Default: "Second", A Localization Setting - Label used to identify the second slider.
  var millisecText: js.UndefOr[String] = js.native
   //Default: null - String of the default time value placed in the input on focus when the input is empty.
  var minDateTime: js.UndefOr[js.Date] = js.native
             //Default: 0 - Initial hour set.
  var minute: js.UndefOr[Double] = js.native
         //Default: 0 - When greater than 0 a label grid will be generated under the slider.This number represents the units (in hours) between labels.
  var minuteGrid: js.UndefOr[Double] = js.native
          //Default: 23 - The maximum hour allowed for all dates.
  var minuteMax: js.UndefOr[Double] = js.native
          //Default: 0 - The minimum hour allowed for all dates.
  var minuteMin: js.UndefOr[Double] = js.native
         //Default: "Hour", A Localization Setting - Label used to identify the hour slider.
  var minuteText: js.UndefOr[String] = js.native
   //Default: false - Hide the datepicker and only provide a time interface.
  @JSName("onSelect")
  var onSelect_DateTimePickerOptions: js.UndefOr[js.Function0[_]] = js.native
   //Default: null - Date object of the maximum datetime allowed.Also Available as maxDate.
  var parse: js.UndefOr[String] = js.native
   //Default: " " - When formatting the time this string is placed between the formatted date and formatted time.
  var pickerTimeFormat: js.UndefOr[String] = js.native
   //Default: (timeFormat option) - How to format the time displayed within the timepicker.
  var pickerTimeSuffix: js.UndefOr[String] = js.native
          //Default: ['AM', 'A'], A Localization Setting - Array of strings to try and parse against to determine AM.
  var pmNames: js.UndefOr[String] = js.native
           //Default: 0 - Initial minute set.
  var second: js.UndefOr[Double] = js.native
       //Default: 0 - When greater than 0 a label grid will be generated under the slider.This number represents the units (in minutes) between labels.
  var secondGrid: js.UndefOr[Double] = js.native
        //Default: 59 - The maximum minute allowed for all dates.
  var secondMax: js.UndefOr[Double] = js.native
        //Default: 0 - The minimum minute allowed for all dates.
  var secondMin: js.UndefOr[Double] = js.native
       //Default: "Minute", A Localization Setting - Label used to identify the minute slider.
  var secondText: js.UndefOr[String] = js.native
   //Default: true - Always have a time set internally, even before user has chosen one.
  var separator: js.UndefOr[String] = js.native
      //Default: 'slider' - Whether to use 'slider' or 'select'.If 'slider' is unavailable through jQueryUI, 'select' will be used.For advanced usage you may pass an object which implements "create", "options", "value" methods to use controls other than sliders or selects.See the _controls property in the source code for more details.
  var showHour: js.UndefOr[Boolean] = js.native
   //Default: null - Whether to show the millisecond control. The default of null will use detection from timeFormat.
  var showMicrosec: js.UndefOr[Boolean] = js.native
     //Default: null - Whether to show the second control. The default of null will use detection from timeFormat.
  var showMillisec: js.UndefOr[Boolean] = js.native
       //Default: null - Whether to show the hour control. The default of null will use detection from timeFormat.
  var showMinute: js.UndefOr[Boolean] = js.native
     //Default: null - Whether to show the minute control. The default of null will use detection from timeFormat.
  var showSecond: js.UndefOr[Boolean] = js.native
   //Default: null - Whether to show the timezone select.
  var showTime: js.UndefOr[Boolean] = js.native
   //Default: (timeSuffix option) - String to place after the formatted time within the timepicker.
  var showTimepicker: js.UndefOr[Boolean] = js.native
   //Default: null - Whether to show the microsecond control. The default of null will use detection from timeFormat.
  var showTimezone: js.UndefOr[Boolean] = js.native
   //Default: false - Adds the sliderAccess plugin to sliders within timepicker
  var sliderAccessArgs: js.UndefOr[js.Any] = js.native
        //Default: true - Whether to show the time selected within the datetimepicker.
  var stepHour: js.UndefOr[Double] = js.native
     //Default: 1 - Milliseconds per step the slider makes.
  var stepMicrosec: js.UndefOr[Double] = js.native
       //Default: 1 - Seconds per step the slider makes.
  var stepMillisec: js.UndefOr[Double] = js.native
         //Default: 1 - Hours per step the slider makes.
  var stepMinute: js.UndefOr[Double] = js.native
       //Default: 1 - Minutes per step the slider makes.
  var stepSecond: js.UndefOr[Double] = js.native
          //Default: ['PM', 'P'], A Localization Setting - Array of strings to try and parse against to determine PM.
  var timeFormat: js.UndefOr[String] = js.native
   //Default: true - Whether to show the button panel at the bottom.This is generally needed.
  var timeOnly: js.UndefOr[Boolean] = js.native
       //Default: "", A Localization Setting - String to place after the formatted time.
  var timeOnlyTitle: js.UndefOr[String] = js.native
       //Default: "HH:mm", A Localization Setting - String of format tokens to be replaced with the time.See Formatting.
  var timeSuffix: js.UndefOr[String] = js.native
    //Default: "Choose Time", A Localization Setting - Title of the wigit when using only timepicker.
  var timeText: js.UndefOr[String] = js.native
         //Default: 0 - Initial microsecond set. Note: Javascript's native Date object does not natively support microseconds. Timepicker adds ability to simply Date.setMicroseconds(m) and Date.getMicroseconds(). Date comparisons will not acknowledge microseconds. Use this only for display purposes.
  var timezone: js.UndefOr[Double] = js.native
     //Default: 0 - When greater than 0 a label grid will be genereated under the slider.This number represents the units (in microseconds) between labels.
  // Timezone options
  var timezoneList: js.UndefOr[js.Array[TimezoneOptions]] = js.native
     //Default: "Microsecond", A Localization Setting - Label used to identify the microsecond slider.
  var timezoneText: js.UndefOr[String] = js.native
}

object DateTimePickerOptions {
  @scala.inline
  def apply(): DateTimePickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimePickerOptions]
  }
  @scala.inline
  implicit class DateTimePickerOptionsOps[Self <: DateTimePickerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddSliderAccess(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSliderAccess")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAddSliderAccess: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addSliderAccess")(js.undefined)
        ret
    }
    @scala.inline
    def withAltFieldTimeOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altFieldTimeOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltFieldTimeOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altFieldTimeOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withAltSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withAltTimeFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altTimeFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltTimeFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altTimeFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withAltTimeSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altTimeSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltTimeSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altTimeSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withAlwaysSetTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysSetTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlwaysSetTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alwaysSetTime")(js.undefined)
        ret
    }
    @scala.inline
    def withAmNames(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amNames")(js.undefined)
        ret
    }
    @scala.inline
    def withControlType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutControlType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("controlType")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withHour(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hour")(js.undefined)
        ret
    }
    @scala.inline
    def withHourGrid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHourGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourGrid")(js.undefined)
        ret
    }
    @scala.inline
    def withHourMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHourMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourMax")(js.undefined)
        ret
    }
    @scala.inline
    def withHourMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHourMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourMin")(js.undefined)
        ret
    }
    @scala.inline
    def withHourText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHourText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourText")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMicrosec(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("microsec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMicrosec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("microsec")(js.undefined)
        ret
    }
    @scala.inline
    def withMicrosecGrid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("microsecGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMicrosecGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("microsecGrid")(js.undefined)
        ret
    }
    @scala.inline
    def withMicrosecMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("microsecMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMicrosecMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("microsecMax")(js.undefined)
        ret
    }
    @scala.inline
    def withMicrosecMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("microsecMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMicrosecMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("microsecMin")(js.undefined)
        ret
    }
    @scala.inline
    def withMicrosecText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("microsecText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMicrosecText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("microsecText")(js.undefined)
        ret
    }
    @scala.inline
    def withMillisec(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("millisec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMillisec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("millisec")(js.undefined)
        ret
    }
    @scala.inline
    def withMillisecGrid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("millisecGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMillisecGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("millisecGrid")(js.undefined)
        ret
    }
    @scala.inline
    def withMillisecMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("millisecMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMillisecMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("millisecMax")(js.undefined)
        ret
    }
    @scala.inline
    def withMillisecMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("millisecMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMillisecMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("millisecMin")(js.undefined)
        ret
    }
    @scala.inline
    def withMillisecText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("millisecText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMillisecText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("millisecText")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDateTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDateTime")(js.undefined)
        ret
    }
    @scala.inline
    def withMinute(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minute")(js.undefined)
        ret
    }
    @scala.inline
    def withMinuteGrid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinuteGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteGrid")(js.undefined)
        ret
    }
    @scala.inline
    def withMinuteMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinuteMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteMax")(js.undefined)
        ret
    }
    @scala.inline
    def withMinuteMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinuteMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteMin")(js.undefined)
        ret
    }
    @scala.inline
    def withMinuteText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinuteText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteText")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withParse(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parse")(js.undefined)
        ret
    }
    @scala.inline
    def withPickerTimeFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerTimeFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPickerTimeFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerTimeFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withPickerTimeSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerTimeSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPickerTimeSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerTimeSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withPmNames(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pmNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPmNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pmNames")(js.undefined)
        ret
    }
    @scala.inline
    def withSecond(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondGrid(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondGrid")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondGrid: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondGrid")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondMax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondMax")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondMin(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondMin")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondText")(js.undefined)
        ret
    }
    @scala.inline
    def withSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("separator")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHour(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHour")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMicrosec(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMicrosec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMicrosec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMicrosec")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMillisec(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMillisec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMillisec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMillisec")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMinute(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMinute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMinute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMinute")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSecond(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSecond")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTime")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTimepicker(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTimepicker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTimepicker: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTimepicker")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTimezone(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTimezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTimezone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTimezone")(js.undefined)
        ret
    }
    @scala.inline
    def withSliderAccessArgs(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderAccessArgs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSliderAccessArgs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sliderAccessArgs")(js.undefined)
        ret
    }
    @scala.inline
    def withStepHour(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepHour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepHour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepHour")(js.undefined)
        ret
    }
    @scala.inline
    def withStepMicrosec(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepMicrosec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepMicrosec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepMicrosec")(js.undefined)
        ret
    }
    @scala.inline
    def withStepMillisec(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepMillisec")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepMillisec: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepMillisec")(js.undefined)
        ret
    }
    @scala.inline
    def withStepMinute(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepMinute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepMinute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepMinute")(js.undefined)
        ret
    }
    @scala.inline
    def withStepSecond(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStepSecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stepSecond")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeOnlyTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeOnlyTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeOnlyTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeOnlyTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeSuffix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSuffix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeSuffix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSuffix")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeText")(js.undefined)
        ret
    }
    @scala.inline
    def withTimezone(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimezone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(js.undefined)
        ret
    }
    @scala.inline
    def withTimezoneList(value: js.Array[TimezoneOptions]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezoneList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimezoneList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezoneList")(js.undefined)
        ret
    }
    @scala.inline
    def withTimezoneText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezoneText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimezoneText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezoneText")(js.undefined)
        ret
    }
  }
  
}

