package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposCheckCollaboratorEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposCheckCollaboratorRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposCheckCollaboratorEndpoint extends StObject {
  
  var parameters: ReposCheckCollaboratorEndpoint = js.native
  
  var request: ReposCheckCollaboratorRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersReposCheckCollaboratorEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposCheckCollaboratorEndpoint,
    request: ReposCheckCollaboratorRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposCheckCollaboratorEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCheckCollaboratorEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposCheckCollaboratorEndpointMutableBuilder[Self <: ParametersReposCheckCollaboratorEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposCheckCollaboratorEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposCheckCollaboratorRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
