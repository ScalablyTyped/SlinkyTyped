package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkInterfaceAssociation extends js.Object {
  /**
    * The allocation ID.
    */
  var AllocationId: js.UndefOr[String] = js.native
  /**
    * The association ID.
    */
  var AssociationId: js.UndefOr[String] = js.native
  /**
    * The ID of the Elastic IP address owner.
    */
  var IpOwnerId: js.UndefOr[String] = js.native
  /**
    * The public DNS name.
    */
  var PublicDnsName: js.UndefOr[String] = js.native
  /**
    * The address of the Elastic IP address bound to the network interface.
    */
  var PublicIp: js.UndefOr[String] = js.native
}

object NetworkInterfaceAssociation {
  @scala.inline
  def apply(): NetworkInterfaceAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInterfaceAssociation]
  }
  @scala.inline
  implicit class NetworkInterfaceAssociationOps[Self <: NetworkInterfaceAssociation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllocationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllocationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllocationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AllocationId")(js.undefined)
        ret
    }
    @scala.inline
    def withAssociationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAssociationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AssociationId")(js.undefined)
        ret
    }
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

