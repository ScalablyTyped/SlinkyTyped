package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservationPurchaseRecommendationDetail extends js.Object {
  /**
    * The account that this RI recommendation is for.
    */
  var AccountId: js.UndefOr[GenericString] = js.native
  /**
    * The average number of normalized units that you used in an hour during the historical period. AWS uses this to calculate your recommended reservation purchases.
    */
  var AverageNormalizedUnitsUsedPerHour: js.UndefOr[GenericString] = js.native
  /**
    * The average number of instances that you used in an hour during the historical period. AWS uses this to calculate your recommended reservation purchases.
    */
  var AverageNumberOfInstancesUsedPerHour: js.UndefOr[GenericString] = js.native
  /**
    * The average utilization of your instances. AWS uses this to calculate your recommended reservation purchases.
    */
  var AverageUtilization: js.UndefOr[GenericString] = js.native
  /**
    * The currency code that AWS used to calculate the costs for this instance.
    */
  var CurrencyCode: js.UndefOr[GenericString] = js.native
  /**
    * How long AWS estimates that it takes for this instance to start saving you money, in months.
    */
  var EstimatedBreakEvenInMonths: js.UndefOr[GenericString] = js.native
  /**
    * How much AWS estimates that you spend on On-Demand Instances in a month.
    */
  var EstimatedMonthlyOnDemandCost: js.UndefOr[GenericString] = js.native
  /**
    * How much AWS estimates that this specific recommendation could save you in a month.
    */
  var EstimatedMonthlySavingsAmount: js.UndefOr[GenericString] = js.native
  /**
    * How much AWS estimates that this specific recommendation could save you in a month, as a percentage of your overall costs.
    */
  var EstimatedMonthlySavingsPercentage: js.UndefOr[GenericString] = js.native
  /**
    * How much AWS estimates that you would have spent for all usage during the specified historical period if you had a reservation.
    */
  var EstimatedReservationCostForLookbackPeriod: js.UndefOr[GenericString] = js.native
  /**
    * Details about the instances that AWS recommends that you purchase.
    */
  var InstanceDetails: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.InstanceDetails] = js.native
  /**
    * The maximum number of normalized units that you used in an hour during the historical period. AWS uses this to calculate your recommended reservation purchases.
    */
  var MaximumNormalizedUnitsUsedPerHour: js.UndefOr[GenericString] = js.native
  /**
    * The maximum number of instances that you used in an hour during the historical period. AWS uses this to calculate your recommended reservation purchases.
    */
  var MaximumNumberOfInstancesUsedPerHour: js.UndefOr[GenericString] = js.native
  /**
    * The minimum number of normalized units that you used in an hour during the historical period. AWS uses this to calculate your recommended reservation purchases.
    */
  var MinimumNormalizedUnitsUsedPerHour: js.UndefOr[GenericString] = js.native
  /**
    * The minimum number of instances that you used in an hour during the historical period. AWS uses this to calculate your recommended reservation purchases.
    */
  var MinimumNumberOfInstancesUsedPerHour: js.UndefOr[GenericString] = js.native
  /**
    * The number of normalized units that AWS recommends that you purchase.
    */
  var RecommendedNormalizedUnitsToPurchase: js.UndefOr[GenericString] = js.native
  /**
    * The number of instances that AWS recommends that you purchase.
    */
  var RecommendedNumberOfInstancesToPurchase: js.UndefOr[GenericString] = js.native
  /**
    * How much purchasing this instance costs you on a monthly basis.
    */
  var RecurringStandardMonthlyCost: js.UndefOr[GenericString] = js.native
  /**
    * How much purchasing this instance costs you upfront.
    */
  var UpfrontCost: js.UndefOr[GenericString] = js.native
}

object ReservationPurchaseRecommendationDetail {
  @scala.inline
  def apply(): ReservationPurchaseRecommendationDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservationPurchaseRecommendationDetail]
  }
  @scala.inline
  implicit class ReservationPurchaseRecommendationDetailOps[Self <: ReservationPurchaseRecommendationDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccountId(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccountId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccountId")(js.undefined)
        ret
    }
    @scala.inline
    def withAverageNormalizedUnitsUsedPerHour(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AverageNormalizedUnitsUsedPerHour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAverageNormalizedUnitsUsedPerHour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AverageNormalizedUnitsUsedPerHour")(js.undefined)
        ret
    }
    @scala.inline
    def withAverageNumberOfInstancesUsedPerHour(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AverageNumberOfInstancesUsedPerHour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAverageNumberOfInstancesUsedPerHour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AverageNumberOfInstancesUsedPerHour")(js.undefined)
        ret
    }
    @scala.inline
    def withAverageUtilization(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AverageUtilization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAverageUtilization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AverageUtilization")(js.undefined)
        ret
    }
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
    def withEstimatedBreakEvenInMonths(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedBreakEvenInMonths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedBreakEvenInMonths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedBreakEvenInMonths")(js.undefined)
        ret
    }
    @scala.inline
    def withEstimatedMonthlyOnDemandCost(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedMonthlyOnDemandCost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedMonthlyOnDemandCost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedMonthlyOnDemandCost")(js.undefined)
        ret
    }
    @scala.inline
    def withEstimatedMonthlySavingsAmount(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedMonthlySavingsAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedMonthlySavingsAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedMonthlySavingsAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withEstimatedMonthlySavingsPercentage(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedMonthlySavingsPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedMonthlySavingsPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedMonthlySavingsPercentage")(js.undefined)
        ret
    }
    @scala.inline
    def withEstimatedReservationCostForLookbackPeriod(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedReservationCostForLookbackPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEstimatedReservationCostForLookbackPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EstimatedReservationCostForLookbackPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceDetails(value: InstanceDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInstanceDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("InstanceDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumNormalizedUnitsUsedPerHour(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumNormalizedUnitsUsedPerHour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumNormalizedUnitsUsedPerHour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumNormalizedUnitsUsedPerHour")(js.undefined)
        ret
    }
    @scala.inline
    def withMaximumNumberOfInstancesUsedPerHour(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumNumberOfInstancesUsedPerHour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaximumNumberOfInstancesUsedPerHour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaximumNumberOfInstancesUsedPerHour")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumNormalizedUnitsUsedPerHour(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinimumNormalizedUnitsUsedPerHour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumNormalizedUnitsUsedPerHour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinimumNormalizedUnitsUsedPerHour")(js.undefined)
        ret
    }
    @scala.inline
    def withMinimumNumberOfInstancesUsedPerHour(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinimumNumberOfInstancesUsedPerHour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinimumNumberOfInstancesUsedPerHour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinimumNumberOfInstancesUsedPerHour")(js.undefined)
        ret
    }
    @scala.inline
    def withRecommendedNormalizedUnitsToPurchase(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecommendedNormalizedUnitsToPurchase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecommendedNormalizedUnitsToPurchase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecommendedNormalizedUnitsToPurchase")(js.undefined)
        ret
    }
    @scala.inline
    def withRecommendedNumberOfInstancesToPurchase(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecommendedNumberOfInstancesToPurchase")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecommendedNumberOfInstancesToPurchase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecommendedNumberOfInstancesToPurchase")(js.undefined)
        ret
    }
    @scala.inline
    def withRecurringStandardMonthlyCost(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecurringStandardMonthlyCost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRecurringStandardMonthlyCost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RecurringStandardMonthlyCost")(js.undefined)
        ret
    }
    @scala.inline
    def withUpfrontCost(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpfrontCost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpfrontCost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UpfrontCost")(js.undefined)
        ret
    }
  }
  
}

