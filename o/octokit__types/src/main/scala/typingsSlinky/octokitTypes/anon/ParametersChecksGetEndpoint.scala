package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ChecksGetEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ChecksGetRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ChecksGetResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersChecksGetEndpoint extends StObject {
  
  var parameters: ChecksGetEndpoint = js.native
  
  var request: ChecksGetRequestOptions = js.native
  
  var response: OctokitResponse[ChecksGetResponseData] = js.native
}
object ParametersChecksGetEndpoint {
  
  @scala.inline
  def apply(
    parameters: ChecksGetEndpoint,
    request: ChecksGetRequestOptions,
    response: OctokitResponse[ChecksGetResponseData]
  ): ParametersChecksGetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksGetEndpoint]
  }
  
  @scala.inline
  implicit class ParametersChecksGetEndpointMutableBuilder[Self <: ParametersChecksGetEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ChecksGetEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ChecksGetRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ChecksGetResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
