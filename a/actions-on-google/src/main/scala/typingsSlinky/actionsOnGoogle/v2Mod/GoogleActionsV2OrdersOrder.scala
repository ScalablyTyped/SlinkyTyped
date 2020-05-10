package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2OrdersOrder extends js.Object {
  /**
    * Required: Merchant assigned internal order id. This id must be unique, and
    * is required for subsequent order update operations. This id may be set to
    * the provided google_order_id, or any other unique value. Note that the id
    * presented to users is the user_visible_order_id, which may be a different,
    * more user-friendly value.
    */
  var actionOrderId: js.UndefOr[String] = js.native
  /**
    * If requested, customer info e.g. email will be passed back to the app.
    */
  var customerInfo: js.UndefOr[GoogleActionsV2OrdersCustomerInfo] = js.native
  /**
    * Reflect back the proposed order that caused the order.
    */
  var finalOrder: js.UndefOr[GoogleActionsV2OrdersProposedOrder] = js.native
  /**
    * Order id assigned by Google.
    */
  var googleOrderId: js.UndefOr[String] = js.native
  /**
    * Date and time the order was created.
    */
  var orderDate: js.UndefOr[String] = js.native
  /**
    * Payment related info for the order.
    */
  var paymentInfo: js.UndefOr[GoogleActionsV2OrdersPaymentInfo] = js.native
}

object GoogleActionsV2OrdersOrder {
  @scala.inline
  def apply(): GoogleActionsV2OrdersOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersOrder]
  }
  @scala.inline
  implicit class GoogleActionsV2OrdersOrderOps[Self <: GoogleActionsV2OrdersOrder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withActionOrderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionOrderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutActionOrderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("actionOrderId")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomerInfo(value: GoogleActionsV2OrdersCustomerInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withFinalOrder(value: GoogleActionsV2OrdersProposedOrder): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalOrder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFinalOrder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("finalOrder")(js.undefined)
        ret
    }
    @scala.inline
    def withGoogleOrderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleOrderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGoogleOrderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("googleOrderId")(js.undefined)
        ret
    }
    @scala.inline
    def withOrderDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOrderDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("orderDate")(js.undefined)
        ret
    }
    @scala.inline
    def withPaymentInfo(value: GoogleActionsV2OrdersPaymentInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaymentInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentInfo")(js.undefined)
        ret
    }
  }
  
}

