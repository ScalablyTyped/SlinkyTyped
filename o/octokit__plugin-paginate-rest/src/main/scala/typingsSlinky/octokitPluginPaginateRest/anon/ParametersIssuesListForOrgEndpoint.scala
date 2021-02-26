package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.IssuesListForOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.IssuesListForOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesListForOrgEndpoint extends StObject {
  
  var parameters: IssuesListForOrgEndpoint = js.native
  
  var response: OctokitResponse[IssuesListForOrgResponseData] = js.native
}
object ParametersIssuesListForOrgEndpoint {
  
  @scala.inline
  def apply(parameters: IssuesListForOrgEndpoint, response: OctokitResponse[IssuesListForOrgResponseData]): ParametersIssuesListForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesListForOrgEndpointMutableBuilder[Self <: ParametersIssuesListForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IssuesListForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesListForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
