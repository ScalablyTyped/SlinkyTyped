package typingsSlinky.cordovaPluginGlobalization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Pattern to format and parse dates according to the client's user preferences.*/
@js.native
trait GlobalizationDatePattern extends js.Object {
  /* The current daylight saving time offset in seconds between the client's non-daylight saving's time zone and the client's daylight saving's time zone. */
  var dst_offset: Double = js.native
  /* The date and time pattern to format and parse dates. The patterns follow Unicode Technical Standard #35. */
  var pattern: String = js.native
  /* The abbreviated name of the time zone on the client. */
  var timezone: String = js.native
  /* The current difference in seconds between the client's time zone and coordinated universal time. */
  var utc_offset: Double = js.native
}

object GlobalizationDatePattern {
  @scala.inline
  def apply(dst_offset: Double, pattern: String, timezone: String, utc_offset: Double): GlobalizationDatePattern = {
    val __obj = js.Dynamic.literal(dst_offset = dst_offset.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any], utc_offset = utc_offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalizationDatePattern]
  }
  @scala.inline
  implicit class GlobalizationDatePatternOps[Self <: GlobalizationDatePattern] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDst_offset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dst_offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPattern(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimezone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUtc_offset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utc_offset")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

