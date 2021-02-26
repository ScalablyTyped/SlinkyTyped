package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.SearchLabelsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.SearchLabelsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.SearchLabelsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersSearchLabelsEndpoint extends StObject {
  
  var parameters: SearchLabelsEndpoint = js.native
  
  var request: SearchLabelsRequestOptions = js.native
  
  var response: OctokitResponse[SearchLabelsResponseData] = js.native
}
object ParametersSearchLabelsEndpoint {
  
  @scala.inline
  def apply(
    parameters: SearchLabelsEndpoint,
    request: SearchLabelsRequestOptions,
    response: OctokitResponse[SearchLabelsResponseData]
  ): ParametersSearchLabelsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersSearchLabelsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersSearchLabelsEndpointMutableBuilder[Self <: ParametersSearchLabelsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: SearchLabelsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: SearchLabelsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[SearchLabelsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
