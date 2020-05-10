package typingsSlinky.googleapis.servicenetworkingV1Mod.servicenetworkingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a subnet that was created or discovered by a private access
  * management service.
  */
@js.native
trait SchemaSubnetwork extends js.Object {
  /**
    * Subnetwork CIDR range in `10.x.x.x/y` format.
    */
  var ipCidrRange: js.UndefOr[String] = js.native
  /**
    * Subnetwork name. See https://cloud.google.com/compute/docs/vpc/
    */
  var name: js.UndefOr[String] = js.native
  /**
    * In the Shared VPC host project, the VPC network that&#39;s peered with
    * the consumer network. For example:
    * `projects/1234321/global/networks/host-network`
    */
  var network: js.UndefOr[String] = js.native
  /**
    * This is a discovered subnet that is not within the current consumer
    * allocated ranges.
    */
  var outsideAllocation: js.UndefOr[Boolean] = js.native
}

object SchemaSubnetwork {
  @scala.inline
  def apply(): SchemaSubnetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSubnetwork]
  }
  @scala.inline
  implicit class SchemaSubnetworkOps[Self <: SchemaSubnetwork] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIpCidrRange(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipCidrRange")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIpCidrRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipCidrRange")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withNetwork(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNetwork: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("network")(js.undefined)
        ret
    }
    @scala.inline
    def withOutsideAllocation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outsideAllocation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOutsideAllocation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("outsideAllocation")(js.undefined)
        ret
    }
  }
  
}

