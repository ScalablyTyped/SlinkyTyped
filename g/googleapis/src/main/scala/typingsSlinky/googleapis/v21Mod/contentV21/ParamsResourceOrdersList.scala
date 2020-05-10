package typingsSlinky.googleapis.v21Mod.contentV21

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceOrdersList extends StandardParameters {
  /**
    * Obtains orders that match the acknowledgement status. When set to true,
    * obtains orders that have been acknowledged. When false, obtains orders
    * that have not been acknowledged. We recommend using this filter set to
    * false, in conjunction with the acknowledge call, such that only
    * un-acknowledged orders are returned.
    */
  var acknowledged: js.UndefOr[Boolean] = js.native
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The maximum number of orders to return in the response, used for paging.
    * The default value is 25 orders per page, and the maximum allowed value is
    * 250 orders per page. Known issue: All List calls will return all Orders
    * without limit regardless of the value of this field.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /**
    * The ID of the account that manages the order. This cannot be a
    * multi-client account.
    */
  var merchantId: js.UndefOr[String] = js.native
  /**
    * The ordering of the returned list. The only supported value are
    * placedDate desc and placedDate asc for now, which returns orders sorted
    * by placement date. "placedDate desc" stands for listing orders by
    * placement date, from oldest to most recent. "placedDate asc" stands for
    * listing orders by placement date, from most recent to oldest. In future
    * releases we'll support other sorting criteria.
    */
  var orderBy: js.UndefOr[String] = js.native
  /**
    * The token returned by the previous request.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Obtains orders placed before this date (exclusively), in ISO 8601 format.
    */
  var placedDateEnd: js.UndefOr[String] = js.native
  /**
    * Obtains orders placed after this date (inclusively), in ISO 8601 format.
    */
  var placedDateStart: js.UndefOr[String] = js.native
  /**
    * Obtains orders that match any of the specified statuses. Multiple values
    * can be specified with comma separation. Additionally, please note that
    * active is a shortcut for pendingShipment and partiallyShipped, and
    * completed is a shortcut for shipped , partiallyDelivered, delivered,
    * partiallyReturned, returned, and canceled.
    */
  var statuses: js.UndefOr[js.Array[String]] = js.native
}

object ParamsResourceOrdersList {
  @scala.inline
  def apply(): ParamsResourceOrdersList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceOrdersList]
  }
  @scala.inline
  implicit class ParamsResourceOrdersListOps[Self <: ParamsResourceOrdersList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAcknowledged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acknowledged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcknowledged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acknowledged")(js.undefined)
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
    def withMerchantId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMerchantId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantId")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderBy(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderBy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderBy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderBy")(js.undefined)
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
    @scala.inline
    def withPlacedDateEnd(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placedDateEnd")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacedDateEnd: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placedDateEnd")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacedDateStart(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placedDateStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacedDateStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placedDateStart")(js.undefined)
        ret
    }
    @scala.inline
    def withStatuses(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statuses")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatuses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("statuses")(js.undefined)
        ret
    }
  }
  
}

