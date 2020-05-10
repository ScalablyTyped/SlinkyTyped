package typingsSlinky.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConformancePackEvaluationResult extends js.Object {
  /**
    * Supplementary information about how the evaluation determined the compliance. 
    */
  var Annotation: js.UndefOr[typingsSlinky.awsSdk.configserviceMod.Annotation] = js.native
  /**
    * The compliance type. The allowed values are COMPLIANT and NON_COMPLIANT. 
    */
  var ComplianceType: ConformancePackComplianceType = js.native
  /**
    * The time when AWS Config rule evaluated AWS resource.
    */
  var ConfigRuleInvokedTime: js.Date = js.native
  var EvaluationResultIdentifier: typingsSlinky.awsSdk.configserviceMod.EvaluationResultIdentifier = js.native
  /**
    * The time when AWS Config recorded the evaluation result. 
    */
  var ResultRecordedTime: js.Date = js.native
}

object ConformancePackEvaluationResult {
  @scala.inline
  def apply(
    ComplianceType: ConformancePackComplianceType,
    ConfigRuleInvokedTime: js.Date,
    EvaluationResultIdentifier: EvaluationResultIdentifier,
    ResultRecordedTime: js.Date
  ): ConformancePackEvaluationResult = {
    val __obj = js.Dynamic.literal(ComplianceType = ComplianceType.asInstanceOf[js.Any], ConfigRuleInvokedTime = ConfigRuleInvokedTime.asInstanceOf[js.Any], EvaluationResultIdentifier = EvaluationResultIdentifier.asInstanceOf[js.Any], ResultRecordedTime = ResultRecordedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConformancePackEvaluationResult]
  }
  @scala.inline
  implicit class ConformancePackEvaluationResultOps[Self <: ConformancePackEvaluationResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withComplianceType(value: ConformancePackComplianceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ComplianceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConfigRuleInvokedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ConfigRuleInvokedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvaluationResultIdentifier(value: EvaluationResultIdentifier): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EvaluationResultIdentifier")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResultRecordedTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResultRecordedTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAnnotation(value: Annotation): Self = {
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
  }
  
}

