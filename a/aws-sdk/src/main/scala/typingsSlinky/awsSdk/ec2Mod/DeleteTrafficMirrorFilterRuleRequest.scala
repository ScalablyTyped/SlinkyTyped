package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTrafficMirrorFilterRuleRequest extends StObject {
  
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
  implicit class DeleteTrafficMirrorFilterRuleRequestMutableBuilder[Self <: DeleteTrafficMirrorFilterRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setTrafficMirrorFilterRuleId(value: TrafficMirrorFilterRuleId): Self = StObject.set(x, "TrafficMirrorFilterRuleId", value.asInstanceOf[js.Any])
  }
}
