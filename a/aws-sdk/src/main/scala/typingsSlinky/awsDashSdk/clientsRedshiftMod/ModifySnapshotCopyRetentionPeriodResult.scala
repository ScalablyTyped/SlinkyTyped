package typingsSlinky.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifySnapshotCopyRetentionPeriodResult extends js.Object {
  var Cluster: js.UndefOr[typingsSlinky.awsDashSdk.clientsRedshiftMod.Cluster] = js.native
}

object ModifySnapshotCopyRetentionPeriodResult {
  @scala.inline
  def apply(Cluster: Cluster = null): ModifySnapshotCopyRetentionPeriodResult = {
    val __obj = js.Dynamic.literal()
    if (Cluster != null) __obj.updateDynamic("Cluster")(Cluster.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifySnapshotCopyRetentionPeriodResult]
  }
}

