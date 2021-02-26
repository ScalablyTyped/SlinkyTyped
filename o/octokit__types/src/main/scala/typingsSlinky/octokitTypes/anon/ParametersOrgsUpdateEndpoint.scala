package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.OrgsUpdateEndpoint
import typingsSlinky.octokitTypes.endpointsMod.OrgsUpdateRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.OrgsUpdateResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOrgsUpdateEndpoint extends StObject {
  
  var parameters: OrgsUpdateEndpoint = js.native
  
  var request: OrgsUpdateRequestOptions = js.native
  
  var response: OctokitResponse[OrgsUpdateResponseData] = js.native
}
object ParametersOrgsUpdateEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsUpdateEndpoint,
    request: OrgsUpdateRequestOptions,
    response: OctokitResponse[OrgsUpdateResponseData]
  ): ParametersOrgsUpdateEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsUpdateEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsUpdateEndpointMutableBuilder[Self <: ParametersOrgsUpdateEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OrgsUpdateEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OrgsUpdateRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsUpdateResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
