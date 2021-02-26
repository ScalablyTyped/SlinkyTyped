package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.UsersAddEmailForAuthenticatedEndpoint
import typingsSlinky.octokitTypes.endpointsMod.UsersAddEmailForAuthenticatedResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1068` extends StObject {
  
  var parameters: RequestParameters with (Omit[UsersAddEmailForAuthenticatedEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[UsersAddEmailForAuthenticatedResponseData] = js.native
}
object `1068` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[UsersAddEmailForAuthenticatedEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[UsersAddEmailForAuthenticatedResponseData]
  ): `1068` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1068`]
  }
  
  @scala.inline
  implicit class `1068MutableBuilder`[Self <: `1068`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[UsersAddEmailForAuthenticatedEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[UsersAddEmailForAuthenticatedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
