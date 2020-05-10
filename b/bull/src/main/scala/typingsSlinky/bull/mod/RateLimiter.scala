package typingsSlinky.bull.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RateLimiter extends js.Object {
  /** When jobs get rate limited, they stay in the waiting queue and are not moved to the delayed queue */
  var bounceBack: js.UndefOr[Boolean] = js.native
  /** Per duration in milliseconds */
  var duration: Double = js.native
  /** Max numbers of jobs processed */
  var max: Double = js.native
}

object RateLimiter {
  @scala.inline
  def apply(duration: Double, max: Double): RateLimiter = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateLimiter]
  }
  @scala.inline
  implicit class RateLimiterOps[Self <: RateLimiter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMax(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("max")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBounceBack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounceBack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBounceBack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bounceBack")(js.undefined)
        ret
    }
  }
  
}

