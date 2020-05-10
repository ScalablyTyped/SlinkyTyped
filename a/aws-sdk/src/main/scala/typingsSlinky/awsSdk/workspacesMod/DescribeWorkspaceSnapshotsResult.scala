package typingsSlinky.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeWorkspaceSnapshotsResult extends js.Object {
  /**
    * Information about the snapshots that can be used to rebuild a WorkSpace. These snapshots include the user volume.
    */
  var RebuildSnapshots: js.UndefOr[SnapshotList] = js.native
  /**
    * Information about the snapshots that can be used to restore a WorkSpace. These snapshots include both the root volume and the user volume.
    */
  var RestoreSnapshots: js.UndefOr[SnapshotList] = js.native
}

object DescribeWorkspaceSnapshotsResult {
  @scala.inline
  def apply(): DescribeWorkspaceSnapshotsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWorkspaceSnapshotsResult]
  }
  @scala.inline
  implicit class DescribeWorkspaceSnapshotsResultOps[Self <: DescribeWorkspaceSnapshotsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRebuildSnapshots(value: SnapshotList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RebuildSnapshots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRebuildSnapshots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RebuildSnapshots")(js.undefined)
        ret
    }
    @scala.inline
    def withRestoreSnapshots(value: SnapshotList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestoreSnapshots")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRestoreSnapshots: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RestoreSnapshots")(js.undefined)
        ret
    }
  }
  
}

