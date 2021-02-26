package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.AppsListAccountsForPlanEndpoint
import typingsSlinky.octokitTypes.endpointsMod.AppsListAccountsForPlanResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `636` extends StObject {
  
  var parameters: RequestParameters with (Omit[AppsListAccountsForPlanEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[AppsListAccountsForPlanResponseData] = js.native
}
object `636` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[AppsListAccountsForPlanEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[AppsListAccountsForPlanResponseData]
  ): `636` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`636`]
  }
  
  @scala.inline
  implicit class `636MutableBuilder`[Self <: `636`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[AppsListAccountsForPlanEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsListAccountsForPlanResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
