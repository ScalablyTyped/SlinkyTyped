package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListVPCAssociationAuthorizationsResponse extends js.Object {
  /**
    * The ID of the hosted zone that you can associate the listed VPCs with.
    */
  var HostedZoneId: ResourceId = js.native
  /**
    * When the response includes a NextToken element, there are more VPCs that can be associated with the specified hosted zone. To get the next page of VPCs, submit another ListVPCAssociationAuthorizations request, and include the value of the NextToken element from the response in the nexttoken request parameter.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The list of VPCs that are authorized to be associated with the specified hosted zone.
    */
  var VPCs: typingsSlinky.awsSdk.route53Mod.VPCs = js.native
}

object ListVPCAssociationAuthorizationsResponse {
  @scala.inline
  def apply(HostedZoneId: ResourceId, VPCs: VPCs): ListVPCAssociationAuthorizationsResponse = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId.asInstanceOf[js.Any], VPCs = VPCs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVPCAssociationAuthorizationsResponse]
  }
  @scala.inline
  implicit class ListVPCAssociationAuthorizationsResponseOps[Self <: ListVPCAssociationAuthorizationsResponse] (val x: Self) extends AnyVal {
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
    def withVPCs(value: VPCs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("VPCs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNextToken(value: PaginationToken): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNextToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("NextToken")(js.undefined)
        ret
    }
  }
  
}

