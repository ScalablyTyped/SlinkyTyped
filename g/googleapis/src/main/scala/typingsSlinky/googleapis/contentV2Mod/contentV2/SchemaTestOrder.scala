package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTestOrder extends js.Object {
  /**
    * The details of the customer who placed the order.
    */
  var customer: js.UndefOr[SchemaTestOrderCustomer] = js.native
  /**
    * Whether the orderinvoices service should support this order.
    */
  var enableOrderinvoices: js.UndefOr[Boolean] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#testOrder&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Line items that are ordered. At least one line item must be provided.
    */
  var lineItems: js.UndefOr[js.Array[SchemaTestOrderLineItem]] = js.native
  /**
    * Determines if test order must be pulled by merchant or pushed to merchant
    * via push integration.
    */
  var notificationMode: js.UndefOr[String] = js.native
  /**
    * The details of the payment method.
    */
  var paymentMethod: js.UndefOr[SchemaTestOrderPaymentMethod] = js.native
  /**
    * Identifier of one of the predefined delivery addresses for the delivery.
    */
  var predefinedDeliveryAddress: js.UndefOr[String] = js.native
  /**
    * Deprecated. Ignored if provided.
    */
  var promotions: js.UndefOr[js.Array[SchemaOrderLegacyPromotion]] = js.native
  /**
    * The price of shipping for all items. Shipping tax is automatically
    * calculated for MFL orders. For non-MFL orders, tax settings from Merchant
    * Center are applied. Note that shipping is not taxed in certain states.
    */
  var shippingCost: js.UndefOr[SchemaPrice] = js.native
  /**
    * Deprecated. Ignored if provided.
    */
  var shippingCostTax: js.UndefOr[SchemaPrice] = js.native
  /**
    * The requested shipping option.
    */
  var shippingOption: js.UndefOr[String] = js.native
}

object SchemaTestOrder {
  @scala.inline
  def apply(): SchemaTestOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTestOrder]
  }
  @scala.inline
  implicit class SchemaTestOrderOps[Self <: SchemaTestOrder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCustomer(value: SchemaTestOrderCustomer): Self = {
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
    def withLineItems(value: js.Array[SchemaTestOrderLineItem]): Self = {
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
    def withPaymentMethod(value: SchemaTestOrderPaymentMethod): Self = {
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
    def withPromotions(value: js.Array[SchemaOrderLegacyPromotion]): Self = {
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
    def withShippingCost(value: SchemaPrice): Self = {
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
    def withShippingCostTax(value: SchemaPrice): Self = {
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

