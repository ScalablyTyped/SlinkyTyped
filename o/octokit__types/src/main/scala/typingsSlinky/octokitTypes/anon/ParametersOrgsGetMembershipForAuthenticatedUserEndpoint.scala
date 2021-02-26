package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.OrgsGetMembershipForAuthenticatedUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.OrgsGetMembershipForAuthenticatedUserRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.OrgsGetMembershipForAuthenticatedUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOrgsGetMembershipForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: OrgsGetMembershipForAuthenticatedUserEndpoint = js.native
  
  var request: OrgsGetMembershipForAuthenticatedUserRequestOptions = js.native
  
  var response: OctokitResponse[OrgsGetMembershipForAuthenticatedUserResponseData] = js.native
}
object ParametersOrgsGetMembershipForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsGetMembershipForAuthenticatedUserEndpoint,
    request: OrgsGetMembershipForAuthenticatedUserRequestOptions,
    response: OctokitResponse[OrgsGetMembershipForAuthenticatedUserResponseData]
  ): ParametersOrgsGetMembershipForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsGetMembershipForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsGetMembershipForAuthenticatedUserEndpointMutableBuilder[Self <: ParametersOrgsGetMembershipForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OrgsGetMembershipForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OrgsGetMembershipForAuthenticatedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsGetMembershipForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
