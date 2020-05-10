package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTrafficPolicyInstanceCountResponse extends js.Object {
  /**
    * The number of traffic policy instances that are associated with the current AWS account.
    */
  var TrafficPolicyInstanceCount: typingsSlinky.awsSdk.route53Mod.TrafficPolicyInstanceCount = js.native
}

object GetTrafficPolicyInstanceCountResponse {
  @scala.inline
  def apply(TrafficPolicyInstanceCount: TrafficPolicyInstanceCount): GetTrafficPolicyInstanceCountResponse = {
    val __obj = js.Dynamic.literal(TrafficPolicyInstanceCount = TrafficPolicyInstanceCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTrafficPolicyInstanceCountResponse]
  }
  @scala.inline
  implicit class GetTrafficPolicyInstanceCountResponseOps[Self <: GetTrafficPolicyInstanceCountResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrafficPolicyInstanceCount(value: TrafficPolicyInstanceCount): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrafficPolicyInstanceCount")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

