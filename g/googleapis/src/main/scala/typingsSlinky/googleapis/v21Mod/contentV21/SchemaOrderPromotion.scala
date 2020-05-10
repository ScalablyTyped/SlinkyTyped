package typingsSlinky.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrderPromotion extends js.Object {
  /**
    * Items which this promotion may be applied to. If empty, there are no
    * restrictions on applicable items and quantity.
    */
  var applicableItems: js.UndefOr[js.Array[SchemaOrderPromotionItem]] = js.native
  /**
    * Items which this promotion have been applied to.
    */
  var appliedItems: js.UndefOr[js.Array[SchemaOrderPromotionItem]] = js.native
  /**
    * The party funding the promotion.
    */
  var funder: js.UndefOr[String] = js.native
  /**
    * This field is used to identify promotions within merchants&#39; own
    * systems.
    */
  var merchantPromotionId: js.UndefOr[String] = js.native
  /**
    * Estimated discount applied to price. Amount is pre-tax or post-tax
    * depending on location of order.
    */
  var priceValue: js.UndefOr[SchemaPrice] = js.native
  /**
    * A short title of the promotion to be shown on the checkout page.
    */
  var shortTitle: js.UndefOr[String] = js.native
  /**
    * The category of the promotion.
    */
  var subtype: js.UndefOr[String] = js.native
  /**
    * Estimated discount applied to tax (if allowed by law).
    */
  var taxValue: js.UndefOr[SchemaPrice] = js.native
  /**
    * The title of the promotion.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The scope of the promotion.
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaOrderPromotion {
  @scala.inline
  def apply(): SchemaOrderPromotion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderPromotion]
  }
  @scala.inline
  implicit class SchemaOrderPromotionOps[Self <: SchemaOrderPromotion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApplicableItems(value: js.Array[SchemaOrderPromotionItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicableItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApplicableItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applicableItems")(js.undefined)
        ret
    }
    @scala.inline
    def withAppliedItems(value: js.Array[SchemaOrderPromotionItem]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appliedItems")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppliedItems: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appliedItems")(js.undefined)
        ret
    }
    @scala.inline
    def withFunder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("funder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFunder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("funder")(js.undefined)
        ret
    }
    @scala.inline
    def withMerchantPromotionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantPromotionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMerchantPromotionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("merchantPromotionId")(js.undefined)
        ret
    }
    @scala.inline
    def withPriceValue(value: SchemaPrice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priceValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPriceValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("priceValue")(js.undefined)
        ret
    }
    @scala.inline
    def withShortTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withSubtype(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubtype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subtype")(js.undefined)
        ret
    }
    @scala.inline
    def withTaxValue(value: SchemaPrice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaxValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxValue")(js.undefined)
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
    def withType(value: String): Self = {
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

