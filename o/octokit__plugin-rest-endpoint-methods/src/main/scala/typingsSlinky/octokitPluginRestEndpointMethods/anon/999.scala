package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposListReleasesEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposListReleasesResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `999` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposListReleasesEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposListReleasesResponseData] = js.native
}
object `999` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposListReleasesEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposListReleasesResponseData]
  ): `999` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`999`]
  }
  
  @scala.inline
  implicit class `999MutableBuilder`[Self <: `999`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ReposListReleasesEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListReleasesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
