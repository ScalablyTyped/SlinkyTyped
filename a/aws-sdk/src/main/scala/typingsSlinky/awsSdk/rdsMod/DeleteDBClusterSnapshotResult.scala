package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDBClusterSnapshotResult extends js.Object {
  var DBClusterSnapshot: js.UndefOr[typingsSlinky.awsSdk.rdsMod.DBClusterSnapshot] = js.native
}

object DeleteDBClusterSnapshotResult {
  @scala.inline
  def apply(): DeleteDBClusterSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDBClusterSnapshotResult]
  }
  @scala.inline
  implicit class DeleteDBClusterSnapshotResultOps[Self <: DeleteDBClusterSnapshotResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDBClusterSnapshot(value: DBClusterSnapshot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterSnapshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDBClusterSnapshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DBClusterSnapshot")(js.undefined)
        ret
    }
  }
  
}

