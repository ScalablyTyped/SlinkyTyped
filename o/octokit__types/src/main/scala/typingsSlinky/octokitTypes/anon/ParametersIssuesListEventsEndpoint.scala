package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.IssuesListEventsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.IssuesListEventsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.IssuesListEventsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesListEventsEndpoint extends StObject {
  
  var parameters: IssuesListEventsEndpoint = js.native
  
  var request: IssuesListEventsRequestOptions = js.native
  
  var response: OctokitResponse[IssuesListEventsResponseData] = js.native
}
object ParametersIssuesListEventsEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesListEventsEndpoint,
    request: IssuesListEventsRequestOptions,
    response: OctokitResponse[IssuesListEventsResponseData]
  ): ParametersIssuesListEventsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListEventsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesListEventsEndpointMutableBuilder[Self <: ParametersIssuesListEventsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IssuesListEventsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesListEventsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesListEventsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
