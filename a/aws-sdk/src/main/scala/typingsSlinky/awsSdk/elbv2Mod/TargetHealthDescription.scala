package typingsSlinky.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetHealthDescription extends StObject {
  
  /**
    * The port to use to connect with the target.
    */
  var HealthCheckPort: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.HealthCheckPort] = js.native
  
  /**
    * The description of the target.
    */
  var Target: js.UndefOr[TargetDescription] = js.native
  
  /**
    * The health information for the target.
    */
  var TargetHealth: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.TargetHealth] = js.native
}
object TargetHealthDescription {
  
  @scala.inline
  def apply(): TargetHealthDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetHealthDescription]
  }
  
  @scala.inline
  implicit class TargetHealthDescriptionMutableBuilder[Self <: TargetHealthDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHealthCheckPort(value: HealthCheckPort): Self = StObject.set(x, "HealthCheckPort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckPortUndefined: Self = StObject.set(x, "HealthCheckPort", js.undefined)
    
    @scala.inline
    def setTarget(value: TargetDescription): Self = StObject.set(x, "Target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetHealth(value: TargetHealth): Self = StObject.set(x, "TargetHealth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetHealthUndefined: Self = StObject.set(x, "TargetHealth", js.undefined)
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "Target", js.undefined)
  }
}
