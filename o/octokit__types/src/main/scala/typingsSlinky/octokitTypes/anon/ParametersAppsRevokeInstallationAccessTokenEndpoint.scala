package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.AppsRevokeInstallationAccessTokenEndpoint
import typingsSlinky.octokitTypes.endpointsMod.AppsRevokeInstallationAccessTokenRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersAppsRevokeInstallationAccessTokenEndpoint extends StObject {
  
  var parameters: AppsRevokeInstallationAccessTokenEndpoint = js.native
  
  var request: AppsRevokeInstallationAccessTokenRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersAppsRevokeInstallationAccessTokenEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsRevokeInstallationAccessTokenEndpoint,
    request: AppsRevokeInstallationAccessTokenRequestOptions,
    response: OctokitResponse[_]
  ): ParametersAppsRevokeInstallationAccessTokenEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsRevokeInstallationAccessTokenEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsRevokeInstallationAccessTokenEndpointMutableBuilder[Self <: ParametersAppsRevokeInstallationAccessTokenEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsRevokeInstallationAccessTokenEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsRevokeInstallationAccessTokenRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
