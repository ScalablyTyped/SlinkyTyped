package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.PullsMergeEndpoint
import typingsSlinky.octokitTypes.endpointsMod.PullsMergeResponse405Data
import typingsSlinky.octokitTypes.endpointsMod.PullsMergeResponse409Data
import typingsSlinky.octokitTypes.endpointsMod.PullsMergeResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `858` extends js.Object {
  
  var parameters: RequestParameters with (Omit[PullsMergeEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[PullsMergeResponseData | PullsMergeResponse405Data | PullsMergeResponse409Data] = js.native
}
object `858` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[PullsMergeEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsMergeResponseData | PullsMergeResponse405Data | PullsMergeResponse409Data]
  ): `858` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`858`]
  }
  
  @scala.inline
  implicit class `858Ops`[Self <: `858`] (val x: Self) extends AnyVal {
    
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
    def setParameters(value: RequestParameters with (Omit[PullsMergeEndpoint, baseUrl | headers | mediaType])): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(
      value: OctokitResponse[PullsMergeResponseData | PullsMergeResponse405Data | PullsMergeResponse409Data]
    ): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
