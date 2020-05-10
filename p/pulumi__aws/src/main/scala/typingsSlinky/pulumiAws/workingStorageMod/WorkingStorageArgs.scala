package typingsSlinky.pulumiAws.workingStorageMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkingStorageArgs extends js.Object {
  /**
    * Local disk identifier. For example, `pci-0000:03:00.0-scsi-0:0:0:0`.
    */
  val diskId: Input[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the gateway.
    */
  val gatewayArn: Input[String] = js.native
}

object WorkingStorageArgs {
  @scala.inline
  def apply(diskId: Input[String], gatewayArn: Input[String]): WorkingStorageArgs = {
    val __obj = js.Dynamic.literal(diskId = diskId.asInstanceOf[js.Any], gatewayArn = gatewayArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkingStorageArgs]
  }
  @scala.inline
  implicit class WorkingStorageArgsOps[Self <: WorkingStorageArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiskId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGatewayArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatewayArn")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

