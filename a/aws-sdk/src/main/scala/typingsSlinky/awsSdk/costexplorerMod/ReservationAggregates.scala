package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReservationAggregates extends js.Object {
  /**
    * The monthly cost of your reservation, amortized over the reservation period.
    */
  var AmortizedRecurringFee: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.AmortizedRecurringFee] = js.native
  /**
    * The upfront cost of your reservation, amortized over the reservation period.
    */
  var AmortizedUpfrontFee: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.AmortizedUpfrontFee] = js.native
  /**
    * How much you saved due to purchasing and utilizing reservation. AWS calculates this by subtracting TotalAmortizedFee from OnDemandCostOfRIHoursUsed.
    */
  var NetRISavings: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.NetRISavings] = js.native
  /**
    * How much your reservation would cost if charged On-Demand rates.
    */
  var OnDemandCostOfRIHoursUsed: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.OnDemandCostOfRIHoursUsed] = js.native
  /**
    * How many reservation hours that you purchased.
    */
  var PurchasedHours: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.PurchasedHours] = js.native
  /**
    * How many Amazon EC2 reservation hours that you purchased, converted to normalized units. Normalized units are available only for Amazon EC2 usage after November 11, 2017.
    */
  var PurchasedUnits: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.PurchasedUnits] = js.native
  /**
    * The total number of reservation hours that you used.
    */
  var TotalActualHours: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.TotalActualHours] = js.native
  /**
    * The total number of Amazon EC2 reservation hours that you used, converted to normalized units. Normalized units are available only for Amazon EC2 usage after November 11, 2017.
    */
  var TotalActualUnits: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.TotalActualUnits] = js.native
  /**
    * The total cost of your reservation, amortized over the reservation period.
    */
  var TotalAmortizedFee: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.TotalAmortizedFee] = js.native
  /**
    * How much you could save if you use your entire reservation.
    */
  var TotalPotentialRISavings: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.TotalPotentialRISavings] = js.native
  /**
    * The number of reservation hours that you didn't use.
    */
  var UnusedHours: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.UnusedHours] = js.native
  /**
    * The number of Amazon EC2 reservation hours that you didn't use, converted to normalized units. Normalized units are available only for Amazon EC2 usage after November 11, 2017.
    */
  var UnusedUnits: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.UnusedUnits] = js.native
  /**
    * The percentage of reservation time that you used.
    */
  var UtilizationPercentage: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.UtilizationPercentage] = js.native
  /**
    * The percentage of Amazon EC2 reservation time that you used, converted to normalized units. Normalized units are available only for Amazon EC2 usage after November 11, 2017.
    */
  var UtilizationPercentageInUnits: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.UtilizationPercentageInUnits] = js.native
}

object ReservationAggregates {
  @scala.inline
  def apply(): ReservationAggregates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReservationAggregates]
  }
  @scala.inline
  implicit class ReservationAggregatesOps[Self <: ReservationAggregates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAmortizedRecurringFee(value: AmortizedRecurringFee): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AmortizedRecurringFee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmortizedRecurringFee: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AmortizedRecurringFee")(js.undefined)
        ret
    }
    @scala.inline
    def withAmortizedUpfrontFee(value: AmortizedUpfrontFee): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AmortizedUpfrontFee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmortizedUpfrontFee: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AmortizedUpfrontFee")(js.undefined)
        ret
    }
    @scala.inline
    def withNetRISavings(value: NetRISavings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetRISavings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetRISavings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetRISavings")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDemandCostOfRIHoursUsed(value: OnDemandCostOfRIHoursUsed): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnDemandCostOfRIHoursUsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDemandCostOfRIHoursUsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnDemandCostOfRIHoursUsed")(js.undefined)
        ret
    }
    @scala.inline
    def withPurchasedHours(value: PurchasedHours): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PurchasedHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPurchasedHours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PurchasedHours")(js.undefined)
        ret
    }
    @scala.inline
    def withPurchasedUnits(value: PurchasedUnits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PurchasedUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPurchasedUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PurchasedUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalActualHours(value: TotalActualHours): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalActualHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalActualHours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalActualHours")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalActualUnits(value: TotalActualUnits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalActualUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalActualUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalActualUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalAmortizedFee(value: TotalAmortizedFee): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalAmortizedFee")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalAmortizedFee: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalAmortizedFee")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalPotentialRISavings(value: TotalPotentialRISavings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalPotentialRISavings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalPotentialRISavings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalPotentialRISavings")(js.undefined)
        ret
    }
    @scala.inline
    def withUnusedHours(value: UnusedHours): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnusedHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnusedHours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnusedHours")(js.undefined)
        ret
    }
    @scala.inline
    def withUnusedUnits(value: UnusedUnits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnusedUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnusedUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UnusedUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withUtilizationPercentage(value: UtilizationPercentage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UtilizationPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUtilizationPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UtilizationPercentage")(js.undefined)
        ret
    }
    @scala.inline
    def withUtilizationPercentageInUnits(value: UtilizationPercentageInUnits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UtilizationPercentageInUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUtilizationPercentageInUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UtilizationPercentageInUnits")(js.undefined)
        ret
    }
  }
  
}

