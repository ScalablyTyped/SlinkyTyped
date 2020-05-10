package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcEndpoint extends js.Object {
  /**
    * The date and time that the VPC endpoint was created.
    */
  var CreationTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * (Interface endpoint) The DNS entries for the endpoint.
    */
  var DnsEntries: js.UndefOr[DnsEntrySet] = js.native
  /**
    * (Interface endpoint) Information about the security groups that are associated with the network interface.
    */
  var Groups: js.UndefOr[GroupIdentifierSet] = js.native
  /**
    * The last error that occurred for VPC endpoint.
    */
  var LastError: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.LastError] = js.native
  /**
    * (Interface endpoint) One or more network interfaces for the endpoint.
    */
  var NetworkInterfaceIds: js.UndefOr[ValueStringList] = js.native
  /**
    * The ID of the AWS account that owns the VPC endpoint.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * The policy document associated with the endpoint, if applicable.
    */
  var PolicyDocument: js.UndefOr[String] = js.native
  /**
    * (Interface endpoint) Indicates whether the VPC is associated with a private hosted zone.
    */
  var PrivateDnsEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the VPC endpoint is being managed by its service.
    */
  var RequesterManaged: js.UndefOr[Boolean] = js.native
  /**
    * (Gateway endpoint) One or more route tables associated with the endpoint.
    */
  var RouteTableIds: js.UndefOr[ValueStringList] = js.native
  /**
    * The name of the service to which the endpoint is associated.
    */
  var ServiceName: js.UndefOr[String] = js.native
  /**
    * The state of the VPC endpoint.
    */
  var State: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.State] = js.native
  /**
    * (Interface endpoint) One or more subnets in which the endpoint is located.
    */
  var SubnetIds: js.UndefOr[ValueStringList] = js.native
  /**
    * Any tags assigned to the VPC endpoint.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The ID of the VPC endpoint.
    */
  var VpcEndpointId: js.UndefOr[String] = js.native
  /**
    * The type of endpoint.
    */
  var VpcEndpointType: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.VpcEndpointType] = js.native
  /**
    * The ID of the VPC to which the endpoint is associated.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object VpcEndpoint {
  @scala.inline
  def apply(): VpcEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcEndpoint]
  }
  @scala.inline
  implicit class VpcEndpointOps[Self <: VpcEndpoint] (val x: Self) extends AnyVal {
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
    def withGroups(value: GroupIdentifierSet): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Groups")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutGroups: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Groups")(js.undefined)
        ret
    }
    @scala.inline
    def withLastError(value: LastError): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastError")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLastError: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LastError")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkInterfaceIds(value: ValueStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkInterfaceIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkInterfaceIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NetworkInterfaceIds")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OwnerId")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicyDocument(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyDocument")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicyDocument: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PolicyDocument")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateDnsEnabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateDnsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateDnsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PrivateDnsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withRequesterManaged(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequesterManaged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequesterManaged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequesterManaged")(js.undefined)
        ret
    }
    @scala.inline
    def withRouteTableIds(value: ValueStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RouteTableIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouteTableIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RouteTableIds")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ServiceName")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: State): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("State")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetIds(value: ValueStringList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SubnetIds")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: TagList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Tags")(js.undefined)
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
    def withVpcEndpointType(value: VpcEndpointType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcEndpointType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcEndpointType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcEndpointType")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcId")(js.undefined)
        ret
    }
  }
  
}

