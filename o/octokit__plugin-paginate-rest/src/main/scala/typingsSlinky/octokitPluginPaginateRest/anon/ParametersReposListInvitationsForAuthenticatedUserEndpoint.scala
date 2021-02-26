package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposListInvitationsForAuthenticatedUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposListInvitationsForAuthenticatedUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposListInvitationsForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: ReposListInvitationsForAuthenticatedUserEndpoint = js.native
  
  var response: OctokitResponse[ReposListInvitationsForAuthenticatedUserResponseData] = js.native
}
object ParametersReposListInvitationsForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposListInvitationsForAuthenticatedUserEndpoint,
    response: OctokitResponse[ReposListInvitationsForAuthenticatedUserResponseData]
  ): ParametersReposListInvitationsForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListInvitationsForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposListInvitationsForAuthenticatedUserEndpointMutableBuilder[Self <: ParametersReposListInvitationsForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposListInvitationsForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListInvitationsForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
