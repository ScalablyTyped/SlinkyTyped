package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActionsSetSelectedReposForOrgSecretEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsSetSelectedReposForOrgSecretRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsSetSelectedReposForOrgSecretEndpoint extends StObject {
  
  var parameters: ActionsSetSelectedReposForOrgSecretEndpoint = js.native
  
  var request: ActionsSetSelectedReposForOrgSecretRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersActionsSetSelectedReposForOrgSecretEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsSetSelectedReposForOrgSecretEndpoint,
    request: ActionsSetSelectedReposForOrgSecretRequestOptions,
    response: OctokitResponse[_]
  ): ParametersActionsSetSelectedReposForOrgSecretEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsSetSelectedReposForOrgSecretEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsSetSelectedReposForOrgSecretEndpointMutableBuilder[Self <: ParametersActionsSetSelectedReposForOrgSecretEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsSetSelectedReposForOrgSecretEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsSetSelectedReposForOrgSecretRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
