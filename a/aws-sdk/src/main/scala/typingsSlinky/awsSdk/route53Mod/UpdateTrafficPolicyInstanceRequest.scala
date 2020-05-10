package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTrafficPolicyInstanceRequest extends js.Object {
  /**
    * The ID of the traffic policy instance that you want to update.
    */
  var Id: TrafficPolicyInstanceId = js.native
  /**
    * The TTL that you want Amazon Route 53 to assign to all of the updated resource record sets.
    */
  var TTL: typingsSlinky.awsSdk.route53Mod.TTL = js.native
  /**
    * The ID of the traffic policy that you want Amazon Route 53 to use to update resource record sets for the specified traffic policy instance.
    */
  var TrafficPolicyId: typingsSlinky.awsSdk.route53Mod.TrafficPolicyId = js.native
  /**
    * The version of the traffic policy that you want Amazon Route 53 to use to update resource record sets for the specified traffic policy instance.
    */
  var TrafficPolicyVersion: typingsSlinky.awsSdk.route53Mod.TrafficPolicyVersion = js.native
}

object UpdateTrafficPolicyInstanceRequest {
  @scala.inline
  def apply(
    Id: TrafficPolicyInstanceId,
    TTL: TTL,
    TrafficPolicyId: TrafficPolicyId,
    TrafficPolicyVersion: TrafficPolicyVersion
  ): UpdateTrafficPolicyInstanceRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], TTL = TTL.asInstanceOf[js.Any], TrafficPolicyId = TrafficPolicyId.asInstanceOf[js.Any], TrafficPolicyVersion = TrafficPolicyVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTrafficPolicyInstanceRequest]
  }
  @scala.inline
  implicit class UpdateTrafficPolicyInstanceRequestOps[Self <: UpdateTrafficPolicyInstanceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: TrafficPolicyInstanceId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTTL(value: TTL): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrafficPolicyId(value: TrafficPolicyId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrafficPolicyId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrafficPolicyVersion(value: TrafficPolicyVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrafficPolicyVersion")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

