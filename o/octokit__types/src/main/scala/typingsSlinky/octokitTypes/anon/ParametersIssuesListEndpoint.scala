package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.IssuesListEndpoint
import typingsSlinky.octokitTypes.endpointsMod.IssuesListRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.IssuesListResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesListEndpoint extends StObject {
  
  var parameters: IssuesListEndpoint = js.native
  
  var request: IssuesListRequestOptions = js.native
  
  var response: OctokitResponse[IssuesListResponseData] = js.native
}
object ParametersIssuesListEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesListEndpoint,
    request: IssuesListRequestOptions,
    response: OctokitResponse[IssuesListResponseData]
  ): ParametersIssuesListEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesListEndpointMutableBuilder[Self <: ParametersIssuesListEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IssuesListEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesListRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesListResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
