package typingsSlinky.googleapis.dlpV2Mod.dlpV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message for specifying an adjustment to the likelihood of a finding as part
  * of a detection rule.
  */
@js.native
trait SchemaGooglePrivacyDlpV2LikelihoodAdjustment extends js.Object {
  /**
    * Set the likelihood of a finding to a fixed value.
    */
  var fixedLikelihood: js.UndefOr[String] = js.native
  /**
    * Increase or decrease the likelihood by the specified number of levels.
    * For example, if a finding would be `POSSIBLE` without the detection rule
    * and `relative_likelihood` is 1, then it is upgraded to `LIKELY`, while a
    * value of -1 would downgrade it to `UNLIKELY`. Likelihood may never drop
    * below `VERY_UNLIKELY` or exceed `VERY_LIKELY`, so applying an adjustment
    * of 1 followed by an adjustment of -1 when base likelihood is
    * `VERY_LIKELY` will result in a final likelihood of `LIKELY`.
    */
  var relativeLikelihood: js.UndefOr[Double] = js.native
}

object SchemaGooglePrivacyDlpV2LikelihoodAdjustment {
  @scala.inline
  def apply(): SchemaGooglePrivacyDlpV2LikelihoodAdjustment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGooglePrivacyDlpV2LikelihoodAdjustment]
  }
  @scala.inline
  implicit class SchemaGooglePrivacyDlpV2LikelihoodAdjustmentOps[Self <: SchemaGooglePrivacyDlpV2LikelihoodAdjustment] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFixedLikelihood(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedLikelihood")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedLikelihood: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedLikelihood")(js.undefined)
        ret
    }
    @scala.inline
    def withRelativeLikelihood(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeLikelihood")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRelativeLikelihood: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("relativeLikelihood")(js.undefined)
        ret
    }
  }
  
}

