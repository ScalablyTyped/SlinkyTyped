package typingsSlinky.parse.mod._Global_.Parse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface declaration for Authentication Providers
  * https://parseplatform.org/Parse-SDK-JS/api/master/AuthProvider.html
  */
@js.native
trait AuthProvider extends js.Object {
  /**
    * (Optional) Called when service is unlinked. Handle any cleanup here.
    */
  var deauthenticate: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * Called when _linkWith isn't passed authData. Handle your own authentication here.
    */
  def authenticate(): Unit = js.native
  /**
    * Unique identifier for this Auth Provider.
    */
  def getAuthType(): String = js.native
  /**
    * Called when auth data is syncronized. Can be used to determine if authData is still valid
    */
  def restoreAuthentication(): Boolean = js.native
}

object AuthProvider {
  @scala.inline
  def apply(authenticate: () => Unit, getAuthType: () => String, restoreAuthentication: () => Boolean): AuthProvider = {
    val __obj = js.Dynamic.literal(authenticate = js.Any.fromFunction0(authenticate), getAuthType = js.Any.fromFunction0(getAuthType), restoreAuthentication = js.Any.fromFunction0(restoreAuthentication))
    __obj.asInstanceOf[AuthProvider]
  }
  @scala.inline
  implicit class AuthProviderOps[Self <: AuthProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAuthenticate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authenticate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetAuthType(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAuthType")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRestoreAuthentication(value: () => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("restoreAuthentication")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDeauthenticate(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deauthenticate")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDeauthenticate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deauthenticate")(js.undefined)
        ret
    }
  }
  
}

