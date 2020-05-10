package typingsSlinky.pulumiAws.getNatGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.ec2.GetNatGatewayFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNatGatewayResult extends js.Object {
  /**
    * The Id of the EIP allocated to the selected Nat Gateway.
    */
  val allocationId: String = js.native
  val filters: js.UndefOr[js.Array[GetNatGatewayFilter]] = js.native
  val id: String = js.native
  /**
    * The Id of the ENI allocated to the selected Nat Gateway.
    */
  val networkInterfaceId: String = js.native
  /**
    * The private Ip address of the selected Nat Gateway.
    */
  val privateIp: String = js.native
  /**
    * The public Ip (EIP) address of the selected Nat Gateway.
    */
  val publicIp: String = js.native
  val state: String = js.native
  val subnetId: String = js.native
  val tags: StringDictionary[js.Any] = js.native
  val vpcId: String = js.native
}

object GetNatGatewayResult {
  @scala.inline
  def apply(
    allocationId: String,
    id: String,
    networkInterfaceId: String,
    privateIp: String,
    publicIp: String,
    state: String,
    subnetId: String,
    tags: StringDictionary[js.Any],
    vpcId: String
  ): GetNatGatewayResult = {
    val __obj = js.Dynamic.literal(allocationId = allocationId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], networkInterfaceId = networkInterfaceId.asInstanceOf[js.Any], privateIp = privateIp.asInstanceOf[js.Any], publicIp = publicIp.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNatGatewayResult]
  }
  @scala.inline
  implicit class GetNatGatewayResultOps[Self <: GetNatGatewayResult] (val x: Self) extends AnyVal {
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
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNetworkInterfaceId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("networkInterfaceId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPrivateIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPublicIp(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("publicIp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSubnetId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("subnetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVpcId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("vpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFilters(value: js.Array[GetNatGatewayFilter]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFilters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("filters")(js.undefined)
        ret
    }
  }
  
}

