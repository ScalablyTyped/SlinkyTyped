package typingsSlinky.firebaseAuthTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserCredential extends StObject {
  
  var additionalUserInfo: js.UndefOr[AdditionalUserInfo | Null] = js.native
  
  var credential: AuthCredential | Null = js.native
  
  var operationType: js.UndefOr[String | Null] = js.native
  
  var user: User | Null = js.native
}
object UserCredential {
  
  @scala.inline
  def apply(): UserCredential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserCredential]
  }
  
  @scala.inline
  implicit class UserCredentialMutableBuilder[Self <: UserCredential] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdditionalUserInfo(value: AdditionalUserInfo): Self = StObject.set(x, "additionalUserInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdditionalUserInfoNull: Self = StObject.set(x, "additionalUserInfo", null)
    
    @scala.inline
    def setAdditionalUserInfoUndefined: Self = StObject.set(x, "additionalUserInfo", js.undefined)
    
    @scala.inline
    def setCredential(value: AuthCredential): Self = StObject.set(x, "credential", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialNull: Self = StObject.set(x, "credential", null)
    
    @scala.inline
    def setOperationType(value: String): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationTypeNull: Self = StObject.set(x, "operationType", null)
    
    @scala.inline
    def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
    
    @scala.inline
    def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNull: Self = StObject.set(x, "user", null)
  }
}
