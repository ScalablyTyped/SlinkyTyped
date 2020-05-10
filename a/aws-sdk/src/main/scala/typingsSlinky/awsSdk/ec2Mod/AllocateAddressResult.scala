package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllocateAddressResult extends js.Object {
  /**
    * [EC2-VPC] The ID that AWS assigns to represent the allocation of the Elastic IP address for use with instances in a VPC.
    */
  var AllocationId: js.UndefOr[String] = js.native
  /**
    * The customer-owned IP address.
    */
  var CustomerOwnedIp: js.UndefOr[String] = js.native
  /**
    * The ID of the customer-owned address pool.
    */
  var CustomerOwnedIpv4Pool: js.UndefOr[String] = js.native
  /**
    * Indicates whether this Elastic IP address is for use with instances in EC2-Classic (standard) or instances in a VPC (vpc).
    */
  var Domain: js.UndefOr[DomainType] = js.native
  /**
    * The location from which the IP address is advertised.
    */
  var NetworkBorderGroup: js.UndefOr[String] = js.native
  /**
    * The Elastic IP address.
    */
  var PublicIp: js.UndefOr[String] = js.native
  /**
    * The ID of an address pool.
    */
  var PublicIpv4Pool: js.UndefOr[String] = js.native
}

object AllocateAddressResult {
  @scala.inline
  def apply(): AllocateAddressResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllocateAddressResult]
  }
  @scala.inline
  implicit class AllocateAddressResultOps[Self <: AllocateAddressResult] (val x: Self) extends AnyVal {
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
    def withCustomerOwnedIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomerOwnedIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerOwnedIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomerOwnedIp")(js.undefined)
        ret
    }
    @scala.inline
    def withCustomerOwnedIpv4Pool(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomerOwnedIpv4Pool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCustomerOwnedIpv4Pool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CustomerOwnedIpv4Pool")(js.undefined)
        ret
    }
    @scala.inline
    def withDomain(value: DomainType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDomain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Domain")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkBorderGroup(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkBorderGroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkBorderGroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkBorderGroup")(js.undefined)
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
    @scala.inline
    def withPublicIpv4Pool(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicIpv4Pool")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPublicIpv4Pool: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PublicIpv4Pool")(js.undefined)
        ret
    }
  }
  
}

