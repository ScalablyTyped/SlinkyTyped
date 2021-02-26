package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.SearchTopicsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.SearchTopicsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersSearchTopicsEndpoint extends StObject {
  
  var parameters: SearchTopicsEndpoint = js.native
  
  var response: OctokitResponse[SearchTopicsResponseData] with `22` = js.native
}
object ParametersSearchTopicsEndpoint {
  
  @scala.inline
  def apply(parameters: SearchTopicsEndpoint, response: OctokitResponse[SearchTopicsResponseData] with `22`): ParametersSearchTopicsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersSearchTopicsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersSearchTopicsEndpointMutableBuilder[Self <: ParametersSearchTopicsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: SearchTopicsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[SearchTopicsResponseData] with `22`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
