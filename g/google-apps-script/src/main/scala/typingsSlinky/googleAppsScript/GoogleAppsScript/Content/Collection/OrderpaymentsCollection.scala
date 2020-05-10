package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrderpaymentsNotifyAuthApprovedRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrderpaymentsNotifyAuthApprovedResponse
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrderpaymentsNotifyAuthDeclinedRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrderpaymentsNotifyAuthDeclinedResponse
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrderpaymentsNotifyChargeRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrderpaymentsNotifyChargeResponse
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrderpaymentsNotifyRefundRequest
import typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema.OrderpaymentsNotifyRefundResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderpaymentsCollection extends js.Object {
  // Notify about successfully authorizing user's payment method for a given amount.
  def notifyauthapproved(resource: OrderpaymentsNotifyAuthApprovedRequest, merchantId: String, orderId: String): OrderpaymentsNotifyAuthApprovedResponse = js.native
  // Notify about failure to authorize user's payment method.
  def notifyauthdeclined(resource: OrderpaymentsNotifyAuthDeclinedRequest, merchantId: String, orderId: String): OrderpaymentsNotifyAuthDeclinedResponse = js.native
  // Notify about charge on user's selected payments method.
  def notifycharge(resource: OrderpaymentsNotifyChargeRequest, merchantId: String, orderId: String): OrderpaymentsNotifyChargeResponse = js.native
  // Notify about refund on user's selected payments method.
  def notifyrefund(resource: OrderpaymentsNotifyRefundRequest, merchantId: String, orderId: String): OrderpaymentsNotifyRefundResponse = js.native
}

object OrderpaymentsCollection {
  @scala.inline
  def apply(
    notifyauthapproved: (OrderpaymentsNotifyAuthApprovedRequest, String, String) => OrderpaymentsNotifyAuthApprovedResponse,
    notifyauthdeclined: (OrderpaymentsNotifyAuthDeclinedRequest, String, String) => OrderpaymentsNotifyAuthDeclinedResponse,
    notifycharge: (OrderpaymentsNotifyChargeRequest, String, String) => OrderpaymentsNotifyChargeResponse,
    notifyrefund: (OrderpaymentsNotifyRefundRequest, String, String) => OrderpaymentsNotifyRefundResponse
  ): OrderpaymentsCollection = {
    val __obj = js.Dynamic.literal(notifyauthapproved = js.Any.fromFunction3(notifyauthapproved), notifyauthdeclined = js.Any.fromFunction3(notifyauthdeclined), notifycharge = js.Any.fromFunction3(notifycharge), notifyrefund = js.Any.fromFunction3(notifyrefund))
    __obj.asInstanceOf[OrderpaymentsCollection]
  }
  @scala.inline
  implicit class OrderpaymentsCollectionOps[Self <: OrderpaymentsCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNotifyauthapproved(
      value: (OrderpaymentsNotifyAuthApprovedRequest, String, String) => OrderpaymentsNotifyAuthApprovedResponse
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyauthapproved")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withNotifyauthdeclined(
      value: (OrderpaymentsNotifyAuthDeclinedRequest, String, String) => OrderpaymentsNotifyAuthDeclinedResponse
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyauthdeclined")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withNotifycharge(value: (OrderpaymentsNotifyChargeRequest, String, String) => OrderpaymentsNotifyChargeResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifycharge")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withNotifyrefund(value: (OrderpaymentsNotifyRefundRequest, String, String) => OrderpaymentsNotifyRefundResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyrefund")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

