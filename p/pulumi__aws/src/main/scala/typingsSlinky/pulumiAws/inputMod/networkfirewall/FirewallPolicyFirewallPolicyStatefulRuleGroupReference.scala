package typingsSlinky.pulumiAws.inputMod.networkfirewall

import typingsSlinky.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirewallPolicyFirewallPolicyStatefulRuleGroupReference extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the stateful rule group.
    */
  var resourceArn: Input[String] = js.native
}
object FirewallPolicyFirewallPolicyStatefulRuleGroupReference {
  
  @scala.inline
  def apply(resourceArn: Input[String]): FirewallPolicyFirewallPolicyStatefulRuleGroupReference = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirewallPolicyFirewallPolicyStatefulRuleGroupReference]
  }
  
  @scala.inline
  implicit class FirewallPolicyFirewallPolicyStatefulRuleGroupReferenceMutableBuilder[Self <: FirewallPolicyFirewallPolicyStatefulRuleGroupReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceArn(value: Input[String]): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
  }
}
