package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.GitListMatchingRefsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.GitListMatchingRefsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `708` extends StObject {
  
  var parameters: RequestParameters with (Omit[GitListMatchingRefsEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[GitListMatchingRefsResponseData] = js.native
}
object `708` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[GitListMatchingRefsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GitListMatchingRefsResponseData]
  ): `708` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`708`]
  }
  
  @scala.inline
  implicit class `708MutableBuilder`[Self <: `708`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[GitListMatchingRefsEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GitListMatchingRefsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
