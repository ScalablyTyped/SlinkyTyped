package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposListForksEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposListForksResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposListForksEndpoint extends StObject {
  
  var parameters: ReposListForksEndpoint = js.native
  
  var response: OctokitResponse[ReposListForksResponseData] = js.native
}
object ParametersReposListForksEndpoint {
  
  @scala.inline
  def apply(parameters: ReposListForksEndpoint, response: OctokitResponse[ReposListForksResponseData]): ParametersReposListForksEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListForksEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposListForksEndpointMutableBuilder[Self <: ParametersReposListForksEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposListForksEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListForksResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
