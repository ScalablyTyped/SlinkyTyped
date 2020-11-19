package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.anon.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  installation_id :number,   repository_id :number} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'machine-man'> */
@js.native
trait AppsRemoveRepoFromInstallationEndpoint extends js.Object {
  
  var installation_id: Double = js.native
  
  var mediaType: `1` = js.native
  
  var repository_id: Double = js.native
}
object AppsRemoveRepoFromInstallationEndpoint {
  
  @scala.inline
  def apply(installation_id: Double, mediaType: `1`, repository_id: Double): AppsRemoveRepoFromInstallationEndpoint = {
    val __obj = js.Dynamic.literal(installation_id = installation_id.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], repository_id = repository_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsRemoveRepoFromInstallationEndpoint]
  }
  
  @scala.inline
  implicit class AppsRemoveRepoFromInstallationEndpointOps[Self <: AppsRemoveRepoFromInstallationEndpoint] (val x: Self) extends AnyVal {
    
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
    def setInstallation_id(value: Double): Self = this.set("installation_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaType(value: `1`): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepository_id(value: Double): Self = this.set("repository_id", value.asInstanceOf[js.Any])
  }
}
