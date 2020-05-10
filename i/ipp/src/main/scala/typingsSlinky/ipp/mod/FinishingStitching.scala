package typingsSlinky.ipp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FinishingStitching extends js.Object {
  var `stitching-angle`: js.UndefOr[Double] = js.native
  var `stitching-locations`: js.UndefOr[js.Array[Double]] = js.native
  var `stitching-method`: js.UndefOr[StitchingMethod] = js.native
  var `stitching-offset`: js.UndefOr[Double] = js.native
  var `stitching-reference-edge`: js.UndefOr[ReferenceEdge] = js.native
}

object FinishingStitching {
  @scala.inline
  def apply(): FinishingStitching = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinishingStitching]
  }
  @scala.inline
  implicit class FinishingStitchingOps[Self <: FinishingStitching] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def `withStitching-angle`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stitching-angle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutStitching-angle`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stitching-angle")(js.undefined)
        ret
    }
    @scala.inline
    def `withStitching-locations`(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stitching-locations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutStitching-locations`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stitching-locations")(js.undefined)
        ret
    }
    @scala.inline
    def `withStitching-method`(value: StitchingMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stitching-method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutStitching-method`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stitching-method")(js.undefined)
        ret
    }
    @scala.inline
    def `withStitching-offset`(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stitching-offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutStitching-offset`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stitching-offset")(js.undefined)
        ret
    }
    @scala.inline
    def `withStitching-reference-edge`(value: ReferenceEdge): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stitching-reference-edge")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def `withoutStitching-reference-edge`: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stitching-reference-edge")(js.undefined)
        ret
    }
  }
  
}

