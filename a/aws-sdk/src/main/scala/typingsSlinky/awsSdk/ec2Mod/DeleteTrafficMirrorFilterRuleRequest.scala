package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTrafficMirrorFilterRuleRequest extends js.Object {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the Traffic Mirror rule.
    */
  var TrafficMirrorFilterRuleId: typingsSlinky.awsSdk.ec2Mod.TrafficMirrorFilterRuleId = js.native
}
object DeleteTrafficMirrorFilterRuleRequest {
  
  @scala.inline
  def apply(TrafficMirrorFilterRuleId: TrafficMirrorFilterRuleId): DeleteTrafficMirrorFilterRuleRequest = {
    val __obj = js.Dynamic.literal(TrafficMirrorFilterRuleId = TrafficMirrorFilterRuleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTrafficMirrorFilterRuleRequest]
  }
  
  @scala.inline
  implicit class DeleteTrafficMirrorFilterRuleRequestOps[Self <: DeleteTrafficMirrorFilterRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTrafficMirrorFilterRuleId(value: TrafficMirrorFilterRuleId): Self = this.set("TrafficMirrorFilterRuleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
  }
}
