package typingsSlinky.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DetachInstancesQuery extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  
  /**
    * The IDs of the instances. You can specify up to 20 instances.
    */
  var InstanceIds: js.UndefOr[typingsSlinky.awsSdk.autoscalingMod.InstanceIds] = js.native
  
  /**
    * Indicates whether the Auto Scaling group decrements the desired capacity value by the number of instances detached.
    */
  var ShouldDecrementDesiredCapacity: typingsSlinky.awsSdk.autoscalingMod.ShouldDecrementDesiredCapacity = js.native
}
object DetachInstancesQuery {
  
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName, ShouldDecrementDesiredCapacity: ShouldDecrementDesiredCapacity): DetachInstancesQuery = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], ShouldDecrementDesiredCapacity = ShouldDecrementDesiredCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachInstancesQuery]
  }
  
  @scala.inline
  implicit class DetachInstancesQueryMutableBuilder[Self <: DetachInstancesQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScalingGroupName(value: ResourceName): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIds(value: InstanceIds): Self = StObject.set(x, "InstanceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdsUndefined: Self = StObject.set(x, "InstanceIds", js.undefined)
    
    @scala.inline
    def setInstanceIdsVarargs(value: XmlStringMaxLen19*): Self = StObject.set(x, "InstanceIds", js.Array(value :_*))
    
    @scala.inline
    def setShouldDecrementDesiredCapacity(value: ShouldDecrementDesiredCapacity): Self = StObject.set(x, "ShouldDecrementDesiredCapacity", value.asInstanceOf[js.Any])
  }
}
