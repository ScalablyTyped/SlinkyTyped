package typingsSlinky.googleAppsScript.GoogleAppsScript.Content.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderLegacyPromotion extends js.Object {
  var benefits: js.UndefOr[js.Array[OrderLegacyPromotionBenefit]] = js.native
  var effectiveDates: js.UndefOr[String] = js.native
  var genericRedemptionCode: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var longTitle: js.UndefOr[String] = js.native
  var productApplicability: js.UndefOr[String] = js.native
  var redemptionChannel: js.UndefOr[String] = js.native
}

object OrderLegacyPromotion {
  @scala.inline
  def apply(): OrderLegacyPromotion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderLegacyPromotion]
  }
  @scala.inline
  implicit class OrderLegacyPromotionOps[Self <: OrderLegacyPromotion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBenefits(value: js.Array[OrderLegacyPromotionBenefit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("benefits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBenefits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("benefits")(js.undefined)
        ret
    }
    @scala.inline
    def withEffectiveDates(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEffectiveDates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("effectiveDates")(js.undefined)
        ret
    }
    @scala.inline
    def withGenericRedemptionCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genericRedemptionCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGenericRedemptionCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("genericRedemptionCode")(js.undefined)
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
    def withLongTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longTitle")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLongTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longTitle")(js.undefined)
        ret
    }
    @scala.inline
    def withProductApplicability(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productApplicability")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProductApplicability: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("productApplicability")(js.undefined)
        ret
    }
    @scala.inline
    def withRedemptionChannel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redemptionChannel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRedemptionChannel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redemptionChannel")(js.undefined)
        ret
    }
  }
  
}

