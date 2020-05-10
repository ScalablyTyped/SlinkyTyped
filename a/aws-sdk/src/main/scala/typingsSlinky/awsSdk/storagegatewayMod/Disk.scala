package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Disk extends js.Object {
  /**
    * The iSCSI qualified name (IQN) that is defined for a disk. This field is not included in the response if the local disk is not defined as an iSCSI target. The format of this field is targetIqn::LUNNumber::region-volumeId. 
    */
  var DiskAllocationResource: js.UndefOr[String] = js.native
  var DiskAllocationType: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.DiskAllocationType] = js.native
  var DiskAttributeList: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.DiskAttributeList] = js.native
  /**
    * The unique device ID or other distinguishing data that identifies a local disk.
    */
  var DiskId: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.DiskId] = js.native
  /**
    * The device node of a local disk as assigned by the virtualization environment.
    */
  var DiskNode: js.UndefOr[String] = js.native
  /**
    * The path of a local disk in the gateway virtual machine (VM).
    */
  var DiskPath: js.UndefOr[String] = js.native
  /**
    * The local disk size in bytes.
    */
  var DiskSizeInBytes: js.UndefOr[long] = js.native
  /**
    * A value that represents the status of a local disk.
    */
  var DiskStatus: js.UndefOr[String] = js.native
}

object Disk {
  @scala.inline
  def apply(): Disk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Disk]
  }
  @scala.inline
  implicit class DiskOps[Self <: Disk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiskAllocationResource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiskAllocationResource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiskAllocationResource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiskAllocationResource")(js.undefined)
        ret
    }
    @scala.inline
    def withDiskAllocationType(value: DiskAllocationType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiskAllocationType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiskAllocationType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiskAllocationType")(js.undefined)
        ret
    }
    @scala.inline
    def withDiskAttributeList(value: DiskAttributeList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiskAttributeList")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiskAttributeList: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiskAttributeList")(js.undefined)
        ret
    }
    @scala.inline
    def withDiskId(value: DiskId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiskId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiskId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiskId")(js.undefined)
        ret
    }
    @scala.inline
    def withDiskNode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiskNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiskNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiskNode")(js.undefined)
        ret
    }
    @scala.inline
    def withDiskPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiskPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiskPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiskPath")(js.undefined)
        ret
    }
    @scala.inline
    def withDiskSizeInBytes(value: long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiskSizeInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiskSizeInBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiskSizeInBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withDiskStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiskStatus")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiskStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiskStatus")(js.undefined)
        ret
    }
  }
  
}

