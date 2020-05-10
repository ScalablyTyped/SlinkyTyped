package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AggregateComplianceCount extends js.Object {
  /**
    * The number of compliant and noncompliant AWS Config rules.
    */
  var ComplianceSummary: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ComplianceSummary] = js.native
  /**
    * The 12-digit account ID or region based on the GroupByKey value.
    */
  var GroupName: js.UndefOr[StringWithCharLimit256] = js.native
}

object AggregateComplianceCount {
  @scala.inline
  def apply(): AggregateComplianceCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregateComplianceCount]
  }
  @scala.inline
  implicit class AggregateComplianceCountOps[Self <: AggregateComplianceCount] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplianceSummary(value: ComplianceSummary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplianceSummary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplianceSummary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplianceSummary")(js.undefined)
        ret
    }
    @scala.inline
    def withGroupName(value: StringWithCharLimit256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroupName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GroupName")(js.undefined)
        ret
    }
  }
  
}

