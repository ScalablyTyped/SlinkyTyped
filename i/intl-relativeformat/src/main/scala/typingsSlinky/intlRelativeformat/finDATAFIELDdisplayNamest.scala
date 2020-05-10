package typingsSlinky.intlRelativeformat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ f in intl-relativeformat.intl-relativeformat/lib/types.DATA_FIELD ]: {  displayName  :string,   relative  :std.Record<string, string>,   relativePeriod? :string,   relativeTime  :{  future  :std.Record<string, string>,   past  :std.Record<string, string>}}} */
@js.native
trait finDATAFIELDdisplayNamest extends js.Object {
  var day: AnonDisplayName = js.native
  var `day-narrow`: AnonDisplayName = js.native
  var `day-short`: AnonDisplayName = js.native
  var hour: AnonDisplayName = js.native
  var `hour-narrow`: AnonDisplayName = js.native
  var `hour-short`: AnonDisplayName = js.native
  var minute: AnonDisplayName = js.native
  var `minute-narrow`: AnonDisplayName = js.native
  var `minute-short`: AnonDisplayName = js.native
  var month: AnonDisplayName = js.native
  var `month-narrow`: AnonDisplayName = js.native
  var `month-short`: AnonDisplayName = js.native
  var quarter: AnonDisplayName = js.native
  var `quarter-narrow`: AnonDisplayName = js.native
  var `quarter-short`: AnonDisplayName = js.native
  var second: AnonDisplayName = js.native
  var `second-narrow`: AnonDisplayName = js.native
  var `second-short`: AnonDisplayName = js.native
  var week: AnonDisplayName = js.native
  var `week-narrow`: AnonDisplayName = js.native
  var `week-short`: AnonDisplayName = js.native
  var year: AnonDisplayName = js.native
  var `year-narrow`: AnonDisplayName = js.native
  var `year-short`: AnonDisplayName = js.native
}

object finDATAFIELDdisplayNamest {
  @scala.inline
  def apply(
    day: AnonDisplayName,
    `day-narrow`: AnonDisplayName,
    `day-short`: AnonDisplayName,
    hour: AnonDisplayName,
    `hour-narrow`: AnonDisplayName,
    `hour-short`: AnonDisplayName,
    minute: AnonDisplayName,
    `minute-narrow`: AnonDisplayName,
    `minute-short`: AnonDisplayName,
    month: AnonDisplayName,
    `month-narrow`: AnonDisplayName,
    `month-short`: AnonDisplayName,
    quarter: AnonDisplayName,
    `quarter-narrow`: AnonDisplayName,
    `quarter-short`: AnonDisplayName,
    second: AnonDisplayName,
    `second-narrow`: AnonDisplayName,
    `second-short`: AnonDisplayName,
    week: AnonDisplayName,
    `week-narrow`: AnonDisplayName,
    `week-short`: AnonDisplayName,
    year: AnonDisplayName,
    `year-narrow`: AnonDisplayName,
    `year-short`: AnonDisplayName
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
    def withDay(value: AnonDisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withDay-narrow`(value: AnonDisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day-narrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withDay-short`(value: AnonDisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("day-short")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHour(value: AnonDisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withHour-narrow`(value: AnonDisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hour-narrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withHour-short`(value: AnonDisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hour-short")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinute(value: AnonDisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withMinute-narrow`(value: AnonDisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minute-narrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withMinute-short`(value: AnonDisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minute-short")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonth(value: AnonDisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withMonth-narrow`(value: AnonDisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month-narrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withMonth-short`(value: AnonDisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month-short")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQuarter(value: AnonDisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quarter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withQuarter-narrow`(value: AnonDisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quarter-narrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withQuarter-short`(value: AnonDisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quarter-short")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecond(value: AnonDisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withSecond-narrow`(value: AnonDisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second-narrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withSecond-short`(value: AnonDisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("second-short")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeek(value: AnonDisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("week")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWeek-narrow`(value: AnonDisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("week-narrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withWeek-short`(value: AnonDisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("week-short")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYear(value: AnonDisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withYear-narrow`(value: AnonDisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year-narrow")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withYear-short`(value: AnonDisplayName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year-short")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

