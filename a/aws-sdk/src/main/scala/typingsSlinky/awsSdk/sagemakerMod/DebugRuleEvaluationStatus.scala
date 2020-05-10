package typingsSlinky.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebugRuleEvaluationStatus extends js.Object {
  /**
    * Timestamp when the rule evaluation status was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
  /**
    * The name of the rule configuration
    */
  var RuleConfigurationName: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.RuleConfigurationName] = js.native
  /**
    * The Amazon Resource Name (ARN) of the rule evaluation job.
    */
  var RuleEvaluationJobArn: js.UndefOr[ProcessingJobArn] = js.native
  /**
    * Status of the rule evaluation.
    */
  var RuleEvaluationStatus: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.RuleEvaluationStatus] = js.native
  /**
    * Details from the rule evaluation.
    */
  var StatusDetails: js.UndefOr[typingsSlinky.awsSdk.sagemakerMod.StatusDetails] = js.native
}

object DebugRuleEvaluationStatus {
  @scala.inline
  def apply(): DebugRuleEvaluationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DebugRuleEvaluationStatus]
  }
  @scala.inline
  implicit class DebugRuleEvaluationStatusOps[Self <: DebugRuleEvaluationStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLastModifiedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastModifiedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastModifiedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleConfigurationName(value: RuleConfigurationName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleConfigurationName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleConfigurationName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleConfigurationName")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleEvaluationJobArn(value: ProcessingJobArn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleEvaluationJobArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleEvaluationJobArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleEvaluationJobArn")(js.undefined)
        ret
    }
    @scala.inline
    def withRuleEvaluationStatus(value: RuleEvaluationStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleEvaluationStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRuleEvaluationStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RuleEvaluationStatus")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusDetails(value: StatusDetails): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusDetails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusDetails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusDetails")(js.undefined)
        ret
    }
  }
  
}

