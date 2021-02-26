package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.MigrationsStartForAuthenticatedUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.MigrationsStartForAuthenticatedUserRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.MigrationsStartForAuthenticatedUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersMigrationsStartForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: MigrationsStartForAuthenticatedUserEndpoint = js.native
  
  var request: MigrationsStartForAuthenticatedUserRequestOptions = js.native
  
  var response: OctokitResponse[MigrationsStartForAuthenticatedUserResponseData] = js.native
}
object ParametersMigrationsStartForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: MigrationsStartForAuthenticatedUserEndpoint,
    request: MigrationsStartForAuthenticatedUserRequestOptions,
    response: OctokitResponse[MigrationsStartForAuthenticatedUserResponseData]
  ): ParametersMigrationsStartForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsStartForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersMigrationsStartForAuthenticatedUserEndpointMutableBuilder[Self <: ParametersMigrationsStartForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: MigrationsStartForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: MigrationsStartForAuthenticatedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsStartForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
