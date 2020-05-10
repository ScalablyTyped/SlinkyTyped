package typingsSlinky.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request to create a subnetwork in a previously peered service network.
  */
@js.native
trait SchemaAddSubnetworkRequest extends js.Object {
  /**
    * Required. A resource that represents the service consumer, such as
    * `projects/123456`. The project number can be different from the value in
    * the consumer network parameter. For example, the network might be part of
    * a Shared VPC network. In those cases, Service Networking validates that
    * this resource belongs to that Shared VPC.
    */
  var consumer: js.UndefOr[String] = js.native
  /**
    * Required. The name of the service consumer&#39;s VPC network. The network
    * must have an existing private connection that was provisioned through the
    * connections.create method. The name must be in the following format:
    * `projects/{project}/global/networks/{network}`, where {project} is a
    * project number, such as `12345`. {network} is the name of a VPC network
    * in the project.
    */
  var consumerNetwork: js.UndefOr[String] = js.native
  /**
    * An optional description of the subnet.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Required. The prefix length of the subnet&#39;s IP address range.  Use
    * CIDR range notation, such as `30` to provision a subnet with an
    * `x.x.x.x/30` CIDR range. The IP address range is drawn from a pool of
    * available ranges in the service consumer&#39;s allocated range.
    */
  var ipPrefixLength: js.UndefOr[Double] = js.native
  /**
    * Required. The name of a [region](/compute/docs/regions-zones) for the
    * subnet, such `europe-west1`.
    */
  var region: js.UndefOr[String] = js.native
  /**
    * Optional. The starting address of a range. The address must be a valid
    * IPv4 address in the x.x.x.x format. This value combined with the IP
    * prefix range is the CIDR range for the subnet. The range must be within
    * the allocated range that is assigned to the private connection. If the
    * CIDR range isn&#39;t available, the call fails.
    */
  var requestedAddress: js.UndefOr[String] = js.native
  /**
    * Required. A name for the new subnet. For information about the naming
    * requirements, see
    * [subnetwork](/compute/docs/reference/rest/v1/subnetworks) in the Compute
    * API documentation.
    */
  var subnetwork: js.UndefOr[String] = js.native
  /**
    * A list of members that are granted the `compute.networkUser` role on the
    * subnet.
    */
  var subnetworkUsers: js.UndefOr[js.Array[String]] = js.native
}

object SchemaAddSubnetworkRequest {
  @scala.inline
  def apply(): SchemaAddSubnetworkRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAddSubnetworkRequest]
  }
  @scala.inline
  implicit class SchemaAddSubnetworkRequestOps[Self <: SchemaAddSubnetworkRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConsumer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsumer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumer")(js.undefined)
        ret
    }
    @scala.inline
    def withConsumerNetwork(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumerNetwork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsumerNetwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumerNetwork")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withIpPrefixLength(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipPrefixLength")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpPrefixLength: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipPrefixLength")(js.undefined)
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestedAddress(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedAddress")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestedAddress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedAddress")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetwork(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetwork")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetwork")(js.undefined)
        ret
    }
    @scala.inline
    def withSubnetworkUsers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetworkUsers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSubnetworkUsers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetworkUsers")(js.undefined)
        ret
    }
  }
  
}

