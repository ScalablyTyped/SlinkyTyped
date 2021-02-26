package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposAddStatusCheckContextsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposAddStatusCheckContextsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `895` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposAddStatusCheckContextsEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposAddStatusCheckContextsResponseData] = js.native
}
object `895` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposAddStatusCheckContextsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposAddStatusCheckContextsResponseData]
  ): `895` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`895`]
  }
  
  @scala.inline
  implicit class `895MutableBuilder`[Self <: `895`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ReposAddStatusCheckContextsEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposAddStatusCheckContextsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
