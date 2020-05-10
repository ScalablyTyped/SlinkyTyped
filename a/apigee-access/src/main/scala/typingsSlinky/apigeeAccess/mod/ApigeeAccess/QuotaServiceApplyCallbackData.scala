package typingsSlinky.apigeeAccess.mod.ApigeeAccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuotaServiceApplyCallbackData extends js.Object {
  var allowed: Double = js.native
  var expiryTime: Double = js.native
  var isAllowed: Boolean = js.native
  var timestamp: Double = js.native
  var used: Double = js.native
}

object QuotaServiceApplyCallbackData {
  @scala.inline
  def apply(allowed: Double, expiryTime: Double, isAllowed: Boolean, timestamp: Double, used: Double): QuotaServiceApplyCallbackData = {
    val __obj = js.Dynamic.literal(allowed = allowed.asInstanceOf[js.Any], expiryTime = expiryTime.asInstanceOf[js.Any], isAllowed = isAllowed.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuotaServiceApplyCallbackData]
  }
  @scala.inline
  implicit class QuotaServiceApplyCallbackDataOps[Self <: QuotaServiceApplyCallbackData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllowed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withExpiryTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiryTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsAllowed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimestamp(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUsed(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("used")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

