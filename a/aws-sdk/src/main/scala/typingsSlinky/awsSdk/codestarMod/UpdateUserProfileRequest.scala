package typingsSlinky.awsSdk.codestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateUserProfileRequest extends StObject {
  
  /**
    * The name that is displayed as the friendly name for the user in AWS CodeStar.
    */
  var displayName: js.UndefOr[UserProfileDisplayName] = js.native
  
  /**
    * The email address that is displayed as part of the user's profile in AWS CodeStar.
    */
  var emailAddress: js.UndefOr[Email] = js.native
  
  /**
    * The SSH public key associated with the user in AWS CodeStar. If a project owner allows the user remote access to project resources, this public key will be used along with the user's private key for SSH access.
    */
  var sshPublicKey: js.UndefOr[SshPublicKey] = js.native
  
  /**
    * The name that will be displayed as the friendly name for the user in AWS CodeStar.
    */
  var userArn: UserArn = js.native
}
object UpdateUserProfileRequest {
  
  @scala.inline
  def apply(userArn: UserArn): UpdateUserProfileRequest = {
    val __obj = js.Dynamic.literal(userArn = userArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateUserProfileRequest]
  }
  
  @scala.inline
  implicit class UpdateUserProfileRequestMutableBuilder[Self <: UpdateUserProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: UserProfileDisplayName): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setEmailAddress(value: Email): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    @scala.inline
    def setSshPublicKey(value: SshPublicKey): Self = StObject.set(x, "sshPublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSshPublicKeyUndefined: Self = StObject.set(x, "sshPublicKey", js.undefined)
    
    @scala.inline
    def setUserArn(value: UserArn): Self = StObject.set(x, "userArn", value.asInstanceOf[js.Any])
  }
}
