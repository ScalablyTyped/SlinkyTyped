package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposListLanguagesEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposListLanguagesRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposListLanguagesResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposListLanguagesEndpoint extends StObject {
  
  var parameters: ReposListLanguagesEndpoint = js.native
  
  var request: ReposListLanguagesRequestOptions = js.native
  
  var response: OctokitResponse[ReposListLanguagesResponseData] = js.native
}
object ParametersReposListLanguagesEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposListLanguagesEndpoint,
    request: ReposListLanguagesRequestOptions,
    response: OctokitResponse[ReposListLanguagesResponseData]
  ): ParametersReposListLanguagesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposListLanguagesEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposListLanguagesEndpointMutableBuilder[Self <: ParametersReposListLanguagesEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposListLanguagesEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposListLanguagesRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListLanguagesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
