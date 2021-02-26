package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReactionsDeleteLegacyEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReactionsDeleteLegacyRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReactionsDeleteLegacyEndpoint extends StObject {
  
  var parameters: ReactionsDeleteLegacyEndpoint = js.native
  
  var request: ReactionsDeleteLegacyRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersReactionsDeleteLegacyEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReactionsDeleteLegacyEndpoint,
    request: ReactionsDeleteLegacyRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReactionsDeleteLegacyEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReactionsDeleteLegacyEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReactionsDeleteLegacyEndpointMutableBuilder[Self <: ParametersReactionsDeleteLegacyEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReactionsDeleteLegacyEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReactionsDeleteLegacyRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
