package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EvaluationResult extends js.Object {
  /**
    * Supplementary information about how the evaluation determined the compliance.
    */
  var Annotation: js.UndefOr[StringWithCharLimit256] = js.native
  /**
    * Indicates whether the AWS resource complies with the AWS Config rule that evaluated it. For the EvaluationResult data type, AWS Config supports only the COMPLIANT, NON_COMPLIANT, and NOT_APPLICABLE values. AWS Config does not support the INSUFFICIENT_DATA value for the EvaluationResult data type.
    */
  var ComplianceType: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.ComplianceType] = js.native
  /**
    * The time when the AWS Config rule evaluated the AWS resource.
    */
  var ConfigRuleInvokedTime: js.UndefOr[js.Date] = js.native
  /**
    * Uniquely identifies the evaluation result.
    */
  var EvaluationResultIdentifier: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.EvaluationResultIdentifier] = js.native
  /**
    * The time when AWS Config recorded the evaluation result.
    */
  var ResultRecordedTime: js.UndefOr[js.Date] = js.native
  /**
    * An encrypted token that associates an evaluation with an AWS Config rule. The token identifies the rule, the AWS resource being evaluated, and the event that triggered the evaluation.
    */
  var ResultToken: js.UndefOr[String] = js.native
}

object EvaluationResult {
  @scala.inline
  def apply(): EvaluationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EvaluationResult]
  }
  @scala.inline
  implicit class EvaluationResultOps[Self <: EvaluationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAnnotation(value: StringWithCharLimit256): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Annotation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAnnotation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Annotation")(js.undefined)
        ret
    }
    @scala.inline
    def withComplianceType(value: ComplianceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplianceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutComplianceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplianceType")(js.undefined)
        ret
    }
    @scala.inline
    def withConfigRuleInvokedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigRuleInvokedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfigRuleInvokedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigRuleInvokedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEvaluationResultIdentifier(value: EvaluationResultIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EvaluationResultIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvaluationResultIdentifier: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EvaluationResultIdentifier")(js.undefined)
        ret
    }
    @scala.inline
    def withResultRecordedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultRecordedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultRecordedTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultRecordedTime")(js.undefined)
        ret
    }
    @scala.inline
    def withResultToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResultToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultToken")(js.undefined)
        ret
    }
  }
  
}

