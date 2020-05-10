package typingsSlinky.awsSdk.efsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateFileSystemRequest extends js.Object {
  /**
    * The ID of the file system that you want to update.
    */
  var FileSystemId: typingsSlinky.awsSdk.efsMod.FileSystemId = js.native
  /**
    * (Optional) The amount of throughput, in MiB/s, that you want to provision for your file system. Valid values are 1-1024. Required if ThroughputMode is changed to provisioned on update. If you're not updating the amount of provisioned throughput for your file system, you don't need to provide this value in your request. 
    */
  var ProvisionedThroughputInMibps: js.UndefOr[typingsSlinky.awsSdk.efsMod.ProvisionedThroughputInMibps] = js.native
  /**
    * (Optional) The throughput mode that you want your file system to use. If you're not updating your throughput mode, you don't need to provide this value in your request. If you are changing the ThroughputMode to provisioned, you must also set a value for ProvisionedThroughputInMibps.
    */
  var ThroughputMode: js.UndefOr[typingsSlinky.awsSdk.efsMod.ThroughputMode] = js.native
}

object UpdateFileSystemRequest {
  @scala.inline
  def apply(FileSystemId: FileSystemId): UpdateFileSystemRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFileSystemRequest]
  }
  @scala.inline
  implicit class UpdateFileSystemRequestOps[Self <: UpdateFileSystemRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFileSystemId(value: FileSystemId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FileSystemId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProvisionedThroughputInMibps(value: ProvisionedThroughputInMibps): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedThroughputInMibps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProvisionedThroughputInMibps: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ProvisionedThroughputInMibps")(js.undefined)
        ret
    }
    @scala.inline
    def withThroughputMode(value: ThroughputMode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThroughputMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThroughputMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ThroughputMode")(js.undefined)
        ret
    }
  }
  
}

