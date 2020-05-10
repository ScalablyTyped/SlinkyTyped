package typingsSlinky.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrderLegacyPromotionBenefit extends js.Object {
  /**
    * The discount in the order price when the promotion is applied.
    */
  var discount: js.UndefOr[SchemaPrice] = js.native
  /**
    * The OfferId(s) that were purchased in this order and map to this specific
    * benefit of the promotion.
    */
  var offerIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * Further describes the benefit of the promotion. Note that we will expand
    * on this enumeration as we support new promotion sub-types.
    */
  var subType: js.UndefOr[String] = js.native
  /**
    * The impact on tax when the promotion is applied.
    */
  var taxImpact: js.UndefOr[SchemaPrice] = js.native
  /**
    * Describes whether the promotion applies to products (e.g. 20% off) or to
    * shipping (e.g. Free Shipping).
    */
  var `type`: js.UndefOr[String] = js.native
}

object SchemaOrderLegacyPromotionBenefit {
  @scala.inline
  def apply(): SchemaOrderLegacyPromotionBenefit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOrderLegacyPromotionBenefit]
  }
  @scala.inline
  implicit class SchemaOrderLegacyPromotionBenefitOps[Self <: SchemaOrderLegacyPromotionBenefit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiscount(value: SchemaPrice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiscount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("discount")(js.undefined)
        ret
    }
    @scala.inline
    def withOfferIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offerIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOfferIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offerIds")(js.undefined)
        ret
    }
    @scala.inline
    def withSubType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subType")(js.undefined)
        ret
    }
    @scala.inline
    def withTaxImpact(value: SchemaPrice): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxImpact")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTaxImpact: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("taxImpact")(js.undefined)
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

