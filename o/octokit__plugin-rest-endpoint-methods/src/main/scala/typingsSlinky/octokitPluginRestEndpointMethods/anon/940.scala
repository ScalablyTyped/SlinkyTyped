package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposGetAllStatusCheckContextsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetAllStatusCheckContextsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `940` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposGetAllStatusCheckContextsEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposGetAllStatusCheckContextsResponseData] = js.native
}
object `940` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetAllStatusCheckContextsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetAllStatusCheckContextsResponseData]
  ): `940` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`940`]
  }
  
  @scala.inline
  implicit class `940MutableBuilder`[Self <: `940`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ReposGetAllStatusCheckContextsEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetAllStatusCheckContextsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
