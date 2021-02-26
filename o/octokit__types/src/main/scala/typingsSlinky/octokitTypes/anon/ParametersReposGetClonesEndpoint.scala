package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposGetClonesEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetClonesRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposGetClonesResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposGetClonesEndpoint extends StObject {
  
  var parameters: ReposGetClonesEndpoint = js.native
  
  var request: ReposGetClonesRequestOptions = js.native
  
  var response: OctokitResponse[ReposGetClonesResponseData] = js.native
}
object ParametersReposGetClonesEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposGetClonesEndpoint,
    request: ReposGetClonesRequestOptions,
    response: OctokitResponse[ReposGetClonesResponseData]
  ): ParametersReposGetClonesEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposGetClonesEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposGetClonesEndpointMutableBuilder[Self <: ParametersReposGetClonesEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposGetClonesEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposGetClonesRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetClonesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
