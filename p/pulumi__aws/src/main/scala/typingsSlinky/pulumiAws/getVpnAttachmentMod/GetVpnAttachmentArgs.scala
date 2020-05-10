package typingsSlinky.pulumiAws.getVpnAttachmentMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpnAttachmentArgs extends js.Object {
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Identifier of the EC2 Transit Gateway.
    */
  val transitGatewayId: String = js.native
  /**
    * Identifier of the EC2 VPN Connection.
    */
  val vpnConnectionId: String = js.native
}

object GetVpnAttachmentArgs {
  @scala.inline
  def apply(transitGatewayId: String, vpnConnectionId: String): GetVpnAttachmentArgs = {
    val __obj = js.Dynamic.literal(transitGatewayId = transitGatewayId.asInstanceOf[js.Any], vpnConnectionId = vpnConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpnAttachmentArgs]
  }
  @scala.inline
  implicit class GetVpnAttachmentArgsOps[Self <: GetVpnAttachmentArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTransitGatewayId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transitGatewayId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVpnConnectionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpnConnectionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
  }
  
}

