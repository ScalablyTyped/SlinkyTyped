package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateClusterSnapshotResult extends js.Object {
  var Snapshot: js.UndefOr[typingsSlinky.awsSdk.redshiftMod.Snapshot] = js.native
}

object CreateClusterSnapshotResult {
  @scala.inline
  def apply(): CreateClusterSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateClusterSnapshotResult]
  }
  @scala.inline
  implicit class CreateClusterSnapshotResultOps[Self <: CreateClusterSnapshotResult] (val x: Self) extends AnyVal {
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

