package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.OrgsListPendingInvitationsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.OrgsListPendingInvitationsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.OrgsListPendingInvitationsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOrgsListPendingInvitationsEndpoint extends StObject {
  
  var parameters: OrgsListPendingInvitationsEndpoint = js.native
  
  var request: OrgsListPendingInvitationsRequestOptions = js.native
  
  var response: OctokitResponse[OrgsListPendingInvitationsResponseData] = js.native
}
object ParametersOrgsListPendingInvitationsEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsListPendingInvitationsEndpoint,
    request: OrgsListPendingInvitationsRequestOptions,
    response: OctokitResponse[OrgsListPendingInvitationsResponseData]
  ): ParametersOrgsListPendingInvitationsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListPendingInvitationsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsListPendingInvitationsEndpointMutableBuilder[Self <: ParametersOrgsListPendingInvitationsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OrgsListPendingInvitationsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OrgsListPendingInvitationsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsListPendingInvitationsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
