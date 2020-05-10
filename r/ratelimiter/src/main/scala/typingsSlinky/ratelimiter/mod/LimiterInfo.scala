package typingsSlinky.ratelimiter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LimiterInfo extends js.Object {
  /**
    * Number of calls left in current duration without decreasing current get
    */
  var remaining: Double = js.native
  /**
    * Time in milliseconds until the end of current duration
    */
  var reset: Double = js.native
  /**
    * max value
    */
  var total: Double = js.native
}

object LimiterInfo {
  @scala.inline
  def apply(remaining: Double, reset: Double, total: Double): LimiterInfo = {
    val __obj = js.Dynamic.literal(remaining = remaining.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimiterInfo]
  }
  @scala.inline
  implicit class LimiterInfoOps[Self <: LimiterInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRemaining(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remaining")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReset(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTotal(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("total")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

