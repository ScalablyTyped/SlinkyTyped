package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActionsListRunnerApplicationsForRepoEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsListRunnerApplicationsForRepoRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ActionsListRunnerApplicationsForRepoResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsListRunnerApplicationsForRepoEndpoint extends StObject {
  
  var parameters: ActionsListRunnerApplicationsForRepoEndpoint = js.native
  
  var request: ActionsListRunnerApplicationsForRepoRequestOptions = js.native
  
  var response: OctokitResponse[ActionsListRunnerApplicationsForRepoResponseData] = js.native
}
object ParametersActionsListRunnerApplicationsForRepoEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsListRunnerApplicationsForRepoEndpoint,
    request: ActionsListRunnerApplicationsForRepoRequestOptions,
    response: OctokitResponse[ActionsListRunnerApplicationsForRepoResponseData]
  ): ParametersActionsListRunnerApplicationsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListRunnerApplicationsForRepoEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsListRunnerApplicationsForRepoEndpointMutableBuilder[Self <: ParametersActionsListRunnerApplicationsForRepoEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsListRunnerApplicationsForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsListRunnerApplicationsForRepoRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListRunnerApplicationsForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
