package typingsSlinky.awsSdk.ioteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDetectorModelRequest extends StObject {
  
  /**
    * Information that defines how the detectors operate.
    */
  var detectorModelDefinition: DetectorModelDefinition = js.native
  
  /**
    * A brief description of the detector model.
    */
  var detectorModelDescription: js.UndefOr[DetectorModelDescription] = js.native
  
  /**
    * The name of the detector model.
    */
  var detectorModelName: DetectorModelName = js.native
  
  /**
    * Information about the order in which events are evaluated and how actions are executed. 
    */
  var evaluationMethod: js.UndefOr[EvaluationMethod] = js.native
  
  /**
    * The input attribute key used to identify a device or system to create a detector (an instance of the detector model) and then to route each input received to the appropriate detector (instance). This parameter uses a JSON-path expression in the message payload of each input to specify the attribute-value pair that is used to identify the device associated with the input.
    */
  var key: js.UndefOr[AttributeJsonPath] = js.native
  
  /**
    * The ARN of the role that grants permission to AWS IoT Events to perform its operations.
    */
  var roleArn: AmazonResourceName = js.native
  
  /**
    * Metadata that can be used to manage the detector model.
    */
  var tags: js.UndefOr[Tags] = js.native
}
object CreateDetectorModelRequest {
  
  @scala.inline
  def apply(
    detectorModelDefinition: DetectorModelDefinition,
    detectorModelName: DetectorModelName,
    roleArn: AmazonResourceName
  ): CreateDetectorModelRequest = {
    val __obj = js.Dynamic.literal(detectorModelDefinition = detectorModelDefinition.asInstanceOf[js.Any], detectorModelName = detectorModelName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDetectorModelRequest]
  }
  
  @scala.inline
  implicit class CreateDetectorModelRequestMutableBuilder[Self <: CreateDetectorModelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectorModelDefinition(value: DetectorModelDefinition): Self = StObject.set(x, "detectorModelDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorModelDescription(value: DetectorModelDescription): Self = StObject.set(x, "detectorModelDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorModelDescriptionUndefined: Self = StObject.set(x, "detectorModelDescription", js.undefined)
    
    @scala.inline
    def setDetectorModelName(value: DetectorModelName): Self = StObject.set(x, "detectorModelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationMethod(value: EvaluationMethod): Self = StObject.set(x, "evaluationMethod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEvaluationMethodUndefined: Self = StObject.set(x, "evaluationMethod", js.undefined)
    
    @scala.inline
    def setKey(value: AttributeJsonPath): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setRoleArn(value: AmazonResourceName): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: Tags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
