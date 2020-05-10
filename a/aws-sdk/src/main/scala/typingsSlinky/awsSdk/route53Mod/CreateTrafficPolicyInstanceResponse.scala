package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTrafficPolicyInstanceResponse extends js.Object {
  /**
    * A unique URL that represents a new traffic policy instance.
    */
  var Location: ResourceURI = js.native
  /**
    * A complex type that contains settings for the new traffic policy instance.
    */
  var TrafficPolicyInstance: typingsSlinky.awsSdk.route53Mod.TrafficPolicyInstance = js.native
}

object CreateTrafficPolicyInstanceResponse {
  @scala.inline
  def apply(Location: ResourceURI, TrafficPolicyInstance: TrafficPolicyInstance): CreateTrafficPolicyInstanceResponse = {
    val __obj = js.Dynamic.literal(Location = Location.asInstanceOf[js.Any], TrafficPolicyInstance = TrafficPolicyInstance.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTrafficPolicyInstanceResponse]
  }
  @scala.inline
  implicit class CreateTrafficPolicyInstanceResponseOps[Self <: CreateTrafficPolicyInstanceResponse] (val x: Self) extends AnyVal {
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
    def withTrafficPolicyInstance(value: TrafficPolicyInstance): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrafficPolicyInstance")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

