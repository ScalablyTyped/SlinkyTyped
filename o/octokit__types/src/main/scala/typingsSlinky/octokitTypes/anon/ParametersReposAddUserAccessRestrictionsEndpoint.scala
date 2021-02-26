package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.ReposAddUserAccessRestrictionsEndpoint
import typingsSlinky.octokitTypes.endpointsMod.ReposAddUserAccessRestrictionsRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.ReposAddUserAccessRestrictionsResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersReposAddUserAccessRestrictionsEndpoint extends StObject {
  
  var parameters: ReposAddUserAccessRestrictionsEndpoint = js.native
  
  var request: ReposAddUserAccessRestrictionsRequestOptions = js.native
  
  var response: OctokitResponse[ReposAddUserAccessRestrictionsResponseData] = js.native
}
object ParametersReposAddUserAccessRestrictionsEndpoint {
  
  @scala.inline
  def apply(
    parameters: ReposAddUserAccessRestrictionsEndpoint,
    request: ReposAddUserAccessRestrictionsRequestOptions,
    response: OctokitResponse[ReposAddUserAccessRestrictionsResponseData]
  ): ParametersReposAddUserAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersReposAddUserAccessRestrictionsEndpoint]
  }
  
  @scala.inline
  implicit class ParametersReposAddUserAccessRestrictionsEndpointMutableBuilder[Self <: ParametersReposAddUserAccessRestrictionsEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: ReposAddUserAccessRestrictionsEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: ReposAddUserAccessRestrictionsRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[ReposAddUserAccessRestrictionsResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
