package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.ActionsListRepoWorkflowsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsListRepoWorkflowsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsListRepoWorkflowsEndpoint extends StObject {
  
  var parameters: ActionsListRepoWorkflowsEndpoint = js.native
  
  var response: OctokitResponse[ActionsListRepoWorkflowsResponseData] with `12` = js.native
}
object ParametersActionsListRepoWorkflowsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsListRepoWorkflowsEndpoint,
    response: OctokitResponse[ActionsListRepoWorkflowsResponseData] with `12`
  ): ParametersActionsListRepoWorkflowsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListRepoWorkflowsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsListRepoWorkflowsEndpointMutableBuilder[Self <: ParametersActionsListRepoWorkflowsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsListRepoWorkflowsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListRepoWorkflowsResponseData] with `12`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
