package typingsSlinky.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Credential extends StObject {
  
  /**
    * The RFC2617 compliant password associated with the SIP credentials, in US-ASCII format.
    */
  var Password: js.UndefOr[SensitiveString] = js.native
  
  /**
    * The RFC2617 compliant user name associated with the SIP credentials, in US-ASCII format.
    */
  var Username: js.UndefOr[SensitiveString] = js.native
}
object Credential {
  
  @scala.inline
  def apply(): Credential = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Credential]
  }
  
  @scala.inline
  implicit class CredentialMutableBuilder[Self <: Credential] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPassword(value: SensitiveString): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPasswordUndefined: Self = StObject.set(x, "Password", js.undefined)
    
    @scala.inline
    def setUsername(value: SensitiveString): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
