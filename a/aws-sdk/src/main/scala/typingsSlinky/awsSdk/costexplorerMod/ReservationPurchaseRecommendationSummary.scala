package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservationPurchaseRecommendationSummary extends js.Object {
  /**
    * The currency code used for this recommendation.
    */
  var CurrencyCode: js.UndefOr[GenericString] = js.native
  /**
    * The total amount that AWS estimates that this recommendation could save you in a month.
    */
  var TotalEstimatedMonthlySavingsAmount: js.UndefOr[GenericString] = js.native
  /**
    * The total amount that AWS estimates that this recommendation could save you in a month, as a percentage of your costs.
    */
  var TotalEstimatedMonthlySavingsPercentage: js.UndefOr[GenericString] = js.native
}

object ReservationPurchaseRecommendationSummary {
  @scala.inline
  def apply(): ReservationPurchaseRecommendationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservationPurchaseRecommendationSummary]
  }
  @scala.inline
  implicit class ReservationPurchaseRecommendationSummaryOps[Self <: ReservationPurchaseRecommendationSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrencyCode(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrencyCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrencyCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CurrencyCode")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalEstimatedMonthlySavingsAmount(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalEstimatedMonthlySavingsAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalEstimatedMonthlySavingsAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalEstimatedMonthlySavingsAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalEstimatedMonthlySavingsPercentage(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalEstimatedMonthlySavingsPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalEstimatedMonthlySavingsPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalEstimatedMonthlySavingsPercentage")(js.undefined)
        ret
    }
  }
  
}

