package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetReusableDelegationSetLimitRequest extends js.Object {
  /**
    * The ID of the delegation set that you want to get the limit for.
    */
  var DelegationSetId: ResourceId = js.native
  /**
    * Specify MAX_ZONES_BY_REUSABLE_DELEGATION_SET to get the maximum number of hosted zones that you can associate with the specified reusable delegation set.
    */
  var Type: ReusableDelegationSetLimitType = js.native
}

object GetReusableDelegationSetLimitRequest {
  @scala.inline
  def apply(DelegationSetId: ResourceId, Type: ReusableDelegationSetLimitType): GetReusableDelegationSetLimitRequest = {
    val __obj = js.Dynamic.literal(DelegationSetId = DelegationSetId.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReusableDelegationSetLimitRequest]
  }
  @scala.inline
  implicit class GetReusableDelegationSetLimitRequestOps[Self <: GetReusableDelegationSetLimitRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDelegationSetId(value: ResourceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DelegationSetId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: ReusableDelegationSetLimitType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

