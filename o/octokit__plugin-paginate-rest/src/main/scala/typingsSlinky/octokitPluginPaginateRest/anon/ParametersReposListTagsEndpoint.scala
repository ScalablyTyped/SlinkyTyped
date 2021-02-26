package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposListTagsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposListTagsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposListTagsEndpoint extends StObject {
  
  var parameters: ReposListTagsEndpoint = js.native
  
  var response: OctokitResponse[ReposListTagsResponseData] = js.native
}
object ParametersReposListTagsEndpoint {
  
  @scala.inline
  def apply(parameters: ReposListTagsEndpoint, response: OctokitResponse[ReposListTagsResponseData]): ParametersReposListTagsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListTagsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposListTagsEndpointMutableBuilder[Self <: ParametersReposListTagsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposListTagsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListTagsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
