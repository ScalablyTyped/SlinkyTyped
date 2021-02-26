package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.IssuesCreateLabelEndpoint
import typingsSlinky.octokitTypes.endpointsMod.IssuesCreateLabelResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `723` extends StObject {
  
  var parameters: RequestParameters with (Omit[IssuesCreateLabelEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[IssuesCreateLabelResponseData] = js.native
}
object `723` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[IssuesCreateLabelEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesCreateLabelResponseData]
  ): `723` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`723`]
  }
  
  @scala.inline
  implicit class `723MutableBuilder`[Self <: `723`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[IssuesCreateLabelEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesCreateLabelResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
