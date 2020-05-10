package typingsSlinky.googleapis.iamV1Mod.iamV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The service account list response.
  */
@js.native
trait SchemaListServiceAccountsResponse extends js.Object {
  /**
    * The list of matching service accounts.
    */
  var accounts: js.UndefOr[js.Array[SchemaServiceAccount]] = js.native
  /**
    * To retrieve the next page of results, set
    * ListServiceAccountsRequest.page_token to this value.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaListServiceAccountsResponse {
  @scala.inline
  def apply(): SchemaListServiceAccountsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListServiceAccountsResponse]
  }
  @scala.inline
  implicit class SchemaListServiceAccountsResponseOps[Self <: SchemaListServiceAccountsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccounts(value: js.Array[SchemaServiceAccount]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accounts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccounts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accounts")(js.undefined)
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

