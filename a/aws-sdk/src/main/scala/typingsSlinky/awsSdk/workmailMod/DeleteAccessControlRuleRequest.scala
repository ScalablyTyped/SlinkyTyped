package typingsSlinky.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteAccessControlRuleRequest extends StObject {
  
  /**
    * The name of the access control rule.
    */
  var Name: AccessControlRuleName = js.native
  
  /**
    * The identifier for the organization.
    */
  var OrganizationId: typingsSlinky.awsSdk.workmailMod.OrganizationId = js.native
}
object DeleteAccessControlRuleRequest {
  
  @scala.inline
  def apply(Name: AccessControlRuleName, OrganizationId: OrganizationId): DeleteAccessControlRuleRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAccessControlRuleRequest]
  }
  
  @scala.inline
  implicit class DeleteAccessControlRuleRequestMutableBuilder[Self <: DeleteAccessControlRuleRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: AccessControlRuleName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
