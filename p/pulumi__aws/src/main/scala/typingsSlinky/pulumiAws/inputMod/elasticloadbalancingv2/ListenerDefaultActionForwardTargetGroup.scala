package typingsSlinky.pulumiAws.inputMod.elasticloadbalancingv2

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListenerDefaultActionForwardTargetGroup extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  var arn: Input[String] = js.native
  
  /**
    * The weight. The range is 0 to 999.
    */
  var weight: js.UndefOr[Input[Double]] = js.native
}
object ListenerDefaultActionForwardTargetGroup {
  
  @scala.inline
  def apply(arn: Input[String]): ListenerDefaultActionForwardTargetGroup = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerDefaultActionForwardTargetGroup]
  }
  
  @scala.inline
  implicit class ListenerDefaultActionForwardTargetGroupMutableBuilder[Self <: ListenerDefaultActionForwardTargetGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeight(value: Input[Double]): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
