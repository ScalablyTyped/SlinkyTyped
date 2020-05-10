package typingsSlinky.oidcTokenManager.Oidc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OidcClient extends js.Object {
  var isOAuth: Boolean = js.native
  var isOidc: Boolean = js.native
  def createLogoutRequestAsync(id_token_hint: String): DefaultPromise = js.native
  def createTokenRequestAsync(): DefaultPromise = js.native
  def loadAuthorizationEndpoint(): Unit = js.native
  def loadMetadataAsync(): DefaultPromise = js.native
  def loadUserProfile(access_token: String): DefaultPromise = js.native
  def loadX509SigningKeyAsync(): DefaultPromise = js.native
  def processResponseAsync(queryString: String): DefaultPromise = js.native
  def validateAccessTokenAsync(id_token_contents: String, access_token: String): DefaultPromise = js.native
  def validateIdTokenAndAccessTokenAsync(id_token: String, nonce: String, access_token: String): DefaultPromise = js.native
  def validateIdTokenAsync(id_token: String, nonce: String, access_token: String): DefaultPromise = js.native
}

object OidcClient {
  @scala.inline
  def apply(
    createLogoutRequestAsync: String => DefaultPromise,
    createTokenRequestAsync: () => DefaultPromise,
    isOAuth: Boolean,
    isOidc: Boolean,
    loadAuthorizationEndpoint: () => Unit,
    loadMetadataAsync: () => DefaultPromise,
    loadUserProfile: String => DefaultPromise,
    loadX509SigningKeyAsync: () => DefaultPromise,
    processResponseAsync: String => DefaultPromise,
    validateAccessTokenAsync: (String, String) => DefaultPromise,
    validateIdTokenAndAccessTokenAsync: (String, String, String) => DefaultPromise,
    validateIdTokenAsync: (String, String, String) => DefaultPromise
  ): OidcClient = {
    val __obj = js.Dynamic.literal(createLogoutRequestAsync = js.Any.fromFunction1(createLogoutRequestAsync), createTokenRequestAsync = js.Any.fromFunction0(createTokenRequestAsync), isOAuth = isOAuth.asInstanceOf[js.Any], isOidc = isOidc.asInstanceOf[js.Any], loadAuthorizationEndpoint = js.Any.fromFunction0(loadAuthorizationEndpoint), loadMetadataAsync = js.Any.fromFunction0(loadMetadataAsync), loadUserProfile = js.Any.fromFunction1(loadUserProfile), loadX509SigningKeyAsync = js.Any.fromFunction0(loadX509SigningKeyAsync), processResponseAsync = js.Any.fromFunction1(processResponseAsync), validateAccessTokenAsync = js.Any.fromFunction2(validateAccessTokenAsync), validateIdTokenAndAccessTokenAsync = js.Any.fromFunction3(validateIdTokenAndAccessTokenAsync), validateIdTokenAsync = js.Any.fromFunction3(validateIdTokenAsync))
    __obj.asInstanceOf[OidcClient]
  }
  @scala.inline
  implicit class OidcClientOps[Self <: OidcClient] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateLogoutRequestAsync(value: String => DefaultPromise): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createLogoutRequestAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCreateTokenRequestAsync(value: () => DefaultPromise): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createTokenRequestAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsOAuth(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOAuth")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsOidc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isOidc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoadAuthorizationEndpoint(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadAuthorizationEndpoint")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLoadMetadataAsync(value: () => DefaultPromise): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadMetadataAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withLoadUserProfile(value: String => DefaultPromise): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadUserProfile")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withLoadX509SigningKeyAsync(value: () => DefaultPromise): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loadX509SigningKeyAsync")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withProcessResponseAsync(value: String => DefaultPromise): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("processResponseAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withValidateAccessTokenAsync(value: (String, String) => DefaultPromise): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateAccessTokenAsync")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withValidateIdTokenAndAccessTokenAsync(value: (String, String, String) => DefaultPromise): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateIdTokenAndAccessTokenAsync")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withValidateIdTokenAsync(value: (String, String, String) => DefaultPromise): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateIdTokenAsync")(js.Any.fromFunction3(value))
        ret
    }
  }
  
}

