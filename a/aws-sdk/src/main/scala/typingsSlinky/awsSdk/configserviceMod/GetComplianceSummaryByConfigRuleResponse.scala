package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetComplianceSummaryByConfigRuleResponse extends js.Object {
  /**
    * The number of AWS Config rules that are compliant and the number that are noncompliant, up to a maximum of 25 for each.
    */
  var ComplianceSummary: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ComplianceSummary] = js.native
}

object GetComplianceSummaryByConfigRuleResponse {
  @scala.inline
  def apply(): GetComplianceSummaryByConfigRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetComplianceSummaryByConfigRuleResponse]
  }
  @scala.inline
  implicit class GetComplianceSummaryByConfigRuleResponseOps[Self <: GetComplianceSummaryByConfigRuleResponse] (val x: Self) extends AnyVal {
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
  }
  
}

