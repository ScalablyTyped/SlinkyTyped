package typingsSlinky.devextreme.mod.DevExpress.ui

import typingsSlinky.devextreme.anon.ComponentDate
import typingsSlinky.devextreme.devextremeStrings.calendar
import typingsSlinky.devextreme.devextremeStrings.century
import typingsSlinky.devextreme.devextremeStrings.date
import typingsSlinky.devextreme.devextremeStrings.datetime
import typingsSlinky.devextreme.devextremeStrings.decade
import typingsSlinky.devextreme.devextremeStrings.list
import typingsSlinky.devextreme.devextremeStrings.month
import typingsSlinky.devextreme.devextremeStrings.native
import typingsSlinky.devextreme.devextremeStrings.rollers
import typingsSlinky.devextreme.devextremeStrings.time
import typingsSlinky.devextreme.devextremeStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxDateBoxOptions extends dxDropDownEditorOptions[dxDateBox] {
  /** Specifies whether or not adaptive widget rendering is enabled on a small screen. */
  var adaptivityEnabled: js.UndefOr[Boolean] = js.native
  /** The text displayed on the Apply button. */
  var applyButtonText: js.UndefOr[String] = js.native
  /** Configures the calendar's value picker. Applies only if the pickerType is "calendar". */
  var calendarOptions: js.UndefOr[dxCalendarOptions] = js.native
  /** The text displayed on the Cancel button. */
  var cancelButtonText: js.UndefOr[String] = js.native
  /** Specifies the message displayed if the specified date is later than the max value or earlier than the min value. */
  var dateOutOfRangeMessage: js.UndefOr[String] = js.native
  /** Specifies the date-time value serialization format. Use it only if you do not specify the value at design time. */
  var dateSerializationFormat: js.UndefOr[String] = js.native
  /** Specifies dates to be disabled. Applies only if pickerType is "calendar". */
  var disabledDates: js.UndefOr[js.Array[js.Date] | (js.Function1[/* data */ ComponentDate, Boolean])] = js.native
  /** Specifies the date display format. Ignored if the pickerType option is "native" */
  var displayFormat: js.UndefOr[format] = js.native
  /** Specifies the interval between neighboring values in the popup list in minutes. */
  var interval: js.UndefOr[Double] = js.native
  /** Specifies the message displayed if the typed value is not a valid date or time. */
  var invalidDateMessage: js.UndefOr[String] = js.native
  /** The last date that can be selected within the widget. */
  var max: js.UndefOr[js.Date | Double | String] = js.native
  /** @deprecated Use the calendarOptions option instead. */
  /** Specifies the maximum zoom level of a calendar, which is used to pick the date. */
  var maxZoomLevel: js.UndefOr[century | decade | month | year] = js.native
  /** The minimum date that can be selected within the widget. */
  var min: js.UndefOr[js.Date | Double | String] = js.native
  /** @deprecated Use the calendarOptions option instead. */
  /** Specifies the minimal zoom level of a calendar, which is used to pick the date. */
  var minZoomLevel: js.UndefOr[century | decade | month | year] = js.native
  /** Specifies the type of the date/time picker. */
  var pickerType: js.UndefOr[calendar | list | native | rollers] = js.native
  /** Specifies whether to show the analog clock in the value picker. Applies only if type is "datetime" and pickerType is "calendar". */
  var showAnalogClock: js.UndefOr[Boolean] = js.native
  /** A format used to display date/time information. */
  var `type`: js.UndefOr[date | datetime | time] = js.native
  /** Specifies whether to control user input using a mask created based on the displayFormat. */
  var useMaskBehavior: js.UndefOr[Boolean] = js.native
  /** An object or a value specifying the date and time currently selected using the date box. */
  @JSName("value")
  var value_dxDateBoxOptions: js.UndefOr[js.Date | Double | String] = js.native
}

object dxDateBoxOptions {
  @scala.inline
  def apply(): dxDateBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDateBoxOptions]
  }
  @scala.inline
  implicit class dxDateBoxOptionsOps[Self <: dxDateBoxOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdaptivityEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adaptivityEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdaptivityEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adaptivityEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withApplyButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplyButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withCalendarOptions(value: dxCalendarOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendarOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelButtonText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButtonText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCancelButtonText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelButtonText")(js.undefined)
        ret
    }
    @scala.inline
    def withDateOutOfRangeMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateOutOfRangeMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateOutOfRangeMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateOutOfRangeMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withDateSerializationFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateSerializationFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateSerializationFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateSerializationFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledDatesFunction1(value: /* data */ ComponentDate => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDates")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDisabledDates(value: js.Array[js.Date] | (js.Function1[/* data */ ComponentDate, Boolean])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledDates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDates")(js.undefined)
        ret
    }
    @scala.inline
    def withDisplayFormatFunction1(value: /* value */ Double | js.Date => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayFormat")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDisplayFormat(value: format): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisplayFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("displayFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterval: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(js.undefined)
        ret
    }
    @scala.inline
    def withInvalidDateMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidDateMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvalidDateMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invalidDateMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: js.Date | Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxZoomLevel(value: century | decade | month | year): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoomLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxZoomLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxZoomLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMin(value: js.Date | Double | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("min")(js.undefined)
        ret
    }
    @scala.inline
    def withMinZoomLevel(value: century | decade | month | year): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoomLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinZoomLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minZoomLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withPickerType(value: calendar | list | native | rollers): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPickerType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickerType")(js.undefined)
        ret
    }
    @scala.inline
    def withShowAnalogClock(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAnalogClock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowAnalogClock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showAnalogClock")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: date | datetime | time): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUseMaskBehavior(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMaskBehavior")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseMaskBehavior: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMaskBehavior")(js.undefined)
        ret
    }
    @scala.inline
    def withValueDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Date | Double | String): Self = {
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
  }
  
}

