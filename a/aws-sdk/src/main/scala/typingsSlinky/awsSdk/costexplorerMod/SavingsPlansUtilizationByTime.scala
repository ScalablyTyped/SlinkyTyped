package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlansUtilizationByTime extends js.Object {
  /**
    * The total amortized commitment for a Savings Plans. This includes the sum of the upfront and recurring Savings Plans fees.
    */
  var AmortizedCommitment: js.UndefOr[SavingsPlansAmortizedCommitment] = js.native
  /**
    * The amount saved by using existing Savings Plans. Savings returns both net savings from Savings Plans as well as the onDemandCostEquivalent of the Savings Plans when considering the utilization rate.
    */
  var Savings: js.UndefOr[SavingsPlansSavings] = js.native
  var TimePeriod: DateInterval = js.native
  /**
    * A ratio of your effectiveness of using existing Savings Plans to apply to workloads that are Savings Plans eligible.
    */
  var Utilization: SavingsPlansUtilization = js.native
}

object SavingsPlansUtilizationByTime {
  @scala.inline
  def apply(TimePeriod: DateInterval, Utilization: SavingsPlansUtilization): SavingsPlansUtilizationByTime = {
    val __obj = js.Dynamic.literal(TimePeriod = TimePeriod.asInstanceOf[js.Any], Utilization = Utilization.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsPlansUtilizationByTime]
  }
  @scala.inline
  implicit class SavingsPlansUtilizationByTimeOps[Self <: SavingsPlansUtilizationByTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTimePeriod(value: DateInterval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimePeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUtilization(value: SavingsPlansUtilization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Utilization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAmortizedCommitment(value: SavingsPlansAmortizedCommitment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AmortizedCommitment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAmortizedCommitment: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AmortizedCommitment")(js.undefined)
        ret
    }
    @scala.inline
    def withSavings(value: SavingsPlansSavings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Savings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSavings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Savings")(js.undefined)
        ret
    }
  }
  
}

