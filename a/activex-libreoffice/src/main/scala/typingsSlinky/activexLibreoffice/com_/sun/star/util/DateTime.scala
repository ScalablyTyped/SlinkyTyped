package typingsSlinky.activexLibreoffice.com_.sun.star.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a combined date+time value. */
@js.native
trait DateTime extends js.Object {
  /** is the day of month (1-31 or 0 for a void date). */
  var Day: Double = js.native
  /** contains the hour (0-23). */
  var Hours: Double = js.native
  /**
    * true: time zone is UTC false: unknown time zone.
    * @since LibreOffice 4.1
    */
  var IsUTC: Boolean = js.native
  /** contains the minutes (0-59). */
  var Minutes: Double = js.native
  /** is the month of year (1-12 or 0 for a void date). */
  var Month: Double = js.native
  /** contains the nanoseconds (0 - 999 999 999). */
  var NanoSeconds: Double = js.native
  /** contains the seconds (0-59). */
  var Seconds: Double = js.native
  /** is the year. */
  var Year: Double = js.native
}

object DateTime {
  @scala.inline
  def apply(
    Day: Double,
    Hours: Double,
    IsUTC: Boolean,
    Minutes: Double,
    Month: Double,
    NanoSeconds: Double,
    Seconds: Double,
    Year: Double
  ): DateTime = {
    val __obj = js.Dynamic.literal(Day = Day.asInstanceOf[js.Any], Hours = Hours.asInstanceOf[js.Any], IsUTC = IsUTC.asInstanceOf[js.Any], Minutes = Minutes.asInstanceOf[js.Any], Month = Month.asInstanceOf[js.Any], NanoSeconds = NanoSeconds.asInstanceOf[js.Any], Seconds = Seconds.asInstanceOf[js.Any], Year = Year.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTime]
  }
  @scala.inline
  implicit class DateTimeOps[Self <: DateTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Day")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHours(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Hours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsUTC(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsUTC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Minutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Month")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNanoSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NanoSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Seconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Year")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

