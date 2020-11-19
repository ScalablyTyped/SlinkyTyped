package typingsSlinky.activexLibreoffice.com_.sun.star.ucb

import typingsSlinky.activexLibreoffice.com_.sun.star.task.InteractionClassification
import typingsSlinky.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An error specifying lack of correct authentication data (e.g., to log into an account).
  * @since OOo 3.2
  */
@js.native
trait URLAuthenticationRequest extends AuthenticationRequest {
  
  /** The URL for which authentication is requested. */
  var URL: String = js.native
}
object URLAuthenticationRequest {
  
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
    URL: String,
    UserName: String
  ): URLAuthenticationRequest = {
    val __obj = js.Dynamic.literal(Account = Account.asInstanceOf[js.Any], Classification = Classification.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Diagnostic = Diagnostic.asInstanceOf[js.Any], HasAccount = HasAccount.asInstanceOf[js.Any], HasPassword = HasPassword.asInstanceOf[js.Any], HasRealm = HasRealm.asInstanceOf[js.Any], HasUserName = HasUserName.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Password = Password.asInstanceOf[js.Any], Realm = Realm.asInstanceOf[js.Any], ServerName = ServerName.asInstanceOf[js.Any], URL = URL.asInstanceOf[js.Any], UserName = UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[URLAuthenticationRequest]
  }
  
  @scala.inline
  implicit class URLAuthenticationRequestOps[Self <: URLAuthenticationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setURL(value: String): Self = this.set("URL", value.asInstanceOf[js.Any])
  }
}
