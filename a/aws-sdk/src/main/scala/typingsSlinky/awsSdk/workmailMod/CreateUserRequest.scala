package typingsSlinky.awsSdk.workmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateUserRequest extends StObject {
  
  /**
    * The display name for the new user.
    */
  var DisplayName: String = js.native
  
  /**
    * The name for the new user. WorkMail directory user names have a maximum length of 64. All others have a maximum length of 20.
    */
  var Name: UserName = js.native
  
  /**
    * The identifier of the organization for which the user is created.
    */
  var OrganizationId: typingsSlinky.awsSdk.workmailMod.OrganizationId = js.native
  
  /**
    * The password for the new user.
    */
  var Password: typingsSlinky.awsSdk.workmailMod.Password = js.native
}
object CreateUserRequest {
  
  @scala.inline
  def apply(DisplayName: String, Name: UserName, OrganizationId: OrganizationId, Password: Password): CreateUserRequest = {
    val __obj = js.Dynamic.literal(DisplayName = DisplayName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OrganizationId = OrganizationId.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUserRequest]
  }
  
  @scala.inline
  implicit class CreateUserRequestMutableBuilder[Self <: CreateUserRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: UserName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationId(value: OrganizationId): Self = StObject.set(x, "OrganizationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: Password): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
  }
}
