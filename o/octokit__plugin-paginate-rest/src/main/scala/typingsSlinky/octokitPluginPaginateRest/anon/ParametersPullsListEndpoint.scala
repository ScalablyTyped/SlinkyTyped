package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.PullsListEndpoint
import typingsSlinky.octokitTypes.endpointsMod.PullsListResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersPullsListEndpoint extends StObject {
  
  var parameters: PullsListEndpoint = js.native
  
  var response: OctokitResponse[PullsListResponseData] = js.native
}
object ParametersPullsListEndpoint {
  
  @scala.inline
  def apply(parameters: PullsListEndpoint, response: OctokitResponse[PullsListResponseData]): ParametersPullsListEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersPullsListEndpoint]
  }
  
  @scala.inline
  implicit class ParametersPullsListEndpointMutableBuilder[Self <: ParametersPullsListEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: PullsListEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsListResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
