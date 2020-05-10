package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConfigRuleEvaluationStatusRequest extends js.Object {
  /**
    * The name of the AWS managed Config rules for which you want status information. If you do not specify any names, AWS Config returns status information for all AWS managed Config rules that you use.
    */
  var ConfigRuleNames: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ConfigRuleNames] = js.native
  /**
    * The number of rule evaluation results that you want returned. This parameter is required if the rule limit for your account is more than the default of 150 rules. For information about requesting a rule limit increase, see AWS Config Limits in the AWS General Reference Guide.
    */
  var Limit: js.UndefOr[RuleLimit] = js.native
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeConfigRuleEvaluationStatusRequest {
  @scala.inline
  def apply(): DescribeConfigRuleEvaluationStatusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeConfigRuleEvaluationStatusRequest]
  }
  @scala.inline
  implicit class DescribeConfigRuleEvaluationStatusRequestOps[Self <: DescribeConfigRuleEvaluationStatusRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigRuleNames(value: ConfigRuleNames): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigRuleNames")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigRuleNames: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigRuleNames")(js.undefined)
        ret
    }
    @scala.inline
    def withLimit(value: RuleLimit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limit")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLimit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Limit")(js.undefined)
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

