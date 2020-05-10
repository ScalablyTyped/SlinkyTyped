package typingsSlinky.awsSdk.storagegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUploadBufferOutput extends js.Object {
  /**
    * An array of the gateway's local disk IDs that are configured as working storage. Each local disk ID is specified as a string (minimum length of 1 and maximum length of 300). If no local disks are configured as working storage, then the DiskIds array is empty.
    */
  var DiskIds: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.DiskIds] = js.native
  var GatewayARN: js.UndefOr[typingsSlinky.awsSdk.storagegatewayMod.GatewayARN] = js.native
  /**
    * The total number of bytes allocated in the gateway's as upload buffer.
    */
  var UploadBufferAllocatedInBytes: js.UndefOr[long] = js.native
  /**
    * The total number of bytes being used in the gateway's upload buffer.
    */
  var UploadBufferUsedInBytes: js.UndefOr[long] = js.native
}

object DescribeUploadBufferOutput {
  @scala.inline
  def apply(): DescribeUploadBufferOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUploadBufferOutput]
  }
  @scala.inline
  implicit class DescribeUploadBufferOutputOps[Self <: DescribeUploadBufferOutput] (val x: Self) extends AnyVal {
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
    def withUploadBufferAllocatedInBytes(value: long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadBufferAllocatedInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadBufferAllocatedInBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadBufferAllocatedInBytes")(js.undefined)
        ret
    }
    @scala.inline
    def withUploadBufferUsedInBytes(value: long): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadBufferUsedInBytes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUploadBufferUsedInBytes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("UploadBufferUsedInBytes")(js.undefined)
        ret
    }
  }
  
}

