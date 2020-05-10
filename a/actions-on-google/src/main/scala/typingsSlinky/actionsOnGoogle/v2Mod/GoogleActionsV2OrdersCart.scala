package typingsSlinky.actionsOnGoogle.v2Mod

import typingsSlinky.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2OrdersCart extends js.Object {
  /**
    * Extension to the cart based on the type of order.
    */
  var extension: js.UndefOr[ApiClientObjectMap[_]] = js.native
  /**
    * Optional id for this cart. Included as part of the
    * Cart returned back to the integrator at confirmation time.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The good(s) or service(s) the user is ordering. There must be at least
    * one line item.
    */
  var lineItems: js.UndefOr[js.Array[GoogleActionsV2OrdersLineItem]] = js.native
  /**
    * Merchant for the cart, if different from the caller.
    */
  var merchant: js.UndefOr[GoogleActionsV2OrdersMerchant] = js.native
  /**
    * Notes about this cart.
    */
  var notes: js.UndefOr[String] = js.native
  /**
    * Adjustments entered by the user, e.g. gratuity.
    */
  var otherItems: js.UndefOr[js.Array[GoogleActionsV2OrdersLineItem]] = js.native
  /**
    * Optional. Promotional coupons added to the cart. Eligible promotions will
    * be sent back as discount line items in proposed order.
    */
  var promotions: js.UndefOr[js.Array[GoogleActionsV2OrdersPromotion]] = js.native
}

object GoogleActionsV2OrdersCart {
  @scala.inline
  def apply(): GoogleActionsV2OrdersCart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersCart]
  }
  @scala.inline
  implicit class GoogleActionsV2OrdersCartOps[Self <: GoogleActionsV2OrdersCart] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withLineItems(value: js.Array[GoogleActionsV2OrdersLineItem]): Self = {
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
    def withMerchant(value: GoogleActionsV2OrdersMerchant): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchant")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMerchant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchant")(js.undefined)
        ret
    }
    @scala.inline
    def withNotes(value: String): Self = {
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
    def withPromotions(value: js.Array[GoogleActionsV2OrdersPromotion]): Self = {
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
  }
  
}

