package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.OrgsSetMembershipForUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.OrgsSetMembershipForUserRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.OrgsSetMembershipForUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOrgsSetMembershipForUserEndpoint extends StObject {
  
  var parameters: OrgsSetMembershipForUserEndpoint = js.native
  
  var request: OrgsSetMembershipForUserRequestOptions = js.native
  
  var response: OctokitResponse[OrgsSetMembershipForUserResponseData] = js.native
}
object ParametersOrgsSetMembershipForUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsSetMembershipForUserEndpoint,
    request: OrgsSetMembershipForUserRequestOptions,
    response: OctokitResponse[OrgsSetMembershipForUserResponseData]
  ): ParametersOrgsSetMembershipForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsSetMembershipForUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsSetMembershipForUserEndpointMutableBuilder[Self <: ParametersOrgsSetMembershipForUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OrgsSetMembershipForUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OrgsSetMembershipForUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsSetMembershipForUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
