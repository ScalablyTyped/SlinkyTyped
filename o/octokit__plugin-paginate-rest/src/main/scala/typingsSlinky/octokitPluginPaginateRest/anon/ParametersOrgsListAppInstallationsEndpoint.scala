package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.OrgsListAppInstallationsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.OrgsListAppInstallationsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOrgsListAppInstallationsEndpoint extends StObject {
  
  var parameters: OrgsListAppInstallationsEndpoint = js.native
  
  var response: OctokitResponse[OrgsListAppInstallationsResponseData] with `6` = js.native
}
object ParametersOrgsListAppInstallationsEndpoint {
  
  @scala.inline
  def apply(
    parameters: OrgsListAppInstallationsEndpoint,
    response: OctokitResponse[OrgsListAppInstallationsResponseData] with `6`
  ): ParametersOrgsListAppInstallationsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOrgsListAppInstallationsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOrgsListAppInstallationsEndpointMutableBuilder[Self <: ParametersOrgsListAppInstallationsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OrgsListAppInstallationsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[OrgsListAppInstallationsResponseData] with `6`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
