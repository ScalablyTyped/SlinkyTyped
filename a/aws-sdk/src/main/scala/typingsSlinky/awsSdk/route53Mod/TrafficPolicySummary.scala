package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrafficPolicySummary extends js.Object {
  /**
    * The ID that Amazon Route 53 assigned to the traffic policy when you created it.
    */
  var Id: TrafficPolicyId = js.native
  /**
    * The version number of the latest version of the traffic policy.
    */
  var LatestVersion: TrafficPolicyVersion = js.native
  /**
    * The name that you specified for the traffic policy when you created it.
    */
  var Name: TrafficPolicyName = js.native
  /**
    * The number of traffic policies that are associated with the current AWS account.
    */
  var TrafficPolicyCount: TrafficPolicyVersion = js.native
  /**
    * The DNS type of the resource record sets that Amazon Route 53 creates when you use a traffic policy to create a traffic policy instance.
    */
  var Type: RRType = js.native
}

object TrafficPolicySummary {
  @scala.inline
  def apply(
    Id: TrafficPolicyId,
    LatestVersion: TrafficPolicyVersion,
    Name: TrafficPolicyName,
    TrafficPolicyCount: TrafficPolicyVersion,
    Type: RRType
  ): TrafficPolicySummary = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], LatestVersion = LatestVersion.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], TrafficPolicyCount = TrafficPolicyCount.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrafficPolicySummary]
  }
  @scala.inline
  implicit class TrafficPolicySummaryOps[Self <: TrafficPolicySummary] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withId(value: TrafficPolicyId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLatestVersion(value: TrafficPolicyVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LatestVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withName(value: TrafficPolicyName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrafficPolicyCount(value: TrafficPolicyVersion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TrafficPolicyCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withType(value: RRType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Type")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

