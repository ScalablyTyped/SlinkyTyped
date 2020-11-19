package typingsSlinky.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setId(value: TrafficPolicyId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestVersion(value: TrafficPolicyVersion): Self = this.set("LatestVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: TrafficPolicyName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficPolicyCount(value: TrafficPolicyVersion): Self = this.set("TrafficPolicyCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: RRType): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
}
