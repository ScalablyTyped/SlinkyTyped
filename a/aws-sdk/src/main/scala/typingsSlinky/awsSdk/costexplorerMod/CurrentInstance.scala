package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurrentInstance extends js.Object {
  /**
    *  The currency code that Amazon Web Services used to calculate the costs for this instance.
    */
  var CurrencyCode: js.UndefOr[GenericString] = js.native
  /**
    *  Current On Demand cost of operating this instance on a monthly basis.
    */
  var MonthlyCost: js.UndefOr[GenericString] = js.native
  /**
    *  Number of hours during the lookback period billed at On Demand rates.
    */
  var OnDemandHoursInLookbackPeriod: js.UndefOr[GenericString] = js.native
  /**
    *  Number of hours during the lookback period covered by reservations.
    */
  var ReservationCoveredHoursInLookbackPeriod: js.UndefOr[GenericString] = js.native
  /**
    *  Details about the resource and utilization.
    */
  var ResourceDetails: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.ResourceDetails] = js.native
  /**
    * Resource ID of the current instance.
    */
  var ResourceId: js.UndefOr[GenericString] = js.native
  /**
    *  Utilization information of the current instance during the lookback period.
    */
  var ResourceUtilization: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.ResourceUtilization] = js.native
  /**
    * Number of hours during the lookback period covered by Savings Plans.
    */
  var SavingsPlansCoveredHoursInLookbackPeriod: js.UndefOr[GenericString] = js.native
  /**
    * Cost allocation resource tags applied to the instance.
    */
  var Tags: js.UndefOr[TagValuesList] = js.native
  /**
    *  The total number of hours the instance ran during the lookback period.
    */
  var TotalRunningHoursInLookbackPeriod: js.UndefOr[GenericString] = js.native
}

object CurrentInstance {
  @scala.inline
  def apply(): CurrentInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentInstance]
  }
  @scala.inline
  implicit class CurrentInstanceOps[Self <: CurrentInstance] (val x: Self) extends AnyVal {
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
    def withMonthlyCost(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonthlyCost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonthlyCost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MonthlyCost")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDemandHoursInLookbackPeriod(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnDemandHoursInLookbackPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDemandHoursInLookbackPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnDemandHoursInLookbackPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withReservationCoveredHoursInLookbackPeriod(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservationCoveredHoursInLookbackPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservationCoveredHoursInLookbackPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservationCoveredHoursInLookbackPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceDetails(value: ResourceDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceDetails")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceId(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceId")(js.undefined)
        ret
    }
    @scala.inline
    def withResourceUtilization(value: ResourceUtilization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceUtilization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceUtilization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceUtilization")(js.undefined)
        ret
    }
    @scala.inline
    def withSavingsPlansCoveredHoursInLookbackPeriod(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SavingsPlansCoveredHoursInLookbackPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSavingsPlansCoveredHoursInLookbackPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SavingsPlansCoveredHoursInLookbackPeriod")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagValuesList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalRunningHoursInLookbackPeriod(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalRunningHoursInLookbackPeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalRunningHoursInLookbackPeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalRunningHoursInLookbackPeriod")(js.undefined)
        ret
    }
  }
  
}

