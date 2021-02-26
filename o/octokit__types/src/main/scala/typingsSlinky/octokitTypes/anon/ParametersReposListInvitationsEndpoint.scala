package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposListInvitationsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposListInvitationsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposListInvitationsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposListInvitationsEndpoint extends StObject {
  
  var parameters: ReposListInvitationsEndpoint = js.native
  
  var request: ReposListInvitationsRequestOptions = js.native
  
  var response: OctokitResponse[ReposListInvitationsResponseData] = js.native
}
object ParametersReposListInvitationsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposListInvitationsEndpoint,
    request: ReposListInvitationsRequestOptions,
    response: OctokitResponse[ReposListInvitationsResponseData]
  ): ParametersReposListInvitationsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListInvitationsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposListInvitationsEndpointMutableBuilder[Self <: ParametersReposListInvitationsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposListInvitationsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposListInvitationsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListInvitationsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
