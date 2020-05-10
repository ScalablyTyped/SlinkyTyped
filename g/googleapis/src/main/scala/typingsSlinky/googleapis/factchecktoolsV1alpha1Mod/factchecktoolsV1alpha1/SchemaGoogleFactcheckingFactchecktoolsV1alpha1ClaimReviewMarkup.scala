package typingsSlinky.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fields for an individual `ClaimReview` element. Except for sub-messages
  * that group fields together, each of these fields correspond those in
  * https://schema.org/ClaimReview. We list the precise mapping for each field.
  */
@js.native
trait SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup extends js.Object {
  /**
    * A list of links to works in which this claim appears, aside from the one
    * specified in `claim_first_appearance`.&lt;br&gt; Corresponds to
    * `ClaimReview.itemReviewed[@type=Claim].appearance.url`.
    */
  var claimAppearances: js.UndefOr[js.Array[String]] = js.native
  /**
    * Info about the author of this claim.
    */
  var claimAuthor: js.UndefOr[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthor] = js.native
  /**
    * The date when the claim was made or entered public discourse.&lt;br&gt;
    * Corresponds to `ClaimReview.itemReviewed.datePublished`.
    */
  var claimDate: js.UndefOr[String] = js.native
  /**
    * A link to a work in which this claim first appears.&lt;br&gt; Corresponds
    * to `ClaimReview.itemReviewed[@type=Claim].firstAppearance.url`.
    */
  var claimFirstAppearance: js.UndefOr[String] = js.native
  /**
    * The location where this claim was made.&lt;br&gt; Corresponds to
    * `ClaimReview.itemReviewed.name`.
    */
  var claimLocation: js.UndefOr[String] = js.native
  /**
    * A short summary of the claim being evaluated.&lt;br&gt; Corresponds to
    * `ClaimReview.claimReviewed`.
    */
  var claimReviewed: js.UndefOr[String] = js.native
  /**
    * Info about the rating of this claim review.
    */
  var rating: js.UndefOr[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimRating] = js.native
  /**
    * This field is optional, and will default to the page URL. We provide this
    * field to allow you the override the default value, but the only permitted
    * override is the page URL plus an optional anchor link (&quot;page
    * jump&quot;).&lt;br&gt; Corresponds to `ClaimReview.url`
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup {
  @scala.inline
  def apply(): SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup]
  }
  @scala.inline
  implicit class SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupOps[Self <: SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClaimAppearances(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimAppearances")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClaimAppearances: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimAppearances")(js.undefined)
        ret
    }
    @scala.inline
    def withClaimAuthor(value: SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimAuthor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClaimAuthor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimAuthor")(js.undefined)
        ret
    }
    @scala.inline
    def withClaimDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClaimDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimDate")(js.undefined)
        ret
    }
    @scala.inline
    def withClaimFirstAppearance(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimFirstAppearance")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClaimFirstAppearance: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimFirstAppearance")(js.undefined)
        ret
    }
    @scala.inline
    def withClaimLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClaimLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimLocation")(js.undefined)
        ret
    }
    @scala.inline
    def withClaimReviewed(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimReviewed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClaimReviewed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimReviewed")(js.undefined)
        ret
    }
    @scala.inline
    def withRating(value: SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimRating): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rating")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRating: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rating")(js.undefined)
        ret
    }
    @scala.inline
    def withUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("url")(js.undefined)
        ret
    }
  }
  
}

