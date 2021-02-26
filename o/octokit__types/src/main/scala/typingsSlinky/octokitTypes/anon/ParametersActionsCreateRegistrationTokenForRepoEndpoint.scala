package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActionsCreateRegistrationTokenForRepoEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActionsCreateRegistrationTokenForRepoRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ActionsCreateRegistrationTokenForRepoResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActionsCreateRegistrationTokenForRepoEndpoint extends StObject {
  
  var parameters: ActionsCreateRegistrationTokenForRepoEndpoint = js.native
  
  var request: ActionsCreateRegistrationTokenForRepoRequestOptions = js.native
  
  var response: OctokitResponse[ActionsCreateRegistrationTokenForRepoResponseData] = js.native
}
object ParametersActionsCreateRegistrationTokenForRepoEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActionsCreateRegistrationTokenForRepoEndpoint,
    request: ActionsCreateRegistrationTokenForRepoRequestOptions,
    response: OctokitResponse[ActionsCreateRegistrationTokenForRepoResponseData]
  ): ParametersActionsCreateRegistrationTokenForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActionsCreateRegistrationTokenForRepoEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActionsCreateRegistrationTokenForRepoEndpointMutableBuilder[Self <: ParametersActionsCreateRegistrationTokenForRepoEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActionsCreateRegistrationTokenForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActionsCreateRegistrationTokenForRepoRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActionsCreateRegistrationTokenForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
