package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.anon.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  project_id :number,   username :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'inertia'> */
@js.native
trait ProjectsGetPermissionForUserEndpoint extends js.Object {
  
  var mediaType: `8` = js.native
  
  var project_id: Double = js.native
  
  var username: String = js.native
}
object ProjectsGetPermissionForUserEndpoint {
  
  @scala.inline
  def apply(mediaType: `8`, project_id: Double, username: String): ProjectsGetPermissionForUserEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsGetPermissionForUserEndpoint]
  }
  
  @scala.inline
  implicit class ProjectsGetPermissionForUserEndpointOps[Self <: ProjectsGetPermissionForUserEndpoint] (val x: Self) extends AnyVal {
    
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
    def setMediaType(value: `8`): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProject_id(value: Double): Self = this.set("project_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
  }
}
