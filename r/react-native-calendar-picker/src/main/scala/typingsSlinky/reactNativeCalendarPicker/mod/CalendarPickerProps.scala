package typingsSlinky.reactNativeCalendarPicker.mod

import typingsSlinky.moment.mod.Moment
import typingsSlinky.reactNative.mod.StyleProp
import typingsSlinky.reactNative.mod.TextStyle
import typingsSlinky.reactNative.mod.ViewStyle
import typingsSlinky.reactNativeCalendarPicker.reactNativeCalendarPickerStrings.circle
import typingsSlinky.reactNativeCalendarPicker.reactNativeCalendarPickerStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarPickerProps extends js.Object {
  var allowRangeSelection: js.UndefOr[Boolean] = js.native
  var customDatesStyles: js.UndefOr[js.Array[CustomDateStyle]] = js.native
  var dayLabelsWrapper: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var dayOfWeekStyles: js.UndefOr[DayOfWeekStyle] = js.native
  var dayShape: js.UndefOr[circle | square] = js.native
  var disabledDates: js.UndefOr[js.Array[js.Date] | DisabledDatesFunc] = js.native
  var disabledDatesTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var enableDateChange: js.UndefOr[Boolean] = js.native
  var enableSwipe: js.UndefOr[Boolean] = js.native
  var headingLevel: js.UndefOr[Double] = js.native
  var height: js.UndefOr[Double] = js.native
  var initialDate: js.UndefOr[js.Date] = js.native
  var maxDate: js.UndefOr[js.Date] = js.native
  var maxRangeDuration: js.UndefOr[Double | js.Array[MaxDurationArrayItem]] = js.native
  var minDate: js.UndefOr[js.Date] = js.native
  var minRangeDuration: js.UndefOr[Double | js.Array[MinDurationArrayItem]] = js.native
  var months: js.UndefOr[js.Array[String]] = js.native
  var nextTitle: js.UndefOr[String] = js.native
  var nextTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var onDateChange: js.UndefOr[DateChangedCallback] = js.native
  var onMonthChange: js.UndefOr[DateChangedCallback] = js.native
  var onSwipe: js.UndefOr[SwipeCallback] = js.native
  var previousTitle: js.UndefOr[String] = js.native
  var previousTitleStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var restrictMonthNavigation: js.UndefOr[Boolean] = js.native
  var scaleFactor: js.UndefOr[Double] = js.native
  var selectedDayColor: js.UndefOr[String] = js.native
  var selectedDayStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var selectedDayTextColor: js.UndefOr[String] = js.native
  var selectedEndDate: js.UndefOr[js.Date] = js.native
  var selectedRangeEndStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var selectedRangeStartStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var selectedRangeStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var selectedStartDate: js.UndefOr[js.Date] = js.native
  var startFromMonday: js.UndefOr[Boolean] = js.native
  var swipeConfig: js.UndefOr[SwipeConfig] = js.native
  var textStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var todayBackgroundColor: js.UndefOr[String] = js.native
  var todayTextStyle: js.UndefOr[StyleProp[TextStyle]] = js.native
  var weekdays: js.UndefOr[js.Array[String]] = js.native
  var width: js.UndefOr[Double] = js.native
}

