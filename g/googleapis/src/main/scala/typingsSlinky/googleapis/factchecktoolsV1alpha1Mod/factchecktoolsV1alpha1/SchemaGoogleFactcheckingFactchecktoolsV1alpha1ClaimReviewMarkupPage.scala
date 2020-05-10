package typingsSlinky.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Holds one or more instances of `ClaimReview` markup for a webpage.
  */
@js.native
trait SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage extends js.Object {
  /**
    * Info about the author of this claim review. Similar to the above,
    * semantically these are page-level fields, and each `ClaimReview` on this
    * page will contain the same values.
    */
  var claimReviewAuthor: js.UndefOr[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor] = js.native
  /**
    * A list of individual claim reviews for this page. Each item in the list
    * corresponds to one `ClaimReview` element.
    */
  var claimReviewMarkups: js.UndefOr[js.Array[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup]] = js.native
  /**
    * The name of this `ClaimReview` markup page resource, in the form of
    * `pages/{page_id}`. Except for update requests, this field is output-only
    * and should not be set by the user.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The URL of the page associated with this `ClaimReview` markup. While
    * every individual `ClaimReview` has its own URL field, semantically this
    * is a page-level field, and each `ClaimReview` on this page will use this
    * value unless individually overridden.&lt;br&gt; Corresponds to
    * `ClaimReview.url`
    */
  var pageUrl: js.UndefOr[String] = js.native
  /**
    * The date when the fact check was published. Similar to the URL,
    * semantically this is a page-level field, and each `ClaimReview` on this
    * page will contain the same value.&lt;br&gt; Corresponds to
    * `ClaimReview.datePublished`
    */
  var publishDate: js.UndefOr[String] = js.native
  /**
    * The version ID for this markup. Except for update requests, this field is
    * output-only and should not be set by the user.
    */
  var versionId: js.UndefOr[String] = js.native
}

object SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage {
  @scala.inline
  def apply(): SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage]
  }
  @scala.inline
  implicit class SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPageOps[Self <: SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClaimReviewAuthor(value: SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimReviewAuthor")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClaimReviewAuthor: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimReviewAuthor")(js.undefined)
        ret
    }
    @scala.inline
    def withClaimReviewMarkups(value: js.Array[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkup]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimReviewMarkups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClaimReviewMarkups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimReviewMarkups")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPageUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withPublishDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublishDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publishDate")(js.undefined)
        ret
    }
    @scala.inline
    def withVersionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVersionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("versionId")(js.undefined)
        ret
    }
  }
  
}

