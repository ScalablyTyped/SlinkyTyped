package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceNetworkInterfaceAssociation extends js.Object {
  /**
    * The ID of the owner of the Elastic IP address.
    */
  var IpOwnerId: js.UndefOr[String] = js.native
  /**
    * The public DNS name.
    */
  var PublicDnsName: js.UndefOr[String] = js.native
  /**
    * The public IP address or Elastic IP address bound to the network interface.
    */
  var PublicIp: js.UndefOr[String] = js.native
}

object InstanceNetworkInterfaceAssociation {
  @scala.inline
  def apply(): InstanceNetworkInterfaceAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceNetworkInterfaceAssociation]
  }
  @scala.inline
  implicit class InstanceNetworkInterfaceAssociationOps[Self <: InstanceNetworkInterfaceAssociation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIpOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpOwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpOwnerId")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicDnsName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicDnsName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicDnsName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicDnsName")(js.undefined)
        ret
    }
    @scala.inline
    def withPublicIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicIp")(js.undefined)
        ret
    }
  }
  
}

