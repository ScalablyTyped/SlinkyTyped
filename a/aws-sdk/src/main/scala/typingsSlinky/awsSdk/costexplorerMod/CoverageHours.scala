package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoverageHours extends js.Object {
  /**
    * The percentage of instance hours that a reservation covered.
    */
  var CoverageHoursPercentage: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.CoverageHoursPercentage] = js.native
  /**
    * The number of instance running hours that On-Demand Instances covered.
    */
  var OnDemandHours: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.OnDemandHours] = js.native
  /**
    * The number of instance running hours that reservations covered.
    */
  var ReservedHours: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.ReservedHours] = js.native
  /**
    * The total instance usage, in hours.
    */
  var TotalRunningHours: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.TotalRunningHours] = js.native
}

object CoverageHours {
  @scala.inline
  def apply(): CoverageHours = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CoverageHours]
  }
  @scala.inline
  implicit class CoverageHoursOps[Self <: CoverageHours] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoverageHoursPercentage(value: CoverageHoursPercentage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CoverageHoursPercentage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoverageHoursPercentage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CoverageHoursPercentage")(js.undefined)
        ret
    }
    @scala.inline
    def withOnDemandHours(value: OnDemandHours): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnDemandHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOnDemandHours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OnDemandHours")(js.undefined)
        ret
    }
    @scala.inline
    def withReservedHours(value: ReservedHours): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReservedHours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ReservedHours")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalRunningHours(value: TotalRunningHours): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalRunningHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalRunningHours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalRunningHours")(js.undefined)
        ret
    }
  }
  
}

