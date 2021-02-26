package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposRemoveStatusCheckProtectionEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposRemoveStatusCheckProtectionRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposRemoveStatusCheckProtectionEndpoint extends StObject {
  
  var parameters: ReposRemoveStatusCheckProtectionEndpoint = js.native
  
  var request: ReposRemoveStatusCheckProtectionRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersReposRemoveStatusCheckProtectionEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposRemoveStatusCheckProtectionEndpoint,
    request: ReposRemoveStatusCheckProtectionRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposRemoveStatusCheckProtectionEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposRemoveStatusCheckProtectionEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposRemoveStatusCheckProtectionEndpointMutableBuilder[Self <: ParametersReposRemoveStatusCheckProtectionEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposRemoveStatusCheckProtectionEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposRemoveStatusCheckProtectionRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
