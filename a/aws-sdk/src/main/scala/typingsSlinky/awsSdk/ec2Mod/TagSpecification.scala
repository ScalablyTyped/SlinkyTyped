package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagSpecification extends js.Object {
  /**
    * The type of resource to tag. Currently, the resource types that support tagging on creation are: capacity-reservation | client-vpn-endpoint | dedicated-host | fleet | fpga-image | instance | key-pair | launch-template | | natgateway | spot-fleet-request | placement-group | snapshot | traffic-mirror-filter | traffic-mirror-session | traffic-mirror-target | transit-gateway | transit-gateway-attachment | transit-gateway-route-table | vpc-endpoint (for interface VPC endpoints)| vpc-endpoint-service (for gateway VPC endpoints) | volume | vpc-flow-log. To tag a resource after it has been created, see CreateTags.
    */
  var ResourceType: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.ResourceType] = js.native
  /**
    * The tags to apply to the resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object TagSpecification {
  @scala.inline
  def apply(): TagSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TagSpecification]
  }
  @scala.inline
  implicit class TagSpecificationOps[Self <: TagSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResourceType(value: ResourceType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResourceType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ResourceType")(js.undefined)
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
  }
  
}

