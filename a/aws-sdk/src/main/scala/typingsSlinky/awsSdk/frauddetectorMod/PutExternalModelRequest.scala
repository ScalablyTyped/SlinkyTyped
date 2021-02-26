package typingsSlinky.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutExternalModelRequest extends StObject {
  
  /**
    * The model endpoint input configuration.
    */
  var inputConfiguration: ModelInputConfiguration = js.native
  
  /**
    * The IAM role used to invoke the model endpoint.
    */
  var invokeModelEndpointRoleArn: String = js.native
  
  /**
    * The model endpoints name.
    */
  var modelEndpoint: sageMakerEndpointIdentifier = js.native
  
  /**
    * The model endpoint’s status in Amazon Fraud Detector.
    */
  var modelEndpointStatus: ModelEndpointStatus = js.native
  
  /**
    * The source of the model.
    */
  var modelSource: ModelSource = js.native
  
  /**
    * The model endpoint output configuration.
    */
  var outputConfiguration: ModelOutputConfiguration = js.native
  
  /**
    * A collection of key and value pairs.
    */
  var tags: js.UndefOr[tagList] = js.native
}
object PutExternalModelRequest {
  
  @scala.inline
  def apply(
    inputConfiguration: ModelInputConfiguration,
    invokeModelEndpointRoleArn: String,
    modelEndpoint: sageMakerEndpointIdentifier,
    modelEndpointStatus: ModelEndpointStatus,
    modelSource: ModelSource,
    outputConfiguration: ModelOutputConfiguration
  ): PutExternalModelRequest = {
    val __obj = js.Dynamic.literal(inputConfiguration = inputConfiguration.asInstanceOf[js.Any], invokeModelEndpointRoleArn = invokeModelEndpointRoleArn.asInstanceOf[js.Any], modelEndpoint = modelEndpoint.asInstanceOf[js.Any], modelEndpointStatus = modelEndpointStatus.asInstanceOf[js.Any], modelSource = modelSource.asInstanceOf[js.Any], outputConfiguration = outputConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutExternalModelRequest]
  }
  
  @scala.inline
  implicit class PutExternalModelRequestMutableBuilder[Self <: PutExternalModelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInputConfiguration(value: ModelInputConfiguration): Self = StObject.set(x, "inputConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvokeModelEndpointRoleArn(value: String): Self = StObject.set(x, "invokeModelEndpointRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelEndpoint(value: sageMakerEndpointIdentifier): Self = StObject.set(x, "modelEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelEndpointStatus(value: ModelEndpointStatus): Self = StObject.set(x, "modelEndpointStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelSource(value: ModelSource): Self = StObject.set(x, "modelSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputConfiguration(value: ModelOutputConfiguration): Self = StObject.set(x, "outputConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: tagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
