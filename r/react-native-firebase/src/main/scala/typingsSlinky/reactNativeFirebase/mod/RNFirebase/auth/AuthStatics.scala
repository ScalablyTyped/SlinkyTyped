package typingsSlinky.reactNativeFirebase.mod.RNFirebase.auth

import typingsSlinky.reactNativeFirebase.AnonAUTOVERIFIED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthStatics extends js.Object {
  var AppleAuthProvider: AuthProvider = js.native
  var EmailAuthProvider: typingsSlinky.reactNativeFirebase.mod.RNFirebase.auth.EmailAuthProvider = js.native
  var FacebookAuthProvider: AuthProvider = js.native
  var GithubAuthProvider: AuthProvider = js.native
  var GoogleAuthProvider: AuthProvider = js.native
  var OAuthProvider: AuthProvider = js.native
  var PhoneAuthProvider: AuthProvider = js.native
  var PhoneAuthState: AnonAUTOVERIFIED = js.native
  var TwitterAuthProvider: AuthProvider = js.native
}

object AuthStatics {
  @scala.inline
  def apply(
    AppleAuthProvider: AuthProvider,
    EmailAuthProvider: EmailAuthProvider,
    FacebookAuthProvider: AuthProvider,
    GithubAuthProvider: AuthProvider,
    GoogleAuthProvider: AuthProvider,
    OAuthProvider: AuthProvider,
    PhoneAuthProvider: AuthProvider,
    PhoneAuthState: AnonAUTOVERIFIED,
    TwitterAuthProvider: AuthProvider
  ): AuthStatics = {
    val __obj = js.Dynamic.literal(AppleAuthProvider = AppleAuthProvider.asInstanceOf[js.Any], EmailAuthProvider = EmailAuthProvider.asInstanceOf[js.Any], FacebookAuthProvider = FacebookAuthProvider.asInstanceOf[js.Any], GithubAuthProvider = GithubAuthProvider.asInstanceOf[js.Any], GoogleAuthProvider = GoogleAuthProvider.asInstanceOf[js.Any], OAuthProvider = OAuthProvider.asInstanceOf[js.Any], PhoneAuthProvider = PhoneAuthProvider.asInstanceOf[js.Any], PhoneAuthState = PhoneAuthState.asInstanceOf[js.Any], TwitterAuthProvider = TwitterAuthProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthStatics]
  }
  @scala.inline
  implicit class AuthStaticsOps[Self <: AuthStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppleAuthProvider(value: AuthProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AppleAuthProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEmailAuthProvider(value: EmailAuthProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EmailAuthProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFacebookAuthProvider(value: AuthProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FacebookAuthProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGithubAuthProvider(value: AuthProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GithubAuthProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGoogleAuthProvider(value: AuthProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GoogleAuthProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOAuthProvider(value: AuthProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("OAuthProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhoneAuthProvider(value: AuthProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhoneAuthProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPhoneAuthState(value: AnonAUTOVERIFIED): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PhoneAuthState")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTwitterAuthProvider(value: AuthProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TwitterAuthProvider")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

