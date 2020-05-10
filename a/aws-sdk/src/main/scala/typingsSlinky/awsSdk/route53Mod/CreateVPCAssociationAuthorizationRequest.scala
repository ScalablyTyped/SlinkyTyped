package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVPCAssociationAuthorizationRequest extends js.Object {
  /**
    * The ID of the private hosted zone that you want to authorize associating a VPC with.
    */
  var HostedZoneId: ResourceId = js.native
  /**
    * A complex type that contains the VPC ID and region for the VPC that you want to authorize associating with your hosted zone.
    */
  var VPC: typingsSlinky.awsSdk.route53Mod.VPC = js.native
}

object CreateVPCAssociationAuthorizationRequest {
  @scala.inline
  def apply(HostedZoneId: ResourceId, VPC: VPC): CreateVPCAssociationAuthorizationRequest = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId.asInstanceOf[js.Any], VPC = VPC.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVPCAssociationAuthorizationRequest]
  }
  @scala.inline
  implicit class CreateVPCAssociationAuthorizationRequestOps[Self <: CreateVPCAssociationAuthorizationRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHostedZoneId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HostedZoneId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVPC(value: VPC): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VPC")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

