package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderLineItemProduct extends js.Object {
  var brand: js.UndefOr[String] = js.native
  var channel: js.UndefOr[String] = js.native
  var condition: js.UndefOr[String] = js.native
  var contentLanguage: js.UndefOr[String] = js.native
  var fees: js.UndefOr[js.Array[OrderLineItemProductFee]] = js.native
  var gtin: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var imageLink: js.UndefOr[String] = js.native
  var itemGroupId: js.UndefOr[String] = js.native
  var mpn: js.UndefOr[String] = js.native
  var offerId: js.UndefOr[String] = js.native
  var price: js.UndefOr[Price] = js.native
  var shownImage: js.UndefOr[String] = js.native
  var targetCountry: js.UndefOr[String] = js.native
  var title: js.UndefOr[String] = js.native
  var variantAttributes: js.UndefOr[js.Array[OrderLineItemProductVariantAttribute]] = js.native
}

object OrderLineItemProduct {
  @scala.inline
  def apply(): OrderLineItemProduct = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderLineItemProduct]
  }
  @scala.inline
  implicit class OrderLineItemProductOps[Self <: OrderLineItemProduct] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBrand(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brand")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBrand: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("brand")(js.undefined)
        ret
    }
    @scala.inline
    def withChannel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChannel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(js.undefined)
        ret
    }
    @scala.inline
    def withCondition(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCondition: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("condition")(js.undefined)
        ret
    }
    @scala.inline
    def withContentLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentLanguage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutContentLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contentLanguage")(js.undefined)
        ret
    }
    @scala.inline
    def withFees(value: js.Array[OrderLineItemProductFee]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fees")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFees: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fees")(js.undefined)
        ret
    }
    @scala.inline
    def withGtin(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gtin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGtin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gtin")(js.undefined)
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
    def withImageLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImageLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("imageLink")(js.undefined)
        ret
    }
    @scala.inline
    def withItemGroupId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutItemGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemGroupId")(js.undefined)
        ret
    }
    @scala.inline
    def withMpn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mpn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMpn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mpn")(js.undefined)
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
    def withShownImage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shownImage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShownImage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shownImage")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetCountry(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetCountry")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetCountry: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetCountry")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withVariantAttributes(value: js.Array[OrderLineItemProductVariantAttribute]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variantAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVariantAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("variantAttributes")(js.undefined)
        ret
    }
  }
  
}

