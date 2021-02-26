package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.OrgsListForUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.OrgsListForUserRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.OrgsListForUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOrgsListForUserEndpoint extends StObject {
  
  var parameters: OrgsListForUserEndpoint = js.native
  
  var request: OrgsListForUserRequestOptions = js.native
  
  var response: OctokitResponse[OrgsListForUserResponseData] = js.native
}
object ParametersOrgsListForUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsListForUserEndpoint,
    request: OrgsListForUserRequestOptions,
    response: OctokitResponse[OrgsListForUserResponseData]
  ): ParametersOrgsListForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListForUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsListForUserEndpointMutableBuilder[Self <: ParametersOrgsListForUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OrgsListForUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OrgsListForUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsListForUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
