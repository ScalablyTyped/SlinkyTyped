package typingsSlinky.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDetectorVersionResult extends StObject {
  
  /**
    * The detector version ARN.
    */
  var arn: js.UndefOr[fraudDetectorArn] = js.native
  
  /**
    * The timestamp when the detector version was created. 
    */
  var createdTime: js.UndefOr[time] = js.native
  
  /**
    * The detector version description.
    */
  var description: js.UndefOr[typingsSlinky.awsSdk.frauddetectorMod.description] = js.native
  
  /**
    * The detector ID.
    */
  var detectorId: js.UndefOr[identifier] = js.native
  
  /**
    * The detector version ID.
    */
  var detectorVersionId: js.UndefOr[wholeNumberVersionString] = js.native
  
  /**
    * The Amazon SageMaker model endpoints included in the detector version.
    */
  var externalModelEndpoints: js.UndefOr[ListOfStrings] = js.native
  
  /**
    * The timestamp when the detector version was last updated. 
    */
  var lastUpdatedTime: js.UndefOr[time] = js.native
  
  /**
    * The model versions included in the detector version. 
    */
  var modelVersions: js.UndefOr[ListOfModelVersions] = js.native
  
  /**
    * The execution mode of the rule in the dectector  FIRST_MATCHED indicates that Amazon Fraud Detector evaluates rules sequentially, first to last, stopping at the first matched rule. Amazon Fraud dectector then provides the outcomes for that single rule.  ALL_MATCHED indicates that Amazon Fraud Detector evaluates all rules and returns the outcomes for all matched rules. You can define and edit the rule mode at the detector version level, when it is in draft status.
    */
  var ruleExecutionMode: js.UndefOr[RuleExecutionMode] = js.native
  
  /**
    * The rules included in the detector version.
    */
  var rules: js.UndefOr[RuleList] = js.native
  
  /**
    * The status of the detector version.
    */
  var status: js.UndefOr[DetectorVersionStatus] = js.native
}
object GetDetectorVersionResult {
  
  @scala.inline
  def apply(): GetDetectorVersionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDetectorVersionResult]
  }
  
  @scala.inline
  implicit class GetDetectorVersionResultMutableBuilder[Self <: GetDetectorVersionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: fraudDetectorArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: time): Self = StObject.set(x, "createdTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedTimeUndefined: Self = StObject.set(x, "createdTime", js.undefined)
    
    @scala.inline
    def setDescription(value: description): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDetectorId(value: identifier): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorIdUndefined: Self = StObject.set(x, "detectorId", js.undefined)
    
    @scala.inline
    def setDetectorVersionId(value: wholeNumberVersionString): Self = StObject.set(x, "detectorVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorVersionIdUndefined: Self = StObject.set(x, "detectorVersionId", js.undefined)
    
    @scala.inline
    def setExternalModelEndpoints(value: ListOfStrings): Self = StObject.set(x, "externalModelEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExternalModelEndpointsUndefined: Self = StObject.set(x, "externalModelEndpoints", js.undefined)
    
    @scala.inline
    def setExternalModelEndpointsVarargs(value: String*): Self = StObject.set(x, "externalModelEndpoints", js.Array(value :_*))
    
    @scala.inline
    def setLastUpdatedTime(value: time): Self = StObject.set(x, "lastUpdatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdatedTimeUndefined: Self = StObject.set(x, "lastUpdatedTime", js.undefined)
    
    @scala.inline
    def setModelVersions(value: ListOfModelVersions): Self = StObject.set(x, "modelVersions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelVersionsUndefined: Self = StObject.set(x, "modelVersions", js.undefined)
    
    @scala.inline
    def setModelVersionsVarargs(value: ModelVersion*): Self = StObject.set(x, "modelVersions", js.Array(value :_*))
    
    @scala.inline
    def setRuleExecutionMode(value: RuleExecutionMode): Self = StObject.set(x, "ruleExecutionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleExecutionModeUndefined: Self = StObject.set(x, "ruleExecutionMode", js.undefined)
    
    @scala.inline
    def setRules(value: RuleList): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesUndefined: Self = StObject.set(x, "rules", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: Rule*): Self = StObject.set(x, "rules", js.Array(value :_*))
    
    @scala.inline
    def setStatus(value: DetectorVersionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
