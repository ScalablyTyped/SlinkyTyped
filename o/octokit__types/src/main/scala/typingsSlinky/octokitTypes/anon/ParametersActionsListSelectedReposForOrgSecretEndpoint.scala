package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActionsListSelectedReposForOrgSecretEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsListSelectedReposForOrgSecretRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ActionsListSelectedReposForOrgSecretResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsListSelectedReposForOrgSecretEndpoint extends StObject {
  
  var parameters: ActionsListSelectedReposForOrgSecretEndpoint = js.native
  
  var request: ActionsListSelectedReposForOrgSecretRequestOptions = js.native
  
  var response: OctokitResponse[ActionsListSelectedReposForOrgSecretResponseData] = js.native
}
object ParametersActionsListSelectedReposForOrgSecretEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsListSelectedReposForOrgSecretEndpoint,
    request: ActionsListSelectedReposForOrgSecretRequestOptions,
    response: OctokitResponse[ActionsListSelectedReposForOrgSecretResponseData]
  ): ParametersActionsListSelectedReposForOrgSecretEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsListSelectedReposForOrgSecretEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsListSelectedReposForOrgSecretEndpointMutableBuilder[Self <: ParametersActionsListSelectedReposForOrgSecretEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsListSelectedReposForOrgSecretEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsListSelectedReposForOrgSecretRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsListSelectedReposForOrgSecretResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
