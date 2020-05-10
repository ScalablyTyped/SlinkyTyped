package typingsSlinky.googleapis.v14Mod.adexchangebuyerV14

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceMarketplaceprivateauctionUpdateproposal extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The private auction id to be updated.
    */
  var privateAuctionId: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaUpdatePrivateAuctionProposalRequest] = js.native
}

object ParamsResourceMarketplaceprivateauctionUpdateproposal {
  @scala.inline
  def apply(): ParamsResourceMarketplaceprivateauctionUpdateproposal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceMarketplaceprivateauctionUpdateproposal]
  }
  @scala.inline
  implicit class ParamsResourceMarketplaceprivateauctionUpdateproposalOps[Self <: ParamsResourceMarketplaceprivateauctionUpdateproposal] (val x: Self) extends AnyVal {
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
    def withPrivateAuctionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateAuctionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateAuctionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateAuctionId")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestBody(value: SchemaUpdatePrivateAuctionProposalRequest): Self = {
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

