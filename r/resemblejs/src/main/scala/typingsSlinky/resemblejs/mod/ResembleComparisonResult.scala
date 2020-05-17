package typingsSlinky.resemblejs.mod

import typingsSlinky.resemblejs.anon.Bottom
import typingsSlinky.resemblejs.anon.Height
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResembleComparisonResult extends js.Object {
  var analysisTime: Double = js.native
  var diffBounds: Bottom = js.native
  /**
    * The difference in width and height between the dimensions of the two compared images
    */
  var dimensionDifference: Height = js.native
  /**
    * Do the two images have the same dimensions?
    */
  var isSameDimensions: Boolean = js.native
  /**
    * The percentage of pixels which do not match between the images
    */
  var misMatchPercentage: Double = js.native
  /**
    * Get a data URL for the comparison image
    */
  def getImageDataUrl(): String = js.native
}

object ResembleComparisonResult {
  @scala.inline
  def apply(
    analysisTime: Double,
    diffBounds: Bottom,
    dimensionDifference: Height,
    getImageDataUrl: () => String,
    isSameDimensions: Boolean,
    misMatchPercentage: Double
  ): ResembleComparisonResult = {
    val __obj = js.Dynamic.literal(analysisTime = analysisTime.asInstanceOf[js.Any], diffBounds = diffBounds.asInstanceOf[js.Any], dimensionDifference = dimensionDifference.asInstanceOf[js.Any], getImageDataUrl = js.Any.fromFunction0(getImageDataUrl), isSameDimensions = isSameDimensions.asInstanceOf[js.Any], misMatchPercentage = misMatchPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResembleComparisonResult]
  }
  @scala.inline
  implicit class ResembleComparisonResultOps[Self <: ResembleComparisonResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnalysisTime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("analysisTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiffBounds(value: Bottom): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diffBounds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDimensionDifference(value: Height): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dimensionDifference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetImageDataUrl(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getImageDataUrl")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsSameDimensions(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isSameDimensions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMisMatchPercentage(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("misMatchPercentage")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

