package typingsSlinky.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteScheduledActionType extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  
  /**
    * The name of the action to delete.
    */
  var ScheduledActionName: ResourceName = js.native
}
object DeleteScheduledActionType {
  
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName, ScheduledActionName: ResourceName): DeleteScheduledActionType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], ScheduledActionName = ScheduledActionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteScheduledActionType]
  }
  
  @scala.inline
  implicit class DeleteScheduledActionTypeMutableBuilder[Self <: DeleteScheduledActionType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScalingGroupName(value: ResourceName): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledActionName(value: ResourceName): Self = StObject.set(x, "ScheduledActionName", value.asInstanceOf[js.Any])
  }
}
