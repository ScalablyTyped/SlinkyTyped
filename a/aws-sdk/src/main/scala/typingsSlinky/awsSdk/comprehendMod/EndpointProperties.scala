package typingsSlinky.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointProperties extends StObject {
  
  /**
    * The creation date and time of the endpoint.
    */
  var CreationTime: js.UndefOr[js.Date] = js.native
  
  /**
    * The number of inference units currently used by the model using this endpoint.
    */
  var CurrentInferenceUnits: js.UndefOr[InferenceUnitsInteger] = js.native
  
  /**
    * The desired number of inference units to be used by the model using this endpoint. Each inference unit represents of a throughput of 100 characters per second.
    */
  var DesiredInferenceUnits: js.UndefOr[InferenceUnitsInteger] = js.native
  
  /**
    * The Amazon Resource Number (ARN) of the endpoint.
    */
  var EndpointArn: js.UndefOr[ComprehendEndpointArn] = js.native
  
  /**
    * The date and time that the endpoint was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.native
  
  /**
    * Specifies a reason for failure in cases of Failed status.
    */
  var Message: js.UndefOr[AnyLengthString] = js.native
  
  /**
    * The Amazon Resource Number (ARN) of the model to which the endpoint is attached.
    */
  var ModelArn: js.UndefOr[ComprehendModelArn] = js.native
  
  /**
    * Specifies the status of the endpoint. Because the endpoint updates and creation are asynchronous, so customers will need to wait for the endpoint to be Ready status before making inference requests.
    */
  var Status: js.UndefOr[EndpointStatus] = js.native
}
object EndpointProperties {
  
  @scala.inline
  def apply(): EndpointProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointProperties]
  }
  
  @scala.inline
  implicit class EndpointPropertiesMutableBuilder[Self <: EndpointProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setCurrentInferenceUnits(value: InferenceUnitsInteger): Self = StObject.set(x, "CurrentInferenceUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentInferenceUnitsUndefined: Self = StObject.set(x, "CurrentInferenceUnits", js.undefined)
    
    @scala.inline
    def setDesiredInferenceUnits(value: InferenceUnitsInteger): Self = StObject.set(x, "DesiredInferenceUnits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredInferenceUnitsUndefined: Self = StObject.set(x, "DesiredInferenceUnits", js.undefined)
    
    @scala.inline
    def setEndpointArn(value: ComprehendEndpointArn): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointArnUndefined: Self = StObject.set(x, "EndpointArn", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    @scala.inline
    def setMessage(value: AnyLengthString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    @scala.inline
    def setModelArn(value: ComprehendModelArn): Self = StObject.set(x, "ModelArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelArnUndefined: Self = StObject.set(x, "ModelArn", js.undefined)
    
    @scala.inline
    def setStatus(value: EndpointStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
