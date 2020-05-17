package typingsSlinky.activexLibreoffice.com_.sun.star.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a range of date+time values. */
@js.native
trait DateTimeRange extends js.Object {
  /** contains the end day of month (1-31 or 0 for a void date) for the range. */
  var EndDay: Double = js.native
  /** contains the end hour (0-23) for the range. */
  var EndHours: Double = js.native
  /** contains the end minutes (0-59) for the range. */
  var EndMinutes: Double = js.native
  /** contains the end month of year (1-12 or 0 for a void date) for the range. */
  var EndMonth: Double = js.native
  /** contains the end nanoseconds (0 - 999 999 999) for the range. */
  var EndNanoSeconds: Double = js.native
  /** contains the end seconds (0-59) for the range. */
  var EndSeconds: Double = js.native
  /** contains the end year for the range. */
  var EndYear: Double = js.native
  /**
    * true: time zone is UTC false: unknown time zone.
    * @since LibreOffice 4.1
    */
  var IsUTC: Boolean = js.native
  /** contains the start day of month (1-31 or 0 for a void date) for the range. */
  var StartDay: Double = js.native
  /** contains the start hour (0-23) for the range. */
  var StartHours: Double = js.native
  /** contains the start minutes (0-59) for the range. */
  var StartMinutes: Double = js.native
  /** contains the start month of year (1-12 or 0 for a void date) for the range. */
  var StartMonth: Double = js.native
  /** contains the start nanoseconds (0 - 999 999 999) for the range. */
  var StartNanoSeconds: Double = js.native
  /** contains the start seconds (0-59) for the range. */
  var StartSeconds: Double = js.native
  /** contains the start year for the range. */
  var StartYear: Double = js.native
}

object DateTimeRange {
  @scala.inline
  def apply(
    EndDay: Double,
    EndHours: Double,
    EndMinutes: Double,
    EndMonth: Double,
    EndNanoSeconds: Double,
    EndSeconds: Double,
    EndYear: Double,
    IsUTC: Boolean,
    StartDay: Double,
    StartHours: Double,
    StartMinutes: Double,
    StartMonth: Double,
    StartNanoSeconds: Double,
    StartSeconds: Double,
    StartYear: Double
  ): DateTimeRange = {
    val __obj = js.Dynamic.literal(EndDay = EndDay.asInstanceOf[js.Any], EndHours = EndHours.asInstanceOf[js.Any], EndMinutes = EndMinutes.asInstanceOf[js.Any], EndMonth = EndMonth.asInstanceOf[js.Any], EndNanoSeconds = EndNanoSeconds.asInstanceOf[js.Any], EndSeconds = EndSeconds.asInstanceOf[js.Any], EndYear = EndYear.asInstanceOf[js.Any], IsUTC = IsUTC.asInstanceOf[js.Any], StartDay = StartDay.asInstanceOf[js.Any], StartHours = StartHours.asInstanceOf[js.Any], StartMinutes = StartMinutes.asInstanceOf[js.Any], StartMonth = StartMonth.asInstanceOf[js.Any], StartNanoSeconds = StartNanoSeconds.asInstanceOf[js.Any], StartSeconds = StartSeconds.asInstanceOf[js.Any], StartYear = StartYear.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateTimeRange]
  }
  @scala.inline
  implicit class DateTimeRangeOps[Self <: DateTimeRange] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndDay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndHours(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndMinutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndMonth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndNanoSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndNanoSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEndYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsUTC(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsUTC")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartDay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartHours(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartMinutes(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartMonth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartMonth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartNanoSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartNanoSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartSeconds(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StartYear")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

