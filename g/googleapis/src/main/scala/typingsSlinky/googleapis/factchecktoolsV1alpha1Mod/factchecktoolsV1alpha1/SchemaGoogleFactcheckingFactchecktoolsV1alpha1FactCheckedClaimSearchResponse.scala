package typingsSlinky.googleapis.factchecktoolsV1alpha1Mod.factchecktoolsV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response from searching fact-checked claims.
  */
@js.native
trait SchemaGoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse extends js.Object {
  /**
    * The list of claims and all of their associated information.
    */
  var claims: js.UndefOr[js.Array[SchemaGoogleFactcheckingFactchecktoolsV1alpha1Claim]] = js.native
  /**
    * The next pagination token in the Search response. It should be used as
    * the `page_token` for the following request. An empty value means no more
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaGoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse {
  @scala.inline
  def apply(): SchemaGoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse]
  }
  @scala.inline
  implicit class SchemaGoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponseOps[Self <: SchemaGoogleFactcheckingFactchecktoolsV1alpha1FactCheckedClaimSearchResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClaims(value: js.Array[SchemaGoogleFactcheckingFactchecktoolsV1alpha1Claim]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claims")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClaims: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("claims")(js.undefined)
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

