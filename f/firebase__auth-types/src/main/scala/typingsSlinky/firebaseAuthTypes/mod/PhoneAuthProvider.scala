package typingsSlinky.firebaseAuthTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth-types", "PhoneAuthProvider")
@js.native
class PhoneAuthProvider () extends PhoneAuthProviderInstance
/* static members */
@JSImport("@firebase/auth-types", "PhoneAuthProvider")
@js.native
object PhoneAuthProvider extends js.Object {
  
  var PHONE_SIGN_IN_METHOD: String = js.native
  
  var PROVIDER_ID: String = js.native
  
  def credential(verificationId: String, verificationCode: String): AuthCredential = js.native
}
