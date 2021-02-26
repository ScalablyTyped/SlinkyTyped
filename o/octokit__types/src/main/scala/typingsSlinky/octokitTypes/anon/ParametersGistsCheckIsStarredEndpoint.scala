package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.GistsCheckIsStarredEndpoint
import typingsSlinky.octokitTypes.endpointsMod.GistsCheckIsStarredRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGistsCheckIsStarredEndpoint extends StObject {
  
  var parameters: GistsCheckIsStarredEndpoint = js.native
  
  var request: GistsCheckIsStarredRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersGistsCheckIsStarredEndpoint {
  
  @scala.inline
  def apply(
    parameters: GistsCheckIsStarredEndpoint,
    request: GistsCheckIsStarredRequestOptions,
    response: OctokitResponse[_]
  ): ParametersGistsCheckIsStarredEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsCheckIsStarredEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGistsCheckIsStarredEndpointMutableBuilder[Self <: ParametersGistsCheckIsStarredEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: GistsCheckIsStarredEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GistsCheckIsStarredRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
