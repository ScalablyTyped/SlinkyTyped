package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.MigrationsListForAuthenticatedUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.MigrationsListForAuthenticatedUserRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.MigrationsListForAuthenticatedUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersMigrationsListForAuthenticatedUserEndpoint extends StObject {
  
  var parameters: MigrationsListForAuthenticatedUserEndpoint = js.native
  
  var request: MigrationsListForAuthenticatedUserRequestOptions = js.native
  
  var response: OctokitResponse[MigrationsListForAuthenticatedUserResponseData] = js.native
}
object ParametersMigrationsListForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: MigrationsListForAuthenticatedUserEndpoint,
    request: MigrationsListForAuthenticatedUserRequestOptions,
    response: OctokitResponse[MigrationsListForAuthenticatedUserResponseData]
  ): ParametersMigrationsListForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsListForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersMigrationsListForAuthenticatedUserEndpointMutableBuilder[Self <: ParametersMigrationsListForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: MigrationsListForAuthenticatedUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: MigrationsListForAuthenticatedUserRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsListForAuthenticatedUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
