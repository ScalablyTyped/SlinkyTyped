package typingsSlinky.octokitPluginRestEndpointMethods.anon

import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.baseUrl
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.headers
import typingsSlinky.octokitPluginRestEndpointMethods.octokitPluginRestEndpointMethodsStrings.mediaType
import typingsSlinky.octokitTypes.endpointsMod.BillingGetGithubPackagesBillingOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.BillingGetGithubPackagesBillingOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import typingsSlinky.octokitTypes.requestParametersMod.RequestParameters
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `653` extends StObject {
  
  var parameters: RequestParameters with (Omit[BillingGetGithubPackagesBillingOrgEndpoint, baseUrl | headers | mediaType]) = js.native
  
  var response: OctokitResponse[BillingGetGithubPackagesBillingOrgResponseData] = js.native
}
object `653` {
  
  @scala.inline
  def apply(
    parameters: RequestParameters with (Omit[BillingGetGithubPackagesBillingOrgEndpoint, baseUrl | headers | mediaType]),
    response: OctokitResponse[BillingGetGithubPackagesBillingOrgResponseData]
  ): `653` = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[`653`]
  }
  
  @scala.inline
  implicit class `653MutableBuilder`[Self <: `653`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: RequestParameters with (Omit[BillingGetGithubPackagesBillingOrgEndpoint, baseUrl | headers | mediaType])
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[BillingGetGithubPackagesBillingOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
