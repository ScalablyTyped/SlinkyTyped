package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.IssuesAddAssigneesEndpoint
import typingsSlinky.octokitTypes.endpointsMod.IssuesAddAssigneesResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `718` extends StObject {
  
  var parameters: RequestParameters with (Omit[IssuesAddAssigneesEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[IssuesAddAssigneesResponseData] = js.native
}
object `718` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[IssuesAddAssigneesEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesAddAssigneesResponseData]
  ): `718` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`718`]
  }
  
  @scala.inline
  implicit class `718MutableBuilder`[Self <: `718`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[IssuesAddAssigneesEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesAddAssigneesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
