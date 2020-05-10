package typingsSlinky.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalizationDatePattern extends js.Object {
  var dst_offset: Double = js.native
  var pattern: String = js.native
  var timezone: String = js.native
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

