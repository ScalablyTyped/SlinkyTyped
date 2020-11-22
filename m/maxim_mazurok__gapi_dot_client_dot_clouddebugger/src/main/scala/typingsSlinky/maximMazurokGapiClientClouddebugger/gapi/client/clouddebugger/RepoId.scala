package typingsSlinky.maximMazurokGapiClientClouddebugger.gapi.client.clouddebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RepoId extends js.Object {
  
  /** A combination of a project ID and a repo name. */
  var projectRepoId: js.UndefOr[ProjectRepoId] = js.native
  
  /** A server-assigned, globally unique identifier. */
  var uid: js.UndefOr[String] = js.native
}
object RepoId {
  
  @scala.inline
  def apply(): RepoId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepoId]
  }
  
  @scala.inline
  implicit class RepoIdOps[Self <: RepoId] (val x: Self) extends AnyVal {
    
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
    def setProjectRepoId(value: ProjectRepoId): Self = this.set("projectRepoId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectRepoId: Self = this.set("projectRepoId", js.undefined)
    
    @scala.inline
    def setUid(value: String): Self = this.set("uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUid: Self = this.set("uid", js.undefined)
  }
}
