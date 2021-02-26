package typingsSlinky.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetGroupTuple extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the target group.
    */
  var TargetGroupArn: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.TargetGroupArn] = js.native
  
  /**
    * The weight. The range is 0 to 999.
    */
  var Weight: js.UndefOr[TargetGroupWeight] = js.native
}
object TargetGroupTuple {
  
  @scala.inline
  def apply(): TargetGroupTuple = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetGroupTuple]
  }
  
  @scala.inline
  implicit class TargetGroupTupleMutableBuilder[Self <: TargetGroupTuple] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetGroupArn(value: TargetGroupArn): Self = StObject.set(x, "TargetGroupArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetGroupArnUndefined: Self = StObject.set(x, "TargetGroupArn", js.undefined)
    
    @scala.inline
    def setWeight(value: TargetGroupWeight): Self = StObject.set(x, "Weight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightUndefined: Self = StObject.set(x, "Weight", js.undefined)
  }
}
