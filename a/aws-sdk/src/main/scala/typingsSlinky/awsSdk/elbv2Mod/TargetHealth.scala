package typingsSlinky.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetHealth extends StObject {
  
  /**
    * A description of the target health that provides additional details. If the state is healthy, a description is not provided.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.elbv2Mod.Description] = js.native
  
  /**
    * The reason code. If the target state is healthy, a reason code is not provided. If the target state is initial, the reason code can be one of the following values:    Elb.RegistrationInProgress - The target is in the process of being registered with the load balancer.    Elb.InitialHealthChecking - The load balancer is still sending the target the minimum number of health checks required to determine its health status.   If the target state is unhealthy, the reason code can be one of the following values:    Target.ResponseCodeMismatch - The health checks did not return an expected HTTP code. Applies only to Application Load Balancers and Gateway Load Balancers.    Target.Timeout - The health check requests timed out. Applies only to Application Load Balancers and Gateway Load Balancers.    Target.FailedHealthChecks - The load balancer received an error while establishing a connection to the target or the target response was malformed.    Elb.InternalError - The health checks failed due to an internal error. Applies only to Application Load Balancers.   If the target state is unused, the reason code can be one of the following values:    Target.NotRegistered - The target is not registered with the target group.    Target.NotInUse - The target group is not used by any load balancer or the target is in an Availability Zone that is not enabled for its load balancer.    Target.InvalidState - The target is in the stopped or terminated state.    Target.IpUnusable - The target IP address is reserved for use by a load balancer.   If the target state is draining, the reason code can be the following value:    Target.DeregistrationInProgress - The target is in the process of being deregistered and the deregistration delay period has not expired.   If the target state is unavailable, the reason code can be the following value:    Target.HealthCheckDisabled - Health checks are disabled for the target group. Applies only to Application Load Balancers.    Elb.InternalError - Target health is unavailable due to an internal error. Applies only to Network Load Balancers.  
    */
  var Reason: js.UndefOr[TargetHealthReasonEnum] = js.native
  
  /**
    * The state of the target.
    */
  var State: js.UndefOr[TargetHealthStateEnum] = js.native
}
object TargetHealth {
  
  @scala.inline
  def apply(): TargetHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetHealth]
  }
  
  @scala.inline
  implicit class TargetHealthMutableBuilder[Self <: TargetHealth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setReason(value: TargetHealthReasonEnum): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "Reason", js.undefined)
    
    @scala.inline
    def setState(value: TargetHealthStateEnum): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
