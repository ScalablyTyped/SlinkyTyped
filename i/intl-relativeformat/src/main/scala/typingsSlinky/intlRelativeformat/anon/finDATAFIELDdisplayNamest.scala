package typingsSlinky.intlRelativeformat.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ f in intl-relativeformat.intl-relativeformat/lib/types.DATA_FIELD ]: {  displayName  :string,   relative  :std.Record<string, string>,   relativePeriod? :string,   relativeTime  :{  future  :std.Record<string, string>,   past  :std.Record<string, string>}}} */
@js.native
trait finDATAFIELDdisplayNamest extends js.Object {
  var day: DisplayName = js.native
  var `day-narrow`: DisplayName = js.native
  var `day-short`: DisplayName = js.native
  var hour: DisplayName = js.native
  var `hour-narrow`: DisplayName = js.native
  var `hour-short`: DisplayName = js.native
  var minute: DisplayName = js.native
  var `minute-narrow`: DisplayName = js.native
  var `minute-short`: DisplayName = js.native
  var month: DisplayName = js.native
  var `month-narrow`: DisplayName = js.native
  var `month-short`: DisplayName = js.native
  var quarter: DisplayName = js.native
  var `quarter-narrow`: DisplayName = js.native
  var `quarter-short`: DisplayName = js.native
  var second: DisplayName = js.native
  var `second-narrow`: DisplayName = js.native
  var `second-short`: DisplayName = js.native
  var week: DisplayName = js.native
  var `week-narrow`: DisplayName = js.native
  var `week-short`: DisplayName = js.native
  var year: DisplayName = js.native
  var `year-narrow`: DisplayName = js.native
  var `year-short`: DisplayName = js.native
}

object finDATAFIELDdisplayNamest {
  @scala.inline
  def apply(
    day: DisplayName,
    `day-narrow`: DisplayName,
    `day-short`: DisplayName,
    hour: DisplayName,
    `hour-narrow`: DisplayName,
    `hour-short`: DisplayName,
    minute: DisplayName,
    `minute-narrow`: DisplayName,
    `minute-short`: DisplayName,
    month: DisplayName,
    `month-narrow`: DisplayName,
    `month-short`: DisplayName,
    quarter: DisplayName,
    `quarter-narrow`: DisplayName,
    `quarter-short`: DisplayName,
    second: DisplayName,
    `second-narrow`: DisplayName,
    `second-short`: DisplayName,
    week: DisplayName,
    `week-narrow`: DisplayName,
    `week-short`: DisplayName,
    year: DisplayName,
    `year-narrow`: DisplayName,
    `year-short`: DisplayName
  ): finDATAFIELDdisplayNamest = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any], hour = hour.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], quarter = quarter.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any], week = week.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.updateDynamic("day-narrow")(`day-narrow`.asInstanceOf[js.Any])
    __obj.updateDynamic("day-short")(`day-short`.asInstanceOf[js.Any])
    __obj.updateDynamic("hour-narrow")(`hour-narrow`.asInstanceOf[js.Any])
    __obj.updateDynamic("hour-short")(`hour-short`.asInstanceOf[js.Any])
    __obj.updateDynamic("minute-narrow")(`minute-narrow`.asInstanceOf[js.Any])
    __obj.updateDynamic("minute-short")(`minute-short`.asInstanceOf[js.Any])
    __obj.updateDynamic("month-narrow")(`month-narrow`.asInstanceOf[js.Any])
    __obj.updateDynamic("month-short")(`month-short`.asInstanceOf[js.Any])
    __obj.updateDynamic("quarter-narrow")(`quarter-narrow`.asInstanceOf[js.Any])
    __obj.updateDynamic("quarter-short")(`quarter-short`.asInstanceOf[js.Any])
    __obj.updateDynamic("second-narrow")(`second-narrow`.asInstanceOf[js.Any])
    __obj.updateDynamic("second-short")(`second-short`.asInstanceOf[js.Any])
    __obj.updateDynamic("week-narrow")(`week-narrow`.asInstanceOf[js.Any])
    __obj.updateDynamic("week-short")(`week-short`.asInstanceOf[js.Any])
    __obj.updateDynamic("year-narrow")(`year-narrow`.asInstanceOf[js.Any])
    __obj.updateDynamic("year-short")(`year-short`.asInstanceOf[js.Any])
    __obj.asInstanceOf[finDATAFIELDdisplayNamest]
  }
  @scala.inline
  implicit class finDATAFIELDdisplayNamestOps[Self <: finDATAFIELDdisplayNamest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDay(value: DisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withDay-narrow`(value: DisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day-narrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withDay-short`(value: DisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day-short")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHour(value: DisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withHour-narrow`(value: DisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hour-narrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withHour-short`(value: DisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hour-short")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinute(value: DisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withMinute-narrow`(value: DisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minute-narrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withMinute-short`(value: DisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minute-short")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonth(value: DisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withMonth-narrow`(value: DisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month-narrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withMonth-short`(value: DisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month-short")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuarter(value: DisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quarter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withQuarter-narrow`(value: DisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quarter-narrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withQuarter-short`(value: DisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quarter-short")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecond(value: DisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withSecond-narrow`(value: DisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second-narrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withSecond-short`(value: DisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second-short")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeek(value: DisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("week")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWeek-narrow`(value: DisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("week-narrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWeek-short`(value: DisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("week-short")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYear(value: DisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withYear-narrow`(value: DisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year-narrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withYear-short`(value: DisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year-short")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

