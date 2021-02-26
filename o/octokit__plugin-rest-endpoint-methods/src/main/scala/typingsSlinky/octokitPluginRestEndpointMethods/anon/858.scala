package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.PullsListCommitsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.PullsListCommitsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `858` extends StObject {
  
  var parameters: RequestParameters with (Omit[PullsListCommitsEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[PullsListCommitsResponseData] = js.native
}
object `858` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[PullsListCommitsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[PullsListCommitsResponseData]
  ): `858` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`858`]
  }
  
  @scala.inline
  implicit class `858MutableBuilder`[Self <: `858`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[PullsListCommitsEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[PullsListCommitsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
