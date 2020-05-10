package typingsSlinky.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OrderPromotion extends js.Object {
  var benefits: js.UndefOr[js.Array[OrderPromotionBenefit]] = js.native
  /**
    * The date and time frame when the promotion is active and ready for validation review. Note that the promotion live time may be delayed for a few hours
    * due to the validation review.
    * Start date and end date are separated by a forward slash (/). The start date is specified by the format (YYYY-MM-DD), followed by the letter ?T?, the
    * time of the day when the sale starts (in Greenwich Mean Time, GMT), followed by an expression of the time zone for the sale. The end date is in the
    * same format.
    */
  var effectiveDates: js.UndefOr[String] = js.native
  /** Optional. The text code that corresponds to the promotion when applied on the retailer?s website. */
  var genericRedemptionCode: js.UndefOr[String] = js.native
  /** The unique ID of the promotion. */
  var id: js.UndefOr[String] = js.native
  /** The full title of the promotion. */
  var longTitle: js.UndefOr[String] = js.native
  /** Whether the promotion is applicable to all products or only specific products. */
  var productApplicability: js.UndefOr[String] = js.native
  /** Indicates that the promotion is valid online. */
  var redemptionChannel: js.UndefOr[String] = js.native
}

object OrderPromotion {
  @scala.inline
  def apply(): OrderPromotion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrderPromotion]
  }
  @scala.inline
  implicit class OrderPromotionOps[Self <: OrderPromotion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBenefits(value: js.Array[OrderPromotionBenefit]): Self = {
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

