package typingsSlinky.pulumiAws.vpcEndpointMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.ec2.VpcEndpointDnsEntry
import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcEndpointState extends js.Object {
  /**
    * Accept the VPC endpoint (the VPC endpoint and service need to be in the same AWS account).
    */
  val autoAccept: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The list of CIDR blocks for the exposed AWS service. Applicable for endpoints of type `Gateway`.
    */
  val cidrBlocks: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The DNS entries for the VPC Endpoint. Applicable for endpoints of type `Interface`. DNS blocks are documented below.
    */
  val dnsEntries: js.UndefOr[Input[js.Array[Input[VpcEndpointDnsEntry]]]] = js.native
  /**
    * One or more network interfaces for the VPC Endpoint. Applicable for endpoints of type `Interface`.
    */
  val networkInterfaceIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The ID of the AWS account that owns the VPC endpoint.
    */
  val ownerId: js.UndefOr[Input[String]] = js.native
  val policy: js.UndefOr[Input[String]] = js.native
  /**
    * The prefix list ID of the exposed AWS service. Applicable for endpoints of type `Gateway`.
    */
  val prefixListId: js.UndefOr[Input[String]] = js.native
  /**
    * Whether or not to associate a private hosted zone with the specified VPC. Applicable for endpoints of type `Interface`.
    * Defaults to `false`.
    */
  val privateDnsEnabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Whether or not the VPC Endpoint is being managed by its service - `true` or `false`.
    */
  val requesterManaged: js.UndefOr[Input[Boolean]] = js.native
  /**
    * One or more route table IDs. Applicable for endpoints of type `Gateway`.
    */
  val routeTableIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The ID of one or more security groups to associate with the network interface. Required for endpoints of type `Interface`.
    */
  val securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The service name, in the form `com.amazonaws.region.service` for AWS services.
    */
  val serviceName: js.UndefOr[Input[String]] = js.native
  /**
    * The state of the VPC endpoint.
    */
  val state: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of one or more subnets in which to create a network interface for the endpoint. Applicable for endpoints of type `Interface`.
    */
  val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The VPC endpoint type, `Gateway` or `Interface`. Defaults to `Gateway`.
    */
  val vpcEndpointType: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the VPC in which the endpoint will be used.
    */
  val vpcId: js.UndefOr[Input[String]] = js.native
}

object VpcEndpointState {
  @scala.inline
  def apply(): VpcEndpointState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcEndpointState]
  }
  @scala.inline
  implicit class VpcEndpointStateOps[Self <: VpcEndpointState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoAccept(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAccept")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoAccept: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoAccept")(js.undefined)
        ret
    }
    @scala.inline
    def withCidrBlocks(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cidrBlocks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCidrBlocks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cidrBlocks")(js.undefined)
        ret
    }
    @scala.inline
    def withDnsEntries(value: Input[js.Array[Input[VpcEndpointDnsEntry]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsEntries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDnsEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dnsEntries")(js.undefined)
        ret
    }
    @scala.inline
    def withNetworkInterfaceIds(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInterfaceIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetworkInterfaceIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInterfaceIds")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerId")(js.undefined)
        ret
    }
    @scala.inline
    def withPolicy(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPolicy: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("policy")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefixListId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixListId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefixListId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefixListId")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateDnsEnabled(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateDnsEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateDnsEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateDnsEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withRequesterManaged(value: Input[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requesterManaged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequesterManaged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requesterManaged")(js.undefined)
        ret
    }
    @scala.inline
    def withRouteTableIds(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeTableIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRouteTableIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("routeTableIds")(js.undefined)
        ret
    }
    @scala.inline
    def withSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecurityGroupIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("securityGroupIds")(js.undefined)
        ret
    }
    @scala.inline
    def withServiceName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServiceName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serviceName")(js.undefined)
        ret
    }
    @scala.inline
    def withState(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutState: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetIds(value: Input[js.Array[Input[String]]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetIds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetIds")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: Input[StringDictionary[_]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcEndpointType(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcEndpointType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcEndpointType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcEndpointType")(js.undefined)
        ret
    }
    @scala.inline
    def withVpcId(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcId")(js.undefined)
        ret
    }
  }
  
}

