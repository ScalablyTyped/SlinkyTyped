package typingsSlinky.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NonCompliantSummary extends js.Object {
  /**
    * The total number of compliance items that are not compliant.
    */
  var NonCompliantCount: js.UndefOr[ComplianceSummaryCount] = js.native
  /**
    * A summary of the non-compliance severity by compliance type
    */
  var SeveritySummary: js.UndefOr[typingsSlinky.awsSdk.ssmMod.SeveritySummary] = js.native
}

object NonCompliantSummary {
  @scala.inline
  def apply(): NonCompliantSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NonCompliantSummary]
  }
  @scala.inline
  implicit class NonCompliantSummaryOps[Self <: NonCompliantSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNonCompliantCount(value: ComplianceSummaryCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NonCompliantCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonCompliantCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NonCompliantCount")(js.undefined)
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

