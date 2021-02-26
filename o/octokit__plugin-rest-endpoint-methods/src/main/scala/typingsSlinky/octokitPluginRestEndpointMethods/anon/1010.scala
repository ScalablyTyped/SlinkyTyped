package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposRemoveUserAccessRestrictionsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposRemoveUserAccessRestrictionsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1010` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposRemoveUserAccessRestrictionsEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposRemoveUserAccessRestrictionsResponseData] = js.native
}
object `1010` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposRemoveUserAccessRestrictionsEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposRemoveUserAccessRestrictionsResponseData]
  ): `1010` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1010`]
  }
  
  @scala.inline
  implicit class `1010MutableBuilder`[Self <: `1010`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ReposRemoveUserAccessRestrictionsEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposRemoveUserAccessRestrictionsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
