package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.IssuesAddLabelsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.IssuesAddLabelsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `719` extends StObject {
  
  var parameters: RequestParameters with (Omit[IssuesAddLabelsEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[IssuesAddLabelsResponseData] = js.native
}
object `719` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[IssuesAddLabelsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesAddLabelsResponseData]
  ): `719` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`719`]
  }
  
  @scala.inline
  implicit class `719MutableBuilder`[Self <: `719`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[IssuesAddLabelsEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesAddLabelsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
