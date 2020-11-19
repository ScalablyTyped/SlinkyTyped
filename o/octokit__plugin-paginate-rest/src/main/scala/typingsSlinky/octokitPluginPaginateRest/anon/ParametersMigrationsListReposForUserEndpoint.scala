package typingsSlinky.octokitPluginPaginateRest.anon

import typingsSlinky.octokitTypes.endpointsMod.MigrationsListReposForUserEndpoint
import typingsSlinky.octokitTypes.endpointsMod.MigrationsListReposForUserResponseData
import typingsSlinky.octokitTypes.octokitResponseMod.OctokitResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParametersMigrationsListReposForUserEndpoint extends js.Object {
  
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
  implicit class ParametersMigrationsListReposForUserEndpointOps[Self <: ParametersMigrationsListReposForUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParameters(value: MigrationsListReposForUserEndpoint): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponse(value: OctokitResponse[MigrationsListReposForUserResponseData]): Self = this.set("response", value.asInstanceOf[js.Any])
  }
}
