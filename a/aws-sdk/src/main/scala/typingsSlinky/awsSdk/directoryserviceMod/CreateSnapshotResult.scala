package typingsSlinky.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSnapshotResult extends js.Object {
  /**
    * The identifier of the snapshot that was created.
    */
  var SnapshotId: js.UndefOr[typingsSlinky.awsSdk.directoryserviceMod.SnapshotId] = js.native
}

object CreateSnapshotResult {
  @scala.inline
  def apply(): CreateSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSnapshotResult]
  }
  @scala.inline
  implicit class CreateSnapshotResultOps[Self <: CreateSnapshotResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSnapshotId(value: SnapshotId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSnapshotId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SnapshotId")(js.undefined)
        ret
    }
  }
  
}

