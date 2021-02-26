package typingsSlinky.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateMyUserProfileRequest extends StObject {
  
  /**
    * The user's SSH public key.
    */
  var SshPublicKey: js.UndefOr[String] = js.native
}
object UpdateMyUserProfileRequest {
  
  @scala.inline
  def apply(): UpdateMyUserProfileRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMyUserProfileRequest]
  }
  
  @scala.inline
  implicit class UpdateMyUserProfileRequestMutableBuilder[Self <: UpdateMyUserProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSshPublicKey(value: String): Self = StObject.set(x, "SshPublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSshPublicKeyUndefined: Self = StObject.set(x, "SshPublicKey", js.undefined)
  }
}
