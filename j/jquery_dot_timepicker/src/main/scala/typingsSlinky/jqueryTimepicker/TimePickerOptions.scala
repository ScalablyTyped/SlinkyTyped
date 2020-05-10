package typingsSlinky.jqueryTimepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimePickerOptions extends js.Object {
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
  implicit class TimePickerOptionsOps[Self <: TimePickerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAltField(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altField")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAltField: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("altField")(js.undefined)
        ret
    }
    @scala.inline
    def withAmPmText(value: js.Tuple2[String, String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amPmText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmPmText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("amPmText")(js.undefined)
        ret
    }
    @scala.inline
    def withAppendText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendText")(js.undefined)
        ret
    }
    @scala.inline
    def withAtPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAtPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("atPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeShow(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBeforeShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeShow")(js.undefined)
        ret
    }
    @scala.inline
    def withButton(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("button")(js.undefined)
        ret
    }
    @scala.inline
    def withCloseButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCloseButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("closeButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultTime")(js.undefined)
        ret
    }
    @scala.inline
    def withDeselectButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deselectButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeselectButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deselectButtonText")(js.undefined)
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
    def withHours(value: TimePickerHour): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hours")(js.undefined)
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
    def withMinutes(value: TimePickerMinutes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minutes")(js.undefined)
        ret
    }
    @scala.inline
    def withMyPosition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("myPosition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMyPosition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("myPosition")(js.undefined)
        ret
    }
    @scala.inline
    def withNowButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nowButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNowButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nowButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withOnClose(value: (/* timeText */ String, /* inst */ js.Any) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnClose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onClose")(js.undefined)
        ret
    }
    @scala.inline
    def withOnHourShow(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHourShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnHourShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onHourShow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMinuteShow(value: () => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMinuteShow")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutOnMinuteShow: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMinuteShow")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSelect(value: (/* timeText */ String, /* inst */ js.Any) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutOnSelect: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSelect")(js.undefined)
        ret
    }
    @scala.inline
    def withOptionalMinutes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOptionalMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("optionalMinutes")(js.undefined)
        ret
    }
    @scala.inline
    def withPeriodSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("periodSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeriodSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("periodSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withRows(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rows")(js.undefined)
        ret
    }
    @scala.inline
    def withShowAnim(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAnim")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowAnim: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAnim")(js.undefined)
        ret
    }
    @scala.inline
    def withShowCloseButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCloseButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowCloseButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showCloseButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowDeselectButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDeselectButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowDeselectButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showDeselectButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHours(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHours")(js.undefined)
        ret
    }
    @scala.inline
    def withShowLeadingZero(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLeadingZero")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowLeadingZero: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showLeadingZero")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMinutes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMinutes")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMinutesLeadingZero(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMinutesLeadingZero")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMinutesLeadingZero: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMinutesLeadingZero")(js.undefined)
        ret
    }
    @scala.inline
    def withShowNowButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNowButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowNowButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showNowButton")(js.undefined)
        ret
    }
    @scala.inline
    def withShowOn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowOn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOn")(js.undefined)
        ret
    }
    @scala.inline
    def withShowOptions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPeriod(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withShowPeriodLabels(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPeriodLabels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowPeriodLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showPeriodLabels")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeSeparator")(js.undefined)
        ret
    }
  }
  
}

