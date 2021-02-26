package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.GitignoreGetTemplateEndpoint
import typingsSlinky.octokitTypes.endpointsMod.GitignoreGetTemplateResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `711` extends StObject {
  
  var parameters: RequestParameters with (Omit[GitignoreGetTemplateEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[GitignoreGetTemplateResponseData] = js.native
}
object `711` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[GitignoreGetTemplateEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GitignoreGetTemplateResponseData]
  ): `711` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`711`]
  }
  
  @scala.inline
  implicit class `711MutableBuilder`[Self <: `711`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[GitignoreGetTemplateEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GitignoreGetTemplateResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
