package typingsSlinky.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyVersionIdentifier extends StObject {
  
  /**
    * The name of the policy.
    */
  var policyName: js.UndefOr[PolicyName] = js.native
  
  /**
    * The ID of the version of the policy associated with the resource.
    */
  var policyVersionId: js.UndefOr[PolicyVersionId] = js.native
}
object PolicyVersionIdentifier {
  
  @scala.inline
  def apply(): PolicyVersionIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyVersionIdentifier]
  }
  
  @scala.inline
  implicit class PolicyVersionIdentifierMutableBuilder[Self <: PolicyVersionIdentifier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyName(value: PolicyName): Self = StObject.set(x, "policyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyNameUndefined: Self = StObject.set(x, "policyName", js.undefined)
    
    @scala.inline
    def setPolicyVersionId(value: PolicyVersionId): Self = StObject.set(x, "policyVersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyVersionIdUndefined: Self = StObject.set(x, "policyVersionId", js.undefined)
  }
}
