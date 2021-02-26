package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ScimProvisionAndInviteUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ScimProvisionAndInviteUserRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ScimProvisionAndInviteUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersScimProvisionAndInviteUserEndpoint extends StObject {
  
  var parameters: ScimProvisionAndInviteUserEndpoint = js.native
  
  var request: ScimProvisionAndInviteUserRequestOptions = js.native
  
  var response: OctokitResponse[ScimProvisionAndInviteUserResponseData] = js.native
}
object ParametersScimProvisionAndInviteUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: ScimProvisionAndInviteUserEndpoint,
    request: ScimProvisionAndInviteUserRequestOptions,
    response: OctokitResponse[ScimProvisionAndInviteUserResponseData]
  ): ParametersScimProvisionAndInviteUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersScimProvisionAndInviteUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersScimProvisionAndInviteUserEndpointMutableBuilder[Self <: ParametersScimProvisionAndInviteUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ScimProvisionAndInviteUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ScimProvisionAndInviteUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ScimProvisionAndInviteUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
