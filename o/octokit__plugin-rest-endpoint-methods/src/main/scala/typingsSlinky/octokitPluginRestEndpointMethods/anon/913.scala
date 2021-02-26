package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposCreateReleaseEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposCreateReleaseResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `913` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposCreateReleaseEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposCreateReleaseResponseData] = js.native
}
object `913` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposCreateReleaseEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposCreateReleaseResponseData]
  ): `913` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`913`]
  }
  
  @scala.inline
  implicit class `913MutableBuilder`[Self <: `913`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ReposCreateReleaseEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposCreateReleaseResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
