package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.GistsGetRevisionEndpoint
import typingsSlinky.octokitTypes.endpointsMod.GistsGetRevisionRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.GistsGetRevisionResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGistsGetRevisionEndpoint extends StObject {
  
  var parameters: GistsGetRevisionEndpoint = js.native
  
  var request: GistsGetRevisionRequestOptions = js.native
  
  var response: OctokitResponse[GistsGetRevisionResponseData] = js.native
}
object ParametersGistsGetRevisionEndpoint {
  
  @scala.inline
  def apply(
    parameters: GistsGetRevisionEndpoint,
    request: GistsGetRevisionRequestOptions,
    response: OctokitResponse[GistsGetRevisionResponseData]
  ): ParametersGistsGetRevisionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsGetRevisionEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGistsGetRevisionEndpointMutableBuilder[Self <: ParametersGistsGetRevisionEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: GistsGetRevisionEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GistsGetRevisionRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GistsGetRevisionResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
