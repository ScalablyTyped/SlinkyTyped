package typingsSlinky.gapiClientAdexchangebuyer.gapi.client.adexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DealTermsGuaranteedFixedPriceTerms extends js.Object {
  /** External billing info for this Deal. This field is relevant when external billing info such as price has a different currency code than DFP/AdX. */
  var billingInfo: js.UndefOr[DealTermsGuaranteedFixedPriceTermsBillingInfo] = js.native
  /** Fixed price for the specified buyer. */
  var fixedPrices: js.UndefOr[js.Array[PricePerBuyer]] = js.native
  /** Guaranteed impressions as a percentage. This is the percentage of guaranteed looks that the buyer is guaranteeing to buy. */
  var guaranteedImpressions: js.UndefOr[String] = js.native
  /** Count of guaranteed looks. Required for deal, optional for product. For CPD deals, buyer changes to guaranteed_looks will be ignored. */
  var guaranteedLooks: js.UndefOr[String] = js.native
  /** Count of minimum daily looks for a CPD deal. For CPD deals, buyer should negotiate on this field instead of guaranteed_looks. */
  var minimumDailyLooks: js.UndefOr[String] = js.native
}

object DealTermsGuaranteedFixedPriceTerms {
  @scala.inline
  def apply(): DealTermsGuaranteedFixedPriceTerms = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DealTermsGuaranteedFixedPriceTerms]
  }
  @scala.inline
  implicit class DealTermsGuaranteedFixedPriceTermsOps[Self <: DealTermsGuaranteedFixedPriceTerms] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBillingInfo(value: DealTermsGuaranteedFixedPriceTermsBillingInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBillingInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("billingInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withFixedPrices(value: js.Array[PricePerBuyer]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedPrices")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFixedPrices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fixedPrices")(js.undefined)
        ret
    }
    @scala.inline
    def withGuaranteedImpressions(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guaranteedImpressions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuaranteedImpressions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guaranteedImpressions")(js.undefined)
        ret
    }
    @scala.inline
    def withGuaranteedLooks(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guaranteedLooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGuaranteedLooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("guaranteedLooks")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumDailyLooks(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumDailyLooks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumDailyLooks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minimumDailyLooks")(js.undefined)
        ret
    }
  }
  
}

