package typingsSlinky.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeregisterTargetsInput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  var TargetGroupArn: typingsSlinky.awsSdk.elbv2Mod.TargetGroupArn = js.native
  
  /**
    * The targets. If you specified a port override when you registered a target, you must specify both the target ID and the port when you deregister it.
    */
  var Targets: TargetDescriptions = js.native
}
object DeregisterTargetsInput {
  
  @scala.inline
  def apply(TargetGroupArn: TargetGroupArn, Targets: TargetDescriptions): DeregisterTargetsInput = {
    val __obj = js.Dynamic.literal(TargetGroupArn = TargetGroupArn.asInstanceOf[js.Any], Targets = Targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterTargetsInput]
  }
  
  @scala.inline
  implicit class DeregisterTargetsInputMutableBuilder[Self <: DeregisterTargetsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetGroupArn(value: TargetGroupArn): Self = StObject.set(x, "TargetGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargets(value: TargetDescriptions): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsVarargs(value: TargetDescription*): Self = StObject.set(x, "Targets", js.Array(value :_*))
  }
}
