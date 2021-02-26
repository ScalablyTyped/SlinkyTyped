package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActionsSetRepoAccessToSelfHostedRunnerGroupInOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsSetRepoAccessToSelfHostedRunnerGroupInOrgRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsSetRepoAccessToSelfHostedRunnerGroupInOrgEndpoint extends StObject {
  
  var parameters: ActionsSetRepoAccessToSelfHostedRunnerGroupInOrgEndpoint = js.native
  
  var request: ActionsSetRepoAccessToSelfHostedRunnerGroupInOrgRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersActionsSetRepoAccessToSelfHostedRunnerGroupInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsSetRepoAccessToSelfHostedRunnerGroupInOrgEndpoint,
    request: ActionsSetRepoAccessToSelfHostedRunnerGroupInOrgRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsSetRepoAccessToSelfHostedRunnerGroupInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsSetRepoAccessToSelfHostedRunnerGroupInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsSetRepoAccessToSelfHostedRunnerGroupInOrgEndpointMutableBuilder[Self <: ParametersActionsSetRepoAccessToSelfHostedRunnerGroupInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsSetRepoAccessToSelfHostedRunnerGroupInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsSetRepoAccessToSelfHostedRunnerGroupInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
