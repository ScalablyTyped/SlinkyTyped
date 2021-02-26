package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposDeleteAccessRestrictionsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposDeleteAccessRestrictionsRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposDeleteAccessRestrictionsEndpoint extends StObject {
  
  var parameters: ReposDeleteAccessRestrictionsEndpoint = js.native
  
  var request: ReposDeleteAccessRestrictionsRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersReposDeleteAccessRestrictionsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposDeleteAccessRestrictionsEndpoint,
    request: ReposDeleteAccessRestrictionsRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposDeleteAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposDeleteAccessRestrictionsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposDeleteAccessRestrictionsEndpointMutableBuilder[Self <: ParametersReposDeleteAccessRestrictionsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposDeleteAccessRestrictionsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposDeleteAccessRestrictionsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
