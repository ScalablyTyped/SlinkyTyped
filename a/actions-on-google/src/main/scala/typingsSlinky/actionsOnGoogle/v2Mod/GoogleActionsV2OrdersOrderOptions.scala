package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2OrdersOrderOptions extends js.Object {
  /**
    * The app can request customer info by setting this field.
    * If set, the corresponding field will show up in ProposedOrderCard for
    * user's confirmation.
    */
  var customerInfoOptions: js.UndefOr[GoogleActionsV2OrdersCustomerInfoOptions] = js.native
  /**
    * If true, delivery address is required for the associated Order.
    */
  var requestDeliveryAddress: js.UndefOr[Boolean] = js.native
}

object GoogleActionsV2OrdersOrderOptions {
  @scala.inline
  def apply(): GoogleActionsV2OrdersOrderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersOrderOptions]
  }
  @scala.inline
  implicit class GoogleActionsV2OrdersOrderOptionsOps[Self <: GoogleActionsV2OrdersOrderOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomerInfoOptions(value: GoogleActionsV2OrdersCustomerInfoOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerInfoOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerInfoOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerInfoOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestDeliveryAddress(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestDeliveryAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestDeliveryAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestDeliveryAddress")(js.undefined)
        ret
    }
  }
  
}

