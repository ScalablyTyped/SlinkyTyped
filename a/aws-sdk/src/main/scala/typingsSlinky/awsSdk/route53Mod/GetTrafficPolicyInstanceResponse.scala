package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTrafficPolicyInstanceResponse extends js.Object {
  /**
    * A complex type that contains settings for the traffic policy instance.
    */
  var TrafficPolicyInstance: typingsSlinky.awsSdk.route53Mod.TrafficPolicyInstance = js.native
}

object GetTrafficPolicyInstanceResponse {
  @scala.inline
  def apply(TrafficPolicyInstance: TrafficPolicyInstance): GetTrafficPolicyInstanceResponse = {
    val __obj = js.Dynamic.literal(TrafficPolicyInstance = TrafficPolicyInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTrafficPolicyInstanceResponse]
  }
  @scala.inline
  implicit class GetTrafficPolicyInstanceResponseOps[Self <: GetTrafficPolicyInstanceResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withTrafficPolicyInstance(value: TrafficPolicyInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrafficPolicyInstance")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

