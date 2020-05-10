package typingsSlinky.reactBigCalendar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Formats extends js.Object {
  var agendaDateFormat: js.UndefOr[DateFormat] = js.native
  /**
    * Toolbar header format for the Agenda view, e.g. "4/1/2015 — 5/1/2015"
    */
  var agendaHeaderFormat: js.UndefOr[DateRangeFormatFunction] = js.native
  var agendaTimeFormat: js.UndefOr[DateFormat] = js.native
  var agendaTimeRangeFormat: js.UndefOr[DateRangeFormatFunction] = js.native
  /**
    * Format for the day of the month heading in the Month view.
    * e.g. "01", "02", "03", etc
    */
  var dateFormat: js.UndefOr[DateFormat] = js.native
  /**
    * A day of the week format for Week and Day headings,
    * e.g. "Wed 01/04"
    *
    */
  var dayFormat: js.UndefOr[DateFormat] = js.native
  /**
    * Toolbar header format for the Day view, e.g. "Wednesday Apr 01"
    */
  var dayHeaderFormat: js.UndefOr[DateFormat] = js.native
  /**
    * Toolbar header format for the Week views, e.g. "Mar 29 - Apr 04"
    */
  var dayRangeHeaderFormat: js.UndefOr[DateRangeFormatFunction] = js.native
  /**
    * An optional event time range for events that continue from another day
    */
  var eventTimeRangeEndFormat: js.UndefOr[DateRangeFormatFunction] = js.native
  /**
    * Time range displayed on events.
    */
  var eventTimeRangeFormat: js.UndefOr[DateRangeFormatFunction] = js.native
  /**
    * An optional event time range for events that continue onto another day
    */
  var eventTimeRangeStartFormat: js.UndefOr[DateRangeFormatFunction] = js.native
  /**
    * Toolbar header format for the Month view, e.g "2015 April"
    *
    */
  var monthHeaderFormat: js.UndefOr[DateFormat] = js.native
  /**
    * A time range format for selecting time slots, e.g "8:00am — 2:00pm"
    */
  var selectRangeFormat: js.UndefOr[DateRangeFormatFunction] = js.native
  /**
    * The timestamp cell formats in Week and Time views, e.g. "4:00 AM"
    */
  var timeGutterFormat: js.UndefOr[DateFormat] = js.native
  /**
    * Week day name format for the Month week day headings,
    * e.g: "Sun", "Mon", "Tue", etc
    *
    */
  var weekdayFormat: js.UndefOr[DateFormat] = js.native
}

object Formats {
  @scala.inline
  def apply(): Formats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Formats]
  }
  @scala.inline
  implicit class FormatsOps[Self <: Formats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAgendaDateFormatFunction3(
      value: (/* date */ js.Date, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agendaDateFormat")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withAgendaDateFormat(value: DateFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agendaDateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgendaDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agendaDateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withAgendaHeaderFormat(
      value: (/* range */ DateRange, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agendaHeaderFormat")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAgendaHeaderFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agendaHeaderFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withAgendaTimeFormatFunction3(
      value: (/* date */ js.Date, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agendaTimeFormat")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withAgendaTimeFormat(value: DateFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agendaTimeFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAgendaTimeFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agendaTimeFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withAgendaTimeRangeFormat(
      value: (/* range */ DateRange, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agendaTimeRangeFormat")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAgendaTimeRangeFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("agendaTimeRangeFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDateFormatFunction3(
      value: (/* date */ js.Date, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDateFormat(value: DateFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDayFormatFunction3(
      value: (/* date */ js.Date, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayFormat")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDayFormat(value: DateFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDayHeaderFormatFunction3(
      value: (/* date */ js.Date, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayHeaderFormat")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withDayHeaderFormat(value: DateFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayHeaderFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayHeaderFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayHeaderFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withDayRangeHeaderFormat(
      value: (/* range */ DateRange, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayRangeHeaderFormat")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDayRangeHeaderFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayRangeHeaderFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withEventTimeRangeEndFormat(
      value: (/* range */ DateRange, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTimeRangeEndFormat")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutEventTimeRangeEndFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTimeRangeEndFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withEventTimeRangeFormat(
      value: (/* range */ DateRange, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTimeRangeFormat")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutEventTimeRangeFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTimeRangeFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withEventTimeRangeStartFormat(
      value: (/* range */ DateRange, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTimeRangeStartFormat")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutEventTimeRangeStartFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventTimeRangeStartFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withMonthHeaderFormatFunction3(
      value: (/* date */ js.Date, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthHeaderFormat")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMonthHeaderFormat(value: DateFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthHeaderFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthHeaderFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthHeaderFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withSelectRangeFormat(
      value: (/* range */ DateRange, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectRangeFormat")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSelectRangeFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectRangeFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeGutterFormatFunction3(
      value: (/* date */ js.Date, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeGutterFormat")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withTimeGutterFormat(value: DateFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeGutterFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeGutterFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeGutterFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekdayFormatFunction3(
      value: (/* date */ js.Date, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => String
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdayFormat")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withWeekdayFormat(value: DateFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdayFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekdayFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdayFormat")(js.undefined)
        ret
    }
  }
  
}

