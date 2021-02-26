package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.GitGetBlobEndpoint
import typingsSlinky.octokitTypes.endpointsMod.GitGetBlobResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `703` extends StObject {
  
  var parameters: RequestParameters with (Omit[GitGetBlobEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[GitGetBlobResponseData] = js.native
}
object `703` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[GitGetBlobEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GitGetBlobResponseData]
  ): `703` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`703`]
  }
  
  @scala.inline
  implicit class `703MutableBuilder`[Self <: `703`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[GitGetBlobEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GitGetBlobResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
