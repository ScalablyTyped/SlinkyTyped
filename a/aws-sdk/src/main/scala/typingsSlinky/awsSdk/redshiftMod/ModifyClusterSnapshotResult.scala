package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyClusterSnapshotResult extends js.Object {
  var Snapshot: js.UndefOr[typingsSlinky.awsSdk.redshiftMod.Snapshot] = js.native
}

object ModifyClusterSnapshotResult {
  @scala.inline
  def apply(Snapshot: Snapshot = null): ModifyClusterSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (Snapshot != null) __obj.updateDynamic("Snapshot")(Snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyClusterSnapshotResult]
  }
}

