package typingsSlinky.awsSdk.elasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoScalingGroup extends StObject {
  
  /**
    * The name of the AutoScalingGroup . 
    */
  var Name: js.UndefOr[ResourceId] = js.native
}
object AutoScalingGroup {
  
  @scala.inline
  def apply(): AutoScalingGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoScalingGroup]
  }
  
  @scala.inline
  implicit class AutoScalingGroupMutableBuilder[Self <: AutoScalingGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: ResourceId): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
