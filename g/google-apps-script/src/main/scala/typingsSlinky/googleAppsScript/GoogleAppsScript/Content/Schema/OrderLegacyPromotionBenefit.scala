package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderLegacyPromotionBenefit extends js.Object {
  var discount: js.UndefOr[Price] = js.native
  var offerIds: js.UndefOr[js.Array[String]] = js.native
  var subType: js.UndefOr[String] = js.native
  var taxImpact: js.UndefOr[Price] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object OrderLegacyPromotionBenefit {
  @scala.inline
  def apply(): OrderLegacyPromotionBenefit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderLegacyPromotionBenefit]
  }
  @scala.inline
  implicit class OrderLegacyPromotionBenefitOps[Self <: OrderLegacyPromotionBenefit] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiscount(value: Price): Self = {
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
    def withTaxImpact(value: Price): Self = {
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

