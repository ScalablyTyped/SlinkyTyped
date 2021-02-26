package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.IssuesListCommentsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.IssuesListCommentsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `735` extends StObject {
  
  var parameters: RequestParameters with (Omit[IssuesListCommentsEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[IssuesListCommentsResponseData] = js.native
}
object `735` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[IssuesListCommentsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesListCommentsResponseData]
  ): `735` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`735`]
  }
  
  @scala.inline
  implicit class `735MutableBuilder`[Self <: `735`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[IssuesListCommentsEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesListCommentsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
