package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActivityGetThreadEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActivityGetThreadRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ActivityGetThreadResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActivityGetThreadEndpoint extends StObject {
  
  var parameters: ActivityGetThreadEndpoint = js.native
  
  var request: ActivityGetThreadRequestOptions = js.native
  
  var response: OctokitResponse[ActivityGetThreadResponseData] = js.native
}
object ParametersActivityGetThreadEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActivityGetThreadEndpoint,
    request: ActivityGetThreadRequestOptions,
    response: OctokitResponse[ActivityGetThreadResponseData]
  ): ParametersActivityGetThreadEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityGetThreadEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActivityGetThreadEndpointMutableBuilder[Self <: ParametersActivityGetThreadEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActivityGetThreadEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActivityGetThreadRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActivityGetThreadResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
