package typingsSlinky.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the claim review author.
  */
@js.native
trait SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor extends js.Object {
  /**
    * Corresponds to `ClaimReview.author.image`.
    */
  var imageUrl: js.UndefOr[String] = js.native
  /**
    * Name of the organization that is publishing the fact check.&lt;br&gt;
    * Corresponds to `ClaimReview.author.name`.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor {
  @scala.inline
  def apply(): SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor]
  }
  @scala.inline
  implicit class SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthorOps[Self <: SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReviewAuthor] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
  }
  
}

