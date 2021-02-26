package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.AppsListPlansStubbedEndpoint
import typingsSlinky.octokitTypes.endpointsMod.AppsListPlansStubbedResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `642` extends StObject {
  
  var parameters: RequestParameters with (Omit[AppsListPlansStubbedEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[AppsListPlansStubbedResponseData] = js.native
}
object `642` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[AppsListPlansStubbedEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[AppsListPlansStubbedResponseData]
  ): `642` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`642`]
  }
  
  @scala.inline
  implicit class `642MutableBuilder`[Self <: `642`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[AppsListPlansStubbedEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[AppsListPlansStubbedResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
