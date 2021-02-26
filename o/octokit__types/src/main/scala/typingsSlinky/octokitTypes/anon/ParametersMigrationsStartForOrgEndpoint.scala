package typingsSlinky.octokitTypes.anon

import typingsSlinky.octokitTypes.endpointsMod.MigrationsStartForOrgEndpoint
import typingsSlinky.octokitTypes.endpointsMod.MigrationsStartForOrgRequestOptions
import typingsSlinky.octokitTypes.endpointsMod.MigrationsStartForOrgResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersMigrationsStartForOrgEndpoint extends StObject {
  
  var parameters: MigrationsStartForOrgEndpoint = js.native
  
  var request: MigrationsStartForOrgRequestOptions = js.native
  
  var response: OctokitResponse[MigrationsStartForOrgResponseData] = js.native
}
object ParametersMigrationsStartForOrgEndpoint {
  
  @scala.inline
  def apply(
    parameters: MigrationsStartForOrgEndpoint,
    request: MigrationsStartForOrgRequestOptions,
    response: OctokitResponse[MigrationsStartForOrgResponseData]
  ): ParametersMigrationsStartForOrgEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsStartForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ParametersMigrationsStartForOrgEndpointMutableBuilder[Self <: ParametersMigrationsStartForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: MigrationsStartForOrgEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: MigrationsStartForOrgRequestOptions): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsStartForOrgResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
