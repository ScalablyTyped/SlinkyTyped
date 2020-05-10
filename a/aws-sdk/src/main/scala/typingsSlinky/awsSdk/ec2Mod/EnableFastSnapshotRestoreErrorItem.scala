package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableFastSnapshotRestoreErrorItem extends js.Object {
  /**
    * The errors.
    */
  var FastSnapshotRestoreStateErrors: js.UndefOr[EnableFastSnapshotRestoreStateErrorSet] = js.native
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: js.UndefOr[String] = js.native
}

object EnableFastSnapshotRestoreErrorItem {
  @scala.inline
  def apply(): EnableFastSnapshotRestoreErrorItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableFastSnapshotRestoreErrorItem]
  }
  @scala.inline
  implicit class EnableFastSnapshotRestoreErrorItemOps[Self <: EnableFastSnapshotRestoreErrorItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFastSnapshotRestoreStateErrors(value: EnableFastSnapshotRestoreStateErrorSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FastSnapshotRestoreStateErrors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFastSnapshotRestoreStateErrors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FastSnapshotRestoreStateErrors")(js.undefined)
        ret
    }
    @scala.inline
    def withSnapshotId(value: String): Self = {
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

