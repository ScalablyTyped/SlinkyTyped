package typingsSlinky.foundation.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/docs/components/magellan.html#js
@js.native
trait MagellanOptions extends js.Object {
  var active_class: js.UndefOr[String] = js.native
  var destination_threshold: js.UndefOr[Double] = js.native
  var duration: js.UndefOr[Double] = js.native
  var easing: js.UndefOr[String] = js.native
  var fixed_top: js.UndefOr[Double] = js.native
  var offset_by_height: js.UndefOr[Boolean] = js.native
  var threshold: js.UndefOr[Double] = js.native
  var throttle_delay: js.UndefOr[Double] = js.native
}

object MagellanOptions {
  @scala.inline
  def apply(): MagellanOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MagellanOptions]
  }
  @scala.inline
  implicit class MagellanOptionsOps[Self <: MagellanOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActive_class(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active_class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActive_class: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("active_class")(js.undefined)
        ret
    }
    @scala.inline
    def withDestination_threshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination_threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestination_threshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destination_threshold")(js.undefined)
        ret
    }
    @scala.inline
    def withDuration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDuration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("duration")(js.undefined)
        ret
    }
    @scala.inline
    def withEasing(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEasing: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("easing")(js.undefined)
        ret
    }
    @scala.inline
    def withFixed_top(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed_top")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixed_top: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixed_top")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset_by_height(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset_by_height")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset_by_height: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset_by_height")(js.undefined)
        ret
    }
    @scala.inline
    def withThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("threshold")(js.undefined)
        ret
    }
    @scala.inline
    def withThrottle_delay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttle_delay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThrottle_delay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("throttle_delay")(js.undefined)
        ret
    }
  }
  
}

