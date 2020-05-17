package typingsSlinky.googleGax.gaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BundlingConfig extends js.Object {
  var delay_threshold_millis: js.UndefOr[Double] = js.native
  var element_count_limit: Double = js.native
  var element_count_threshold: Double = js.native
  var request_byte_limit: js.UndefOr[Double] = js.native
  var request_byte_threshold: js.UndefOr[Double] = js.native
}

object BundlingConfig {
  @scala.inline
  def apply(element_count_limit: Double, element_count_threshold: Double): BundlingConfig = {
    val __obj = js.Dynamic.literal(element_count_limit = element_count_limit.asInstanceOf[js.Any], element_count_threshold = element_count_threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[BundlingConfig]
  }
  @scala.inline
  implicit class BundlingConfigOps[Self <: BundlingConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withElement_count_limit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element_count_limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withElement_count_threshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("element_count_threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDelay_threshold_millis(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay_threshold_millis")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelay_threshold_millis: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delay_threshold_millis")(js.undefined)
        ret
    }
    @scala.inline
    def withRequest_byte_limit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request_byte_limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest_byte_limit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request_byte_limit")(js.undefined)
        ret
    }
    @scala.inline
    def withRequest_byte_threshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request_byte_threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequest_byte_threshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("request_byte_threshold")(js.undefined)
        ret
    }
  }
  
}

