package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StandardTimeZoneOffset extends js.Object {
  // Represents the nth occurrence of the day of week that the transition from daylight saving time to standard time occurs.
  var dayOccurrence: js.UndefOr[Double] = js.native
  // Represents the day of the week when the transition from daylight saving time to standard time.
  var dayOfWeek: js.UndefOr[DayOfWeek] = js.native
  // Represents the month of the year when the transition from daylight saving time to standard time occurs.
  var month: js.UndefOr[Double] = js.native
  // Represents the time of day when the transition from daylight saving time to standard time occurs.
  var time: js.UndefOr[String] = js.native
  /**
    * Represents how frequently in terms of years the change from daylight saving time to standard time occurs. For example,
    * a value of 0 means every year.
    */
  var year: js.UndefOr[Double] = js.native
}

object StandardTimeZoneOffset {
  @scala.inline
  def apply(): StandardTimeZoneOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StandardTimeZoneOffset]
  }
  @scala.inline
  implicit class StandardTimeZoneOffsetOps[Self <: StandardTimeZoneOffset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDayOccurrence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayOccurrence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayOccurrence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayOccurrence")(js.undefined)
        ret
    }
    @scala.inline
    def withDayOfWeek(value: DayOfWeek): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayOfWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDayOfWeek: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dayOfWeek")(js.undefined)
        ret
    }
    @scala.inline
    def withMonth(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("month")(js.undefined)
        ret
    }
    @scala.inline
    def withTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(js.undefined)
        ret
    }
    @scala.inline
    def withYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutYear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("year")(js.undefined)
        ret
    }
  }
  
}

