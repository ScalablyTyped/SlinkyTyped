package typingsSlinky.firebaseAuthTypes.anon

import org.scalablytyped.runtime.Instantiable0
import typingsSlinky.firebaseAuthTypes.mod.AuthCredential
import typingsSlinky.firebaseAuthTypes.mod.PhoneAuthProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofPhoneAuthProvider extends Instantiable0[PhoneAuthProvider] {
  
  var PHONE_SIGN_IN_METHOD: String = js.native
  
  var PROVIDER_ID: String = js.native
  
  def credential(verificationId: String, verificationCode: String): AuthCredential = js.native
}
