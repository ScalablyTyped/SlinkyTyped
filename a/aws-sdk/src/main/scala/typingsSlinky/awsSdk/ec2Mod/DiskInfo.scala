package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiskInfo extends js.Object {
  /**
    * The number of disks with this configuration.
    */
  var Count: js.UndefOr[DiskCount] = js.native
  /**
    * The size of the disk in GB.
    */
  var SizeInGB: js.UndefOr[DiskSize] = js.native
  /**
    * The type of disk.
    */
  var Type: js.UndefOr[DiskType] = js.native
}

object DiskInfo {
  @scala.inline
  def apply(): DiskInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskInfo]
  }
  @scala.inline
  implicit class DiskInfoOps[Self <: DiskInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCount(value: DiskCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(js.undefined)
        ret
    }
    @scala.inline
    def withSizeInGB(value: DiskSize): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizeInGB")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSizeInGB: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SizeInGB")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: DiskType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(js.undefined)
        ret
    }
  }
  
}

