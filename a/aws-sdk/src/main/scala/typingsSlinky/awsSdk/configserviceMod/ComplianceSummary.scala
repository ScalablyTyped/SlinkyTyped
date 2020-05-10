package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComplianceSummary extends js.Object {
  /**
    * The time that AWS Config created the compliance summary.
    */
  var ComplianceSummaryTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The number of AWS Config rules or AWS resources that are compliant, up to a maximum of 25 for rules and 100 for resources.
    */
  var CompliantResourceCount: js.UndefOr[ComplianceContributorCount] = js.native
  /**
    * The number of AWS Config rules or AWS resources that are noncompliant, up to a maximum of 25 for rules and 100 for resources.
    */
  var NonCompliantResourceCount: js.UndefOr[ComplianceContributorCount] = js.native
}

object ComplianceSummary {
  @scala.inline
  def apply(): ComplianceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComplianceSummary]
  }
  @scala.inline
  implicit class ComplianceSummaryOps[Self <: ComplianceSummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplianceSummaryTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplianceSummaryTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplianceSummaryTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplianceSummaryTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withCompliantResourceCount(value: ComplianceContributorCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompliantResourceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompliantResourceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CompliantResourceCount")(js.undefined)
        ret
    }
    @scala.inline
    def withNonCompliantResourceCount(value: ComplianceContributorCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NonCompliantResourceCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonCompliantResourceCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NonCompliantResourceCount")(js.undefined)
        ret
    }
  }
  
}

