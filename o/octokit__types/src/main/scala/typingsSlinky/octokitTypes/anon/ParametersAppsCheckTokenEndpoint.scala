package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.AppsCheckTokenEndpoint
import typingsSlinky.octokitTypes.endpointsMod.AppsCheckTokenRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.AppsCheckTokenResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersAppsCheckTokenEndpoint extends StObject {
  
  var parameters: AppsCheckTokenEndpoint = js.native
  
  var request: AppsCheckTokenRequestOptions = js.native
  
  var response: OctokitResponse[AppsCheckTokenResponseData] = js.native
}
object ParametersAppsCheckTokenEndpoint {
  
  @scala.inline
  def apply(
    parameters: AppsCheckTokenEndpoint,
    request: AppsCheckTokenRequestOptions,
    response: OctokitResponse[AppsCheckTokenResponseData]
  ): ParametersAppsCheckTokenEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersAppsCheckTokenEndpoint]
  }
  
  @scala.inline
  implicit class ParametersAppsCheckTokenEndpointMutableBuilder[Self <: ParametersAppsCheckTokenEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: AppsCheckTokenEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: AppsCheckTokenRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsCheckTokenResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
