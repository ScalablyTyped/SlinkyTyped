package typingsSlinky.googleapis.clouddebuggerV2Mod.clouddebuggerV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A CloudWorkspaceSourceContext denotes a workspace at a particular snapshot.
  */
@js.native
trait SchemaCloudWorkspaceSourceContext extends js.Object {
  /**
    * The ID of the snapshot. An empty snapshot_id refers to the most recent
    * snapshot.
    */
  var snapshotId: js.UndefOr[String] = js.native
  /**
    * The ID of the workspace.
    */
  var workspaceId: js.UndefOr[SchemaCloudWorkspaceId] = js.native
}

object SchemaCloudWorkspaceSourceContext {
  @scala.inline
  def apply(): SchemaCloudWorkspaceSourceContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudWorkspaceSourceContext]
  }
  @scala.inline
  implicit class SchemaCloudWorkspaceSourceContextOps[Self <: SchemaCloudWorkspaceSourceContext] (val x: Self) extends AnyVal {
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
    def withWorkspaceId(value: SchemaCloudWorkspaceId): Self = {
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

