package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposUpdateInvitationEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposUpdateInvitationRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposUpdateInvitationResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposUpdateInvitationEndpoint extends StObject {
  
  var parameters: ReposUpdateInvitationEndpoint = js.native
  
  var request: ReposUpdateInvitationRequestOptions = js.native
  
  var response: OctokitResponse[ReposUpdateInvitationResponseData] = js.native
}
object ParametersReposUpdateInvitationEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposUpdateInvitationEndpoint,
    request: ReposUpdateInvitationRequestOptions,
    response: OctokitResponse[ReposUpdateInvitationResponseData]
  ): ParametersReposUpdateInvitationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposUpdateInvitationEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposUpdateInvitationEndpointMutableBuilder[Self <: ParametersReposUpdateInvitationEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposUpdateInvitationEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposUpdateInvitationRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposUpdateInvitationResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
