package typingsSlinky.expressSlowDown.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlowDownRequestAugmentation extends js.Object {
  /**
    * The number of requests in the current window
    */
  var current: Double = js.native
  /**
    * Amount of delay imposed on current request in milliseconds
    */
  var delay: Double = js.native
  /**
    * The `options.delayAfter` value
    */
  var limit: Double = js.native
  /**
    * the number of requests remaining before rate-limiting begins
    */
  var remaining: Double = js.native
  /**
    * When the window will reset, `current` will return to `0`, and `remaining` will return
    * to limit. Represents milliseconds since epoch (compare to `Date.now()`). This field
    * depends on store support. It will be `undefined` if the store does not provide the value.
    */
  var resetTime: js.UndefOr[Double] = js.native
}

object SlowDownRequestAugmentation {
  @scala.inline
  def apply(current: Double, delay: Double, limit: Double, remaining: Double): SlowDownRequestAugmentation = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], limit = limit.asInstanceOf[js.Any], remaining = remaining.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlowDownRequestAugmentation]
  }
  @scala.inline
  implicit class SlowDownRequestAugmentationOps[Self <: SlowDownRequestAugmentation] (val x: Self) extends AnyVal {
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
    def withDelay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay")(value.asInstanceOf[js.Any])
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
    def withResetTime(value: Double): Self = {
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

