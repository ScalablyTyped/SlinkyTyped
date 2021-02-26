package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.ChecksListForSuiteEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ChecksListForSuiteResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `663` extends StObject {
  
  var parameters: RequestParameters with (Omit[ChecksListForSuiteEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[ChecksListForSuiteResponseData] = js.native
}
object `663` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[ChecksListForSuiteEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[ChecksListForSuiteResponseData]
  ): `663` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`663`]
  }
  
  @scala.inline
  implicit class `663MutableBuilder`[Self <: `663`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: RequestParameters with (Omit[ChecksListForSuiteEndpoint, baseUrl | headers | mediaType])): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ChecksListForSuiteResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
