package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposGetLatestReleaseEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetLatestReleaseResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `960` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposGetLatestReleaseEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposGetLatestReleaseResponseData] = js.native
}
object `960` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetLatestReleaseEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetLatestReleaseResponseData]
  ): `960` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`960`]
  }
  
  @scala.inline
  implicit class `960MutableBuilder`[Self <: `960`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ReposGetLatestReleaseEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetLatestReleaseResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
