package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.GistsListForUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.GistsListForUserRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.GistsListForUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGistsListForUserEndpoint extends StObject {
  
  var parameters: GistsListForUserEndpoint = js.native
  
  var request: GistsListForUserRequestOptions = js.native
  
  var response: OctokitResponse[GistsListForUserResponseData] = js.native
}
object ParametersGistsListForUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: GistsListForUserEndpoint,
    request: GistsListForUserRequestOptions,
    response: OctokitResponse[GistsListForUserResponseData]
  ): ParametersGistsListForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsListForUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGistsListForUserEndpointMutableBuilder[Self <: ParametersGistsListForUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: GistsListForUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GistsListForUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GistsListForUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
