package typingsSlinky.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegisterToWorkMailRequest extends StObject {
  
  /**
    * The email for the user, group, or resource to be updated.
    */
  var Email: EmailAddress = js.native
  
  /**
    * The identifier for the user, group, or resource to be updated.
    */
  var EntityId: WorkMailIdentifier = js.native
  
  /**
    * The identifier for the organization under which the user, group, or resource exists.
    */
  var OrganizationId: typingsSlinky.awsSdk.workmailMod.OrganizationId = js.native
}
object RegisterToWorkMailRequest {
  
  @scala.inline
  def apply(Email: EmailAddress, EntityId: WorkMailIdentifier, OrganizationId: OrganizationId): RegisterToWorkMailRequest = {
    val __obj = js.Dynamic.literal(Email = Email.asInstanceOf[js.Any], EntityId = EntityId.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterToWorkMailRequest]
  }
  
  @scala.inline
  implicit class RegisterToWorkMailRequestMutableBuilder[Self <: RegisterToWorkMailRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: EmailAddress): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityId(value: WorkMailIdentifier): Self = StObject.set(x, "EntityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
  }
}
