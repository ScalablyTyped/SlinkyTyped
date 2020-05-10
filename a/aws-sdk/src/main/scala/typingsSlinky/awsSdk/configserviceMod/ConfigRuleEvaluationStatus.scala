package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigRuleEvaluationStatus extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the AWS Config rule.
    */
  var ConfigRuleArn: js.UndefOr[String] = js.native
  /**
    * The ID of the AWS Config rule.
    */
  var ConfigRuleId: js.UndefOr[String] = js.native
  /**
    * The name of the AWS Config rule.
    */
  var ConfigRuleName: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ConfigRuleName] = js.native
  /**
    * The time that you first activated the AWS Config rule.
    */
  var FirstActivatedTime: js.UndefOr[js.Date] = js.native
  /**
    * Indicates whether AWS Config has evaluated your resources against the rule at least once.    true - AWS Config has evaluated your AWS resources against the rule at least once.    false - AWS Config has not once finished evaluating your AWS resources against the rule.  
    */
  var FirstEvaluationStarted: js.UndefOr[Boolean] = js.native
  var LastDeactivatedTime: js.UndefOr[js.Date] = js.native
  /**
    * The error code that AWS Config returned when the rule last failed.
    */
  var LastErrorCode: js.UndefOr[String] = js.native
  /**
    * The error message that AWS Config returned when the rule last failed.
    */
  var LastErrorMessage: js.UndefOr[String] = js.native
  /**
    * The time that AWS Config last failed to evaluate your AWS resources against the rule.
    */
  var LastFailedEvaluationTime: js.UndefOr[js.Date] = js.native
  /**
    * The time that AWS Config last failed to invoke the AWS Config rule to evaluate your AWS resources.
    */
  var LastFailedInvocationTime: js.UndefOr[js.Date] = js.native
  /**
    * The time that AWS Config last successfully evaluated your AWS resources against the rule.
    */
  var LastSuccessfulEvaluationTime: js.UndefOr[js.Date] = js.native
  /**
    * The time that AWS Config last successfully invoked the AWS Config rule to evaluate your AWS resources.
    */
  var LastSuccessfulInvocationTime: js.UndefOr[js.Date] = js.native
}

object ConfigRuleEvaluationStatus {
  @scala.inline
  def apply(): ConfigRuleEvaluationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigRuleEvaluationStatus]
  }
  @scala.inline
  implicit class ConfigRuleEvaluationStatusOps[Self <: ConfigRuleEvaluationStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConfigRuleArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigRuleArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigRuleArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigRuleArn")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigRuleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigRuleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigRuleId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigRuleId")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigRuleName(value: ConfigRuleName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigRuleName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigRuleName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigRuleName")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstActivatedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstActivatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstActivatedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstActivatedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withFirstEvaluationStarted(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstEvaluationStarted")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFirstEvaluationStarted: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstEvaluationStarted")(js.undefined)
        ret
    }
    @scala.inline
    def withLastDeactivatedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastDeactivatedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastDeactivatedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastDeactivatedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLastErrorCode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastErrorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastErrorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastErrorCode")(js.undefined)
        ret
    }
    @scala.inline
    def withLastErrorMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastErrorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withLastFailedEvaluationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastFailedEvaluationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastFailedEvaluationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastFailedEvaluationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLastFailedInvocationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastFailedInvocationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastFailedInvocationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastFailedInvocationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLastSuccessfulEvaluationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastSuccessfulEvaluationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastSuccessfulEvaluationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastSuccessfulEvaluationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLastSuccessfulInvocationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastSuccessfulInvocationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastSuccessfulInvocationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastSuccessfulInvocationTime")(js.undefined)
        ret
    }
  }
  
}

