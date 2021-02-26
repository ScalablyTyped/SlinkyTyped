package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.OauthAuthorizationsGetOrCreateAuthorizationForAppEndpoint
import typingsSlinky.octokitTypes.endpointsMod.OauthAuthorizationsGetOrCreateAuthorizationForAppRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.OauthAuthorizationsGetOrCreateAuthorizationForAppResponse201Data
import typingsSlinky.octokitTypes.endpointsMod.OauthAuthorizationsGetOrCreateAuthorizationForAppResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOauthAuthorizationsGetOrCreateAuthorizationForAppEndpoint extends StObject {
  
  var parameters: OauthAuthorizationsGetOrCreateAuthorizationForAppEndpoint = js.native
  
  var request: OauthAuthorizationsGetOrCreateAuthorizationForAppRequestOptions = js.native
  
  var response: OctokitResponse[
    OauthAuthorizationsGetOrCreateAuthorizationForAppResponseData | OauthAuthorizationsGetOrCreateAuthorizationForAppResponse201Data
  ] = js.native
}
object ParametersOauthAuthorizationsGetOrCreateAuthorizationForAppEndpoint {
  
  @scala.inline
  def apply(
    parameters: OauthAuthorizationsGetOrCreateAuthorizationForAppEndpoint,
    request: OauthAuthorizationsGetOrCreateAuthorizationForAppRequestOptions,
    response: OctokitResponse[
      OauthAuthorizationsGetOrCreateAuthorizationForAppResponseData | OauthAuthorizationsGetOrCreateAuthorizationForAppResponse201Data
    ]
  ): ParametersOauthAuthorizationsGetOrCreateAuthorizationForAppEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOauthAuthorizationsGetOrCreateAuthorizationForAppEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOauthAuthorizationsGetOrCreateAuthorizationForAppEndpointMutableBuilder[Self <: ParametersOauthAuthorizationsGetOrCreateAuthorizationForAppEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OauthAuthorizationsGetOrCreateAuthorizationForAppEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OauthAuthorizationsGetOrCreateAuthorizationForAppRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(
      value: OctokitResponse[
          OauthAuthorizationsGetOrCreateAuthorizationForAppResponseData | OauthAuthorizationsGetOrCreateAuthorizationForAppResponse201Data
        ]
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
