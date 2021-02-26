package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.MigrationsListReposForUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.MigrationsListReposForUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersMigrationsListReposForUserEndpoint extends StObject {
  
  var parameters: MigrationsListReposForUserEndpoint = js.native
  
  var response: OctokitResponse[MigrationsListReposForUserResponseData] = js.native
}
object ParametersMigrationsListReposForUserEndpoint {
  
  @scala.inline
  def apply(
    parameters: MigrationsListReposForUserEndpoint,
    response: OctokitResponse[MigrationsListReposForUserResponseData]
  ): ParametersMigrationsListReposForUserEndpoint = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParametersMigrationsListReposForUserEndpoint]
  }
  
  @scala.inline
  implicit class ParametersMigrationsListReposForUserEndpointMutableBuilder[Self <: ParametersMigrationsListReposForUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: MigrationsListReposForUserEndpoint): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsListReposForUserResponseData]): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
  }
}
