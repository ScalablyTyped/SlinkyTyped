package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ScimUpdateAttributeForUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ScimUpdateAttributeForUserRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ScimUpdateAttributeForUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersScimUpdateAttributeForUserEndpoint extends StObject {
  
  var parameters: ScimUpdateAttributeForUserEndpoint = js.native
  
  var request: ScimUpdateAttributeForUserRequestOptions = js.native
  
  var response: OctokitResponse[ScimUpdateAttributeForUserResponseData] = js.native
}
object ParametersScimUpdateAttributeForUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: ScimUpdateAttributeForUserEndpoint,
    request: ScimUpdateAttributeForUserRequestOptions,
    response: OctokitResponse[ScimUpdateAttributeForUserResponseData]
  ): ParametersScimUpdateAttributeForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersScimUpdateAttributeForUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersScimUpdateAttributeForUserEndpointMutableBuilder[Self <: ParametersScimUpdateAttributeForUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ScimUpdateAttributeForUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ScimUpdateAttributeForUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ScimUpdateAttributeForUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
