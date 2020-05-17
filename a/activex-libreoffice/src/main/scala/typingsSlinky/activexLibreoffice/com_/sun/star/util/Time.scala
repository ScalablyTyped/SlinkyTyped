package typingsSlinky.activexLibreoffice.com_.sun.star.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a time value. */
@js.native
trait Time extends js.Object {
  /** contains the hour (0-23). */
  var Hours: Double = js.native
  /**
    * true: time zone is UTC false: unknown time zone.
    * @since LibreOffice 4.1
    */
  var IsUTC: Boolean = js.native
  /** contains the minutes (0-59). */
  var Minutes: Double = js.native
  /** contains the nanoseconds (0 - 999 999 999). */
  var NanoSeconds: Double = js.native
  /** contains the seconds (0-59). */
  var Seconds: Double = js.native
}

object Time {
  @scala.inline
  def apply(Hours: Double, IsUTC: Boolean, Minutes: Double, NanoSeconds: Double, Seconds: Double): Time = {
    val __obj = js.Dynamic.literal(Hours = Hours.asInstanceOf[js.Any], IsUTC = IsUTC.asInstanceOf[js.Any], Minutes = Minutes.asInstanceOf[js.Any], NanoSeconds = NanoSeconds.asInstanceOf[js.Any], Seconds = Seconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Time]
  }
  @scala.inline
  implicit class TimeOps[Self <: Time] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

