package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomTimeZone extends TimeZoneBase {
  /**
    * The time offset of the time zone from Coordinated Universal Time (UTC). This value is in minutes. Time zones that are
    * ahead of UTC have a positive offset; time zones that are behind UTC have a negative offset.
    */
  var bias: js.UndefOr[Double] = js.native
  // Specifies when the time zone switches from standard time to daylight saving time.
  var daylightOffset: js.UndefOr[DaylightTimeZoneOffset] = js.native
  // Specifies when the time zone switches from daylight saving time to standard time.
  var standardOffset: js.UndefOr[StandardTimeZoneOffset] = js.native
}

object CustomTimeZone {
  @scala.inline
  def apply(): CustomTimeZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomTimeZone]
  }
  @scala.inline
  implicit class CustomTimeZoneOps[Self <: CustomTimeZone] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBias(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bias")(js.undefined)
        ret
    }
    @scala.inline
    def withDaylightOffset(value: DaylightTimeZoneOffset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daylightOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDaylightOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daylightOffset")(js.undefined)
        ret
    }
    @scala.inline
    def withStandardOffset(value: StandardTimeZoneOffset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standardOffset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStandardOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("standardOffset")(js.undefined)
        ret
    }
  }
  
}

