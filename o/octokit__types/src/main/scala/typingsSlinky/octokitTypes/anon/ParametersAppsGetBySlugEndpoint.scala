package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.AppsGetBySlugEndpoint
import typingsSlinky.octokitTypes.endpointsMod.AppsGetBySlugRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.AppsGetBySlugResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersAppsGetBySlugEndpoint extends StObject {
  
  var parameters: AppsGetBySlugEndpoint = js.native
  
  var request: AppsGetBySlugRequestOptions = js.native
  
  var response: OctokitResponse[AppsGetBySlugResponseData] = js.native
}
object ParametersAppsGetBySlugEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsGetBySlugEndpoint,
    request: AppsGetBySlugRequestOptions,
    response: OctokitResponse[AppsGetBySlugResponseData]
  ): ParametersAppsGetBySlugEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsGetBySlugEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsGetBySlugEndpointMutableBuilder[Self <: ParametersAppsGetBySlugEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsGetBySlugEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsGetBySlugRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsGetBySlugResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
