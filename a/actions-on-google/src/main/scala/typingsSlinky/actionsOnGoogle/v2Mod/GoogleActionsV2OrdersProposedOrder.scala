package typingsSlinky.actionsOnGoogle.v2Mod

import typingsSlinky.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2OrdersProposedOrder extends js.Object {
  /**
    * User's items.
    */
  var cart: js.UndefOr[GoogleActionsV2OrdersCart] = js.native
  /**
    * Extension to the proposed order based on the kind of order.
    * For example, if the order includes a location then this extension will
    * contain a OrderLocation value.
    */
  var extension: js.UndefOr[ApiClientObjectMap[_]] = js.native
  /**
    * Optional id for this ProposedOrder. Included as part of the
    * ProposedOrder returned back to the integrator at confirmation time.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Image associated with the proposed order.
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.native
  /**
    * Fees, adjustments, subtotals, etc.
    */
  var otherItems: js.UndefOr[js.Array[GoogleActionsV2OrdersLineItem]] = js.native
  /**
    * A link to the terms of service that apply to this proposed order.
    */
  var termsOfServiceUrl: js.UndefOr[String] = js.native
  /**
    * Total price of the proposed order. If of type `ACTUAL`, this is the amount
    * the caller will charge when the user confirms the proposed order.
    */
  var totalPrice: js.UndefOr[GoogleActionsV2OrdersPrice] = js.native
}

object GoogleActionsV2OrdersProposedOrder {
  @scala.inline
  def apply(): GoogleActionsV2OrdersProposedOrder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersProposedOrder]
  }
  @scala.inline
  implicit class GoogleActionsV2OrdersProposedOrderOps[Self <: GoogleActionsV2OrdersProposedOrder] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCart(value: GoogleActionsV2OrdersCart): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cart")(js.undefined)
        ret
    }
    @scala.inline
    def withExtension(value: ApiClientObjectMap[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtension: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extension")(js.undefined)
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
    def withOtherItems(value: js.Array[GoogleActionsV2OrdersLineItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOtherItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("otherItems")(js.undefined)
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
    def withTotalPrice(value: GoogleActionsV2OrdersPrice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalPrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("totalPrice")(js.undefined)
        ret
    }
  }
  
}

