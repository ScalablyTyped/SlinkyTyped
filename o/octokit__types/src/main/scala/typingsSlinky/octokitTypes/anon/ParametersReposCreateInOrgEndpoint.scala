package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposCreateInOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposCreateInOrgRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposCreateInOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposCreateInOrgEndpoint extends StObject {
  
  var parameters: ReposCreateInOrgEndpoint = js.native
  
  var request: ReposCreateInOrgRequestOptions = js.native
  
  var response: OctokitResponse[ReposCreateInOrgResponseData] = js.native
}
object ParametersReposCreateInOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposCreateInOrgEndpoint,
    request: ReposCreateInOrgRequestOptions,
    response: OctokitResponse[ReposCreateInOrgResponseData]
  ): ParametersReposCreateInOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposCreateInOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposCreateInOrgEndpointMutableBuilder[Self <: ParametersReposCreateInOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposCreateInOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposCreateInOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposCreateInOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
