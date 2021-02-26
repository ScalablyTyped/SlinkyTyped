package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposGetReadmeEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposGetReadmeResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `966` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposGetReadmeEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposGetReadmeResponseData] = js.native
}
object `966` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposGetReadmeEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposGetReadmeResponseData]
  ): `966` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`966`]
  }
  
  @scala.inline
  implicit class `966MutableBuilder`[Self <: `966`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ReposGetReadmeEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposGetReadmeResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
