package typingsSlinky.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyTypeDescription extends StObject {
  
  /**
    * A description of the policy type.
    */
  var Description: js.UndefOr[typingsSlinky.awsSdk.elbMod.Description] = js.native
  
  /**
    * The description of the policy attributes associated with the policies defined by Elastic Load Balancing.
    */
  var PolicyAttributeTypeDescriptions: js.UndefOr[typingsSlinky.awsSdk.elbMod.PolicyAttributeTypeDescriptions] = js.native
  
  /**
    * The name of the policy type.
    */
  var PolicyTypeName: js.UndefOr[typingsSlinky.awsSdk.elbMod.PolicyTypeName] = js.native
}
object PolicyTypeDescription {
  
  @scala.inline
  def apply(): PolicyTypeDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyTypeDescription]
  }
  
  @scala.inline
  implicit class PolicyTypeDescriptionMutableBuilder[Self <: PolicyTypeDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setPolicyAttributeTypeDescriptions(value: PolicyAttributeTypeDescriptions): Self = StObject.set(x, "PolicyAttributeTypeDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyAttributeTypeDescriptionsUndefined: Self = StObject.set(x, "PolicyAttributeTypeDescriptions", js.undefined)
    
    @scala.inline
    def setPolicyAttributeTypeDescriptionsVarargs(value: PolicyAttributeTypeDescription*): Self = StObject.set(x, "PolicyAttributeTypeDescriptions", js.Array(value :_*))
    
    @scala.inline
    def setPolicyTypeName(value: PolicyTypeName): Self = StObject.set(x, "PolicyTypeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolicyTypeNameUndefined: Self = StObject.set(x, "PolicyTypeName", js.undefined)
  }
}
