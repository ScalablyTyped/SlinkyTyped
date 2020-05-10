package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlansUtilizationDetail extends js.Object {
  /**
    * The total amortized commitment for a Savings Plans. Includes the sum of the upfront and recurring Savings Plans fees.
    */
  var AmortizedCommitment: js.UndefOr[SavingsPlansAmortizedCommitment] = js.native
  /**
    * The attribute that applies to a specific Dimension.
    */
  var Attributes: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.Attributes] = js.native
  /**
    * The amount saved by using existing Savings Plans. Savings returns both net savings from savings plans as well as the onDemandCostEquivalent of the Savings Plans when considering the utilization rate.
    */
  var Savings: js.UndefOr[SavingsPlansSavings] = js.native
  /**
    * The unique Amazon Resource Name (ARN) for a particular Savings Plan.
    */
  var SavingsPlanArn: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.SavingsPlanArn] = js.native
  /**
    * A ratio of your effectiveness of using existing Savings Plans to apply to workloads that are Savings Plans eligible.
    */
  var Utilization: js.UndefOr[SavingsPlansUtilization] = js.native
}

object SavingsPlansUtilizationDetail {
  @scala.inline
  def apply(): SavingsPlansUtilizationDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlansUtilizationDetail]
  }
  @scala.inline
  implicit class SavingsPlansUtilizationDetailOps[Self <: SavingsPlansUtilizationDetail] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withAttributes(value: Attributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Attributes")(js.undefined)
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
    @scala.inline
    def withSavingsPlanArn(value: SavingsPlanArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SavingsPlanArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSavingsPlanArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SavingsPlanArn")(js.undefined)
        ret
    }
    @scala.inline
    def withUtilization(value: SavingsPlansUtilization): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Utilization")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUtilization: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Utilization")(js.undefined)
        ret
    }
  }
  
}

