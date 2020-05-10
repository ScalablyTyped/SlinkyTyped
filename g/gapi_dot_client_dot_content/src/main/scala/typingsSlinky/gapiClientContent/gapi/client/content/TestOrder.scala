package typingsSlinky.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestOrder extends js.Object {
  /** The details of the customer who placed the order. */
  var customer: js.UndefOr[TestOrderCustomer] = js.native
  /** Identifies what kind of resource this is. Value: the fixed string "content#testOrder". */
  var kind: js.UndefOr[String] = js.native
  /** Line items that are ordered. At least one line item must be provided. */
  var lineItems: js.UndefOr[js.Array[TestOrderLineItem]] = js.native
  /** The details of the payment method. */
  var paymentMethod: js.UndefOr[TestOrderPaymentMethod] = js.native
  /** Identifier of one of the predefined delivery addresses for the delivery. */
  var predefinedDeliveryAddress: js.UndefOr[String] = js.native
  /** The details of the merchant provided promotions applied to the order. More details about the program are here. */
  var promotions: js.UndefOr[js.Array[OrderPromotion]] = js.native
  /** The total cost of shipping for all items. */
  var shippingCost: js.UndefOr[Price] = js.native
  /** The tax for the total shipping cost. */
  var shippingCostTax: js.UndefOr[Price] = js.native
  /** The requested shipping option. */
  var shippingOption: js.UndefOr[String] = js.native
}

object TestOrder {
  @scala.inline
  def apply(): TestOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestOrder]
  }
  @scala.inline
  implicit class TestOrderOps[Self <: TestOrder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomer(value: TestOrderCustomer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customer")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withLineItems(value: js.Array[TestOrderLineItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLineItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lineItems")(js.undefined)
        ret
    }
    @scala.inline
    def withPaymentMethod(value: TestOrderPaymentMethod): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentMethod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaymentMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentMethod")(js.undefined)
        ret
    }
    @scala.inline
    def withPredefinedDeliveryAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predefinedDeliveryAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPredefinedDeliveryAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("predefinedDeliveryAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withPromotions(value: js.Array[OrderPromotion]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promotions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPromotions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("promotions")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingCost(value: Price): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingCost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingCost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingCost")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingCostTax(value: Price): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingCostTax")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingCostTax: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingCostTax")(js.undefined)
        ret
    }
    @scala.inline
    def withShippingOption(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingOption")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShippingOption: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shippingOption")(js.undefined)
        ret
    }
  }
  
}

