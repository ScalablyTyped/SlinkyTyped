package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.GistsListCommitsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.GistsListCommitsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.GistsListCommitsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersGistsListCommitsEndpoint extends StObject {
  
  var parameters: GistsListCommitsEndpoint = js.native
  
  var request: GistsListCommitsRequestOptions = js.native
  
  var response: OctokitResponse[GistsListCommitsResponseData] = js.native
}
object ParametersGistsListCommitsEndpoint {
  
  @scala.inline
  def apply(
    parameters: GistsListCommitsEndpoint,
    request: GistsListCommitsRequestOptions,
    response: OctokitResponse[GistsListCommitsResponseData]
  ): ParametersGistsListCommitsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersGistsListCommitsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersGistsListCommitsEndpointMutableBuilder[Self <: ParametersGistsListCommitsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: GistsListCommitsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: GistsListCommitsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GistsListCommitsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
