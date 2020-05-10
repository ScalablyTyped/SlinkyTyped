package typingsSlinky.pulumiAws.uploadBufferMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadBufferState extends js.Object {
  /**
    * Local disk identifier. For example, `pci-0000:03:00.0-scsi-0:0:0:0`.
    */
  val diskId: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon Resource Name (ARN) of the gateway.
    */
  val gatewayArn: js.UndefOr[Input[String]] = js.native
}

object UploadBufferState {
  @scala.inline
  def apply(): UploadBufferState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UploadBufferState]
  }
  @scala.inline
  implicit class UploadBufferStateOps[Self <: UploadBufferState] (val x: Self) extends AnyVal {
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
    def withoutDiskId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskId")(js.undefined)
        ret
    }
    @scala.inline
    def withGatewayArn(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatewayArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGatewayArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatewayArn")(js.undefined)
        ret
    }
  }
  
}

