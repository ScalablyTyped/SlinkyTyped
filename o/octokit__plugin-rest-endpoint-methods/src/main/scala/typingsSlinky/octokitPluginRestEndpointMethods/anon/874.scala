package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReactionsCreateForIssueEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReactionsCreateForIssueResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `874` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReactionsCreateForIssueEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReactionsCreateForIssueResponseData] = js.native
}
object `874` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReactionsCreateForIssueEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReactionsCreateForIssueResponseData]
  ): `874` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`874`]
  }
  
  @scala.inline
  implicit class `874MutableBuilder`[Self <: `874`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ReactionsCreateForIssueEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReactionsCreateForIssueResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
