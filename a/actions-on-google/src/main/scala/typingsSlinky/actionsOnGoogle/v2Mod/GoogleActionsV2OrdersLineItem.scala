package typingsSlinky.actionsOnGoogle.v2Mod

import typingsSlinky.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2OrdersLineItem extends js.Object {
  /**
    * Description of the item.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Extension to the line item based on its type.
    */
  var extension: js.UndefOr[ApiClientObjectMap[_]] = js.native
  /**
    * Unique id of the line item within the Cart/Order. Required.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Small image associated with this item.
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.native
  /**
    * Name of the line item as displayed in the receipt. Required.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Optional product or offer id for this item.
    */
  var offerId: js.UndefOr[String] = js.native
  /**
    * Each line item should have a price, even if the price is 0. Required.
    * This is the total price as displayed on the receipt for this line
    * (i.e. unit price * quantity).
    */
  var price: js.UndefOr[GoogleActionsV2OrdersPrice] = js.native
  /**
    * Number of items included.
    */
  var quantity: js.UndefOr[Double] = js.native
  /**
    * Sub-line item(s). Only valid if type is `REGULAR`.
    */
  var subLines: js.UndefOr[js.Array[GoogleActionsV2OrdersLineItemSubLine]] = js.native
  /**
    * Type of line item.
    */
  var `type`: js.UndefOr[GoogleActionsV2OrdersLineItemType] = js.native
}

object GoogleActionsV2OrdersLineItem {
  @scala.inline
  def apply(): GoogleActionsV2OrdersLineItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersLineItem]
  }
  @scala.inline
  implicit class GoogleActionsV2OrdersLineItemOps[Self <: GoogleActionsV2OrdersLineItem] (val x: Self) extends AnyVal {
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
    def withOfferId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfferId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offerId")(js.undefined)
        ret
    }
    @scala.inline
    def withPrice(value: GoogleActionsV2OrdersPrice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("price")(js.undefined)
        ret
    }
    @scala.inline
    def withQuantity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("quantity")(js.undefined)
        ret
    }
    @scala.inline
    def withSubLines(value: js.Array[GoogleActionsV2OrdersLineItemSubLine]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subLines")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubLines: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subLines")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: GoogleActionsV2OrdersLineItemType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

