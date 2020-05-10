package typingsSlinky.apolloEngineReporting.durationHistogramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DurationHistogramOptions extends js.Object {
  var buckets: js.UndefOr[js.Array[Double]] = js.native
  var initSize: js.UndefOr[Double] = js.native
}

object DurationHistogramOptions {
  @scala.inline
  def apply(): DurationHistogramOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DurationHistogramOptions]
  }
  @scala.inline
  implicit class DurationHistogramOptionsOps[Self <: DurationHistogramOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuckets(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buckets")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuckets: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buckets")(js.undefined)
        ret
    }
    @scala.inline
    def withInitSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInitSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("initSize")(js.undefined)
        ret
    }
  }
  
}

