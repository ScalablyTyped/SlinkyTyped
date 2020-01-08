package typingsSlinky.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConformancePackEvaluationResult extends js.Object {
  /**
    * Supplementary information about how the evaluation determined the compliance. 
    */
  var Annotation: js.UndefOr[typingsSlinky.awsDashSdk.clientsConfigserviceMod.Annotation] = js.native
  /**
    * The compliance type. The allowed values are COMPLIANT and NON_COMPLIANT. 
    */
  var ComplianceType: ConformancePackComplianceType = js.native
  /**
    * The time when AWS Config rule evaluated AWS resource.
    */
  var ConfigRuleInvokedTime: js.Date = js.native
  var EvaluationResultIdentifier: typingsSlinky.awsDashSdk.clientsConfigserviceMod.EvaluationResultIdentifier = js.native
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
    ResultRecordedTime: js.Date,
    Annotation: Annotation = null
  ): ConformancePackEvaluationResult = {
    val __obj = js.Dynamic.literal(ComplianceType = ComplianceType.asInstanceOf[js.Any], ConfigRuleInvokedTime = ConfigRuleInvokedTime.asInstanceOf[js.Any], EvaluationResultIdentifier = EvaluationResultIdentifier.asInstanceOf[js.Any], ResultRecordedTime = ResultRecordedTime.asInstanceOf[js.Any])
    if (Annotation != null) __obj.updateDynamic("Annotation")(Annotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConformancePackEvaluationResult]
  }
}

