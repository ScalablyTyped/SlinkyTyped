package typingsSlinky.awsSdk.elasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSnapshotResult extends js.Object {
  var Snapshot: js.UndefOr[typingsSlinky.awsSdk.elasticacheMod.Snapshot] = js.native
}

object CreateSnapshotResult {
  @scala.inline
  def apply(Snapshot: Snapshot = null): CreateSnapshotResult = {
    val __obj = js.Dynamic.literal()
    if (Snapshot != null) __obj.updateDynamic("Snapshot")(Snapshot.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSnapshotResult]
  }
}

