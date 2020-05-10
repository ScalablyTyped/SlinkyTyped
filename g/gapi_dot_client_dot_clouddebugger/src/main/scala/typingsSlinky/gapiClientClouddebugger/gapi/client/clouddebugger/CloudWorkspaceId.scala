package typingsSlinky.gapiClientClouddebugger.gapi.client.clouddebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudWorkspaceId extends js.Object {
  /**
    * The unique name of the workspace within the repo.  This is the name
    * chosen by the client in the Source API's CreateWorkspace method.
    */
  var name: js.UndefOr[String] = js.native
  /** The ID of the repo containing the workspace. */
  var repoId: js.UndefOr[RepoId] = js.native
}

object CloudWorkspaceId {
  @scala.inline
  def apply(): CloudWorkspaceId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudWorkspaceId]
  }
  @scala.inline
  implicit class CloudWorkspaceIdOps[Self <: CloudWorkspaceId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withRepoId(value: RepoId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repoId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRepoId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("repoId")(js.undefined)
        ret
    }
  }
  
}

