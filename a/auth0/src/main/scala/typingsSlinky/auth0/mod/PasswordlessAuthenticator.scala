package typingsSlinky.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("auth0", "PasswordlessAuthenticator")
@js.native
class PasswordlessAuthenticator protected () extends js.Object {
  def this(options: PasswordLessClientOptions, oauth: OAuthAuthenticator) = this()
  
  def sendEmail(data: RequestEmailCodeOrLinkOptions): js.Promise[_] = js.native
  def sendEmail(
    data: RequestEmailCodeOrLinkOptions,
    cb: js.Function2[/* err */ js.Error, /* message */ String, Unit]
  ): Unit = js.native
  
  def sendSMS(data: RequestSMSCodeOptions): js.Promise[_] = js.native
  def sendSMS(data: RequestSMSCodeOptions, cb: js.Function2[/* err */ js.Error, /* message */ String, Unit]): Unit = js.native
  
  def signIn(data: SignInOptions): js.Promise[SignInToken] = js.native
  def signIn(data: SignInOptions, cb: js.Function2[/* err */ js.Error, /* data */ SignInToken, Unit]): Unit = js.native
}
