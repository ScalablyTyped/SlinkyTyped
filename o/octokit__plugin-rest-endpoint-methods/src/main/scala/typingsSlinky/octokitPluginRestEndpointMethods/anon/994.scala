package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposListLanguagesEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposListLanguagesResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `994` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposListLanguagesEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposListLanguagesResponseData] = js.native
}
object `994` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposListLanguagesEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposListLanguagesResponseData]
  ): `994` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`994`]
  }
  
  @scala.inline
  implicit class `994MutableBuilder`[Self <: `994`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ReposListLanguagesEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListLanguagesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
