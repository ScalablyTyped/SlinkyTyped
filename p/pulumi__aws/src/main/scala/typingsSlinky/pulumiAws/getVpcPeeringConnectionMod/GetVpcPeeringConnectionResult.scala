package typingsSlinky.pulumiAws.getVpcPeeringConnectionMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.pulumiAws.outputMod.ec2.GetVpcPeeringConnectionFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetVpcPeeringConnectionResult extends js.Object {
  /**
    * A configuration block that describes [VPC Peering Connection]
    * (http://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide) options set for the accepter VPC.
    */
  val accepter: StringDictionary[Boolean] = js.native
  val cidrBlock: String = js.native
  val filters: js.UndefOr[js.Array[GetVpcPeeringConnectionFilter]] = js.native
  val id: String = js.native
  val ownerId: String = js.native
  val peerCidrBlock: String = js.native
  val peerOwnerId: String = js.native
  val peerRegion: String = js.native
  val peerVpcId: String = js.native
  val region: String = js.native
  /**
    * A configuration block that describes [VPC Peering Connection]
    * (http://docs.aws.amazon.com/AmazonVPC/latest/PeeringGuide) options set for the requester VPC.
    */
  val requester: StringDictionary[Boolean] = js.native
  val status: String = js.native
  val tags: StringDictionary[js.Any] = js.native
  val vpcId: String = js.native
}

object GetVpcPeeringConnectionResult {
  @scala.inline
  def apply(
    accepter: StringDictionary[Boolean],
    cidrBlock: String,
    id: String,
    ownerId: String,
    peerCidrBlock: String,
    peerOwnerId: String,
    peerRegion: String,
    peerVpcId: String,
    region: String,
    requester: StringDictionary[Boolean],
    status: String,
    tags: StringDictionary[js.Any],
    vpcId: String
  ): GetVpcPeeringConnectionResult = {
    val __obj = js.Dynamic.literal(accepter = accepter.asInstanceOf[js.Any], cidrBlock = cidrBlock.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ownerId = ownerId.asInstanceOf[js.Any], peerCidrBlock = peerCidrBlock.asInstanceOf[js.Any], peerOwnerId = peerOwnerId.asInstanceOf[js.Any], peerRegion = peerRegion.asInstanceOf[js.Any], peerVpcId = peerVpcId.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], requester = requester.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVpcPeeringConnectionResult]
  }
  @scala.inline
  implicit class GetVpcPeeringConnectionResultOps[Self <: GetVpcPeeringConnectionResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccepter(value: StringDictionary[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accepter")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCidrBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ownerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeerCidrBlock(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerCidrBlock")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeerOwnerId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerOwnerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeerRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerRegion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPeerVpcId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("peerVpcId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRegion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("region")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRequester(value: StringDictionary[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requester")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
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
  }
  
}

