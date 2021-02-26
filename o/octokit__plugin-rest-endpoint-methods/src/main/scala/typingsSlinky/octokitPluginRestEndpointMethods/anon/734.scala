package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.IssuesListAssigneesEndpoint
import typingsSlinky.octokitTypes.endpointsMod.IssuesListAssigneesResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `734` extends StObject {
  
  var parameters: RequestParameters with (Omit[IssuesListAssigneesEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[IssuesListAssigneesResponseData] = js.native
}
object `734` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[IssuesListAssigneesEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesListAssigneesResponseData]
  ): `734` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`734`]
  }
  
  @scala.inline
  implicit class `734MutableBuilder`[Self <: `734`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[IssuesListAssigneesEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesListAssigneesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
