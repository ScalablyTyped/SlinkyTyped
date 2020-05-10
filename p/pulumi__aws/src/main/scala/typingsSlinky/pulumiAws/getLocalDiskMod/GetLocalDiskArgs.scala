package typingsSlinky.pulumiAws.getLocalDiskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLocalDiskArgs extends js.Object {
  /**
    * The device node of the local disk to retrieve. For example, `/dev/sdb`.
    */
  val diskNode: js.UndefOr[String] = js.native
  /**
    * The device path of the local disk to retrieve. For example, `/dev/xvdb` or `/dev/nvme1n1`.
    */
  val diskPath: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the gateway.
    */
  val gatewayArn: String = js.native
}

object GetLocalDiskArgs {
  @scala.inline
  def apply(gatewayArn: String): GetLocalDiskArgs = {
    val __obj = js.Dynamic.literal(gatewayArn = gatewayArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLocalDiskArgs]
  }
  @scala.inline
  implicit class GetLocalDiskArgsOps[Self <: GetLocalDiskArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGatewayArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatewayArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDiskNode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskNode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiskNode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskNode")(js.undefined)
        ret
    }
    @scala.inline
    def withDiskPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskPath")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDiskPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskPath")(js.undefined)
        ret
    }
  }
  
}

