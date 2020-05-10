package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetHostedZoneLimitRequest extends js.Object {
  /**
    * The ID of the hosted zone that you want to get a limit for.
    */
  var HostedZoneId: ResourceId = js.native
  /**
    * The limit that you want to get. Valid values include the following:    MAX_RRSETS_BY_ZONE: The maximum number of records that you can create in the specified hosted zone.    MAX_VPCS_ASSOCIATED_BY_ZONE: The maximum number of Amazon VPCs that you can associate with the specified private hosted zone.  
    */
  var Type: HostedZoneLimitType = js.native
}

object GetHostedZoneLimitRequest {
  @scala.inline
  def apply(HostedZoneId: ResourceId, Type: HostedZoneLimitType): GetHostedZoneLimitRequest = {
    val __obj = js.Dynamic.literal(HostedZoneId = HostedZoneId.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetHostedZoneLimitRequest]
  }
  @scala.inline
  implicit class GetHostedZoneLimitRequestOps[Self <: GetHostedZoneLimitRequest] (val x: Self) extends AnyVal {
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
    def withType(value: HostedZoneLimitType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

