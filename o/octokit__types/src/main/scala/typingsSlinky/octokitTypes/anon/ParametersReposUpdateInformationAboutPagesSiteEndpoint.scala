package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposUpdateInformationAboutPagesSiteEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposUpdateInformationAboutPagesSiteRequestOptions
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposUpdateInformationAboutPagesSiteEndpoint extends StObject {
  
  var parameters: ReposUpdateInformationAboutPagesSiteEndpoint = js.native
  
  var request: ReposUpdateInformationAboutPagesSiteRequestOptions = js.native
  
  var response: OctokitResponse[_] = js.native
}
object ParametersReposUpdateInformationAboutPagesSiteEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposUpdateInformationAboutPagesSiteEndpoint,
    request: ReposUpdateInformationAboutPagesSiteRequestOptions,
    response: OctokitResponse[_]
  ): ParametersReposUpdateInformationAboutPagesSiteEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposUpdateInformationAboutPagesSiteEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposUpdateInformationAboutPagesSiteEndpointMutableBuilder[Self <: ParametersReposUpdateInformationAboutPagesSiteEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposUpdateInformationAboutPagesSiteEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposUpdateInformationAboutPagesSiteRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[_]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
