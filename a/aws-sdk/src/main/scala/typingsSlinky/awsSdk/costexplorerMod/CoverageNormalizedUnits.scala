package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoverageNormalizedUnits extends js.Object {
  /**
    * The percentage of your used instance normalized units that a reservation covers.
    */
  var CoverageNormalizedUnitsPercentage: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.CoverageNormalizedUnitsPercentage] = js.native
  /**
    * The number of normalized units that are covered by On-Demand Instances instead of a reservation.
    */
  var OnDemandNormalizedUnits: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.OnDemandNormalizedUnits] = js.native
  /**
    * The number of normalized units that a reservation covers.
    */
  var ReservedNormalizedUnits: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.ReservedNormalizedUnits] = js.native
  /**
    * The total number of normalized units that you used.
    */
  var TotalRunningNormalizedUnits: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.TotalRunningNormalizedUnits] = js.native
}

object CoverageNormalizedUnits {
  @scala.inline
  def apply(): CoverageNormalizedUnits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverageNormalizedUnits]
  }
  @scala.inline
  implicit class CoverageNormalizedUnitsOps[Self <: CoverageNormalizedUnits] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoverageNormalizedUnitsPercentage(value: CoverageNormalizedUnitsPercentage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CoverageNormalizedUnitsPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoverageNormalizedUnitsPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CoverageNormalizedUnitsPercentage")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDemandNormalizedUnits(value: OnDemandNormalizedUnits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnDemandNormalizedUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDemandNormalizedUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnDemandNormalizedUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withReservedNormalizedUnits(value: ReservedNormalizedUnits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedNormalizedUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservedNormalizedUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedNormalizedUnits")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalRunningNormalizedUnits(value: TotalRunningNormalizedUnits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalRunningNormalizedUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalRunningNormalizedUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalRunningNormalizedUnits")(js.undefined)
        ret
    }
  }
  
}

