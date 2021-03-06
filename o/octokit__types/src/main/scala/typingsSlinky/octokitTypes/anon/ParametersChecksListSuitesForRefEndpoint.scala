package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ChecksListSuitesForRefEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ChecksListSuitesForRefRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ChecksListSuitesForRefResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersChecksListSuitesForRefEndpoint extends StObject {
  
  var parameters: ChecksListSuitesForRefEndpoint = js.native
  
  var request: ChecksListSuitesForRefRequestOptions = js.native
  
  var response: OctokitResponse[ChecksListSuitesForRefResponseData] = js.native
}
object ParametersChecksListSuitesForRefEndpoint {
  
  @scala.inline
  def apply(
    parameters: ChecksListSuitesForRefEndpoint,
    request: ChecksListSuitesForRefRequestOptions,
    response: OctokitResponse[ChecksListSuitesForRefResponseData]
  ): ParametersChecksListSuitesForRefEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersChecksListSuitesForRefEndpoint]
  }
  
  @scala.inline
  implicit class ParametersChecksListSuitesForRefEndpointMutableBuilder[Self <: ParametersChecksListSuitesForRefEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ChecksListSuitesForRefEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ChecksListSuitesForRefRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ChecksListSuitesForRefResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
