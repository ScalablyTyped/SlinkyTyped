package typingsSlinky.gapi.global.gapi

import typingsSlinky.gapi.GoogleApiOAuth2TokenObject
import typingsSlinky.gapi.anon.Apppackagename
import typingsSlinky.gapi.anon.Clientid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("gapi.auth")
@js.native
object auth extends js.Object {
  
  def authorize(params: Clientid, callback: js.Function1[/* token */ GoogleApiOAuth2TokenObject, _]): Unit = js.native
  
  def getToken(): GoogleApiOAuth2TokenObject = js.native
  
  def init(callback: js.Function0[_]): Unit = js.native
  
  def setToken(token: GoogleApiOAuth2TokenObject): Unit = js.native
  
  def signIn(params: Apppackagename): Unit = js.native
  
  def signOut(): Unit = js.native
}
