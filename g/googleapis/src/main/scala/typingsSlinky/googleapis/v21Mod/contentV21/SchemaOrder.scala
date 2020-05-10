package typingsSlinky.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Order. All methods require the order manager role.
  */
@js.native
trait SchemaOrder extends js.Object {
  /**
    * Whether the order was acknowledged.
    */
  var acknowledged: js.UndefOr[Boolean] = js.native
  /**
    * The billing address.
    */
  var billingAddress: js.UndefOr[SchemaOrderAddress] = js.native
  /**
    * The details of the customer who placed the order.
    */
  var customer: js.UndefOr[SchemaOrderCustomer] = js.native
  /**
    * The details for the delivery.
    */
  var deliveryDetails: js.UndefOr[SchemaOrderDeliveryDetails] = js.native
  /**
    * The REST ID of the order. Globally unique.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#order&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Line items that are ordered.
    */
  var lineItems: js.UndefOr[js.Array[SchemaOrderLineItem]] = js.native
  var merchantId: js.UndefOr[String] = js.native
  /**
    * Merchant-provided ID of the order.
    */
  var merchantOrderId: js.UndefOr[String] = js.native
  /**
    * The net amount for the order (price part). For example, if an order was
    * originally for $100 and a refund was issued for $20, the net amount will
    * be $80.
    */
  var netPriceAmount: js.UndefOr[SchemaPrice] = js.native
  /**
    * The net amount for the order (tax part). Note that in certain cases due
    * to taxable base adjustment netTaxAmount might not match to a sum of tax
    * field across all lineItems and refunds.
    */
  var netTaxAmount: js.UndefOr[SchemaPrice] = js.native
  /**
    * The status of the payment.
    */
  var paymentStatus: js.UndefOr[String] = js.native
  /**
    * The date when the order was placed, in ISO 8601 format.
    */
  var placedDate: js.UndefOr[String] = js.native
  /**
    * Promotions associated with the order.
    */
  var promotions: js.UndefOr[js.Array[SchemaOrderPromotion]] = js.native
  /**
    * Refunds for the order.
    */
  var refunds: js.UndefOr[js.Array[SchemaOrderRefund]] = js.native
  /**
    * Shipments of the order.
    */
  var shipments: js.UndefOr[js.Array[SchemaOrderShipment]] = js.native
  /**
    * The total cost of shipping for all items.
    */
  var shippingCost: js.UndefOr[SchemaPrice] = js.native
  /**
    * The tax for the total shipping cost.
    */
  var shippingCostTax: js.UndefOr[SchemaPrice] = js.native
  /**
    * The status of the order.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * The party responsible for collecting and remitting taxes.
    */
  var taxCollector: js.UndefOr[String] = js.native
}

object SchemaOrder {
  @scala.inline
  def apply(): SchemaOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrder]
  }
  @scala.inline
  implicit class SchemaOrderOps[Self <: SchemaOrder] (val x: Self) extends AnyVal {
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
    def withBillingAddress(value: SchemaOrderAddress): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomer(value: SchemaOrderCustomer): Self = {
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
    def withDeliveryDetails(value: SchemaOrderDeliveryDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeliveryDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deliveryDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
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
    def withLineItems(value: js.Array[SchemaOrderLineItem]): Self = {
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
    def withMerchantOrderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantOrderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMerchantOrderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantOrderId")(js.undefined)
        ret
    }
    @scala.inline
    def withNetPriceAmount(value: SchemaPrice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("netPriceAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetPriceAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("netPriceAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withNetTaxAmount(value: SchemaPrice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("netTaxAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetTaxAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("netTaxAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withPaymentStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaymentStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withPlacedDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placedDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlacedDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placedDate")(js.undefined)
        ret
    }
    @scala.inline
    def withPromotions(value: js.Array[SchemaOrderPromotion]): Self = {
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
    def withRefunds(value: js.Array[SchemaOrderRefund]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refunds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRefunds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refunds")(js.undefined)
        ret
    }
    @scala.inline
    def withShipments(value: js.Array[SchemaOrderShipment]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipments")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShipments: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shipments")(js.undefined)
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
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTaxCollector(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxCollector")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaxCollector: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxCollector")(js.undefined)
        ret
    }
  }
  
}

