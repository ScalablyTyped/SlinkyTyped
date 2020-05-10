package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcPeeringConnection extends js.Object {
  /**
    * Information about the accepter VPC. CIDR block information is only returned when describing an active VPC peering connection.
    */
  var AccepterVpcInfo: js.UndefOr[VpcPeeringConnectionVpcInfo] = js.native
  /**
    * The time that an unaccepted VPC peering connection will expire.
    */
  var ExpirationTime: js.UndefOr[js.Date] = js.native
  /**
    * Information about the requester VPC. CIDR block information is only returned when describing an active VPC peering connection.
    */
  var RequesterVpcInfo: js.UndefOr[VpcPeeringConnectionVpcInfo] = js.native
  /**
    * The status of the VPC peering connection.
    */
  var Status: js.UndefOr[VpcPeeringConnectionStateReason] = js.native
  /**
    * Any tags assigned to the resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The ID of the VPC peering connection.
    */
  var VpcPeeringConnectionId: js.UndefOr[String] = js.native
}

object VpcPeeringConnection {
  @scala.inline
  def apply(): VpcPeeringConnection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcPeeringConnection]
  }
  @scala.inline
  implicit class VpcPeeringConnectionOps[Self <: VpcPeeringConnection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccepterVpcInfo(value: VpcPeeringConnectionVpcInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccepterVpcInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccepterVpcInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AccepterVpcInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withExpirationTime(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpirationTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpirationTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ExpirationTime")(js.undefined)
        ret
    }
    @scala.inline
    def withRequesterVpcInfo(value: VpcPeeringConnectionVpcInfo): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequesterVpcInfo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequesterVpcInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RequesterVpcInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withStatus(value: VpcPeeringConnectionStateReason): Self = {
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
    def withVpcPeeringConnectionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcPeeringConnectionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVpcPeeringConnectionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VpcPeeringConnectionId")(js.undefined)
        ret
    }
  }
  
}

