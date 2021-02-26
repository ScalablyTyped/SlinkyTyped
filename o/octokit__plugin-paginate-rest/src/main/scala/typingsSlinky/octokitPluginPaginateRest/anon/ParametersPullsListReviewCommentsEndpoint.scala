package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.PullsListReviewCommentsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.PullsListReviewCommentsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersPullsListReviewCommentsEndpoint extends StObject {
  
  var parameters: PullsListReviewCommentsEndpoint = js.native
  
  var response: OctokitResponse[PullsListReviewCommentsResponseData] = js.native
}
object ParametersPullsListReviewCommentsEndpoint {
  
  @scala.inline
  def apply(
    parameters: PullsListReviewCommentsEndpoint,
    response: OctokitResponse[PullsListReviewCommentsResponseData]
  ): ParametersPullsListReviewCommentsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsListReviewCommentsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersPullsListReviewCommentsEndpointMutableBuilder[Self <: ParametersPullsListReviewCommentsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: PullsListReviewCommentsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsListReviewCommentsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
