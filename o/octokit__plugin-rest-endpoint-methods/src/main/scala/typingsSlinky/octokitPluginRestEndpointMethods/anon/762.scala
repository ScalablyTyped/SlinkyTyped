package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.MetaGetEndpoint
import typingsSlinky.octokitTypes.endpointsMod.MetaGetResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `762` extends StObject {
  
  var parameters: RequestParameters with (Omit[MetaGetEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[MetaGetResponseData] = js.native
}
object `762` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[MetaGetEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[MetaGetResponseData]
  ): `762` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`762`]
  }
  
  @scala.inline
  implicit class `762MutableBuilder`[Self <: `762`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[MetaGetEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MetaGetResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
