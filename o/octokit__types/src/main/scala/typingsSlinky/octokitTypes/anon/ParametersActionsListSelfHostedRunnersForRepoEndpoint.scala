package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActionsListSelfHostedRunnersForRepoEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsListSelfHostedRunnersForRepoRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ActionsListSelfHostedRunnersForRepoResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsListSelfHostedRunnersForRepoEndpoint extends StObject {
  
  var parameters: ActionsListSelfHostedRunnersForRepoEndpoint = js.native
  
  var request: ActionsListSelfHostedRunnersForRepoRequestOptions = js.native
  
  var response: OctokitResponse[ActionsListSelfHostedRunnersForRepoResponseData] = js.native
}
object ParametersActionsListSelfHostedRunnersForRepoEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsListSelfHostedRunnersForRepoEndpoint,
    request: ActionsListSelfHostedRunnersForRepoRequestOptions,
    response: OctokitResponse[ActionsListSelfHostedRunnersForRepoResponseData]
  ): ParametersActionsListSelfHostedRunnersForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListSelfHostedRunnersForRepoEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsListSelfHostedRunnersForRepoEndpointMutableBuilder[Self <: ParametersActionsListSelfHostedRunnersForRepoEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsListSelfHostedRunnersForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsListSelfHostedRunnersForRepoRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListSelfHostedRunnersForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
