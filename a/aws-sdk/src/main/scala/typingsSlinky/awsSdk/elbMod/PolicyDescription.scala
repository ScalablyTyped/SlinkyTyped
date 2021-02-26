package typingsSlinky.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyDescription extends StObject {
  
  /**
    * The policy attributes.
    */
  var PolicyAttributeDescriptions: js.UndefOr[typingsSlinky.awsSdk.elbMod.PolicyAttributeDescriptions] = js.native
  
  /**
    * The name of the policy.
    */
  var PolicyName: js.UndefOr[typingsSlinky.awsSdk.elbMod.PolicyName] = js.native
  
  /**
    * The name of the policy type.
    */
  var PolicyTypeName: js.UndefOr[typingsSlinky.awsSdk.elbMod.PolicyTypeName] = js.native
}
object PolicyDescription {
  
  @scala.inline
  def apply(): PolicyDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyDescription]
  }
  
  @scala.inline
  implicit class PolicyDescriptionMutableBuilder[Self <: PolicyDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicyAttributeDescriptions(value: PolicyAttributeDescriptions): Self = StObject.set(x, "PolicyAttributeDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyAttributeDescriptionsUndefined: Self = StObject.set(x, "PolicyAttributeDescriptions", js.undefined)
    
    @scala.inline
    def setPolicyAttributeDescriptionsVarargs(value: PolicyAttributeDescription*): Self = StObject.set(x, "PolicyAttributeDescriptions", js.Array(value :_*))
    
    @scala.inline
    def setPolicyName(value: PolicyName): Self = StObject.set(x, "PolicyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyNameUndefined: Self = StObject.set(x, "PolicyName", js.undefined)
    
    @scala.inline
    def setPolicyTypeName(value: PolicyTypeName): Self = StObject.set(x, "PolicyTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyTypeNameUndefined: Self = StObject.set(x, "PolicyTypeName", js.undefined)
  }
}
