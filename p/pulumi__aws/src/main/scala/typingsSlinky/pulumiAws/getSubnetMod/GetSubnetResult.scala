package typingsSlinky.pulumiAws.getSubnetMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.ec2.GetSubnetFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSubnetResult extends js.Object {
  /**
    * The ARN of the subnet.
    */
  val arn: String = js.native
  val assignIpv6AddressOnCreation: Boolean = js.native
  val availabilityZone: String = js.native
  val availabilityZoneId: String = js.native
  val cidrBlock: String = js.native
  val defaultForAz: Boolean = js.native
  val filters: js.UndefOr[js.Array[GetSubnetFilter]] = js.native
  val id: String = js.native
  val ipv6CidrBlock: String = js.native
  val ipv6CidrBlockAssociationId: String = js.native
  val mapPublicIpOnLaunch: Boolean = js.native
  /**
    * The ID of the AWS account that owns the subnet.
    */
  val ownerId: String = js.native
  val state: String = js.native
  val tags: StringDictionary[js.Any] = js.native
  val vpcId: String = js.native
}

object GetSubnetResult {
  @scala.inline
  def apply(
    arn: String,
    assignIpv6AddressOnCreation: Boolean,
    availabilityZone: String,
    availabilityZoneId: String,
    cidrBlock: String,
    defaultForAz: Boolean,
    id: String,
    ipv6CidrBlock: String,
    ipv6CidrBlockAssociationId: String,
    mapPublicIpOnLaunch: Boolean,
    ownerId: String,
    state: String,
    tags: StringDictionary[js.Any],
    vpcId: String
  ): GetSubnetResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], assignIpv6AddressOnCreation = assignIpv6AddressOnCreation.asInstanceOf[js.Any], availabilityZone = availabilityZone.asInstanceOf[js.Any], availabilityZoneId = availabilityZoneId.asInstanceOf[js.Any], cidrBlock = cidrBlock.asInstanceOf[js.Any], defaultForAz = defaultForAz.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ipv6CidrBlock = ipv6CidrBlock.asInstanceOf[js.Any], ipv6CidrBlockAssociationId = ipv6CidrBlockAssociationId.asInstanceOf[js.Any], mapPublicIpOnLaunch = mapPublicIpOnLaunch.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSubnetResult]
  }
  @scala.inline
  implicit class GetSubnetResultOps[Self <: GetSubnetResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withArn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAssignIpv6AddressOnCreation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("assignIpv6AddressOnCreation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvailabilityZone(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZone")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAvailabilityZoneId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("availabilityZoneId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCidrBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultForAz(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultForAz")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpv6CidrBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6CidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIpv6CidrBlockAssociationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ipv6CidrBlockAssociationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMapPublicIpOnLaunch(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mapPublicIpOnLaunch")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
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
    def withFilters(value: js.Array[GetSubnetFilter]): Self = {
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

