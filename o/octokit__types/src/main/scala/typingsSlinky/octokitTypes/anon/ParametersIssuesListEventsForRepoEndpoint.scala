package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.IssuesListEventsForRepoEndpoint
import typingsSlinky.octokitTypes.endpointsMod.IssuesListEventsForRepoRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.IssuesListEventsForRepoResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesListEventsForRepoEndpoint extends StObject {
  
  var parameters: IssuesListEventsForRepoEndpoint = js.native
  
  var request: IssuesListEventsForRepoRequestOptions = js.native
  
  var response: OctokitResponse[IssuesListEventsForRepoResponseData] = js.native
}
object ParametersIssuesListEventsForRepoEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesListEventsForRepoEndpoint,
    request: IssuesListEventsForRepoRequestOptions,
    response: OctokitResponse[IssuesListEventsForRepoResponseData]
  ): ParametersIssuesListEventsForRepoEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListEventsForRepoEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesListEventsForRepoEndpointMutableBuilder[Self <: ParametersIssuesListEventsForRepoEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IssuesListEventsForRepoEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesListEventsForRepoRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesListEventsForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
