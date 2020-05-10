package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestOrder extends js.Object {
  var customer: js.UndefOr[TestOrderCustomer] = js.native
  var enableOrderinvoices: js.UndefOr[Boolean] = js.native
  var kind: js.UndefOr[String] = js.native
  var lineItems: js.UndefOr[js.Array[TestOrderLineItem]] = js.native
  var notificationMode: js.UndefOr[String] = js.native
  var paymentMethod: js.UndefOr[TestOrderPaymentMethod] = js.native
  var predefinedDeliveryAddress: js.UndefOr[String] = js.native
  var promotions: js.UndefOr[js.Array[OrderLegacyPromotion]] = js.native
  var shippingCost: js.UndefOr[Price] = js.native
  var shippingCostTax: js.UndefOr[Price] = js.native
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
    def withEnableOrderinvoices(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableOrderinvoices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnableOrderinvoices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enableOrderinvoices")(js.undefined)
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
    def withNotificationMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotificationMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notificationMode")(js.undefined)
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
    def withPromotions(value: js.Array[OrderLegacyPromotion]): Self = {
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

