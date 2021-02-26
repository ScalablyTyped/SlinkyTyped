package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposGetPagesEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetPagesRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposGetPagesResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetPagesEndpoint extends StObject {
  
  var parameters: ReposGetPagesEndpoint = js.native
  
  var request: ReposGetPagesRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetPagesResponseData] = js.native
}
object ParametersReposGetPagesEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetPagesEndpoint,
    request: ReposGetPagesRequestOptions,
    response: OctokitResponse[ReposGetPagesResponseData]
  ): ParametersReposGetPagesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetPagesEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetPagesEndpointMutableBuilder[Self <: ParametersReposGetPagesEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetPagesEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetPagesRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetPagesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
