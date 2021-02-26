package typingsSlinky.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteTrafficMirrorFilterRuleResult extends StObject {
  
  /**
    * The ID of the deleted Traffic Mirror rule.
    */
  var TrafficMirrorFilterRuleId: js.UndefOr[String] = js.native
}
object DeleteTrafficMirrorFilterRuleResult {
  
  @scala.inline
  def apply(): DeleteTrafficMirrorFilterRuleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTrafficMirrorFilterRuleResult]
  }
  
  @scala.inline
  implicit class DeleteTrafficMirrorFilterRuleResultMutableBuilder[Self <: DeleteTrafficMirrorFilterRuleResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTrafficMirrorFilterRuleId(value: String): Self = StObject.set(x, "TrafficMirrorFilterRuleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrafficMirrorFilterRuleIdUndefined: Self = StObject.set(x, "TrafficMirrorFilterRuleId", js.undefined)
  }
}
