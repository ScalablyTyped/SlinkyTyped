package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActionsListRepoAccessToSelfHostedRunnerGroupInOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsListRepoAccessToSelfHostedRunnerGroupInOrgRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ActionsListRepoAccessToSelfHostedRunnerGroupInOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsListRepoAccessToSelfHostedRunnerGroupInOrgEndpoint extends StObject {
  
  var parameters: ActionsListRepoAccessToSelfHostedRunnerGroupInOrgEndpoint = js.native
  
  var request: ActionsListRepoAccessToSelfHostedRunnerGroupInOrgRequestOptions = js.native
  
  var response: OctokitResponse[ActionsListRepoAccessToSelfHostedRunnerGroupInOrgResponseData] = js.native
}
object ParametersActionsListRepoAccessToSelfHostedRunnerGroupInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsListRepoAccessToSelfHostedRunnerGroupInOrgEndpoint,
    request: ActionsListRepoAccessToSelfHostedRunnerGroupInOrgRequestOptions,
    response: OctokitResponse[ActionsListRepoAccessToSelfHostedRunnerGroupInOrgResponseData]
  ): ParametersActionsListRepoAccessToSelfHostedRunnerGroupInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListRepoAccessToSelfHostedRunnerGroupInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsListRepoAccessToSelfHostedRunnerGroupInOrgEndpointMutableBuilder[Self <: ParametersActionsListRepoAccessToSelfHostedRunnerGroupInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsListRepoAccessToSelfHostedRunnerGroupInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsListRepoAccessToSelfHostedRunnerGroupInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListRepoAccessToSelfHostedRunnerGroupInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
