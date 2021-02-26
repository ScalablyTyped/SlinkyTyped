package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModifyTrafficMirrorFilterRuleResult extends StObject {
  
  /**
    * Modifies a Traffic Mirror rule.
    */
  var TrafficMirrorFilterRule: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.TrafficMirrorFilterRule] = js.native
}
object ModifyTrafficMirrorFilterRuleResult {
  
  @scala.inline
  def apply(): ModifyTrafficMirrorFilterRuleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyTrafficMirrorFilterRuleResult]
  }
  
  @scala.inline
  implicit class ModifyTrafficMirrorFilterRuleResultMutableBuilder[Self <: ModifyTrafficMirrorFilterRuleResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrafficMirrorFilterRule(value: TrafficMirrorFilterRule): Self = StObject.set(x, "TrafficMirrorFilterRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficMirrorFilterRuleUndefined: Self = StObject.set(x, "TrafficMirrorFilterRule", js.undefined)
  }
}
