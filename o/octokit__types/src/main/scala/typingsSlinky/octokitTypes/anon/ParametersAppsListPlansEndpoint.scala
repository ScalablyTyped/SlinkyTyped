package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.AppsListPlansEndpoint
import typingsSlinky.octokitTypes.endpointsMod.AppsListPlansRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.AppsListPlansResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersAppsListPlansEndpoint extends StObject {
  
  var parameters: AppsListPlansEndpoint = js.native
  
  var request: AppsListPlansRequestOptions = js.native
  
  var response: OctokitResponse[AppsListPlansResponseData] = js.native
}
object ParametersAppsListPlansEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsListPlansEndpoint,
    request: AppsListPlansRequestOptions,
    response: OctokitResponse[AppsListPlansResponseData]
  ): ParametersAppsListPlansEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsListPlansEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsListPlansEndpointMutableBuilder[Self <: ParametersAppsListPlansEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsListPlansEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsListPlansRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsListPlansResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
