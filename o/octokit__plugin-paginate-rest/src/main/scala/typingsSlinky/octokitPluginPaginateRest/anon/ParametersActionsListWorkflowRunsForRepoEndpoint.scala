package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.ActionsListWorkflowRunsForRepoEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsListWorkflowRunsForRepoResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsListWorkflowRunsForRepoEndpoint extends StObject {
  
  var parameters: ActionsListWorkflowRunsForRepoEndpoint = js.native
  
  var response: OctokitResponse[ActionsListWorkflowRunsForRepoResponseData] with `9` = js.native
}
object ParametersActionsListWorkflowRunsForRepoEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsListWorkflowRunsForRepoEndpoint,
    response: OctokitResponse[ActionsListWorkflowRunsForRepoResponseData] with `9`
  ): ParametersActionsListWorkflowRunsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListWorkflowRunsForRepoEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsListWorkflowRunsForRepoEndpointMutableBuilder[Self <: ParametersActionsListWorkflowRunsForRepoEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsListWorkflowRunsForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListWorkflowRunsForRepoResponseData] with `9`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
