package typingsSlinky.gapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CropHint extends js.Object {
  /**
    * The bounding polygon for the crop region. The coordinates of the bounding
    * box are in the original image's scale, as returned in `ImageParams`.
    */
  var boundingPoly: js.UndefOr[BoundingPoly] = js.native
  /** Confidence of this being a salient region.  Range [0, 1]. */
  var confidence: js.UndefOr[Double] = js.native
  /**
    * Fraction of importance of this salient region with respect to the original
    * image.
    */
  var importanceFraction: js.UndefOr[Double] = js.native
}

object CropHint {
  @scala.inline
  def apply(): CropHint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CropHint]
  }
  @scala.inline
  implicit class CropHintOps[Self <: CropHint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBoundingPoly(value: BoundingPoly): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingPoly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundingPoly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundingPoly")(js.undefined)
        ret
    }
    @scala.inline
    def withConfidence(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfidence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confidence")(js.undefined)
        ret
    }
    @scala.inline
    def withImportanceFraction(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importanceFraction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImportanceFraction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importanceFraction")(js.undefined)
        ret
    }
  }
  
}

