package typingsSlinky.googleapis.v2beta1Mod.adexchangebuyer2V2beta1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceBiddersAccountsFiltersetsCreate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Whether the filter set is transient, or should be persisted indefinitely.
    * By default, filter sets are not transient. If transient, it will be
    * available for at least 1 hour after creation.
    */
  var isTransient: js.UndefOr[Boolean] = js.native
  /**
    * Name of the owner (bidder or account) of the filter set to be created.
    * For example:  - For a bidder-level filter set for bidder 123:
    * `bidders/123`  - For an account-level filter set for the buyer account
    * representing bidder   123: `bidders/123/accounts/123`  - For an
    * account-level filter set for the child seat buyer account 456   whose
    * bidder is 123: `bidders/123/accounts/456`
    */
  var ownerName: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaFilterSet] = js.native
}

object ParamsResourceBiddersAccountsFiltersetsCreate {
  @scala.inline
  def apply(): ParamsResourceBiddersAccountsFiltersetsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceBiddersAccountsFiltersetsCreate]
  }
  @scala.inline
  implicit class ParamsResourceBiddersAccountsFiltersetsCreateOps[Self <: ParamsResourceBiddersAccountsFiltersetsCreate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuth: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("auth")(js.undefined)
        ret
    }
    @scala.inline
    def withIsTransient(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTransient")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsTransient: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isTransient")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerName")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestBody(value: SchemaFilterSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestBody")(js.undefined)
        ret
    }
  }
  
}

