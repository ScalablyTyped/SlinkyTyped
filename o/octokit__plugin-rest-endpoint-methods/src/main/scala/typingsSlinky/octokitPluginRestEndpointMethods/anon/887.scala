package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReactionsListForIssueEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReactionsListForIssueResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `887` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReactionsListForIssueEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReactionsListForIssueResponseData] = js.native
}
object `887` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReactionsListForIssueEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReactionsListForIssueResponseData]
  ): `887` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`887`]
  }
  
  @scala.inline
  implicit class `887MutableBuilder`[Self <: `887`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ReactionsListForIssueEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReactionsListForIssueResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
