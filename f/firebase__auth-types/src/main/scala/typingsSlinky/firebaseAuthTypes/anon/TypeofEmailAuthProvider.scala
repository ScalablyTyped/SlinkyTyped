package typingsSlinky.firebaseAuthTypes.anon

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.firebaseAuthTypes.mod.AuthCredential
import typingsSlinky.firebaseAuthTypes.mod.EmailAuthProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofEmailAuthProvider extends Instantiable0[EmailAuthProvider] {
  
  var EMAIL_LINK_SIGN_IN_METHOD: String = js.native
  
  var EMAIL_PASSWORD_SIGN_IN_METHOD: String = js.native
  
  var PROVIDER_ID: String = js.native
  
  def credential(email: String, password: String): AuthCredential = js.native
  
  def credentialWithLink(email: String, emailLink: String): AuthCredential = js.native
}
