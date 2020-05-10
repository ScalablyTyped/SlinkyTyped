package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeComplianceByConfigRuleResponse extends js.Object {
  /**
    * Indicates whether each of the specified AWS Config rules is compliant.
    */
  var ComplianceByConfigRules: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ComplianceByConfigRules] = js.native
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeComplianceByConfigRuleResponse {
  @scala.inline
  def apply(): DescribeComplianceByConfigRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeComplianceByConfigRuleResponse]
  }
  @scala.inline
  implicit class DescribeComplianceByConfigRuleResponseOps[Self <: DescribeComplianceByConfigRuleResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplianceByConfigRules(value: ComplianceByConfigRules): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplianceByConfigRules")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplianceByConfigRules: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplianceByConfigRules")(js.undefined)
        ret
    }
    @scala.inline
    def withNextToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

