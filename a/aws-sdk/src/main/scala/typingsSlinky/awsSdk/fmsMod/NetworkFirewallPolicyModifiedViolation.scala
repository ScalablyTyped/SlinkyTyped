package typingsSlinky.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkFirewallPolicyModifiedViolation extends StObject {
  
  /**
    * The policy that's currently in use in the individual account. 
    */
  var CurrentPolicyDescription: js.UndefOr[NetworkFirewallPolicyDescription] = js.native
  
  /**
    * The policy that should be in use in the individual account in order to be compliant. 
    */
  var ExpectedPolicyDescription: js.UndefOr[NetworkFirewallPolicyDescription] = js.native
  
  /**
    * The ID of the AWS Network Firewall or VPC resource that's in violation.
    */
  var ViolationTarget: js.UndefOr[typingsSlinky.awsSdk.fmsMod.ViolationTarget] = js.native
}
object NetworkFirewallPolicyModifiedViolation {
  
  @scala.inline
  def apply(): NetworkFirewallPolicyModifiedViolation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkFirewallPolicyModifiedViolation]
  }
  
  @scala.inline
  implicit class NetworkFirewallPolicyModifiedViolationMutableBuilder[Self <: NetworkFirewallPolicyModifiedViolation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentPolicyDescription(value: NetworkFirewallPolicyDescription): Self = StObject.set(x, "CurrentPolicyDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentPolicyDescriptionUndefined: Self = StObject.set(x, "CurrentPolicyDescription", js.undefined)
    
    @scala.inline
    def setExpectedPolicyDescription(value: NetworkFirewallPolicyDescription): Self = StObject.set(x, "ExpectedPolicyDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedPolicyDescriptionUndefined: Self = StObject.set(x, "ExpectedPolicyDescription", js.undefined)
    
    @scala.inline
    def setViolationTarget(value: ViolationTarget): Self = StObject.set(x, "ViolationTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViolationTargetUndefined: Self = StObject.set(x, "ViolationTarget", js.undefined)
  }
}
