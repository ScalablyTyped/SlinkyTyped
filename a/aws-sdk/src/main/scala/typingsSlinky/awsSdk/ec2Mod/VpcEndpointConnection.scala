package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcEndpointConnection extends js.Object {
  /**
    * The date and time that the VPC endpoint was created.
    */
  var CreationTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The DNS entries for the VPC endpoint.
    */
  var DnsEntries: js.UndefOr[DnsEntrySet] = js.native
  /**
    * The Amazon Resource Names (ARNs) of the network load balancers for the service.
    */
  var NetworkLoadBalancerArns: js.UndefOr[ValueStringList] = js.native
  /**
    * The ID of the service to which the endpoint is connected.
    */
  var ServiceId: js.UndefOr[String] = js.native
  /**
    * The ID of the VPC endpoint.
    */
  var VpcEndpointId: js.UndefOr[String] = js.native
  /**
    * The AWS account ID of the owner of the VPC endpoint.
    */
  var VpcEndpointOwner: js.UndefOr[String] = js.native
  /**
    * The state of the VPC endpoint.
    */
  var VpcEndpointState: js.UndefOr[State] = js.native
}

object VpcEndpointConnection {
  @scala.inline
  def apply(): VpcEndpointConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcEndpointConnection]
  }
  @scala.inline
  implicit class VpcEndpointConnectionOps[Self <: VpcEndpointConnection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreationTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTimestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTimestamp")(js.undefined)
        ret
    }
    @scala.inline
    def withDnsEntries(value: DnsEntrySet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DnsEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnsEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DnsEntries")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkLoadBalancerArns(value: ValueStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkLoadBalancerArns")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkLoadBalancerArns: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkLoadBalancerArns")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceId")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcEndpointId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcEndpointId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcEndpointId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcEndpointId")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcEndpointOwner(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcEndpointOwner")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcEndpointOwner: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcEndpointOwner")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcEndpointState(value: State): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcEndpointState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcEndpointState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcEndpointState")(js.undefined)
        ret
    }
  }
  
}

