package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.IssuesListForAuthenticatedUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.IssuesListForAuthenticatedUserRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.IssuesListForAuthenticatedUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesListForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: IssuesListForAuthenticatedUserEndpoint = js.native
  
  var request: IssuesListForAuthenticatedUserRequestOptions = js.native
  
  var response: OctokitResponse[IssuesListForAuthenticatedUserResponseData] = js.native
}
object ParametersIssuesListForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesListForAuthenticatedUserEndpoint,
    request: IssuesListForAuthenticatedUserRequestOptions,
    response: OctokitResponse[IssuesListForAuthenticatedUserResponseData]
  ): ParametersIssuesListForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesListForAuthenticatedUserEndpointMutableBuilder[Self <: ParametersIssuesListForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IssuesListForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesListForAuthenticatedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesListForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
