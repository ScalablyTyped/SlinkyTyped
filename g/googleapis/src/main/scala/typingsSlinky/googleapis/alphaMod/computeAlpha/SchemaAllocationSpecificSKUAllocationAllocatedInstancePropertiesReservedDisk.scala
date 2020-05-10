package typingsSlinky.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaAllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk extends js.Object {
  /**
    * Specifies the size of the disk in base-2 GB.
    */
  var diskSizeGb: js.UndefOr[String] = js.native
  /**
    * Specifies the disk interface to use for attaching this disk, which is
    * either SCSI or NVME. The default is SCSI. For performance characteristics
    * of SCSI over NVMe, see Local SSD performance.
    */
  var interface: js.UndefOr[String] = js.native
}

object SchemaAllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk {
  @scala.inline
  def apply(): SchemaAllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk]
  }
  @scala.inline
  implicit class SchemaAllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDiskOps[Self <: SchemaAllocationSpecificSKUAllocationAllocatedInstancePropertiesReservedDisk] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiskSizeGb(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskSizeGb")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiskSizeGb: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskSizeGb")(js.undefined)
        ret
    }
    @scala.inline
    def withInterface(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInterface: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("interface")(js.undefined)
        ret
    }
  }
  
}

