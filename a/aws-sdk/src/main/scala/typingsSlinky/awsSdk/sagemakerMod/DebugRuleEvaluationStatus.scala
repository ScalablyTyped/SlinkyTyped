package typingsSlinky.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DebugRuleEvaluationStatus extends StObject {
  
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
  implicit class DebugRuleEvaluationStatusMutableBuilder[Self <: DebugRuleEvaluationStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    @scala.inline
    def setRuleConfigurationName(value: RuleConfigurationName): Self = StObject.set(x, "RuleConfigurationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleConfigurationNameUndefined: Self = StObject.set(x, "RuleConfigurationName", js.undefined)
    
    @scala.inline
    def setRuleEvaluationJobArn(value: ProcessingJobArn): Self = StObject.set(x, "RuleEvaluationJobArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleEvaluationJobArnUndefined: Self = StObject.set(x, "RuleEvaluationJobArn", js.undefined)
    
    @scala.inline
    def setRuleEvaluationStatus(value: RuleEvaluationStatus): Self = StObject.set(x, "RuleEvaluationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleEvaluationStatusUndefined: Self = StObject.set(x, "RuleEvaluationStatus", js.undefined)
    
    @scala.inline
    def setStatusDetails(value: StatusDetails): Self = StObject.set(x, "StatusDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusDetailsUndefined: Self = StObject.set(x, "StatusDetails", js.undefined)
  }
}
