package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposRemoveStatusCheckContextsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposRemoveStatusCheckContextsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1007` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposRemoveStatusCheckContextsEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposRemoveStatusCheckContextsResponseData] = js.native
}
object `1007` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposRemoveStatusCheckContextsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposRemoveStatusCheckContextsResponseData]
  ): `1007` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1007`]
  }
  
  @scala.inline
  implicit class `1007MutableBuilder`[Self <: `1007`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ReposRemoveStatusCheckContextsEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposRemoveStatusCheckContextsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