object CalendarPickerProps {
  @scala.inline
  def apply(): CalendarPickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarPickerProps]
  }
  @scala.inline
  implicit class CalendarPickerPropsOps[Self <: CalendarPickerProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowRangeSelection(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRangeSelection")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowRangeSelection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowRangeSelection")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomDatesStyles(value: js.Array[CustomDateStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customDatesStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomDatesStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customDatesStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withDayLabelsWrapper(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayLabelsWrapper")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayLabelsWrapper: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayLabelsWrapper")(js.undefined)
        ret
    }
    @scala.inline
    def withDayLabelsWrapperNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayLabelsWrapper")(null)
        ret
    }
    @scala.inline
    def withDayOfWeekStyles(value: DayOfWeekStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayOfWeekStyles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayOfWeekStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayOfWeekStyles")(js.undefined)
        ret
    }
    @scala.inline
    def withDayShape(value: circle | square): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayShape")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayShape: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayShape")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledDatesFunction1(value: /* date */ Moment => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDates")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withDisabledDates(value: js.Array[js.Date] | DisabledDatesFunc): Self = {
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
    def withDisabledDatesTextStyle(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDatesTextStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledDatesTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDatesTextStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledDatesTextStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDatesTextStyle")(null)
        ret
    }
    @scala.inline
    def withEnableDateChange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDateChange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableDateChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableDateChange")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableSwipe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSwipe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableSwipe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableSwipe")(js.undefined)
        ret
    }
    @scala.inline
    def withHeadingLevel(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headingLevel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHeadingLevel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("headingLevel")(js.undefined)
        ret
    }
    @scala.inline
    def withHeight(value: Double): Self = {
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
    def withInitialDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitialDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initialDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxRangeDuration(value: Double | js.Array[MaxDurationArrayItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRangeDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxRangeDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxRangeDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMinRangeDuration(value: Double | js.Array[MinDurationArrayItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRangeDuration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinRangeDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minRangeDuration")(js.undefined)
        ret
    }
    @scala.inline
    def withMonths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("months")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("months")(js.undefined)
        ret
    }
    @scala.inline
    def withNextTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withNextTitleStyle(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextTitleStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextTitleStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextTitleStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withNextTitleStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextTitleStyle")(null)
        ret
    }
    @scala.inline
    def withOnDateChange(value: /* date */ Moment => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDateChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnDateChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onDateChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnMonthChange(value: /* date */ Moment => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMonthChange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnMonthChange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onMonthChange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnSwipe(value: /* swipeDirection */ SwipeDirection => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipe")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnSwipe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onSwipe")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousTitleStyle(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousTitleStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreviousTitleStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousTitleStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withPreviousTitleStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousTitleStyle")(null)
        ret
    }
    @scala.inline
    def withRestrictMonthNavigation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictMonthNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestrictMonthNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restrictMonthNavigation")(js.undefined)
        ret
    }
    @scala.inline
    def withScaleFactor(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleFactor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScaleFactor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scaleFactor")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedDayColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedDayColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedDayColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedDayColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedDayStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedDayStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedDayStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedDayStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedDayStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedDayStyle")(null)
        ret
    }
    @scala.inline
    def withSelectedDayTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedDayTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedDayTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedDayTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedEndDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedEndDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedEndDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedEndDate")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedRangeEndStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRangeEndStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedRangeEndStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRangeEndStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedRangeEndStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRangeEndStyle")(null)
        ret
    }
    @scala.inline
    def withSelectedRangeStartStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRangeStartStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedRangeStartStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRangeStartStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedRangeStartStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRangeStartStyle")(null)
        ret
    }
    @scala.inline
    def withSelectedRangeStyle(value: StyleProp[ViewStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRangeStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedRangeStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRangeStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedRangeStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedRangeStyle")(null)
        ret
    }
    @scala.inline
    def withSelectedStartDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedStartDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedStartDate")(js.undefined)
        ret
    }
    @scala.inline
    def withStartFromMonday(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startFromMonday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartFromMonday: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startFromMonday")(js.undefined)
        ret
    }
    @scala.inline
    def withSwipeConfig(value: SwipeConfig): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSwipeConfig: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("swipeConfig")(js.undefined)
        ret
    }
    @scala.inline
    def withTextStyle(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTextStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textStyle")(null)
        ret
    }
    @scala.inline
    def withTodayBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todayBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTodayBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todayBackgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTodayTextStyle(value: StyleProp[TextStyle]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todayTextStyle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTodayTextStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todayTextStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withTodayTextStyleNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todayTextStyle")(null)
        ret
    }
    @scala.inline
    def withWeekdays(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekdays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdays")(js.undefined)
        ret
    }
    @scala.inline
    def withWidth(value: Double): Self = {
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
  }
  
}

