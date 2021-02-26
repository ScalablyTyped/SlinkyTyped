package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposListDeploymentStatusesEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposListDeploymentStatusesResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `986` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposListDeploymentStatusesEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ReposListDeploymentStatusesResponseData] = js.native
}
object `986` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposListDeploymentStatusesEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ReposListDeploymentStatusesResponseData]
  ): `986` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`986`]
  }
  
  @scala.inline
  implicit class `986MutableBuilder`[Self <: `986`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[ReposListDeploymentStatusesEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposListDeploymentStatusesResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
