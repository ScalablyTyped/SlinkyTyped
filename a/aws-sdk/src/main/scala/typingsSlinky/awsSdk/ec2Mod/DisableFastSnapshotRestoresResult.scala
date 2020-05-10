package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisableFastSnapshotRestoresResult extends js.Object {
  /**
    * Information about the snapshots for which fast snapshot restores were successfully disabled.
    */
  var Successful: js.UndefOr[DisableFastSnapshotRestoreSuccessSet] = js.native
  /**
    * Information about the snapshots for which fast snapshot restores could not be disabled.
    */
  var Unsuccessful: js.UndefOr[DisableFastSnapshotRestoreErrorSet] = js.native
}

object DisableFastSnapshotRestoresResult {
  @scala.inline
  def apply(): DisableFastSnapshotRestoresResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableFastSnapshotRestoresResult]
  }
  @scala.inline
  implicit class DisableFastSnapshotRestoresResultOps[Self <: DisableFastSnapshotRestoresResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withSuccessful(value: DisableFastSnapshotRestoreSuccessSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Successful")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSuccessful: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Successful")(js.undefined)
        ret
    }
    @scala.inline
    def withUnsuccessful(value: DisableFastSnapshotRestoreErrorSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unsuccessful")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUnsuccessful: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Unsuccessful")(js.undefined)
        ret
    }
  }
  
}

