package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.com_.sun.star.task.ClassifiedInteractionRequest
import typingsSlinky.activexLibreoffice.com_.sun.star.task.InteractionClassification
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An error specifying lack of correct authentication data (e.g., to log into an account). */
@js.native
trait AuthenticationRequest extends ClassifiedInteractionRequest {
  
  /**
    * Any already specified account.
    *
    * If HasAccount is false, this member should be ignored.
    */
  var Account: String = js.native
  
  /** Any diagnostic message about the failure to log in (if applicable; it will typically be an English phrase or sentence). */
  var Diagnostic: String = js.native
  
  /** Specifies if the authentication involves an "account" (as can be the case for FTP). */
  var HasAccount: Boolean = js.native
  
  /** Specifies if the authentication involves a "password" (as is almost always the case). */
  var HasPassword: Boolean = js.native
  
  /** Specifies if the authentication involves a "realm" (as can be the case for HTTP). */
  var HasRealm: Boolean = js.native
  
  /** Specifies if the authentication involves a "user name" (as is almost always the case). */
  var HasUserName: Boolean = js.native
  
  /**
    * Any already specified password.
    *
    * If HasPassword is false, this member should be ignored.
    */
  var Password: String = js.native
  
  /**
    * Any already specified realm.
    *
    * If HasRealm is false, this member should be ignored.
    */
  var Realm: String = js.native
  
  /** The name of the server (if applicable). */
  var ServerName: String = js.native
  
  /**
    * Any already specified user name.
    *
    * If HasUserName is false, this member should be ignored.
    */
  var UserName: String = js.native
}
object AuthenticationRequest {
  
  @scala.inline
  def apply(
    Account: String,
    Classification: InteractionClassification,
    Context: XInterface,
    Diagnostic: String,
    HasAccount: Boolean,
    HasPassword: Boolean,
    HasRealm: Boolean,
    HasUserName: Boolean,
    Message: String,
    Password: String,
    Realm: String,
    ServerName: String,
    UserName: String
  ): AuthenticationRequest = {
    val __obj = js.Dynamic.literal(Account = Account.asInstanceOf[js.Any], Classification = Classification.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Diagnostic = Diagnostic.asInstanceOf[js.Any], HasAccount = HasAccount.asInstanceOf[js.Any], HasPassword = HasPassword.asInstanceOf[js.Any], HasRealm = HasRealm.asInstanceOf[js.Any], HasUserName = HasUserName.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], Realm = Realm.asInstanceOf[js.Any], ServerName = ServerName.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationRequest]
  }
  
  @scala.inline
  implicit class AuthenticationRequestMutableBuilder[Self <: AuthenticationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: String): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiagnostic(value: String): Self = StObject.set(x, "Diagnostic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasAccount(value: Boolean): Self = StObject.set(x, "HasAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasPassword(value: Boolean): Self = StObject.set(x, "HasPassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasRealm(value: Boolean): Self = StObject.set(x, "HasRealm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasUserName(value: Boolean): Self = StObject.set(x, "HasUserName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRealm(value: String): Self = StObject.set(x, "Realm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerName(value: String): Self = StObject.set(x, "ServerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserName(value: String): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
  }
}
