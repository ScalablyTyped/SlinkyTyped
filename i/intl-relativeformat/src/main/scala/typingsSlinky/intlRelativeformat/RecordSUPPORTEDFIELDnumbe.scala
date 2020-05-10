package typingsSlinky.intlRelativeformat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Record<intl-relativeformat.intl-relativeformat/lib/types.SUPPORTED_FIELD, number> */
@js.native
trait RecordSUPPORTEDFIELDnumbe extends js.Object {
  var day: Double = js.native
  var `day-narrow`: Double = js.native
  var `day-short`: Double = js.native
  var hour: Double = js.native
  var `hour-narrow`: Double = js.native
  var `hour-short`: Double = js.native
  var minute: Double = js.native
  var `minute-narrow`: Double = js.native
  var `minute-short`: Double = js.native
  var month: Double = js.native
  var `month-narrow`: Double = js.native
  var `month-short`: Double = js.native
  var second: Double = js.native
  var `second-narrow`: Double = js.native
  var `second-short`: Double = js.native
  var week: Double = js.native
  var `week-narrow`: Double = js.native
  var `week-short`: Double = js.native
  var year: Double = js.native
  var `year-narrow`: Double = js.native
  var `year-short`: Double = js.native
}

object RecordSUPPORTEDFIELDnumbe {
  @scala.inline
  def apply(
    day: Double,
    `day-narrow`: Double,
    `day-short`: Double,
    hour: Double,
    `hour-narrow`: Double,
    `hour-short`: Double,
    minute: Double,
    `minute-narrow`: Double,
    `minute-short`: Double,
    month: Double,
    `month-narrow`: Double,
    `month-short`: Double,
    second: Double,
    `second-narrow`: Double,
    `second-short`: Double,
    week: Double,
    `week-narrow`: Double,
    `week-short`: Double,
    year: Double,
    `year-narrow`: Double,
    `year-short`: Double
  ): RecordSUPPORTEDFIELDnumbe = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], week = week.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.updateDynamic("day-narrow")(`day-narrow`.asInstanceOf[js.Any])
    __obj.updateDynamic("day-short")(`day-short`.asInstanceOf[js.Any])
    __obj.updateDynamic("hour-narrow")(`hour-narrow`.asInstanceOf[js.Any])
    __obj.updateDynamic("hour-short")(`hour-short`.asInstanceOf[js.Any])
    __obj.updateDynamic("minute-narrow")(`minute-narrow`.asInstanceOf[js.Any])
    __obj.updateDynamic("minute-short")(`minute-short`.asInstanceOf[js.Any])
    __obj.updateDynamic("month-narrow")(`month-narrow`.asInstanceOf[js.Any])
    __obj.updateDynamic("month-short")(`month-short`.asInstanceOf[js.Any])
    __obj.updateDynamic("second-narrow")(`second-narrow`.asInstanceOf[js.Any])
    __obj.updateDynamic("second-short")(`second-short`.asInstanceOf[js.Any])
    __obj.updateDynamic("week-narrow")(`week-narrow`.asInstanceOf[js.Any])
    __obj.updateDynamic("week-short")(`week-short`.asInstanceOf[js.Any])
    __obj.updateDynamic("year-narrow")(`year-narrow`.asInstanceOf[js.Any])
    __obj.updateDynamic("year-short")(`year-short`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecordSUPPORTEDFIELDnumbe]
  }
  @scala.inline
  implicit class RecordSUPPORTEDFIELDnumbeOps[Self <: RecordSUPPORTEDFIELDnumbe] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withDay-narrow`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day-narrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withDay-short`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day-short")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHour(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withHour-narrow`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hour-narrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withHour-short`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hour-short")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinute(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withMinute-narrow`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minute-narrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withMinute-short`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minute-short")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withMonth-narrow`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month-narrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withMonth-short`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month-short")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecond(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withSecond-narrow`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second-narrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withSecond-short`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second-short")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeek(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("week")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWeek-narrow`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("week-narrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWeek-short`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("week-short")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withYear-narrow`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year-narrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withYear-short`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year-short")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

