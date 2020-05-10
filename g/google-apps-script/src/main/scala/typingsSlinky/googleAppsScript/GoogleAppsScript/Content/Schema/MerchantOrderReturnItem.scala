package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MerchantOrderReturnItem extends js.Object {
  var customerReturnReason: js.UndefOr[CustomerReturnReason] = js.native
  var itemId: js.UndefOr[String] = js.native
  var merchantReturnReason: js.UndefOr[RefundReason] = js.native
  var product: js.UndefOr[OrderLineItemProduct] = js.native
  var returnShipmentIds: js.UndefOr[js.Array[String]] = js.native
  var state: js.UndefOr[String] = js.native
}

object MerchantOrderReturnItem {
  @scala.inline
  def apply(): MerchantOrderReturnItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MerchantOrderReturnItem]
  }
  @scala.inline
  implicit class MerchantOrderReturnItemOps[Self <: MerchantOrderReturnItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomerReturnReason(value: CustomerReturnReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerReturnReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerReturnReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customerReturnReason")(js.undefined)
        ret
    }
    @scala.inline
    def withItemId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemId")(js.undefined)
        ret
    }
    @scala.inline
    def withMerchantReturnReason(value: RefundReason): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantReturnReason")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMerchantReturnReason: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantReturnReason")(js.undefined)
        ret
    }
    @scala.inline
    def withProduct(value: OrderLineItemProduct): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProduct: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("product")(js.undefined)
        ret
    }
    @scala.inline
    def withReturnShipmentIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnShipmentIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReturnShipmentIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("returnShipmentIds")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
  }
  
}

