package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.IssuesGetEndpoint
import typingsSlinky.octokitTypes.endpointsMod.IssuesGetRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.IssuesGetResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesGetEndpoint extends StObject {
  
  var parameters: IssuesGetEndpoint = js.native
  
  var request: IssuesGetRequestOptions = js.native
  
  var response: OctokitResponse[IssuesGetResponseData] = js.native
}
object ParametersIssuesGetEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesGetEndpoint,
    request: IssuesGetRequestOptions,
    response: OctokitResponse[IssuesGetResponseData]
  ): ParametersIssuesGetEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesGetEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesGetEndpointMutableBuilder[Self <: ParametersIssuesGetEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IssuesGetEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesGetRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesGetResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
