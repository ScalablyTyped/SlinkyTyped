package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTransitGatewayVpcAttachmentRequestOptions extends js.Object {
  /**
    * Enable or disable DNS support. The default is enable.
    */
  var DnsSupport: js.UndefOr[DnsSupportValue] = js.native
  /**
    * Enable or disable IPv6 support. The default is enable.
    */
  var Ipv6Support: js.UndefOr[Ipv6SupportValue] = js.native
}

object CreateTransitGatewayVpcAttachmentRequestOptions {
  @scala.inline
  def apply(): CreateTransitGatewayVpcAttachmentRequestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTransitGatewayVpcAttachmentRequestOptions]
  }
  @scala.inline
  implicit class CreateTransitGatewayVpcAttachmentRequestOptionsOps[Self <: CreateTransitGatewayVpcAttachmentRequestOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDnsSupport(value: DnsSupportValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DnsSupport")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnsSupport: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DnsSupport")(js.undefined)
        ret
    }
    @scala.inline
    def withIpv6Support(value: Ipv6SupportValue): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ipv6Support")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpv6Support: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Ipv6Support")(js.undefined)
        ret
    }
  }
  
}

