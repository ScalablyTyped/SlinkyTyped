package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposListPullRequestsAssociatedWithCommitEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposListPullRequestsAssociatedWithCommitResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `997` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposListPullRequestsAssociatedWithCommitEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposListPullRequestsAssociatedWithCommitResponseData] = js.native
}
object `997` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposListPullRequestsAssociatedWithCommitEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposListPullRequestsAssociatedWithCommitResponseData]
  ): `997` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`997`]
  }
  
  @scala.inline
  implicit class `997MutableBuilder`[Self <: `997`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ReposListPullRequestsAssociatedWithCommitEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListPullRequestsAssociatedWithCommitResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
