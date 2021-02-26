package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.AppsGetOrgInstallationEndpoint
import typingsSlinky.octokitTypes.endpointsMod.AppsGetOrgInstallationRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.AppsGetOrgInstallationResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersAppsGetOrgInstallationEndpoint extends StObject {
  
  var parameters: AppsGetOrgInstallationEndpoint = js.native
  
  var request: AppsGetOrgInstallationRequestOptions = js.native
  
  var response: OctokitResponse[AppsGetOrgInstallationResponseData] = js.native
}
object ParametersAppsGetOrgInstallationEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsGetOrgInstallationEndpoint,
    request: AppsGetOrgInstallationRequestOptions,
    response: OctokitResponse[AppsGetOrgInstallationResponseData]
  ): ParametersAppsGetOrgInstallationEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsGetOrgInstallationEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsGetOrgInstallationEndpointMutableBuilder[Self <: ParametersAppsGetOrgInstallationEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsGetOrgInstallationEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsGetOrgInstallationRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsGetOrgInstallationResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
