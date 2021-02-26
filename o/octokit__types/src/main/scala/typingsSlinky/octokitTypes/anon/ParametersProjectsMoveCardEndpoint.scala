package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ProjectsMoveCardEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ProjectsMoveCardRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersProjectsMoveCardEndpoint extends StObject {
  
  var parameters: ProjectsMoveCardEndpoint = js.native
  
  var request: ProjectsMoveCardRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersProjectsMoveCardEndpoint {
  
  @scala.inline
  def apply(
    parameters: ProjectsMoveCardEndpoint,
    request: ProjectsMoveCardRequestOptions,
    response: OctokitResponse[_]
  ): ParametersProjectsMoveCardEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersProjectsMoveCardEndpoint]
  }
  
  @scala.inline
  implicit class ParametersProjectsMoveCardEndpointMutableBuilder[Self <: ParametersProjectsMoveCardEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ProjectsMoveCardEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ProjectsMoveCardRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
