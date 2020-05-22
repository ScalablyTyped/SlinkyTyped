package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CopyClusterSnapshotResult extends js.Object {
  var Snapshot: js.UndefOr[typingsSlinky.awsSdk.redshiftMod.Snapshot] = js.native
}

object CopyClusterSnapshotResult {
  @scala.inline
  def apply(Snapshot: Snapshot = null): CopyClusterSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (Snapshot != null) __obj.updateDynamic("Snapshot")(Snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyClusterSnapshotResult]
  }
}

