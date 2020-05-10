package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlansCoverageData extends js.Object {
  /**
    * The percentage of your existing Savings Planscovered usage, divided by all of your eligible Savings Plans usage in an account(or set of accounts).
    */
  var CoveragePercentage: js.UndefOr[GenericString] = js.native
  /**
    * The cost of your Amazon Web Services usage at the public On-Demand rate.
    */
  var OnDemandCost: js.UndefOr[GenericString] = js.native
  /**
    * The amount of your Amazon Web Services usage that is covered by a Savings Plans.
    */
  var SpendCoveredBySavingsPlans: js.UndefOr[GenericString] = js.native
  /**
    * The total cost of your Amazon Web Services usage, regardless of your purchase option.
    */
  var TotalCost: js.UndefOr[GenericString] = js.native
}

object SavingsPlansCoverageData {
  @scala.inline
  def apply(): SavingsPlansCoverageData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlansCoverageData]
  }
  @scala.inline
  implicit class SavingsPlansCoverageDataOps[Self <: SavingsPlansCoverageData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoveragePercentage(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CoveragePercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoveragePercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CoveragePercentage")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDemandCost(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnDemandCost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDemandCost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnDemandCost")(js.undefined)
        ret
    }
    @scala.inline
    def withSpendCoveredBySavingsPlans(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpendCoveredBySavingsPlans")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpendCoveredBySavingsPlans: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SpendCoveredBySavingsPlans")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalCost(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalCost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalCost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalCost")(js.undefined)
        ret
    }
  }
  
}

