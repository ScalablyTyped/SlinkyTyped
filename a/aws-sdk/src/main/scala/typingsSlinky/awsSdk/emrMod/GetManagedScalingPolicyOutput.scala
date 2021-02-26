package typingsSlinky.awsSdk.emrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetManagedScalingPolicyOutput extends StObject {
  
  /**
    *  Specifies the managed scaling policy that is attached to an Amazon EMR cluster. 
    */
  var ManagedScalingPolicy: js.UndefOr[typingsSlinky.awsSdk.emrMod.ManagedScalingPolicy] = js.native
}
object GetManagedScalingPolicyOutput {
  
  @scala.inline
  def apply(): GetManagedScalingPolicyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetManagedScalingPolicyOutput]
  }
  
  @scala.inline
  implicit class GetManagedScalingPolicyOutputMutableBuilder[Self <: GetManagedScalingPolicyOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManagedScalingPolicy(value: ManagedScalingPolicy): Self = StObject.set(x, "ManagedScalingPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManagedScalingPolicyUndefined: Self = StObject.set(x, "ManagedScalingPolicy", js.undefined)
  }
}
