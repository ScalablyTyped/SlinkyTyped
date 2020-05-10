package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInventory extends js.Object {
  /**
    * The availability of the product.
    */
  var availability: js.UndefOr[String] = js.native
  /**
    * Custom label 0 for custom grouping of items in a Shopping campaign. Only
    * supported for online products.
    */
  var customLabel0: js.UndefOr[String] = js.native
  /**
    * Custom label 1 for custom grouping of items in a Shopping campaign. Only
    * supported for online products.
    */
  var customLabel1: js.UndefOr[String] = js.native
  /**
    * Custom label 2 for custom grouping of items in a Shopping campaign. Only
    * supported for online products.
    */
  var customLabel2: js.UndefOr[String] = js.native
  /**
    * Custom label 3 for custom grouping of items in a Shopping campaign. Only
    * supported for online products.
    */
  var customLabel3: js.UndefOr[String] = js.native
  /**
    * Custom label 3 for custom grouping of items in a Shopping campaign. Only
    * supported for online products.
    */
  var customLabel4: js.UndefOr[String] = js.native
  /**
    * Number and amount of installments to pay for an item. Brazil only.
    */
  var installment: js.UndefOr[SchemaInstallment] = js.native
  /**
    * The instore product location. Supported only for local products.
    */
  var instoreProductLocation: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#inventory&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Loyalty points that users receive after purchasing the item. Japan only.
    */
  var loyaltyPoints: js.UndefOr[SchemaLoyaltyPoints] = js.native
  /**
    * Store pickup information. Only supported for local inventory. Not setting
    * pickup means &quot;don&#39;t update&quot; while setting it to the empty
    * value ({} in JSON) means &quot;delete&quot;. Otherwise, pickupMethod and
    * pickupSla must be set together, unless pickupMethod is &quot;not
    * supported&quot;.
    */
  var pickup: js.UndefOr[SchemaInventoryPickup] = js.native
  /**
    * The price of the product.
    */
  var price: js.UndefOr[SchemaPrice] = js.native
  /**
    * The quantity of the product. Must be equal to or greater than zero.
    * Supported only for local products.
    */
  var quantity: js.UndefOr[Double] = js.native
  /**
    * The sale price of the product. Mandatory if sale_price_effective_date is
    * defined.
    */
  var salePrice: js.UndefOr[SchemaPrice] = js.native
  /**
    * A date range represented by a pair of ISO 8601 dates separated by a
    * space, comma, or slash. Both dates might be specified as &#39;null&#39;
    * if undecided.
    */
  var salePriceEffectiveDate: js.UndefOr[String] = js.native
  /**
    * The quantity of the product that is available for selling on Google.
    * Supported only for online products.
    */
  var sellOnGoogleQuantity: js.UndefOr[Double] = js.native
}

object SchemaInventory {
  @scala.inline
  def apply(): SchemaInventory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInventory]
  }
  @scala.inline
  implicit class SchemaInventoryOps[Self <: SchemaInventory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAvailability(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAvailability: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availability")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomLabel0(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLabel0")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomLabel0: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLabel0")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomLabel1(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLabel1")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomLabel1: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLabel1")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomLabel2(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLabel2")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomLabel2: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLabel2")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomLabel3(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLabel3")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomLabel3: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLabel3")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomLabel4(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLabel4")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomLabel4: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("customLabel4")(js.undefined)
        ret
    }
    @scala.inline
    def withInstallment(value: SchemaInstallment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstallment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("installment")(js.undefined)
        ret
    }
    @scala.inline
    def withInstoreProductLocation(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instoreProductLocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstoreProductLocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instoreProductLocation")(js.undefined)
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
    def withLoyaltyPoints(value: SchemaLoyaltyPoints): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loyaltyPoints")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoyaltyPoints: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loyaltyPoints")(js.undefined)
        ret
    }
    @scala.inline
    def withPickup(value: SchemaInventoryPickup): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPickup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickup")(js.undefined)
        ret
    }
    @scala.inline
    def withPrice(value: SchemaPrice): Self = {
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
    def withSalePrice(value: SchemaPrice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salePrice")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSalePrice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salePrice")(js.undefined)
        ret
    }
    @scala.inline
    def withSalePriceEffectiveDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salePriceEffectiveDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSalePriceEffectiveDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("salePriceEffectiveDate")(js.undefined)
        ret
    }
    @scala.inline
    def withSellOnGoogleQuantity(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sellOnGoogleQuantity")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSellOnGoogleQuantity: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sellOnGoogleQuantity")(js.undefined)
        ret
    }
  }
  
}

