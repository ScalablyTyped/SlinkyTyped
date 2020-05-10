package typingsSlinky.actionsOnGoogle.v2Mod

import typingsSlinky.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsOrdersV3Order extends js.Object {
  /**
    * Info about the buyer.
    */
  var buyerInfo: js.UndefOr[GoogleActionsOrdersV3UserInfo] = js.native
  /**
    * Required: Order contents which is a group of line items.
    */
  var contents: js.UndefOr[GoogleActionsOrdersV3OrderContents] = js.native
  /**
    * Required: Date and time the order was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Follow up actions at order level.
    */
  var followUpActions: js.UndefOr[js.Array[GoogleActionsOrdersV3Action]] = js.native
  /**
    * Google assigned order id.
    */
  var googleOrderId: js.UndefOr[String] = js.native
  /**
    * Image associated with the order.
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.native
  /**
    * Date and time the order was last updated.
    * Required for OrderUpdate.
    */
  var lastUpdateTime: js.UndefOr[String] = js.native
  /**
    * Required: Merchant assigned internal order id. This id must be unique, and
    * is required for subsequent order update operations. This id may be set to
    * the provided google_order_id, or any other unique value. Note that the id
    * presented to users is the user_visible_order_id, which may be a different,
    * more user-friendly value.
    * Max allowed length is 64 chars.
    */
  var merchantOrderId: js.UndefOr[String] = js.native
  /**
    * Notes attached to an order.
    */
  var note: js.UndefOr[String] = js.native
  /**
    * Payment related data for the order.
    */
  var paymentData: js.UndefOr[GoogleActionsTransactionsV3PaymentData] = js.native
  /**
    * Price, discounts, taxes and so on.
    */
  var priceAttributes: js.UndefOr[js.Array[GoogleActionsOrdersV3PriceAttribute]] = js.native
  /**
    * All promotions that are associated with this order.
    */
  var promotions: js.UndefOr[js.Array[GoogleActionsOrdersV3Promotion]] = js.native
  /**
    * Purchase order
    */
  var purchase: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtension] = js.native
  /**
    * A link to the terms of service that apply to order/proposed order.
    */
  var termsOfServiceUrl: js.UndefOr[String] = js.native
  /**
    * Ticket order
    */
  var ticket: js.UndefOr[GoogleActionsOrdersV3VerticalsTicketTicketOrderExtension] = js.native
  /**
    * Merchant that facilitated the checkout. This could be different from
    * a line item level provider. Example: Expedia Order with line item from ANA.
    */
  var transactionMerchant: js.UndefOr[GoogleActionsOrdersV3Merchant] = js.native
  /**
    * The user facing id referencing to current order. This id should be
    * consistent with the id displayed for this order in other contexts,
    * including websites, apps and email.
    */
  var userVisibleOrderId: js.UndefOr[String] = js.native
  /**
    * Deprecated: Use OrderExtensions status instead.
    * User visible label for the state of this order.
    */
  var userVisibleStateLabel: js.UndefOr[String] = js.native
  /**
    * Deprecated: Use verticals instead.
    * These properties will apply to all line items, unless overridden in
    * some line item. This vertical must match the line item level vertical type.
    * Possible values:
    * google.actions.orders.v3.verticals.purchase.PurchaseOrderExtension
    * google.actions.orders.v3.verticals.ticket.TicketOrderExtension
    */
  var vertical: js.UndefOr[ApiClientObjectMap[_]] = js.native
}

object GoogleActionsOrdersV3Order {
  @scala.inline
  def apply(): GoogleActionsOrdersV3Order = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3Order]
  }
  @scala.inline
  implicit class GoogleActionsOrdersV3OrderOps[Self <: GoogleActionsOrdersV3Order] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuyerInfo(value: GoogleActionsOrdersV3UserInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buyerInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBuyerInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("buyerInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withContents(value: GoogleActionsOrdersV3OrderContents): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contents")(js.undefined)
        ret
    }
    @scala.inline
    def withCreateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFollowUpActions(value: js.Array[GoogleActionsOrdersV3Action]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followUpActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFollowUpActions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("followUpActions")(js.undefined)
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
    def withImage(value: GoogleActionsV2UiElementsImage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("image")(js.undefined)
        ret
    }
    @scala.inline
    def withLastUpdateTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdateTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastUpdateTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lastUpdateTime")(js.undefined)
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
    def withNote(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNote: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("note")(js.undefined)
        ret
    }
    @scala.inline
    def withPaymentData(value: GoogleActionsTransactionsV3PaymentData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPaymentData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("paymentData")(js.undefined)
        ret
    }
    @scala.inline
    def withPriceAttributes(value: js.Array[GoogleActionsOrdersV3PriceAttribute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priceAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriceAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priceAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withPromotions(value: js.Array[GoogleActionsOrdersV3Promotion]): Self = {
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
    def withPurchase(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseOrderExtension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purchase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPurchase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("purchase")(js.undefined)
        ret
    }
    @scala.inline
    def withTermsOfServiceUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("termsOfServiceUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTermsOfServiceUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("termsOfServiceUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withTicket(value: GoogleActionsOrdersV3VerticalsTicketTicketOrderExtension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticket")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTicket: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ticket")(js.undefined)
        ret
    }
    @scala.inline
    def withTransactionMerchant(value: GoogleActionsOrdersV3Merchant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionMerchant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTransactionMerchant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transactionMerchant")(js.undefined)
        ret
    }
    @scala.inline
    def withUserVisibleOrderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userVisibleOrderId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserVisibleOrderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userVisibleOrderId")(js.undefined)
        ret
    }
    @scala.inline
    def withUserVisibleStateLabel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userVisibleStateLabel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUserVisibleStateLabel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("userVisibleStateLabel")(js.undefined)
        ret
    }
    @scala.inline
    def withVertical(value: ApiClientObjectMap[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVertical: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vertical")(js.undefined)
        ret
    }
  }
  
}

