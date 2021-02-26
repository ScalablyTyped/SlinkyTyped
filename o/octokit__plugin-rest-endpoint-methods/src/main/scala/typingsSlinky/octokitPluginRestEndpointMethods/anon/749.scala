package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.IssuesRemoveAssigneesEndpoint
import typingsSlinky.octokitTypes.endpointsMod.IssuesRemoveAssigneesResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `749` extends StObject {
  
  var parameters: RequestParameters with (Omit[IssuesRemoveAssigneesEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[IssuesRemoveAssigneesResponseData] = js.native
}
object `749` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[IssuesRemoveAssigneesEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[IssuesRemoveAssigneesResponseData]
  ): `749` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`749`]
  }
  
  @scala.inline
  implicit class `749MutableBuilder`[Self <: `749`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[IssuesRemoveAssigneesEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[IssuesRemoveAssigneesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
