package typingsSlinky.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDiskSnapshotRequest extends js.Object {
  /**
    * The name of the disk snapshot you want to delete (e.g., my-disk-snapshot).
    */
  var diskSnapshotName: ResourceName = js.native
}

object DeleteDiskSnapshotRequest {
  @scala.inline
  def apply(diskSnapshotName: ResourceName): DeleteDiskSnapshotRequest = {
    val __obj = js.Dynamic.literal(diskSnapshotName = diskSnapshotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDiskSnapshotRequest]
  }
  @scala.inline
  implicit class DeleteDiskSnapshotRequestOps[Self <: DeleteDiskSnapshotRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiskSnapshotName(value: ResourceName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskSnapshotName")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

