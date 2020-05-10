package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeWorkingStorageOutput extends js.Object {
  /**
    * An array of the gateway's local disk IDs that are configured as working storage. Each local disk ID is specified as a string (minimum length of 1 and maximum length of 300). If no local disks are configured as working storage, then the DiskIds array is empty.
    */
  var DiskIds: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.DiskIds] = js.native
  var GatewayARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.GatewayARN] = js.native
  /**
    * The total working storage in bytes allocated for the gateway. If no working storage is configured for the gateway, this field returns 0.
    */
  var WorkingStorageAllocatedInBytes: js.UndefOr[long] = js.native
  /**
    * The total working storage in bytes in use by the gateway. If no working storage is configured for the gateway, this field returns 0.
    */
  var WorkingStorageUsedInBytes: js.UndefOr[long] = js.native
}

object DescribeWorkingStorageOutput {
  @scala.inline
  def apply(): DescribeWorkingStorageOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWorkingStorageOutput]
  }
  @scala.inline
  implicit class DescribeWorkingStorageOutputOps[Self <: DescribeWorkingStorageOutput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiskIds(value: DiskIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiskIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiskIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DiskIds")(js.undefined)
        ret
    }
    @scala.inline
    def withGatewayARN(value: GatewayARN): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayARN")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGatewayARN: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GatewayARN")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkingStorageAllocatedInBytes(value: long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkingStorageAllocatedInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkingStorageAllocatedInBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkingStorageAllocatedInBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkingStorageUsedInBytes(value: long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkingStorageUsedInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkingStorageUsedInBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkingStorageUsedInBytes")(js.undefined)
        ret
    }
  }
  
}

