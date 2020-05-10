package typingsSlinky.bootstrapDatepicker

import typingsSlinky.bootstrapDatepicker.bootstrapDatepickerStrings.linked
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * All options that take a “Date” can handle a Date object; a String
  * formatted according to the given format; or a timedelta relative
  * to today, eg “-1d”, “+6m +1y”, etc, where valid units are “d” (day),
  * “w” (week), “m” (month), and “y” (year).
  *
  * See online docs for more info:
  *  https://bootstrap-datepicker.readthedocs.io/en/latest/options.html
  */
@js.native
trait DatepickerOptions extends js.Object {
  var assumeNearbyYear: js.UndefOr[Boolean | Double] = js.native
  var autoclose: js.UndefOr[Boolean] = js.native
  var beforeShowCentury: js.UndefOr[
    js.Function1[/* date */ js.Date, js.UndefOr[String | Boolean | DatepickerBeforeShowResponse]]
  ] = js.native
  var beforeShowDay: js.UndefOr[
    js.Function1[/* date */ js.Date, js.UndefOr[String | Boolean | DatepickerBeforeShowDayResponse]]
  ] = js.native
  var beforeShowDecade: js.UndefOr[
    js.Function1[/* date */ js.Date, js.UndefOr[String | Boolean | DatepickerBeforeShowResponse]]
  ] = js.native
  var beforeShowMonth: js.UndefOr[
    js.Function1[/* date */ js.Date, js.UndefOr[String | Boolean | DatepickerBeforeShowResponse]]
  ] = js.native
  var beforeShowYear: js.UndefOr[
    js.Function1[/* date */ js.Date, js.UndefOr[String | Boolean | DatepickerBeforeShowResponse]]
  ] = js.native
  var calendarWeeks: js.UndefOr[Boolean] = js.native
  var clearBtn: js.UndefOr[Boolean] = js.native
  var container: js.UndefOr[String] = js.native
  var datesDisabled: js.UndefOr[String | js.Array[String]] = js.native
  var daysOfWeekDisabled: js.UndefOr[String | js.Array[Double]] = js.native
  var daysOfWeekHighlighted: js.UndefOr[String | js.Array[Double]] = js.native
  var defaultViewDate: js.UndefOr[js.Date | String | DatepickerViewDate] = js.native
  var enableOnReadonly: js.UndefOr[Boolean] = js.native
  var endDate: js.UndefOr[js.Date | String] = js.native
  var forceParse: js.UndefOr[Boolean] = js.native
  var format: js.UndefOr[String | DatepickerCustomFormatOptions] = js.native
  var immediateUpdates: js.UndefOr[Boolean] = js.native
  var inputs: js.UndefOr[js.Array[_]] = js.native
  var keepEmptyValues: js.UndefOr[Boolean] = js.native
  var keyboardNavigation: js.UndefOr[Boolean] = js.native
  var language: js.UndefOr[String] = js.native
  var maxViewMode: js.UndefOr[DatepickerViewModes] = js.native
  var minViewMode: js.UndefOr[DatepickerViewModes] = js.native
  var multidate: js.UndefOr[Boolean | Double] = js.native
  var multidateSeparator: js.UndefOr[String] = js.native
  var orientation: js.UndefOr[DatepickerOrientations] = js.native
  var showOnFocus: js.UndefOr[Boolean] = js.native
  var showWeekDays: js.UndefOr[Boolean] = js.native
  var startDate: js.UndefOr[js.Date | String] = js.native
  var startView: js.UndefOr[DatepickerViewModes] = js.native
  var templates: js.UndefOr[js.Any] = js.native
  var title: js.UndefOr[String] = js.native
  var todayBtn: js.UndefOr[Boolean | linked] = js.native
  var todayHighlight: js.UndefOr[Boolean] = js.native
  var updateViewDate: js.UndefOr[Boolean] = js.native
  var weekStart: js.UndefOr[Double] = js.native
  var zIndexOffset: js.UndefOr[Double] = js.native
}

