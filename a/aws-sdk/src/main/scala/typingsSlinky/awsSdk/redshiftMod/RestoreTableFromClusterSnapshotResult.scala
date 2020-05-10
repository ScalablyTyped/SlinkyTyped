package typingsSlinky.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreTableFromClusterSnapshotResult extends js.Object {
  var TableRestoreStatus: js.UndefOr[typingsSlinky.awsSdk.redshiftMod.TableRestoreStatus] = js.native
}

object RestoreTableFromClusterSnapshotResult {
  @scala.inline
  def apply(): RestoreTableFromClusterSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreTableFromClusterSnapshotResult]
  }
  @scala.inline
  implicit class RestoreTableFromClusterSnapshotResultOps[Self <: RestoreTableFromClusterSnapshotResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTableRestoreStatus(value: TableRestoreStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableRestoreStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTableRestoreStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TableRestoreStatus")(js.undefined)
        ret
    }
  }
  
}

