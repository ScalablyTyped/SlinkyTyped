package typingsSlinky.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionItemOption extends js.Object {
  /**
    * For options that are items, unique item id.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Option name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Note related to the option.
    */
  var note: js.UndefOr[String] = js.native
  /**
    * Option total price.
    */
  var prices: js.UndefOr[js.Array[GoogleActionsOrdersV3PriceAttribute]] = js.native
  /**
    * Product or offer id associated with this option.
    */
  var productId: js.UndefOr[String] = js.native
  /**
    * For options that are items, quantity.
    */
  var quantity: js.UndefOr[Double] = js.native
  /**
    * To define other nested sub options.
    */
  var subOptions: js.UndefOr[js.Array[GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionItemOption]] = js.native
}

object GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionItemOption {
  @scala.inline
  def apply(): GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionItemOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionItemOption]
  }
  @scala.inline
  implicit class GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionItemOptionOps[Self <: GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionItemOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withPrices(value: js.Array[GoogleActionsOrdersV3PriceAttribute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prices")(js.undefined)
        ret
    }
    @scala.inline
    def withProductId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productId")(js.undefined)
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
    def withSubOptions(value: js.Array[GoogleActionsOrdersV3VerticalsPurchasePurchaseItemExtensionItemOption]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subOptions")(js.undefined)
        ret
    }
  }
  
}

