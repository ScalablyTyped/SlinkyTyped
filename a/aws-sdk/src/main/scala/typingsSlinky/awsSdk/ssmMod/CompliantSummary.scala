package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompliantSummary extends js.Object {
  /**
    * The total number of resources that are compliant.
    */
  var CompliantCount: js.UndefOr[ComplianceSummaryCount] = js.native
  /**
    * A summary of the compliance severity by compliance type.
    */
  var SeveritySummary: js.UndefOr[typingsSlinky.awsSdk.ssmMod.SeveritySummary] = js.native
}

object CompliantSummary {
  @scala.inline
  def apply(): CompliantSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompliantSummary]
  }
  @scala.inline
  implicit class CompliantSummaryOps[Self <: CompliantSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCompliantCount(value: ComplianceSummaryCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompliantCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompliantCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompliantCount")(js.undefined)
        ret
    }
    @scala.inline
    def withSeveritySummary(value: SeveritySummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SeveritySummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSeveritySummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SeveritySummary")(js.undefined)
        ret
    }
  }
  
}

