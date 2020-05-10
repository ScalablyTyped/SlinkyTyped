package typingsSlinky.actionsOnGoogle.v2Mod

import typingsSlinky.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsOrdersV3LineItem extends js.Object {
  /**
    * Line item description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Follow up actions at line item.
    */
  var followUpActions: js.UndefOr[js.Array[GoogleActionsOrdersV3Action]] = js.native
  /**
    * Required: Merchant assigned identifier for line item.
    * Used for identifying existing line item in applying partial updates.
    * Max allowed length is 64 chars.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Small image associated with this item, if any.
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.native
  /**
    * Name of line item as displayed on the receipt.
    * Max allowed length is 100 chars.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Additional notes applicable to this particular line item, for example
    * cancellation policy.
    */
  var notes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Line item level price and adjustments.
    */
  var priceAttributes: js.UndefOr[js.Array[GoogleActionsOrdersV3PriceAttribute]] = js.native
  /**
    * The provider of the particular line item, if different from the overall
    * order. Example: Expedia Order with line item provider ANA.
    */
  var provider: js.UndefOr[GoogleActionsOrdersV3Merchant] = js.native
  /**
    * Purchase orders like goods, food etc.
    */
  var purchase: js.UndefOr[GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtension] = js.native
  /**
    * Line item level customers, this could be different from Order level buyer.
    * Example: User X made restaurant reservation under name of user Y.
    */
  var recipients: js.UndefOr[js.Array[GoogleActionsOrdersV3UserInfo]] = js.native
  /**
    * Reservation orders like restaurant, haircut etc.
    */
  var reservation: js.UndefOr[GoogleActionsOrdersV3VerticalsReservationReservationItemExtension] = js.native
  /**
    * Deprecated. Use vertical level status instead. For example, for purchases,
    * use PurchaseOrderExtension.status.
    * User visible label for the state of this line item.
    */
  var userVisibleStateLabel: js.UndefOr[String] = js.native
  /**
    * Deprecated: Use verticals instead.
    * Required: Semantic Contents of line item based on its type/vertical.
    * Every vertical should include its own fulfillment details.
    * Must be either one of the following values:
    * google.actions.orders.v3.verticals.purchase.PurchaseItemExtension
    * google.actions.orders.v3.verticals.reservation.ReservationItemExtension
    * google.actions.orders.v3.verticals.ticket.TicketItemExtension
    */
  var vertical: js.UndefOr[ApiClientObjectMap[_]] = js.native
}

object GoogleActionsOrdersV3LineItem {
  @scala.inline
  def apply(): GoogleActionsOrdersV3LineItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3LineItem]
  }
  @scala.inline
  implicit class GoogleActionsOrdersV3LineItemOps[Self <: GoogleActionsOrdersV3LineItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
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
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNotes(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNotes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notes")(js.undefined)
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
    def withProvider(value: GoogleActionsOrdersV3Merchant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("provider")(js.undefined)
        ret
    }
    @scala.inline
    def withPurchase(value: GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtension): Self = {
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
    def withRecipients(value: js.Array[GoogleActionsOrdersV3UserInfo]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipients")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecipients: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("recipients")(js.undefined)
        ret
    }
    @scala.inline
    def withReservation(value: GoogleActionsOrdersV3VerticalsReservationReservationItemExtension): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reservation")(js.undefined)
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

