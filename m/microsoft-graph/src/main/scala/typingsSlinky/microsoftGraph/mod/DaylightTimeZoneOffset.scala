package typingsSlinky.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DaylightTimeZoneOffset extends StandardTimeZoneOffset {
  // The time offset from Coordinated Universal Time (UTC) for daylight saving time. This value is in minutes.
  var daylightBias: js.UndefOr[Double] = js.native
}

object DaylightTimeZoneOffset {
  @scala.inline
  def apply(): DaylightTimeZoneOffset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DaylightTimeZoneOffset]
  }
  @scala.inline
  implicit class DaylightTimeZoneOffsetOps[Self <: DaylightTimeZoneOffset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDaylightBias(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daylightBias")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDaylightBias: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daylightBias")(js.undefined)
        ret
    }
  }
  
}

