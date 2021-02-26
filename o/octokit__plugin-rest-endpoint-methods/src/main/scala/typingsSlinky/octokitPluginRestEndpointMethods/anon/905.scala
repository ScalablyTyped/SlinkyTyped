package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ReposCreateDeploymentEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposCreateDeploymentResponse202Data
import typingsSlinky.octokitTypes.endpointsMod.ReposCreateDeploymentResponse409Data
import typingsSlinky.octokitTypes.endpointsMod.ReposCreateDeploymentResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `905` extends StObject {
  
  var parameters: RequestParameters with (Omit[ReposCreateDeploymentEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[
    ReposCreateDeploymentResponseData | ReposCreateDeploymentResponse202Data | ReposCreateDeploymentResponse409Data
  ] = js.native
}
object `905` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ReposCreateDeploymentEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[
      ReposCreateDeploymentResponseData | ReposCreateDeploymentResponse202Data | ReposCreateDeploymentResponse409Data
    ]
  ): `905` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`905`]
  }
  
  @scala.inline
  implicit class `905MutableBuilder`[Self <: `905`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ReposCreateDeploymentEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(
      value: OctokitResponse[
          ReposCreateDeploymentResponseData | ReposCreateDeploymentResponse202Data | ReposCreateDeploymentResponse409Data
        ]
    ): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
