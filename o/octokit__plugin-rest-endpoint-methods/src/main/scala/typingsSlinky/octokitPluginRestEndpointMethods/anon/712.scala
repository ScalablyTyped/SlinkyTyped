package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.InteractionsGetRestrictionsForOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.InteractionsGetRestrictionsForOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `712` extends StObject {
  
  var parameters: RequestParameters with (Omit[InteractionsGetRestrictionsForOrgEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[InteractionsGetRestrictionsForOrgResponseData] = js.native
}
object `712` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[InteractionsGetRestrictionsForOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[InteractionsGetRestrictionsForOrgResponseData]
  ): `712` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`712`]
  }
  
  @scala.inline
  implicit class `712MutableBuilder`[Self <: `712`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[InteractionsGetRestrictionsForOrgEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[InteractionsGetRestrictionsForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
