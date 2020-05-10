package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceStorageInfo extends js.Object {
  /**
    * Array describing the disks that are available for the instance type.
    */
  var Disks: js.UndefOr[DiskInfoList] = js.native
  /**
    * The total size of the disks, in GB.
    */
  var TotalSizeInGB: js.UndefOr[DiskSize] = js.native
}

object InstanceStorageInfo {
  @scala.inline
  def apply(): InstanceStorageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceStorageInfo]
  }
  @scala.inline
  implicit class InstanceStorageInfoOps[Self <: InstanceStorageInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDisks(value: DiskInfoList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Disks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Disks")(js.undefined)
        ret
    }
    @scala.inline
    def withTotalSizeInGB(value: DiskSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalSizeInGB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTotalSizeInGB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TotalSizeInGB")(js.undefined)
        ret
    }
  }
  
}

