package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteClusterSnapshotResult extends js.Object {
  var Snapshot: js.UndefOr[typingsSlinky.awsSdk.redshiftMod.Snapshot] = js.native
}

object DeleteClusterSnapshotResult {
  @scala.inline
  def apply(): DeleteClusterSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteClusterSnapshotResult]
  }
  @scala.inline
  implicit class DeleteClusterSnapshotResultOps[Self <: DeleteClusterSnapshotResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSnapshot(value: Snapshot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Snapshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Snapshot")(js.undefined)
        ret
    }
  }
  
}

