package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlansSavings extends js.Object {
  /**
    * The savings amount that you are accumulating for the usage that is covered by a Savings Plans, when compared to the On-Demand equivalent of the same usage.
    */
  var NetSavings: js.UndefOr[GenericString] = js.native
  /**
    * How much the amount that the usage would have cost if it was accrued at the On-Demand rate.
    */
  var OnDemandCostEquivalent: js.UndefOr[GenericString] = js.native
}

object SavingsPlansSavings {
  @scala.inline
  def apply(): SavingsPlansSavings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlansSavings]
  }
  @scala.inline
  implicit class SavingsPlansSavingsOps[Self <: SavingsPlansSavings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNetSavings(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetSavings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetSavings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetSavings")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDemandCostEquivalent(value: GenericString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnDemandCostEquivalent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDemandCostEquivalent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnDemandCostEquivalent")(js.undefined)
        ret
    }
  }
  
}

