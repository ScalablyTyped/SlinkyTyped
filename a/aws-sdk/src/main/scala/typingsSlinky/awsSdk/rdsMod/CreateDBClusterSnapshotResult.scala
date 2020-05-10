package typingsSlinky.awsSdk.rdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDBClusterSnapshotResult extends js.Object {
  var DBClusterSnapshot: js.UndefOr[typingsSlinky.awsSdk.rdsMod.DBClusterSnapshot] = js.native
}

object CreateDBClusterSnapshotResult {
  @scala.inline
  def apply(): CreateDBClusterSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDBClusterSnapshotResult]
  }
  @scala.inline
  implicit class CreateDBClusterSnapshotResultOps[Self <: CreateDBClusterSnapshotResult] (val x: Self) extends AnyVal {
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

