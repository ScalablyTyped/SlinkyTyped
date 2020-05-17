package typingsSlinky.firebaseAuthTypes.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.firebaseAppTypes.mod.FirebaseApp
import typingsSlinky.firebaseAuthTypes.mod.EmailAuthProviderInstance
import typingsSlinky.firebaseAuthTypes.mod.FacebookAuthProviderInstance
import typingsSlinky.firebaseAuthTypes.mod.FirebaseAuth
import typingsSlinky.firebaseAuthTypes.mod.GithubAuthProviderInstance
import typingsSlinky.firebaseAuthTypes.mod.GoogleAuthProviderInstance
import typingsSlinky.firebaseAuthTypes.mod.PhoneAuthProviderInstance
import typingsSlinky.firebaseAuthTypes.mod.RecaptchaVerifierInstance
import typingsSlinky.firebaseAuthTypes.mod.TwitterAuthProviderInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Call extends js.Object {
  var Auth: TypeofFirebaseAuth = js.native
  var EmailAuthProvider: TypeofEmailAuthProvider = js.native
  var EmailAuthProvider_Instance: Instantiable0[EmailAuthProviderInstance] = js.native
  var FacebookAuthProvider: TypeofFacebookAuthProvide = js.native
  var FacebookAuthProvider_Instance: Instantiable0[FacebookAuthProviderInstance] = js.native
  var GithubAuthProvider: TypeofGithubAuthProvider = js.native
  var GithubAuthProvider_Instance: Instantiable0[GithubAuthProviderInstance] = js.native
  var GoogleAuthProvider: TypeofGoogleAuthProvider = js.native
  var GoogleAuthProvider_Instance: Instantiable0[GoogleAuthProviderInstance] = js.native
  var OAuthProvider: Instantiable1[/* providerId */ String, typingsSlinky.firebaseAuthTypes.mod.OAuthProvider] = js.native
  var PhoneAuthProvider: TypeofPhoneAuthProvider = js.native
  var PhoneAuthProvider_Instance: Instantiable1[js.UndefOr[FirebaseAuth | Null], PhoneAuthProviderInstance] = js.native
  var PhoneMultiFactorGenerator: TypeofPhoneMultiFactorGen = js.native
  var RecaptchaVerifier: Instantiable0[typingsSlinky.firebaseAuthTypes.mod.RecaptchaVerifier] = js.native
  var RecaptchaVerifier_Instance: Instantiable3[
    /* container */ js.Any | String, 
    js.UndefOr[js.Object | Null], 
    js.UndefOr[FirebaseApp | Null], 
    RecaptchaVerifierInstance
  ] = js.native
  var SAMLAuthProvider: Instantiable1[/* providerId */ String, typingsSlinky.firebaseAuthTypes.mod.SAMLAuthProvider] = js.native
  var TwitterAuthProvider: TypeofTwitterAuthProvider = js.native
  var TwitterAuthProvider_Instance: Instantiable0[TwitterAuthProviderInstance] = js.native
  def apply(): FirebaseAuth = js.native
  def apply(app: typingsSlinky.firebaseAuthTypes.mod.firebaseAppTypesAugmentingMod.FirebaseApp): FirebaseAuth = js.native
}

