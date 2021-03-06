package typingsSlinky.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemberFabricConfiguration extends StObject {
  
  /**
    * The password for the member's initial administrative user. The AdminPassword must be at least eight characters long and no more than 32 characters. It must contain at least one uppercase letter, one lowercase letter, and one digit. It cannot have a single quote(‘), double quote(“), forward slash(/), backward slash(\), @, or a space.
    */
  var AdminPassword: PasswordString = js.native
  
  /**
    * The user name for the member's initial administrative user.
    */
  var AdminUsername: UsernameString = js.native
}
object MemberFabricConfiguration {
  
  @scala.inline
  def apply(AdminPassword: PasswordString, AdminUsername: UsernameString): MemberFabricConfiguration = {
    val __obj = js.Dynamic.literal(AdminPassword = AdminPassword.asInstanceOf[js.Any], AdminUsername = AdminUsername.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberFabricConfiguration]
  }
  
  @scala.inline
  implicit class MemberFabricConfigurationMutableBuilder[Self <: MemberFabricConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdminPassword(value: PasswordString): Self = StObject.set(x, "AdminPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdminUsername(value: UsernameString): Self = StObject.set(x, "AdminUsername", value.asInstanceOf[js.Any])
  }
}
