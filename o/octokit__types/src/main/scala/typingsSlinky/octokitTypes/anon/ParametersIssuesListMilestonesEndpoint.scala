package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.IssuesListMilestonesEndpoint
import typingsSlinky.octokitTypes.endpointsMod.IssuesListMilestonesRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.IssuesListMilestonesResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesListMilestonesEndpoint extends StObject {
  
  var parameters: IssuesListMilestonesEndpoint = js.native
  
  var request: IssuesListMilestonesRequestOptions = js.native
  
  var response: OctokitResponse[IssuesListMilestonesResponseData] = js.native
}
object ParametersIssuesListMilestonesEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesListMilestonesEndpoint,
    request: IssuesListMilestonesRequestOptions,
    response: OctokitResponse[IssuesListMilestonesResponseData]
  ): ParametersIssuesListMilestonesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListMilestonesEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesListMilestonesEndpointMutableBuilder[Self <: ParametersIssuesListMilestonesEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IssuesListMilestonesEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IssuesListMilestonesRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesListMilestonesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
