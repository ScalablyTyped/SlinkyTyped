package typingsSlinky.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SecurityPolicyRule extends StObject {
  
  /** The Action to preform when the client connection triggers the rule. Can currently be either "allow" or "deny()" where valid values for status are 403, 404, and 502. */
  var action: js.UndefOr[String] = js.native
  
  /** An optional description of this resource. Provide this property when you create the resource. */
  var description: js.UndefOr[String] = js.native
  
  /** [Output only] Type of the resource. Always compute#securityPolicyRule for security policy rules */
  var kind: js.UndefOr[String] = js.native
  
  /** A match condition that incoming traffic is evaluated against. If it evaluates to true, the corresponding 'action' is enforced. */
  var `match`: js.UndefOr[SecurityPolicyRuleMatcher] = js.native
  
  /** If set to true, the specified action is not enforced. */
  var preview: js.UndefOr[Boolean] = js.native
  
  /**
    * An integer indicating the priority of a rule in the list. The priority must be a positive value between 0 and 2147483647. Rules are evaluated from highest to lowest priority where 0
    * is the highest priority and 2147483647 is the lowest prority.
    */
  var priority: js.UndefOr[Double] = js.native
}
object SecurityPolicyRule {
  
  @scala.inline
  def apply(): SecurityPolicyRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityPolicyRule]
  }
  
  @scala.inline
  implicit class SecurityPolicyRuleMutableBuilder[Self <: SecurityPolicyRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setMatch(value: SecurityPolicyRuleMatcher): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    @scala.inline
    def setPreview(value: Boolean): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
  }
}
