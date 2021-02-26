package typingsSlinky.pulumiAws.outputMod.lb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListenerRuleActionForwardTargetGroup extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  var arn: String = js.native
  
  /**
    * The weight. The range is 0 to 999.
    */
  var weight: js.UndefOr[Double] = js.native
}
object ListenerRuleActionForwardTargetGroup {
  
  @scala.inline
  def apply(arn: String): ListenerRuleActionForwardTargetGroup = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerRuleActionForwardTargetGroup]
  }
  
  @scala.inline
  implicit class ListenerRuleActionForwardTargetGroupMutableBuilder[Self <: ListenerRuleActionForwardTargetGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
