package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.SearchIssuesAndPullRequestsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.SearchIssuesAndPullRequestsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1033` extends StObject {
  
  var parameters: RequestParameters with (Omit[SearchIssuesAndPullRequestsEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[SearchIssuesAndPullRequestsResponseData] = js.native
}
object `1033` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[SearchIssuesAndPullRequestsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[SearchIssuesAndPullRequestsResponseData]
  ): `1033` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1033`]
  }
  
  @scala.inline
  implicit class `1033MutableBuilder`[Self <: `1033`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[SearchIssuesAndPullRequestsEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[SearchIssuesAndPullRequestsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
