package typingsSlinky.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistogramHistogramOptions extends js.Object {
  var bucketSize: js.UndefOr[Double] = js.native
  var hideBucketItems: js.UndefOr[Boolean] = js.native
  var lastBucketPercentile: js.UndefOr[Double] = js.native
}

object HistogramHistogramOptions {
  @scala.inline
  def apply(): HistogramHistogramOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistogramHistogramOptions]
  }
  @scala.inline
  implicit class HistogramHistogramOptionsOps[Self <: HistogramHistogramOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBucketSize(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketSize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBucketSize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bucketSize")(js.undefined)
        ret
    }
    @scala.inline
    def withHideBucketItems(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideBucketItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHideBucketItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hideBucketItems")(js.undefined)
        ret
    }
    @scala.inline
    def withLastBucketPercentile(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastBucketPercentile")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastBucketPercentile: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastBucketPercentile")(js.undefined)
        ret
    }
  }
  
}

