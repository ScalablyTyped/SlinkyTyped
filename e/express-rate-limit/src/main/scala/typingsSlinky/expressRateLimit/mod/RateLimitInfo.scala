package typingsSlinky.expressRateLimit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RateLimitInfo extends js.Object {
  val current: Double = js.native
  val limit: Double = js.native
  val remaining: Double = js.native
  val resetTime: js.UndefOr[js.Date] = js.native
}

object RateLimitInfo {
  @scala.inline
  def apply(current: Double, limit: Double, remaining: Double): RateLimitInfo = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], remaining = remaining.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateLimitInfo]
  }
  @scala.inline
  implicit class RateLimitInfoOps[Self <: RateLimitInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrent(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("current")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemaining(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remaining")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResetTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResetTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resetTime")(js.undefined)
        ret
    }
  }
  
}

