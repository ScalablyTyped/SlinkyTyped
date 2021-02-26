package typingsSlinky.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VerificationRequest extends StObject {
  
  var Account: String = js.native
  
  var Session: String = js.native
  
  var User: String = js.native
  
  var VerificationRequest: String = js.native
}
object VerificationRequest {
  
  @scala.inline
  def apply(Account: String, Session: String, User: String, VerificationRequest: String): VerificationRequest = {
    val __obj = js.Dynamic.literal(Account = Account.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], User = User.asInstanceOf[js.Any], VerificationRequest = VerificationRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerificationRequest]
  }
  
  @scala.inline
  implicit class VerificationRequestMutableBuilder[Self <: VerificationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: String): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: String): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUser(value: String): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerificationRequest(value: String): Self = StObject.set(x, "VerificationRequest", value.asInstanceOf[js.Any])
  }
}
