package typingsSlinky.googleCloudTasks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RateLimits extends js.Object {
  var maxBurstSize: Double = js.native
  var maxConcurrentDispatches: Double = js.native
  var maxDispatchesPerSecond: Double = js.native
}

object RateLimits {
  @scala.inline
  def apply(maxBurstSize: Double, maxConcurrentDispatches: Double, maxDispatchesPerSecond: Double): RateLimits = {
    val __obj = js.Dynamic.literal(maxBurstSize = maxBurstSize.asInstanceOf[js.Any], maxConcurrentDispatches = maxConcurrentDispatches.asInstanceOf[js.Any], maxDispatchesPerSecond = maxDispatchesPerSecond.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateLimits]
  }
  @scala.inline
  implicit class RateLimitsOps[Self <: RateLimits] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMaxBurstSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxBurstSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxConcurrentDispatches(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxConcurrentDispatches")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxDispatchesPerSecond(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDispatchesPerSecond")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

