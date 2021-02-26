package typingsSlinky.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait User extends StObject {
  
  /**
    * The active status of user. When you create an Amazon QuickSight user that’s not an IAM user or an Active Directory user, that user is inactive until they sign in and provide a password.
    */
  var Active: js.UndefOr[Boolean] = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the user.
    */
  var Arn: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.Arn] = js.native
  
  /**
    * The custom permissions profile associated with this user.
    */
  var CustomPermissionsName: js.UndefOr[RoleName] = js.native
  
  /**
    * The user's email address.
    */
  var Email: js.UndefOr[String] = js.native
  
  /**
    * The type of identity authentication used by the user.
    */
  var IdentityType: js.UndefOr[typingsSlinky.awsSdk.quicksightMod.IdentityType] = js.native
  
  /**
    * The principal ID of the user.
    */
  var PrincipalId: js.UndefOr[String] = js.native
  
  /**
    * The Amazon QuickSight role for the user. The user role can be one of the following:.    READER: A user who has read-only access to dashboards.    AUTHOR: A user who can create data sources, datasets, analyses, and dashboards.    ADMIN: A user who is an author, who can also manage Amazon QuickSight settings.    RESTRICTED_READER: This role isn't currently available for use.    RESTRICTED_AUTHOR: This role isn't currently available for use.  
    */
  var Role: js.UndefOr[UserRole] = js.native
  
  /**
    * The user's user name.
    */
  var UserName: js.UndefOr[UserName_] = js.native
}
object User {
  
  @scala.inline
  def apply(): User = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit class UserMutableBuilder[Self <: User] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActive(value: Boolean): Self = StObject.set(x, "Active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveUndefined: Self = StObject.set(x, "Active", js.undefined)
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCustomPermissionsName(value: RoleName): Self = StObject.set(x, "CustomPermissionsName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomPermissionsNameUndefined: Self = StObject.set(x, "CustomPermissionsName", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "Email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "Email", js.undefined)
    
    @scala.inline
    def setIdentityType(value: IdentityType): Self = StObject.set(x, "IdentityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityTypeUndefined: Self = StObject.set(x, "IdentityType", js.undefined)
    
    @scala.inline
    def setPrincipalId(value: String): Self = StObject.set(x, "PrincipalId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalIdUndefined: Self = StObject.set(x, "PrincipalId", js.undefined)
    
    @scala.inline
    def setRole(value: UserRole): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
    
    @scala.inline
    def setUserName(value: UserName_): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
  }
}
