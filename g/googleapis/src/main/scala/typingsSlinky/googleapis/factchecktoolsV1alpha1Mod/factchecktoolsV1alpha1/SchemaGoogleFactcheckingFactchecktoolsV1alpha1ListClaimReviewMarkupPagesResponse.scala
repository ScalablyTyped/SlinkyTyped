package typingsSlinky.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response from listing `ClaimReview` markup.
  */
@js.native
trait SchemaGoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse extends js.Object {
  /**
    * The result list of pages of `ClaimReview` markup.
    */
  var claimReviewMarkupPages: js.UndefOr[js.Array[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage]] = js.native
  /**
    * The next pagination token in the Search response. It should be used as
    * the `page_token` for the following request. An empty value means no more
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaGoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse {
  @scala.inline
  def apply(): SchemaGoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse]
  }
  @scala.inline
  implicit class SchemaGoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponseOps[Self <: SchemaGoogleFactcheckingFactchecktoolsV1alpha1ListClaimReviewMarkupPagesResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClaimReviewMarkupPages(value: js.Array[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewMarkupPage]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimReviewMarkupPages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClaimReviewMarkupPages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimReviewMarkupPages")(js.undefined)
        ret
    }
    @scala.inline
    def withNextPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nextPageToken")(js.undefined)
        ret
    }
  }
  
}

