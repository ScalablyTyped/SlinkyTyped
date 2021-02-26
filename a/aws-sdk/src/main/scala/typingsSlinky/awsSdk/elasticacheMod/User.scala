package typingsSlinky.awsSdk.elasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait User extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the user account.
    */
  var ARN: js.UndefOr[String] = js.native
  
  /**
    * Access permissions string used for this user account.
    */
  var AccessString: js.UndefOr[String] = js.native
  
  /**
    * Denotes whether the user requires a password to authenticate.
    */
  var Authentication: js.UndefOr[typingsSlinky.awsSdk.elasticacheMod.Authentication] = js.native
  
  /**
    * Must be Redis. 
    */
  var Engine: js.UndefOr[EngineType] = js.native
  
  /**
    * Indicates the user status. Can be "active", "modifying" or "deleting".
    */
  var Status: js.UndefOr[String] = js.native
  
  /**
    * Returns a list of the user group IDs the user belongs to.
    */
  var UserGroupIds: js.UndefOr[UserGroupIdList] = js.native
  
  /**
    * The ID of the user.
    */
  var UserId: js.UndefOr[String] = js.native
  
  /**
    * The username of the user.
    */
  var UserName: js.UndefOr[String] = js.native
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
    def setARN(value: String): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    @scala.inline
    def setAccessString(value: String): Self = StObject.set(x, "AccessString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessStringUndefined: Self = StObject.set(x, "AccessString", js.undefined)
    
    @scala.inline
    def setAuthentication(value: Authentication): Self = StObject.set(x, "Authentication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthenticationUndefined: Self = StObject.set(x, "Authentication", js.undefined)
    
    @scala.inline
    def setEngine(value: EngineType): Self = StObject.set(x, "Engine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEngineUndefined: Self = StObject.set(x, "Engine", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setUserGroupIds(value: UserGroupIdList): Self = StObject.set(x, "UserGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserGroupIdsUndefined: Self = StObject.set(x, "UserGroupIds", js.undefined)
    
    @scala.inline
    def setUserGroupIdsVarargs(value: UserGroupId*): Self = StObject.set(x, "UserGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
    
    @scala.inline
    def setUserName(value: String): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
  }
}
