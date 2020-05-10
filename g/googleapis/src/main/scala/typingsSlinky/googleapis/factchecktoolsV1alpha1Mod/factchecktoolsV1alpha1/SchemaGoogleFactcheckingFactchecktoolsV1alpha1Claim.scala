package typingsSlinky.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the claim.
  */
@js.native
trait SchemaGoogleFactcheckingFactchecktoolsV1alpha1Claim extends js.Object {
  /**
    * The date that the claim was made.
    */
  var claimDate: js.UndefOr[String] = js.native
  /**
    * One or more reviews of this claim (namely, a fact-checking article).
    */
  var claimReview: js.UndefOr[js.Array[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReview]] = js.native
  /**
    * A person or organization stating the claim. For instance, &quot;John
    * Doe&quot;.
    */
  var claimant: js.UndefOr[String] = js.native
  /**
    * The claim text. For instance, &quot;Crime has doubled in the last 2
    * years.&quot;
    */
  var text: js.UndefOr[String] = js.native
}

object SchemaGoogleFactcheckingFactchecktoolsV1alpha1Claim {
  @scala.inline
  def apply(): SchemaGoogleFactcheckingFactchecktoolsV1alpha1Claim = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFactcheckingFactchecktoolsV1alpha1Claim]
  }
  @scala.inline
  implicit class SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimOps[Self <: SchemaGoogleFactcheckingFactchecktoolsV1alpha1Claim] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withClaimReview(value: js.Array[SchemaGoogleFactcheckingFactchecktoolsV1alpha1ClaimReview]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimReview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClaimReview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimReview")(js.undefined)
        ret
    }
    @scala.inline
    def withClaimant(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClaimant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claimant")(js.undefined)
        ret
    }
    @scala.inline
    def withText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("text")(js.undefined)
        ret
    }
  }
  
}

