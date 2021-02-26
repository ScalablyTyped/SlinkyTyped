package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.IssuesSetLabelsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.IssuesSetLabelsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `751` extends StObject {
  
  var parameters: RequestParameters with (Omit[IssuesSetLabelsEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[IssuesSetLabelsResponseData] = js.native
}
object `751` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[IssuesSetLabelsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesSetLabelsResponseData]
  ): `751` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`751`]
  }
  
  @scala.inline
  implicit class `751MutableBuilder`[Self <: `751`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[IssuesSetLabelsEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesSetLabelsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
