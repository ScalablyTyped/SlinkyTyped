package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.GitignoreGetAllTemplatesEndpoint
import typingsSlinky.octokitTypes.endpointsMod.GitignoreGetAllTemplatesResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `710` extends StObject {
  
  var parameters: RequestParameters with (Omit[GitignoreGetAllTemplatesEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[GitignoreGetAllTemplatesResponseData] = js.native
}
object `710` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[GitignoreGetAllTemplatesEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[GitignoreGetAllTemplatesResponseData]
  ): `710` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`710`]
  }
  
  @scala.inline
  implicit class `710MutableBuilder`[Self <: `710`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[GitignoreGetAllTemplatesEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[GitignoreGetAllTemplatesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
