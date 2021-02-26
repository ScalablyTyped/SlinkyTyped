package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ScimDeleteUserFromOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ScimDeleteUserFromOrgRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersScimDeleteUserFromOrgEndpoint extends StObject {
  
  var parameters: ScimDeleteUserFromOrgEndpoint = js.native
  
  var request: ScimDeleteUserFromOrgRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersScimDeleteUserFromOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ScimDeleteUserFromOrgEndpoint,
    request: ScimDeleteUserFromOrgRequestOptions,
    response: OctokitResponse[_]
  ): ParametersScimDeleteUserFromOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersScimDeleteUserFromOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersScimDeleteUserFromOrgEndpointMutableBuilder[Self <: ParametersScimDeleteUserFromOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ScimDeleteUserFromOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ScimDeleteUserFromOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
