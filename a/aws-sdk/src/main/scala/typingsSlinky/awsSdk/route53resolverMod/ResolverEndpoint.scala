package typingsSlinky.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolverEndpoint extends js.Object {
  /**
    * The ARN (Amazon Resource Name) for the resolver endpoint.
    */
  var Arn: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.Arn] = js.native
  /**
    * The date and time that the endpoint was created, in Unix time format and Coordinated Universal Time (UTC).
    */
  var CreationTime: js.UndefOr[Rfc3339TimeString] = js.native
  /**
    * A unique string that identifies the request that created the resolver endpoint. The CreatorRequestId allows failed requests to be retried without the risk of executing the operation twice.
    */
  var CreatorRequestId: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.CreatorRequestId] = js.native
  /**
    * Indicates whether the resolver endpoint allows inbound or outbound DNS queries:    INBOUND: allows DNS queries to your VPC from your network or another VPC    OUTBOUND: allows DNS queries from your VPC to your network or another VPC  
    */
  var Direction: js.UndefOr[ResolverEndpointDirection] = js.native
  /**
    * The ID of the VPC that you want to create the resolver endpoint in.
    */
  var HostVPCId: js.UndefOr[ResourceId] = js.native
  /**
    * The ID of the resolver endpoint.
    */
  var Id: js.UndefOr[ResourceId] = js.native
  /**
    * The number of IP addresses that the resolver endpoint can use for DNS queries.
    */
  var IpAddressCount: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.IpAddressCount] = js.native
  /**
    * The date and time that the endpoint was last modified, in Unix time format and Coordinated Universal Time (UTC).
    */
  var ModificationTime: js.UndefOr[Rfc3339TimeString] = js.native
  /**
    * The name that you assigned to the resolver endpoint when you submitted a CreateResolverEndpoint request.
    */
  var Name: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.Name] = js.native
  /**
    * The ID of one or more security groups that control access to this VPC. The security group must include one or more inbound resolver rules.
    */
  var SecurityGroupIds: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.SecurityGroupIds] = js.native
  /**
    * A code that specifies the current status of the resolver endpoint.
    */
  var Status: js.UndefOr[ResolverEndpointStatus] = js.native
  /**
    * A detailed description of the status of the resolver endpoint.
    */
  var StatusMessage: js.UndefOr[typingsSlinky.awsSdk.route53resolverMod.StatusMessage] = js.native
}

object ResolverEndpoint {
  @scala.inline
  def apply(): ResolverEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolverEndpoint]
  }
  @scala.inline
  implicit class ResolverEndpointOps[Self <: ResolverEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: Arn): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutArn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Arn")(js.undefined)
        ret
    }
    @scala.inline
    def withCreationTime(value: Rfc3339TimeString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withCreatorRequestId(value: CreatorRequestId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatorRequestId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCreatorRequestId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CreatorRequestId")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: ResolverEndpointDirection): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Direction")(js.undefined)
        ret
    }
    @scala.inline
    def withHostVPCId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostVPCId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostVPCId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostVPCId")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(js.undefined)
        ret
    }
    @scala.inline
    def withIpAddressCount(value: IpAddressCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpAddressCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpAddressCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IpAddressCount")(js.undefined)
        ret
    }
    @scala.inline
    def withModificationTime(value: Rfc3339TimeString): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModificationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModificationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ModificationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Name): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityGroupIds(value: SecurityGroupIds): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroupIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("SecurityGroupIds")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: ResolverEndpointStatus): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Status")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusMessage(value: StatusMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusMessage")(js.undefined)
        ret
    }
  }
  
}

