package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlansUtilizationAggregates extends js.Object {
  /**
    * The total amortized commitment for a Savings Plans. This includes the sum of the upfront and recurring Savings Plans fees.
    */
  var AmortizedCommitment: js.UndefOr[SavingsPlansAmortizedCommitment] = js.native
  /**
    * The amount saved by using existing Savings Plans. Savings returns both net savings from Savings Plans, as well as the onDemandCostEquivalent of the Savings Plans when considering the utilization rate.
    */
  var Savings: js.UndefOr[SavingsPlansSavings] = js.native
  /**
    * A ratio of your effectiveness of using existing Savings Plans to apply to workloads that are Savings Plans eligible.
    */
  var Utilization: SavingsPlansUtilization = js.native
}

object SavingsPlansUtilizationAggregates {
  @scala.inline
  def apply(Utilization: SavingsPlansUtilization): SavingsPlansUtilizationAggregates = {
    val __obj = js.Dynamic.literal(Utilization = Utilization.asInstanceOf[js.Any])
    __obj.asInstanceOf[SavingsPlansUtilizationAggregates]
  }
  @scala.inline
  implicit class SavingsPlansUtilizationAggregatesOps[Self <: SavingsPlansUtilizationAggregates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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

