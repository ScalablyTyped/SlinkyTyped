package typingsSlinky.activexLibreoffice.com_.sun.star.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a date value.
  *
  * The time zone is unknown.
  */
@js.native
trait Date extends js.Object {
  /** contains the day of month (1-31 or 0 for a void date). */
  var Day: Double = js.native
  /** contains the month of year (1-12 or 0 for a void date). */
  var Month: Double = js.native
  /** contains the year. */
  var Year: Double = js.native
}

object Date {
  @scala.inline
  def apply(Day: Double, Month: Double, Year: Double): Date = {
    val __obj = js.Dynamic.literal(Day = Day.asInstanceOf[js.Any], Month = Month.asInstanceOf[js.Any], Year = Year.asInstanceOf[js.Any])
    __obj.asInstanceOf[Date]
  }
  @scala.inline
  implicit class DateOps[Self <: Date] (val x: Self) extends AnyVal {
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
    def withMonth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Month")(value.asInstanceOf[js.Any])
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

