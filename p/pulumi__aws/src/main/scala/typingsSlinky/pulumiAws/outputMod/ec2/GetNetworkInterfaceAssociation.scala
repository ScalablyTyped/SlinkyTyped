package typingsSlinky.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNetworkInterfaceAssociation extends js.Object {
  /**
    * The allocation ID.
    */
  var allocationId: String = js.native
  /**
    * The association ID.
    */
  var associationId: String = js.native
  /**
    * The ID of the Elastic IP address owner.
    */
  var ipOwnerId: String = js.native
  /**
    * The public DNS name.
    */
  var publicDnsName: String = js.native
  /**
    * The address of the Elastic IP address bound to the network interface.
    */
  var publicIp: String = js.native
}

object GetNetworkInterfaceAssociation {
  @scala.inline
  def apply(
    allocationId: String,
    associationId: String,
    ipOwnerId: String,
    publicDnsName: String,
    publicIp: String
  ): GetNetworkInterfaceAssociation = {
    val __obj = js.Dynamic.literal(allocationId = allocationId.asInstanceOf[js.Any], associationId = associationId.asInstanceOf[js.Any], ipOwnerId = ipOwnerId.asInstanceOf[js.Any], publicDnsName = publicDnsName.asInstanceOf[js.Any], publicIp = publicIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNetworkInterfaceAssociation]
  }
  @scala.inline
  implicit class GetNetworkInterfaceAssociationOps[Self <: GetNetworkInterfaceAssociation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllocationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allocationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssociationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("associationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipOwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicDnsName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicDnsName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicIp")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

