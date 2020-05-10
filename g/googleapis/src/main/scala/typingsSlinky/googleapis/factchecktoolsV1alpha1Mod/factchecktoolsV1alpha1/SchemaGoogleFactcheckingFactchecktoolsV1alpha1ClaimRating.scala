package typingsSlinky.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the claim rating.
  */
@js.native
trait SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimRating extends js.Object {
  /**
    * For numeric ratings, the best value possible in the scale from worst to
    * best.&lt;br&gt; Corresponds to `ClaimReview.reviewRating.bestRating`.
    */
  var bestRating: js.UndefOr[Double] = js.native
  /**
    * Corresponds to `ClaimReview.reviewRating.image`.
    */
  var imageUrl: js.UndefOr[String] = js.native
  /**
    * A numeric rating of this claim, in the range worstRating — bestRating
    * inclusive.&lt;br&gt; Corresponds to
    * `ClaimReview.reviewRating.ratingValue`.
    */
  var ratingValue: js.UndefOr[Double] = js.native
  /**
    * The truthfulness rating as a human-readible short word or
    * phrase.&lt;br&gt; Corresponds to
    * `ClaimReview.reviewRating.alternateName`.
    */
  var textualRating: js.UndefOr[String] = js.native
  /**
    * For numeric ratings, the worst value possible in the scale from worst to
    * best.&lt;br&gt; Corresponds to `ClaimReview.reviewRating.worstRating`.
    */
  var worstRating: js.UndefOr[Double] = js.native
}

object SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimRating {
  @scala.inline
  def apply(): SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimRating = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimRating]
  }
  @scala.inline
  implicit class SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimRatingOps[Self <: SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimRating] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBestRating(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bestRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBestRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bestRating")(js.undefined)
        ret
    }
    @scala.inline
    def withImageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withRatingValue(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratingValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRatingValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ratingValue")(js.undefined)
        ret
    }
    @scala.inline
    def withTextualRating(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textualRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTextualRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("textualRating")(js.undefined)
        ret
    }
    @scala.inline
    def withWorstRating(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worstRating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorstRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worstRating")(js.undefined)
        ret
    }
  }
  
}

