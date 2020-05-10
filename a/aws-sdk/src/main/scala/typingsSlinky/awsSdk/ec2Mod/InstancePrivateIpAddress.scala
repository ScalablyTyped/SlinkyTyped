package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstancePrivateIpAddress extends js.Object {
  /**
    * The association information for an Elastic IP address for the network interface.
    */
  var Association: js.UndefOr[InstanceNetworkInterfaceAssociation] = js.native
  /**
    * Indicates whether this IPv4 address is the primary private IP address of the network interface.
    */
  var Primary: js.UndefOr[Boolean] = js.native
  /**
    * The private IPv4 DNS name.
    */
  var PrivateDnsName: js.UndefOr[String] = js.native
  /**
    * The private IPv4 address of the network interface.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.native
}

object InstancePrivateIpAddress {
  @scala.inline
  def apply(): InstancePrivateIpAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstancePrivateIpAddress]
  }
  @scala.inline
  implicit class InstancePrivateIpAddressOps[Self <: InstancePrivateIpAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAssociation(value: InstanceNetworkInterfaceAssociation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Association")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Association")(js.undefined)
        ret
    }
    @scala.inline
    def withPrimary(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Primary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrimary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Primary")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateDnsName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateDnsName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateDnsName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateDnsName")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateIpAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateIpAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateIpAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateIpAddress")(js.undefined)
        ret
    }
  }
  
}

