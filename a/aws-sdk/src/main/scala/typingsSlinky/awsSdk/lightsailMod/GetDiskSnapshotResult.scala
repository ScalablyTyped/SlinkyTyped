package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDiskSnapshotResult extends js.Object {
  /**
    * An object containing information about the disk snapshot.
    */
  var diskSnapshot: js.UndefOr[DiskSnapshot] = js.native
}

object GetDiskSnapshotResult {
  @scala.inline
  def apply(): GetDiskSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDiskSnapshotResult]
  }
  @scala.inline
  implicit class GetDiskSnapshotResultOps[Self <: GetDiskSnapshotResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiskSnapshot(value: DiskSnapshot): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskSnapshot")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiskSnapshot: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskSnapshot")(js.undefined)
        ret
    }
  }
  
}

