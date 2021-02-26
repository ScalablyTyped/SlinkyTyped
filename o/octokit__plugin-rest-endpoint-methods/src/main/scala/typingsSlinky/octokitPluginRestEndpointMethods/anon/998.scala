package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposListReleaseAssetsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposListReleaseAssetsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `998` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposListReleaseAssetsEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposListReleaseAssetsResponseData] = js.native
}
object `998` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposListReleaseAssetsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposListReleaseAssetsResponseData]
  ): `998` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`998`]
  }
  
  @scala.inline
  implicit class `998MutableBuilder`[Self <: `998`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ReposListReleaseAssetsEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListReleaseAssetsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
