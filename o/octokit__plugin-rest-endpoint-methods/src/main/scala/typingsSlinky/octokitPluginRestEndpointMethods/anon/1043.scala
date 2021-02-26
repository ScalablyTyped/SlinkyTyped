package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.TeamsCreateEndpoint
import typingsSlinky.octokitTypes.endpointsMod.TeamsCreateResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1043` extends StObject {
  
  var parameters: RequestParameters with (Omit[TeamsCreateEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[TeamsCreateResponseData] = js.native
}
object `1043` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[TeamsCreateEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[TeamsCreateResponseData]
  ): `1043` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1043`]
  }
  
  @scala.inline
  implicit class `1043MutableBuilder`[Self <: `1043`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[TeamsCreateEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[TeamsCreateResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
