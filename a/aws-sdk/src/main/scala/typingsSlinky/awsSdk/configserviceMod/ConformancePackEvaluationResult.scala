package typingsSlinky.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConformancePackEvaluationResult extends StObject {
  
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
  implicit class ConformancePackEvaluationResultMutableBuilder[Self <: ConformancePackEvaluationResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotation(value: Annotation): Self = StObject.set(x, "Annotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationUndefined: Self = StObject.set(x, "Annotation", js.undefined)
    
    @scala.inline
    def setComplianceType(value: ConformancePackComplianceType): Self = StObject.set(x, "ComplianceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigRuleInvokedTime(value: js.Date): Self = StObject.set(x, "ConfigRuleInvokedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationResultIdentifier(value: EvaluationResultIdentifier): Self = StObject.set(x, "EvaluationResultIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultRecordedTime(value: js.Date): Self = StObject.set(x, "ResultRecordedTime", value.asInstanceOf[js.Any])
  }
}
