package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.GistsListCommentsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.GistsListCommentsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.GistsListCommentsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGistsListCommentsEndpoint extends StObject {
  
  var parameters: GistsListCommentsEndpoint = js.native
  
  var request: GistsListCommentsRequestOptions = js.native
  
  var response: OctokitResponse[GistsListCommentsResponseData] = js.native
}
object ParametersGistsListCommentsEndpoint {
  
  @scala.inline
  def apply(
    parameters: GistsListCommentsEndpoint,
    request: GistsListCommentsRequestOptions,
    response: OctokitResponse[GistsListCommentsResponseData]
  ): ParametersGistsListCommentsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsListCommentsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGistsListCommentsEndpointMutableBuilder[Self <: ParametersGistsListCommentsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: GistsListCommentsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GistsListCommentsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GistsListCommentsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
