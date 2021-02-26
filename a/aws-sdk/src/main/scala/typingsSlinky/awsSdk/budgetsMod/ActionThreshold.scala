package typingsSlinky.awsSdk.budgetsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionThreshold extends StObject {
  
  var ActionThresholdType: ThresholdType = js.native
  
  var ActionThresholdValue: NotificationThreshold = js.native
}
object ActionThreshold {
  
  @scala.inline
  def apply(ActionThresholdType: ThresholdType, ActionThresholdValue: NotificationThreshold): ActionThreshold = {
    val __obj = js.Dynamic.literal(ActionThresholdType = ActionThresholdType.asInstanceOf[js.Any], ActionThresholdValue = ActionThresholdValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionThreshold]
  }
  
  @scala.inline
  implicit class ActionThresholdMutableBuilder[Self <: ActionThreshold] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionThresholdType(value: ThresholdType): Self = StObject.set(x, "ActionThresholdType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionThresholdValue(value: NotificationThreshold): Self = StObject.set(x, "ActionThresholdValue", value.asInstanceOf[js.Any])
  }
}
