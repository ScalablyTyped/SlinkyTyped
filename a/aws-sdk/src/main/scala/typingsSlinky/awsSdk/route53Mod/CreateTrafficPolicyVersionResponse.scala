package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTrafficPolicyVersionResponse extends js.Object {
  /**
    * A unique URL that represents a new traffic policy version.
    */
  var Location: ResourceURI = js.native
  /**
    * A complex type that contains settings for the new version of the traffic policy.
    */
  var TrafficPolicy: typingsSlinky.awsSdk.route53Mod.TrafficPolicy = js.native
}

object CreateTrafficPolicyVersionResponse {
  @scala.inline
  def apply(Location: ResourceURI, TrafficPolicy: TrafficPolicy): CreateTrafficPolicyVersionResponse = {
    val __obj = js.Dynamic.literal(Location = Location.asInstanceOf[js.Any], TrafficPolicy = TrafficPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrafficPolicyVersionResponse]
  }
  @scala.inline
  implicit class CreateTrafficPolicyVersionResponseOps[Self <: CreateTrafficPolicyVersionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLocation(value: ResourceURI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Location")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrafficPolicy(value: TrafficPolicy): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrafficPolicy")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

