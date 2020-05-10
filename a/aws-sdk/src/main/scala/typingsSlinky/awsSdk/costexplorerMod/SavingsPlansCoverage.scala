package typingsSlinky.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SavingsPlansCoverage extends js.Object {
  /**
    * The attribute that applies to a specific Dimension.
    */
  var Attributes: js.UndefOr[typingsSlinky.awsSdk.costexplorerMod.Attributes] = js.native
  /**
    * The amount of Savings Plans eligible usage that the Savings Plans covered.
    */
  var Coverage: js.UndefOr[SavingsPlansCoverageData] = js.native
  var TimePeriod: js.UndefOr[DateInterval] = js.native
}

object SavingsPlansCoverage {
  @scala.inline
  def apply(): SavingsPlansCoverage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SavingsPlansCoverage]
  }
  @scala.inline
  implicit class SavingsPlansCoverageOps[Self <: SavingsPlansCoverage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withCoverage(value: SavingsPlansCoverageData): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Coverage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCoverage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Coverage")(js.undefined)
        ret
    }
    @scala.inline
    def withTimePeriod(value: DateInterval): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimePeriod")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimePeriod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimePeriod")(js.undefined)
        ret
    }
  }
  
}

