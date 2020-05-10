package typingsSlinky.pulumiAws.networkInterfaceSecurityGroupAttachmentMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkInterfaceSecurityGroupAttachmentState extends js.Object {
  /**
    * The ID of the network interface to attach to.
    */
  val networkInterfaceId: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the security group.
    */
  val securityGroupId: js.UndefOr[Input[String]] = js.native
}

object NetworkInterfaceSecurityGroupAttachmentState {
  @scala.inline
  def apply(): NetworkInterfaceSecurityGroupAttachmentState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInterfaceSecurityGroupAttachmentState]
  }
  @scala.inline
  implicit class NetworkInterfaceSecurityGroupAttachmentStateOps[Self <: NetworkInterfaceSecurityGroupAttachmentState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNetworkInterfaceId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInterfaceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkInterfaceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInterfaceId")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityGroupId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroupId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupId")(js.undefined)
        ret
    }
  }
  
}

