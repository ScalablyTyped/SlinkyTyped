package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.AppsListAccountsForPlanStubbedEndpoint
import typingsSlinky.octokitTypes.endpointsMod.AppsListAccountsForPlanStubbedResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `637` extends StObject {
  
  var parameters: RequestParameters with (Omit[AppsListAccountsForPlanStubbedEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[AppsListAccountsForPlanStubbedResponseData] = js.native
}
object `637` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[AppsListAccountsForPlanStubbedEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[AppsListAccountsForPlanStubbedResponseData]
  ): `637` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`637`]
  }
  
  @scala.inline
  implicit class `637MutableBuilder`[Self <: `637`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[AppsListAccountsForPlanStubbedEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsListAccountsForPlanStubbedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
