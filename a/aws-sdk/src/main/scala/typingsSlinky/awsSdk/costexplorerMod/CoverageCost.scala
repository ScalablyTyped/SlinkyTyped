package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoverageCost extends js.Object {
  /**
    * How much an On-Demand instance cost.
    */
  var OnDemandCost: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.OnDemandCost] = js.native
}

object CoverageCost {
  @scala.inline
  def apply(): CoverageCost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverageCost]
  }
  @scala.inline
  implicit class CoverageCostOps[Self <: CoverageCost] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withOnDemandCost(value: OnDemandCost): Self = {
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
  }
  
}

