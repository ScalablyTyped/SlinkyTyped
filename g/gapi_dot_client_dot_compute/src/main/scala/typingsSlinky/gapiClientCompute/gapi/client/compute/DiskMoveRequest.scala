package typingsSlinky.gapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiskMoveRequest extends js.Object {
  /**
    * The URL of the destination zone to move the disk. This can be a full or partial URL. For example, the following are all valid URLs to a zone:
    * - https://www.googleapis.com/compute/v1/projects/project/zones/zone
    * - projects/project/zones/zone
    * - zones/zone
    */
  var destinationZone: js.UndefOr[String] = js.native
  /**
    * The URL of the target disk to move. This can be a full or partial URL. For example, the following are all valid URLs to a disk:
    * - https://www.googleapis.com/compute/v1/projects/project/zones/zone/disks/disk
    * - projects/project/zones/zone/disks/disk
    * - zones/zone/disks/disk
    */
  var targetDisk: js.UndefOr[String] = js.native
}

object DiskMoveRequest {
  @scala.inline
  def apply(): DiskMoveRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskMoveRequest]
  }
  @scala.inline
  implicit class DiskMoveRequestOps[Self <: DiskMoveRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinationZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDestinationZone: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinationZone")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetDisk(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetDisk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetDisk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetDisk")(js.undefined)
        ret
    }
  }
  
}

