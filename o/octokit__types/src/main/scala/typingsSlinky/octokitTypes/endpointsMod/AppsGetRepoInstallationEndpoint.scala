package typingsSlinky.octokitTypes.endpointsMod

import typingsSlinky.octokitTypes.anon.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  owner :string,   repo :string} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'machine-man'> */
@js.native
trait AppsGetRepoInstallationEndpoint extends js.Object {
  
  var mediaType: `1` = js.native
  
  var owner: String = js.native
  
  var repo: String = js.native
}
object AppsGetRepoInstallationEndpoint {
  
  @scala.inline
  def apply(mediaType: `1`, owner: String, repo: String): AppsGetRepoInstallationEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppsGetRepoInstallationEndpoint]
  }
  
  @scala.inline
  implicit class AppsGetRepoInstallationEndpointOps[Self <: AppsGetRepoInstallationEndpoint] (val x: Self) extends AnyVal {
    
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
    def setMediaType(value: `1`): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = this.set("repo", value.asInstanceOf[js.Any])
  }
}
