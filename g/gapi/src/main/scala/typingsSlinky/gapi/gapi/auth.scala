package typingsSlinky.gapi.gapi

import typingsSlinky.gapi.Anon_Apppackagename
import typingsSlinky.gapi.Anon_AuthuserClientid
import typingsSlinky.gapi.GoogleApiOAuth2TokenObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.auth")
@js.native
object auth extends js.Object {
  def authorize(params: Anon_AuthuserClientid, callback: js.Function1[/* token */ GoogleApiOAuth2TokenObject, _]): Unit = js.native
  def getToken(): GoogleApiOAuth2TokenObject = js.native
  def init(callback: js.Function0[_]): Unit = js.native
  def setToken(token: GoogleApiOAuth2TokenObject): Unit = js.native
  def signIn(params: Anon_Apppackagename): Unit = js.native
  def signOut(): Unit = js.native
}

