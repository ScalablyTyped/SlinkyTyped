package typingsSlinky.googleapis.resellerV1Mod.resellerV1

import typingsSlinky.googleAuthLibrary.mod.Compute
import typingsSlinky.googleAuthLibrary.mod.JWT
import typingsSlinky.googleAuthLibrary.mod.OAuth2Client
import typingsSlinky.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceSubscriptionsChangeseats extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Either the customer's primary domain name or the customer's unique
    * identifier. If using the domain name, we do not recommend using a
    * customerId as a key for persistent data. If the domain name for a
    * customerId is changed, the Google system automatically updates.
    */
  var customerId: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaSeats] = js.native
  /**
    * This is a required property. The subscriptionId is the subscription
    * identifier and is unique for each customer. Since a subscriptionId
    * changes when a subscription is updated, we recommend to not use this ID
    * as a key for persistent data. And the subscriptionId can be found using
    * the retrieve all reseller subscriptions method.
    */
  var subscriptionId: js.UndefOr[String] = js.native
}

object ParamsResourceSubscriptionsChangeseats {
  @scala.inline
  def apply(): ParamsResourceSubscriptionsChangeseats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSubscriptionsChangeseats]
  }
  @scala.inline
  implicit class ParamsResourceSubscriptionsChangeseatsOps[Self <: ParamsResourceSubscriptionsChangeseats] (val x: Self) extends AnyVal {
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
    def withCustomerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerId")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestBody(value: SchemaSeats): Self = {
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
    @scala.inline
    def withSubscriptionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubscriptionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subscriptionId")(js.undefined)
        ret
    }
  }
  
}

