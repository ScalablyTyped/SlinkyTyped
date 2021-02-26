package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.GistsListEndpoint
import typingsSlinky.octokitTypes.endpointsMod.GistsListRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.GistsListResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGistsListEndpoint extends StObject {
  
  var parameters: GistsListEndpoint = js.native
  
  var request: GistsListRequestOptions = js.native
  
  var response: OctokitResponse[GistsListResponseData] = js.native
}
object ParametersGistsListEndpoint {
  
  @scala.inline
  def apply(
    parameters: GistsListEndpoint,
    request: GistsListRequestOptions,
    response: OctokitResponse[GistsListResponseData]
  ): ParametersGistsListEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsListEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGistsListEndpointMutableBuilder[Self <: ParametersGistsListEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: GistsListEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GistsListRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GistsListResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
