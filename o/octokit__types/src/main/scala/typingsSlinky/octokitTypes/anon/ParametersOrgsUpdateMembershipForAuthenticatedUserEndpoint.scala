package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.OrgsUpdateMembershipForAuthenticatedUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.OrgsUpdateMembershipForAuthenticatedUserRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.OrgsUpdateMembershipForAuthenticatedUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOrgsUpdateMembershipForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: OrgsUpdateMembershipForAuthenticatedUserEndpoint = js.native
  
  var request: OrgsUpdateMembershipForAuthenticatedUserRequestOptions = js.native
  
  var response: OctokitResponse[OrgsUpdateMembershipForAuthenticatedUserResponseData] = js.native
}
object ParametersOrgsUpdateMembershipForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsUpdateMembershipForAuthenticatedUserEndpoint,
    request: OrgsUpdateMembershipForAuthenticatedUserRequestOptions,
    response: OctokitResponse[OrgsUpdateMembershipForAuthenticatedUserResponseData]
  ): ParametersOrgsUpdateMembershipForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsUpdateMembershipForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsUpdateMembershipForAuthenticatedUserEndpointMutableBuilder[Self <: ParametersOrgsUpdateMembershipForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OrgsUpdateMembershipForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OrgsUpdateMembershipForAuthenticatedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsUpdateMembershipForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
