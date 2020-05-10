package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachNetworkInterfaceResult extends js.Object {
  /**
    * The ID of the network interface attachment.
    */
  var AttachmentId: js.UndefOr[String] = js.native
}

object AttachNetworkInterfaceResult {
  @scala.inline
  def apply(): AttachNetworkInterfaceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachNetworkInterfaceResult]
  }
  @scala.inline
  implicit class AttachNetworkInterfaceResultOps[Self <: AttachNetworkInterfaceResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachmentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachmentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AttachmentId")(js.undefined)
        ret
    }
  }
  
}

