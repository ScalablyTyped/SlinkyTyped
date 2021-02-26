package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ActivityGetFeedsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ActivityGetFeedsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ActivityGetFeedsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersActivityGetFeedsEndpoint extends StObject {
  
  var parameters: ActivityGetFeedsEndpoint = js.native
  
  var request: ActivityGetFeedsRequestOptions = js.native
  
  var response: OctokitResponse[ActivityGetFeedsResponseData] = js.native
}
object ParametersActivityGetFeedsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ActivityGetFeedsEndpoint,
    request: ActivityGetFeedsRequestOptions,
    response: OctokitResponse[ActivityGetFeedsResponseData]
  ): ParametersActivityGetFeedsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersActivityGetFeedsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersActivityGetFeedsEndpointMutableBuilder[Self <: ParametersActivityGetFeedsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ActivityGetFeedsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ActivityGetFeedsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ActivityGetFeedsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
