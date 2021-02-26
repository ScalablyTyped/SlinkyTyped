package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.IssuesListLabelsForMilestoneEndpoint
import typingsSlinky.octokitTypes.endpointsMod.IssuesListLabelsForMilestoneResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersIssuesListLabelsForMilestoneEndpoint extends StObject {
  
  var parameters: IssuesListLabelsForMilestoneEndpoint = js.native
  
  var response: OctokitResponse[IssuesListLabelsForMilestoneResponseData] = js.native
}
object ParametersIssuesListLabelsForMilestoneEndpoint {
  
  @scala.inline
  def apply(
    parameters: IssuesListLabelsForMilestoneEndpoint,
    response: OctokitResponse[IssuesListLabelsForMilestoneResponseData]
  ): ParametersIssuesListLabelsForMilestoneEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersIssuesListLabelsForMilestoneEndpoint]
  }
  
  @scala.inline
  implicit class ParametersIssuesListLabelsForMilestoneEndpointMutableBuilder[Self <: ParametersIssuesListLabelsForMilestoneEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: IssuesListLabelsForMilestoneEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesListLabelsForMilestoneResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
