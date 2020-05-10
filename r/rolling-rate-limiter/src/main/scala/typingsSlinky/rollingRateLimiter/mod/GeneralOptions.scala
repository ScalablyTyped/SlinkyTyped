package typingsSlinky.rollingRateLimiter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeneralOptions extends js.Object {
  var interval: Double = js.native
  var maxInInterval: Double = js.native
  var minDifference: js.UndefOr[Double] = js.native
}

object GeneralOptions {
  @scala.inline
  def apply(interval: Double, maxInInterval: Double): GeneralOptions = {
    val __obj = js.Dynamic.literal(interval = interval.asInstanceOf[js.Any], maxInInterval = maxInInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeneralOptions]
  }
  @scala.inline
  implicit class GeneralOptionsOps[Self <: GeneralOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxInInterval(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxInInterval")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinDifference(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDifference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDifference: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDifference")(js.undefined)
        ret
    }
  }
  
}

