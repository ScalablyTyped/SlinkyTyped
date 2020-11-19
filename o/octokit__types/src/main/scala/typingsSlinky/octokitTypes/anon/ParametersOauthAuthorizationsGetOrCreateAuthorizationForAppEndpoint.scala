package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.OauthAuthorizationsGetOrCreateAuthorizationForAppEndpoint
import typingsSlinky.octokitTypes.endpointsMod.OauthAuthorizationsGetOrCreateAuthorizationForAppRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.OauthAuthorizationsGetOrCreateAuthorizationForAppResponse201Data
import typingsSlinky.octokitTypes.endpointsMod.OauthAuthorizationsGetOrCreateAuthorizationForAppResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersOauthAuthorizationsGetOrCreateAuthorizationForAppEndpoint extends js.Object {
  
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
  implicit class ParametersOauthAuthorizationsGetOrCreateAuthorizationForAppEndpointOps[Self <: ParametersOauthAuthorizationsGetOrCreateAuthorizationForAppEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParameters(value: OauthAuthorizationsGetOrCreateAuthorizationForAppEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: OauthAuthorizationsGetOrCreateAuthorizationForAppRequestOptions): Self = this.set("request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(
      value: OctokitResponse[
          OauthAuthorizationsGetOrCreateAuthorizationForAppResponseData | OauthAuthorizationsGetOrCreateAuthorizationForAppResponse201Data
        ]
    ): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