object DatepickerOptions {
  @scala.inline
  def apply(): DatepickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatepickerOptions]
  }
  @scala.inline
  implicit class DatepickerOptionsOps[Self <: DatepickerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssumeNearbyYear(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assumeNearbyYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssumeNearbyYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assumeNearbyYear")(js.undefined)
        ret
    }
    @scala.inline
    def withAutoclose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoclose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoclose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoclose")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeShowCentury(value: /* date */ js.Date => js.UndefOr[String | Boolean | DatepickerBeforeShowResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeShowCentury")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeShowCentury: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeShowCentury")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeShowDay(value: /* date */ js.Date => js.UndefOr[String | Boolean | DatepickerBeforeShowDayResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeShowDay")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeShowDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeShowDay")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeShowDecade(value: /* date */ js.Date => js.UndefOr[String | Boolean | DatepickerBeforeShowResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeShowDecade")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeShowDecade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeShowDecade")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeShowMonth(value: /* date */ js.Date => js.UndefOr[String | Boolean | DatepickerBeforeShowResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeShowMonth")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeShowMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeShowMonth")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeShowYear(value: /* date */ js.Date => js.UndefOr[String | Boolean | DatepickerBeforeShowResponse]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeShowYear")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutBeforeShowYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeShowYear")(js.undefined)
        ret
    }
    @scala.inline
    def withCalendarWeeks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarWeeks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendarWeeks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarWeeks")(js.undefined)
        ret
    }
    @scala.inline
    def withClearBtn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearBtn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearBtn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearBtn")(js.undefined)
        ret
    }
    @scala.inline
    def withContainer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContainer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("container")(js.undefined)
        ret
    }
    @scala.inline
    def withDatesDisabled(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datesDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatesDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datesDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDaysOfWeekDisabled(value: String | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysOfWeekDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDaysOfWeekDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysOfWeekDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDaysOfWeekHighlighted(value: String | js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysOfWeekHighlighted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDaysOfWeekHighlighted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysOfWeekHighlighted")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultViewDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultViewDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultViewDate(value: js.Date | String | DatepickerViewDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultViewDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultViewDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultViewDate")(js.undefined)
        ret
    }
    @scala.inline
    def withEnableOnReadonly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableOnReadonly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableOnReadonly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableOnReadonly")(js.undefined)
        ret
    }
    @scala.inline
    def withEndDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndDate(value: js.Date | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endDate")(js.undefined)
        ret
    }
    @scala.inline
    def withForceParse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceParse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceParse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceParse")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String | DatepickerCustomFormatOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withImmediateUpdates(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immediateUpdates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImmediateUpdates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("immediateUpdates")(js.undefined)
        ret
    }
    @scala.inline
    def withInputs(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputs")(js.undefined)
        ret
    }
    @scala.inline
    def withKeepEmptyValues(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepEmptyValues")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeepEmptyValues: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keepEmptyValues")(js.undefined)
        ret
    }
    @scala.inline
    def withKeyboardNavigation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardNavigation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKeyboardNavigation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("keyboardNavigation")(js.undefined)
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
    def withMaxViewMode(value: DatepickerViewModes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxViewMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxViewMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxViewMode")(js.undefined)
        ret
    }
    @scala.inline
    def withMinViewMode(value: DatepickerViewModes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minViewMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinViewMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minViewMode")(js.undefined)
        ret
    }
    @scala.inline
    def withMultidate(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multidate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultidate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multidate")(js.undefined)
        ret
    }
    @scala.inline
    def withMultidateSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multidateSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMultidateSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("multidateSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withOrientation(value: DatepickerOrientations): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrientation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orientation")(js.undefined)
        ret
    }
    @scala.inline
    def withShowOnFocus(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOnFocus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowOnFocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showOnFocus")(js.undefined)
        ret
    }
    @scala.inline
    def withShowWeekDays(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWeekDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowWeekDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWeekDays")(js.undefined)
        ret
    }
    @scala.inline
    def withStartDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartDate(value: js.Date | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startDate")(js.undefined)
        ret
    }
    @scala.inline
    def withStartView(value: DatepickerViewModes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startView")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplates(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templates")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withTodayBtn(value: Boolean | linked): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todayBtn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTodayBtn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todayBtn")(js.undefined)
        ret
    }
    @scala.inline
    def withTodayHighlight(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todayHighlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTodayHighlight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todayHighlight")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateViewDate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateViewDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpdateViewDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateViewDate")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekStart")(js.undefined)
        ret
    }
    @scala.inline
    def withZIndexOffset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndexOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutZIndexOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("zIndexOffset")(js.undefined)
        ret
    }
  }
  
}

