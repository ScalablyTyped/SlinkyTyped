package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposGetReleaseAssetEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetReleaseAssetResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `968` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposGetReleaseAssetEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposGetReleaseAssetResponseData] = js.native
}
object `968` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetReleaseAssetEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetReleaseAssetResponseData]
  ): `968` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`968`]
  }
  
  @scala.inline
  implicit class `968MutableBuilder`[Self <: `968`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ReposGetReleaseAssetEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetReleaseAssetResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
