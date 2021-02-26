package typingsSlinky.awsSdk.gameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstanceCredentials extends StObject {
  
  /**
    * Secret string. For Windows instances, the secret is a password for use with Windows Remote Desktop. For Linux instances, it is a private key (which must be saved as a .pem file) for use with SSH.
    */
  var Secret: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * User login string.
    */
  var UserName: js.UndefOr[NonEmptyString] = js.native
}
object InstanceCredentials {
  
  @scala.inline
  def apply(): InstanceCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceCredentials]
  }
  
  @scala.inline
  implicit class InstanceCredentialsMutableBuilder[Self <: InstanceCredentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecret(value: NonEmptyString): Self = StObject.set(x, "Secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretUndefined: Self = StObject.set(x, "Secret", js.undefined)
    
    @scala.inline
    def setUserName(value: NonEmptyString): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
  }
}
