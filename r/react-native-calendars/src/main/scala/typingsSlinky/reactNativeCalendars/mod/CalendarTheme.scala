package typingsSlinky.reactNativeCalendars.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CalendarTheme extends js.Object {
  var arrowColor: js.UndefOr[String] = js.native
  var backgroundColor: js.UndefOr[String] = js.native
  var calendarBackground: js.UndefOr[String] = js.native
  var dayTextColor: js.UndefOr[String] = js.native
  var dotColor: js.UndefOr[String] = js.native
  var indicatorColor: js.UndefOr[String] = js.native
  var monthTextColor: js.UndefOr[String] = js.native
  var selectedDayBackgroundColor: js.UndefOr[String] = js.native
  var selectedDayTextColor: js.UndefOr[String] = js.native
  var selectedDotColor: js.UndefOr[String] = js.native
  @JSName("stylesheet.agenda.list")
  var stylesheetDotagendaDotlist: js.UndefOr[CalendarThemeIdStyle] = js.native
  @JSName("stylesheet.agenda.main")
  var stylesheetDotagendaDotmain: js.UndefOr[CalendarThemeIdStyle] = js.native
  @JSName("stylesheet.calendar-list.main")
  var `stylesheetDotcalendar-listDotmain`: js.UndefOr[CalendarThemeIdStyle] = js.native
  // Theme ID's to style for
  @JSName("stylesheet.calendar.header")
  var stylesheetDotcalendarDotheader: js.UndefOr[CalendarThemeIdStyle] = js.native
  @JSName("stylesheet.calendar.main")
  var stylesheetDotcalendarDotmain: js.UndefOr[CalendarThemeIdStyle] = js.native
  @JSName("stylesheet.day.basic")
  var stylesheetDotdayDotbasic: js.UndefOr[CalendarThemeIdStyle] = js.native
  @JSName("stylesheet.day.multiDot")
  var stylesheetDotdayDotmultiDot: js.UndefOr[CalendarThemeIdStyle] = js.native
  @JSName("stylesheet.day.period")
  var stylesheetDotdayDotperiod: js.UndefOr[CalendarThemeIdStyle] = js.native
  @JSName("stylesheet.day.single")
  var stylesheetDotdayDotsingle: js.UndefOr[CalendarThemeIdStyle] = js.native
  var textDayFontFamily: js.UndefOr[String] = js.native
  var textDayFontSize: js.UndefOr[Double] = js.native
  var textDayFontWeight: js.UndefOr[String] = js.native
  var textDayHeaderFontFamily: js.UndefOr[String] = js.native
  var textDayHeaderFontSize: js.UndefOr[Double] = js.native
  var textDayHeaderFontWeight: js.UndefOr[String] = js.native
  var textDisabledColor: js.UndefOr[String] = js.native
  var textMonthFontFamily: js.UndefOr[String] = js.native
  var textMonthFontSize: js.UndefOr[Double] = js.native
  var textMonthFontWeight: js.UndefOr[String] = js.native
  var textSectionTitleColor: js.UndefOr[String] = js.native
  var todayTextColor: js.UndefOr[String] = js.native
}

object CalendarTheme {
  @scala.inline
  def apply(): CalendarTheme = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CalendarTheme]
  }
  @scala.inline
  implicit class CalendarThemeOps[Self <: CalendarTheme] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArrowColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArrowColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrowColor")(js.undefined)
        ret
    }
    @scala.inline
    def withBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("backgroundColor")(js.undefined)
        ret
    }
    @scala.inline
    def withCalendarBackground(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarBackground")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendarBackground: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarBackground")(js.undefined)
        ret
    }
    @scala.inline
    def withDayTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withDotColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDotColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dotColor")(js.undefined)
        ret
    }
    @scala.inline
    def withIndicatorColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIndicatorColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("indicatorColor")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthTextColor")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectedDayBackgroundColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedDayBackgroundColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedDayBackgroundColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedDayBackgroundColor")(js.undefined)
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
    def withSelectedDotColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedDotColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSelectedDotColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectedDotColor")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesheetDotagendaDotlist(value: CalendarThemeIdStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylesheet.agenda.list")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStylesheetDotagendaDotlist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylesheet.agenda.list")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesheetDotagendaDotmain(value: CalendarThemeIdStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylesheet.agenda.main")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStylesheetDotagendaDotmain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylesheet.agenda.main")(js.undefined)
        ret
    }
    @scala.inline
    def `withStylesheetDotcalendar-listDotmain`(value: CalendarThemeIdStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylesheet.calendar-list.main")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutStylesheetDotcalendar-listDotmain`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylesheet.calendar-list.main")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesheetDotcalendarDotheader(value: CalendarThemeIdStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylesheet.calendar.header")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStylesheetDotcalendarDotheader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylesheet.calendar.header")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesheetDotcalendarDotmain(value: CalendarThemeIdStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylesheet.calendar.main")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStylesheetDotcalendarDotmain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylesheet.calendar.main")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesheetDotdayDotbasic(value: CalendarThemeIdStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylesheet.day.basic")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStylesheetDotdayDotbasic: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylesheet.day.basic")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesheetDotdayDotmultiDot(value: CalendarThemeIdStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylesheet.day.multiDot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStylesheetDotdayDotmultiDot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylesheet.day.multiDot")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesheetDotdayDotperiod(value: CalendarThemeIdStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylesheet.day.period")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStylesheetDotdayDotperiod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylesheet.day.period")(js.undefined)
        ret
    }
    @scala.inline
    def withStylesheetDotdayDotsingle(value: CalendarThemeIdStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylesheet.day.single")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStylesheetDotdayDotsingle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stylesheet.day.single")(js.undefined)
        ret
    }
    @scala.inline
    def withTextDayFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDayFontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextDayFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDayFontFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withTextDayFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDayFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextDayFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDayFontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withTextDayFontWeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDayFontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextDayFontWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDayFontWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withTextDayHeaderFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDayHeaderFontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextDayHeaderFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDayHeaderFontFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withTextDayHeaderFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDayHeaderFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextDayHeaderFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDayHeaderFontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withTextDayHeaderFontWeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDayHeaderFontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextDayHeaderFontWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDayHeaderFontWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withTextDisabledColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDisabledColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextDisabledColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textDisabledColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTextMonthFontFamily(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textMonthFontFamily")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextMonthFontFamily: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textMonthFontFamily")(js.undefined)
        ret
    }
    @scala.inline
    def withTextMonthFontSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textMonthFontSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextMonthFontSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textMonthFontSize")(js.undefined)
        ret
    }
    @scala.inline
    def withTextMonthFontWeight(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textMonthFontWeight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextMonthFontWeight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textMonthFontWeight")(js.undefined)
        ret
    }
    @scala.inline
    def withTextSectionTitleColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textSectionTitleColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextSectionTitleColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textSectionTitleColor")(js.undefined)
        ret
    }
    @scala.inline
    def withTodayTextColor(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todayTextColor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTodayTextColor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todayTextColor")(js.undefined)
        ret
    }
  }
  
}

