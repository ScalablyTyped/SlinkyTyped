package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Coverage extends js.Object {
  /**
    * The amount of cost that the reservation covered.
    */
  var CoverageCost: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.CoverageCost] = js.native
  /**
    * The amount of instance usage that the reservation covered, in hours.
    */
  var CoverageHours: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.CoverageHours] = js.native
  /**
    * The amount of instance usage that the reservation covered, in normalized units.
    */
  var CoverageNormalizedUnits: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.CoverageNormalizedUnits] = js.native
}

object Coverage {
  @scala.inline
  def apply(): Coverage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Coverage]
  }
  @scala.inline
  implicit class CoverageOps[Self <: Coverage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCoverageCost(value: CoverageCost): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CoverageCost")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoverageCost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CoverageCost")(js.undefined)
        ret
    }
    @scala.inline
    def withCoverageHours(value: CoverageHours): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CoverageHours")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoverageHours: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CoverageHours")(js.undefined)
        ret
    }
    @scala.inline
    def withCoverageNormalizedUnits(value: CoverageNormalizedUnits): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CoverageNormalizedUnits")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoverageNormalizedUnits: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CoverageNormalizedUnits")(js.undefined)
        ret
    }
  }
  
}

