package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.InteractionsSetRestrictionsForOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.InteractionsSetRestrictionsForOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `716` extends StObject {
  
  var parameters: RequestParameters with (Omit[InteractionsSetRestrictionsForOrgEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[InteractionsSetRestrictionsForOrgResponseData] = js.native
}
object `716` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[InteractionsSetRestrictionsForOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[InteractionsSetRestrictionsForOrgResponseData]
  ): `716` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`716`]
  }
  
  @scala.inline
  implicit class `716MutableBuilder`[Self <: `716`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[InteractionsSetRestrictionsForOrgEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[InteractionsSetRestrictionsForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
