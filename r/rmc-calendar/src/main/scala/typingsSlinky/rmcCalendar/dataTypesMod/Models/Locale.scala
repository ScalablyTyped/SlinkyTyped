package typingsSlinky.rmcCalendar.dataTypesMod.Models

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Locale extends js.Object {
  var am: String = js.native
  var begin: String = js.native
  var begin_over: String = js.native
  var clear: String = js.native
  var confirm: String = js.native
  var dateFormat: String = js.native
  var dateTimeFormat: String = js.native
  var end: String = js.native
  var lastMonth: String = js.native
  var lastWeek: String = js.native
  var loadPrevMonth: String = js.native
  var month: String = js.native
  var monthTitle: String = js.native
  var noChoose: String = js.native
  var over: String = js.native
  var pm: String = js.native
  var selectEndTime: String = js.native
  var selectStartTime: String = js.native
  var selectTime: String = js.native
  var start: String = js.native
  var title: String = js.native
  var today: String = js.native
  var week: js.Array[String] = js.native
  var year: String = js.native
  var yesterday: String = js.native
}

object Locale {
  @scala.inline
  def apply(
    am: String,
    begin: String,
    begin_over: String,
    clear: String,
    confirm: String,
    dateFormat: String,
    dateTimeFormat: String,
    end: String,
    lastMonth: String,
    lastWeek: String,
    loadPrevMonth: String,
    month: String,
    monthTitle: String,
    noChoose: String,
    over: String,
    pm: String,
    selectEndTime: String,
    selectStartTime: String,
    selectTime: String,
    start: String,
    title: String,
    today: String,
    week: js.Array[String],
    year: String,
    yesterday: String
  ): Locale = {
    val __obj = js.Dynamic.literal(am = am.asInstanceOf[js.Any], begin = begin.asInstanceOf[js.Any], begin_over = begin_over.asInstanceOf[js.Any], clear = clear.asInstanceOf[js.Any], confirm = confirm.asInstanceOf[js.Any], dateFormat = dateFormat.asInstanceOf[js.Any], dateTimeFormat = dateTimeFormat.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], lastMonth = lastMonth.asInstanceOf[js.Any], lastWeek = lastWeek.asInstanceOf[js.Any], loadPrevMonth = loadPrevMonth.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], monthTitle = monthTitle.asInstanceOf[js.Any], noChoose = noChoose.asInstanceOf[js.Any], over = over.asInstanceOf[js.Any], pm = pm.asInstanceOf[js.Any], selectEndTime = selectEndTime.asInstanceOf[js.Any], selectStartTime = selectStartTime.asInstanceOf[js.Any], selectTime = selectTime.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], today = today.asInstanceOf[js.Any], week = week.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any], yesterday = yesterday.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
  @scala.inline
  implicit class LocaleOps[Self <: Locale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("am")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBegin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("begin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBegin_over(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("begin_over")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClear(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfirm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDateTimeFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTimeFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("end")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastMonth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLastWeek(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadPrevMonth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadPrevMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonthTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNoChoose(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("noChoose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOver(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("over")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPm(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectEndTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectEndTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectStartTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectStartTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSelectTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("selectTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("start")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withToday(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("today")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeek(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("week")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYear(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYesterday(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yesterday")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

