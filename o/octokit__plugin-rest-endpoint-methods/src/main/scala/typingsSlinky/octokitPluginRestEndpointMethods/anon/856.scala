package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.PullsListEndpoint
import typingsSlinky.octokitTypes.endpointsMod.PullsListResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `856` extends StObject {
  
  var parameters: RequestParameters with (Omit[PullsListEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[PullsListResponseData] = js.native
}
object `856` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[PullsListEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsListResponseData]
  ): `856` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`856`]
  }
  
  @scala.inline
  implicit class `856MutableBuilder`[Self <: `856`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[PullsListEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsListResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
