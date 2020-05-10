package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Inventory extends js.Object {
  var availability: js.UndefOr[String] = js.native
  var customLabel0: js.UndefOr[String] = js.native
  var customLabel1: js.UndefOr[String] = js.native
  var customLabel2: js.UndefOr[String] = js.native
  var customLabel3: js.UndefOr[String] = js.native
  var customLabel4: js.UndefOr[String] = js.native
  var installment: js.UndefOr[Installment] = js.native
  var instoreProductLocation: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var loyaltyPoints: js.UndefOr[LoyaltyPoints] = js.native
  var pickup: js.UndefOr[InventoryPickup] = js.native
  var price: js.UndefOr[Price] = js.native
  var quantity: js.UndefOr[Double] = js.native
  var salePrice: js.UndefOr[Price] = js.native
  var salePriceEffectiveDate: js.UndefOr[String] = js.native
  var sellOnGoogleQuantity: js.UndefOr[Double] = js.native
}

object Inventory {
  @scala.inline
  def apply(): Inventory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Inventory]
  }
  @scala.inline
  implicit class InventoryOps[Self <: Inventory] (val x: Self) extends AnyVal {
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
    def withInstallment(value: Installment): Self = {
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
    def withLoyaltyPoints(value: LoyaltyPoints): Self = {
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
    def withPickup(value: InventoryPickup): Self = {
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
    def withPrice(value: Price): Self = {
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
    def withSalePrice(value: Price): Self = {
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

