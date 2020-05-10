package typingsSlinky.gapiClientClouddebugger.gapi.client.clouddebugger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudWorkspaceSourceContext extends js.Object {
  /**
    * The ID of the snapshot.
    * An empty snapshot_id refers to the most recent snapshot.
    */
  var snapshotId: js.UndefOr[String] = js.native
  /** The ID of the workspace. */
  var workspaceId: js.UndefOr[CloudWorkspaceId] = js.native
}

object CloudWorkspaceSourceContext {
  @scala.inline
  def apply(): CloudWorkspaceSourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudWorkspaceSourceContext]
  }
  @scala.inline
  implicit class CloudWorkspaceSourceContextOps[Self <: CloudWorkspaceSourceContext] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSnapshotId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("snapshotId")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkspaceId(value: CloudWorkspaceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspaceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkspaceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspaceId")(js.undefined)
        ret
    }
  }
  
}

