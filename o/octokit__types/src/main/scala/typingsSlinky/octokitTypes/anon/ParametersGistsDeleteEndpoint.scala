package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.GistsDeleteEndpoint
import typingsSlinky.octokitTypes.endpointsMod.GistsDeleteRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGistsDeleteEndpoint extends StObject {
  
  var parameters: GistsDeleteEndpoint = js.native
  
  var request: GistsDeleteRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersGistsDeleteEndpoint {
  
  @scala.inline
  def apply(parameters: GistsDeleteEndpoint, request: GistsDeleteRequestOptions, response: OctokitResponse[_]): ParametersGistsDeleteEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsDeleteEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGistsDeleteEndpointMutableBuilder[Self <: ParametersGistsDeleteEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: GistsDeleteEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GistsDeleteRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
