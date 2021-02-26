package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.BillingGetSharedStorageBillingUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.BillingGetSharedStorageBillingUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `656` extends StObject {
  
  var parameters: RequestParameters with (Omit[BillingGetSharedStorageBillingUserEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[BillingGetSharedStorageBillingUserResponseData] = js.native
}
object `656` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[BillingGetSharedStorageBillingUserEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[BillingGetSharedStorageBillingUserResponseData]
  ): `656` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`656`]
  }
  
  @scala.inline
  implicit class `656MutableBuilder`[Self <: `656`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[BillingGetSharedStorageBillingUserEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[BillingGetSharedStorageBillingUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
