package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.OrgsListInvitationTeamsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.OrgsListInvitationTeamsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.OrgsListInvitationTeamsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOrgsListInvitationTeamsEndpoint extends StObject {
  
  var parameters: OrgsListInvitationTeamsEndpoint = js.native
  
  var request: OrgsListInvitationTeamsRequestOptions = js.native
  
  var response: OctokitResponse[OrgsListInvitationTeamsResponseData] = js.native
}
object ParametersOrgsListInvitationTeamsEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsListInvitationTeamsEndpoint,
    request: OrgsListInvitationTeamsRequestOptions,
    response: OctokitResponse[OrgsListInvitationTeamsResponseData]
  ): ParametersOrgsListInvitationTeamsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListInvitationTeamsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsListInvitationTeamsEndpointMutableBuilder[Self <: ParametersOrgsListInvitationTeamsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OrgsListInvitationTeamsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OrgsListInvitationTeamsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsListInvitationTeamsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
