package typingsSlinky.firebaseAuthTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth-types", "PhoneAuthProvider")
@js.native
class PhoneAuthProvider () extends PhoneAuthProviderInstance {
  def this(auth: FirebaseAuth) = this()
}
/* static members */
object PhoneAuthProvider {
  
  @JSImport("@firebase/auth-types", "PhoneAuthProvider")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/auth-types", "PhoneAuthProvider.PHONE_SIGN_IN_METHOD")
  @js.native
  def PHONE_SIGN_IN_METHOD: String = js.native
  @scala.inline
  def PHONE_SIGN_IN_METHOD_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PHONE_SIGN_IN_METHOD")(x.asInstanceOf[js.Any])
  
  @JSImport("@firebase/auth-types", "PhoneAuthProvider.PROVIDER_ID")
  @js.native
  def PROVIDER_ID: String = js.native
  @scala.inline
  def PROVIDER_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROVIDER_ID")(x.asInstanceOf[js.Any])
  
  @JSImport("@firebase/auth-types", "PhoneAuthProvider.credential")
  @js.native
  def credential(verificationId: String, verificationCode: String): AuthCredential = js.native
}
