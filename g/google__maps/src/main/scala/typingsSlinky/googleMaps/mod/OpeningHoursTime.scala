package typingsSlinky.googleMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpeningHoursTime extends js.Object {
  /** a number from 0–6, corresponding to the days of the week, starting on Sunday. For example, 2 means Tuesday. */
  var day: Double = js.native
  /**
    *  may contain a time of day in 24-hour hhmm format. Values are in the range 0000–2359. The `time`
    * will be reported in the place's time zone.
    */
  var time: js.UndefOr[String] = js.native
}

object OpeningHoursTime {
  @scala.inline
  def apply(day: Double): OpeningHoursTime = {
    val __obj = js.Dynamic.literal(day = day.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpeningHoursTime]
  }
  @scala.inline
  implicit class OpeningHoursTimeOps[Self <: OpeningHoursTime] (val x: Self) extends AnyVal {
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
  }
  
}

