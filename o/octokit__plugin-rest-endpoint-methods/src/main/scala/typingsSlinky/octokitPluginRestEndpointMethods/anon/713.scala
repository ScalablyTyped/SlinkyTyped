package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.InteractionsGetRestrictionsForRepoEndpoint
import typingsSlinky.octokitTypes.endpointsMod.InteractionsGetRestrictionsForRepoResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `713` extends StObject {
  
  var parameters: RequestParameters with (Omit[InteractionsGetRestrictionsForRepoEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[InteractionsGetRestrictionsForRepoResponseData] = js.native
}
object `713` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[InteractionsGetRestrictionsForRepoEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[InteractionsGetRestrictionsForRepoResponseData]
  ): `713` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`713`]
  }
  
  @scala.inline
  implicit class `713MutableBuilder`[Self <: `713`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[InteractionsGetRestrictionsForRepoEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[InteractionsGetRestrictionsForRepoResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
