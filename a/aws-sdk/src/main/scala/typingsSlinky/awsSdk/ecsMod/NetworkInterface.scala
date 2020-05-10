package typingsSlinky.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkInterface extends js.Object {
  /**
    * The attachment ID for the network interface.
    */
  var attachmentId: js.UndefOr[String] = js.native
  /**
    * The private IPv6 address for the network interface.
    */
  var ipv6Address: js.UndefOr[String] = js.native
  /**
    * The private IPv4 address for the network interface.
    */
  var privateIpv4Address: js.UndefOr[String] = js.native
}

object NetworkInterface {
  @scala.inline
  def apply(): NetworkInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInterface]
  }
  @scala.inline
  implicit class NetworkInterfaceOps[Self <: NetworkInterface] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttachmentId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttachmentId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachmentId")(js.undefined)
        ret
    }
    @scala.inline
    def withIpv6Address(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6Address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpv6Address: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6Address")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateIpv4Address(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateIpv4Address")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateIpv4Address: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateIpv4Address")(js.undefined)
        ret
    }
  }
  
}

