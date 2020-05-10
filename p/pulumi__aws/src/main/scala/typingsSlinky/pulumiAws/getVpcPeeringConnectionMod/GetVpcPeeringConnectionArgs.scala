package typingsSlinky.pulumiAws.getVpcPeeringConnectionMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.inputMod.ec2.GetVpcPeeringConnectionFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpcPeeringConnectionArgs extends js.Object {
  /**
    * The CIDR block of the requester VPC of the specific VPC Peering Connection to retrieve.
    */
  val cidrBlock: js.UndefOr[String] = js.native
  /**
    * Custom filter block as described below.
    */
  val filters: js.UndefOr[js.Array[GetVpcPeeringConnectionFilter]] = js.native
  /**
    * The ID of the specific VPC Peering Connection to retrieve.
    */
  val id: js.UndefOr[String] = js.native
  /**
    * The AWS account ID of the owner of the requester VPC of the specific VPC Peering Connection to retrieve.
    */
  val ownerId: js.UndefOr[String] = js.native
  /**
    * The CIDR block of the accepter VPC of the specific VPC Peering Connection to retrieve.
    */
  val peerCidrBlock: js.UndefOr[String] = js.native
  /**
    * The AWS account ID of the owner of the accepter VPC of the specific VPC Peering Connection to retrieve.
    */
  val peerOwnerId: js.UndefOr[String] = js.native
  /**
    * The region of the accepter VPC of the specific VPC Peering Connection to retrieve.
    */
  val peerRegion: js.UndefOr[String] = js.native
  /**
    * The ID of the accepter VPC of the specific VPC Peering Connection to retrieve.
    */
  val peerVpcId: js.UndefOr[String] = js.native
  /**
    * The region of the requester VPC of the specific VPC Peering Connection to retrieve.
    */
  val region: js.UndefOr[String] = js.native
  /**
    * The status of the specific VPC Peering Connection to retrieve.
    */
  val status: js.UndefOr[String] = js.native
  /**
    * A mapping of tags, each pair of which must exactly match
    * a pair on the desired VPC Peering Connection.
    */
  val tags: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * The ID of the requester VPC of the specific VPC Peering Connection to retrieve.
    */
  val vpcId: js.UndefOr[String] = js.native
}

object GetVpcPeeringConnectionArgs {
  @scala.inline
  def apply(): GetVpcPeeringConnectionArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVpcPeeringConnectionArgs]
  }
  @scala.inline
  implicit class GetVpcPeeringConnectionArgsOps[Self <: GetVpcPeeringConnectionArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCidrBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCidrBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cidrBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withFilters(value: js.Array[GetVpcPeeringConnectionFilter]): Self = {
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
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withOwnerId(value: String): Self = {
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
    def withPeerCidrBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerCidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeerCidrBlock: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerCidrBlock")(js.undefined)
        ret
    }
    @scala.inline
    def withPeerOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerOwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeerOwnerId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerOwnerId")(js.undefined)
        ret
    }
    @scala.inline
    def withPeerRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeerRegion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerRegion")(js.undefined)
        ret
    }
    @scala.inline
    def withPeerVpcId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerVpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPeerVpcId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerVpcId")(js.undefined)
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
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(js.undefined)
        ret
    }
    @scala.inline
    def withTags(value: StringDictionary[js.Any]): Self = {
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
    def withVpcId(value: String): Self = {
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

