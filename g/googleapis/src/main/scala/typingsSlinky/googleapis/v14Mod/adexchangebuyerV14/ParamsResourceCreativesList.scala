package typingsSlinky.googleapis.v14Mod.adexchangebuyerV14

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceCreativesList extends StandardParameters {
  /**
    * When specified, only creatives for the given account ids are returned.
    */
  var accountId: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * When specified, only creatives for the given buyer creative ids are
    * returned.
    */
  var buyerCreativeId: js.UndefOr[js.Array[String]] = js.native
  /**
    * When specified, only creatives having the given deals status are
    * returned.
    */
  var dealsStatusFilter: js.UndefOr[String] = js.native
  /**
    * Maximum number of entries returned on one result page. If not set, the
    * default is 100. Optional.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * When specified, only creatives having the given open auction status are
    * returned.
    */
  var openAuctionStatusFilter: js.UndefOr[String] = js.native
  /**
    * A continuation token, used to page through ad clients. To retrieve the
    * next page, set this parameter to the value of "nextPageToken" from the
    * previous response. Optional.
    */
  var pageToken: js.UndefOr[String] = js.native
}

object ParamsResourceCreativesList {
  @scala.inline
  def apply(): ParamsResourceCreativesList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceCreativesList]
  }
  @scala.inline
  implicit class ParamsResourceCreativesListOps[Self <: ParamsResourceCreativesList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accountId")(js.undefined)
        ret
    }
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
    def withBuyerCreativeId(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buyerCreativeId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuyerCreativeId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buyerCreativeId")(js.undefined)
        ret
    }
    @scala.inline
    def withDealsStatusFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dealsStatusFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDealsStatusFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dealsStatusFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxResults(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxResults")(js.undefined)
        ret
    }
    @scala.inline
    def withOpenAuctionStatusFilter(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openAuctionStatusFilter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpenAuctionStatusFilter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("openAuctionStatusFilter")(js.undefined)
        ret
    }
    @scala.inline
    def withPageToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPageToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pageToken")(js.undefined)
        ret
    }
  }
  
}

