package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.GistsCreateEndpoint
import typingsSlinky.octokitTypes.endpointsMod.GistsCreateRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.GistsCreateResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGistsCreateEndpoint extends StObject {
  
  var parameters: GistsCreateEndpoint = js.native
  
  var request: GistsCreateRequestOptions = js.native
  
  var response: OctokitResponse[GistsCreateResponseData] = js.native
}
object ParametersGistsCreateEndpoint {
  
  @scala.inline
  def apply(
    parameters: GistsCreateEndpoint,
    request: GistsCreateRequestOptions,
    response: OctokitResponse[GistsCreateResponseData]
  ): ParametersGistsCreateEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsCreateEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGistsCreateEndpointMutableBuilder[Self <: ParametersGistsCreateEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: GistsCreateEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GistsCreateRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GistsCreateResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
