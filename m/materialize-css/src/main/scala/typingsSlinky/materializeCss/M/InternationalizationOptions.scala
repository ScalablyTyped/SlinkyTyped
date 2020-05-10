package typingsSlinky.materializeCss.M

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InternationalizationOptions extends js.Object {
  var cancel: String = js.native
  var clear: String = js.native
  var done: String = js.native
  var months: js.Array[String] = js.native
  var monthsShort: js.Array[String] = js.native
  var nextMonth: String = js.native
  var previousMonth: String = js.native
  var weekdays: js.Array[String] = js.native
  var weekdaysAbbrev: js.Array[String] = js.native
  var weekdaysShort: js.Array[String] = js.native
}

object InternationalizationOptions {
  @scala.inline
  def apply(
    cancel: String,
    clear: String,
    done: String,
    months: js.Array[String],
    monthsShort: js.Array[String],
    nextMonth: String,
    previousMonth: String,
    weekdays: js.Array[String],
    weekdaysAbbrev: js.Array[String],
    weekdaysShort: js.Array[String]
  ): InternationalizationOptions = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], clear = clear.asInstanceOf[js.Any], done = done.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], monthsShort = monthsShort.asInstanceOf[js.Any], nextMonth = nextMonth.asInstanceOf[js.Any], previousMonth = previousMonth.asInstanceOf[js.Any], weekdays = weekdays.asInstanceOf[js.Any], weekdaysAbbrev = weekdaysAbbrev.asInstanceOf[js.Any], weekdaysShort = weekdaysShort.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternationalizationOptions]
  }
  @scala.inline
  implicit class InternationalizationOptionsOps[Self <: InternationalizationOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withClear(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("months")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonthsShort(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthsShort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextMonth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPreviousMonth(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("previousMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeekdays(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeekdaysAbbrev(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdaysAbbrev")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeekdaysShort(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdaysShort")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

