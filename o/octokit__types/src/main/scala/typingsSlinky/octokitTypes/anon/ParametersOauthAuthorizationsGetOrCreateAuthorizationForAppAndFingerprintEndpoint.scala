package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintEndpoint
import typingsSlinky.octokitTypes.endpointsMod.OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintResponse201Data
import typingsSlinky.octokitTypes.endpointsMod.OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintEndpoint extends StObject {
  
  var parameters: OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintEndpoint = js.native
  
  var request: OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintRequestOptions = js.native
  
  var response: OctokitResponse[
    OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintResponseData | OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintResponse201Data
  ] = js.native
}
object ParametersOauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintEndpoint {
  
  @scala.inline
  def apply(
    parameters: OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintEndpoint,
    request: OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintRequestOptions,
    response: OctokitResponse[
      OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintResponseData | OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintResponse201Data
    ]
  ): ParametersOauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersOauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintEndpoint]
  }
  
  @scala.inline
  implicit class ParametersOauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintEndpointMutableBuilder[Self <: ParametersOauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(
      value: OctokitResponse[
          OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintResponseData | OauthAuthorizationsGetOrCreateAuthorizationForAppAndFingerprintResponse201Data
        ]
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
