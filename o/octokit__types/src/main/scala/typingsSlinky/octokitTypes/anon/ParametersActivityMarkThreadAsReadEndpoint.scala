package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActivityMarkThreadAsReadEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActivityMarkThreadAsReadRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActivityMarkThreadAsReadEndpoint extends StObject {
  
  var parameters: ActivityMarkThreadAsReadEndpoint = js.native
  
  var request: ActivityMarkThreadAsReadRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersActivityMarkThreadAsReadEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActivityMarkThreadAsReadEndpoint,
    request: ActivityMarkThreadAsReadRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActivityMarkThreadAsReadEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityMarkThreadAsReadEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActivityMarkThreadAsReadEndpointMutableBuilder[Self <: ParametersActivityMarkThreadAsReadEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActivityMarkThreadAsReadEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActivityMarkThreadAsReadRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
