package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.TeamsListEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsListResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1053` extends StObject {
  
  var parameters: RequestParameters with (Omit[TeamsListEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[TeamsListResponseData] = js.native
}
object `1053` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[TeamsListEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[TeamsListResponseData]
  ): `1053` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1053`]
  }
  
  @scala.inline
  implicit class `1053MutableBuilder`[Self <: `1053`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[TeamsListEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsListResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
