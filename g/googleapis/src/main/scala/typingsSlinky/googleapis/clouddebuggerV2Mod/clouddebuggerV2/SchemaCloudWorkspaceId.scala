package typingsSlinky.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A CloudWorkspaceId is a unique identifier for a cloud workspace. A cloud
  * workspace is a place associated with a repo where modified files can be
  * stored before they are committed.
  */
@js.native
trait SchemaCloudWorkspaceId extends js.Object {
  /**
    * The unique name of the workspace within the repo.  This is the name
    * chosen by the client in the Source API&#39;s CreateWorkspace method.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The ID of the repo containing the workspace.
    */
  var repoId: js.UndefOr[SchemaRepoId] = js.native
}

object SchemaCloudWorkspaceId {
  @scala.inline
  def apply(): SchemaCloudWorkspaceId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudWorkspaceId]
  }
  @scala.inline
  implicit class SchemaCloudWorkspaceIdOps[Self <: SchemaCloudWorkspaceId] (val x: Self) extends AnyVal {
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
    def withRepoId(value: SchemaRepoId): Self = {
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

