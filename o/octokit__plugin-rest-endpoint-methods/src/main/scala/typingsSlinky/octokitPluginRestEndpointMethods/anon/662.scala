package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ChecksListForRefEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ChecksListForRefResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `662` extends StObject {
  
  var parameters: RequestParameters with (Omit[ChecksListForRefEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ChecksListForRefResponseData] = js.native
}
object `662` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ChecksListForRefEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ChecksListForRefResponseData]
  ): `662` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`662`]
  }
  
  @scala.inline
  implicit class `662MutableBuilder`[Self <: `662`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ChecksListForRefEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ChecksListForRefResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
