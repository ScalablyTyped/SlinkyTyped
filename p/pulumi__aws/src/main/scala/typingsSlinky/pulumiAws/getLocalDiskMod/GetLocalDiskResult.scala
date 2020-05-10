package typingsSlinky.pulumiAws.getLocalDiskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLocalDiskResult extends js.Object {
  /**
    * The disk identifier. e.g. `pci-0000:03:00.0-scsi-0:0:0:0`
    */
  val diskId: String = js.native
  val diskNode: js.UndefOr[String] = js.native
  val diskPath: js.UndefOr[String] = js.native
  val gatewayArn: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
}

object GetLocalDiskResult {
  @scala.inline
  def apply(diskId: String, gatewayArn: String, id: String): GetLocalDiskResult = {
    val __obj = js.Dynamic.literal(diskId = diskId.asInstanceOf[js.Any], gatewayArn = gatewayArn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLocalDiskResult]
  }
  @scala.inline
  implicit class GetLocalDiskResultOps[Self <: GetLocalDiskResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDiskId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("diskId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGatewayArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("gatewayArn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
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

