package typingsSlinky.googleGax.bundleExecutorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BundleOptions extends js.Object {
  var delayThreshold: js.UndefOr[Double] = js.native
  var elementCountLimit: js.UndefOr[Double] = js.native
  var elementCountThreshold: js.UndefOr[Double] = js.native
  var requestByteLimit: js.UndefOr[Double] = js.native
  var requestByteThreshold: js.UndefOr[Double] = js.native
}

object BundleOptions {
  @scala.inline
  def apply(): BundleOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BundleOptions]
  }
  @scala.inline
  implicit class BundleOptionsOps[Self <: BundleOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelayThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDelayThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("delayThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withElementCountLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementCountLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementCountLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementCountLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withElementCountThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementCountThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutElementCountThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementCountThreshold")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestByteLimit(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestByteLimit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestByteLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestByteLimit")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestByteThreshold(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestByteThreshold")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestByteThreshold: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestByteThreshold")(js.undefined)
        ret
    }
  }
  
}

