package typingsSlinky.firebase.mod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the options for initializing an
  * {@link firebase.auth.OAuthCredential}. For ID tokens with nonce claim,
  * the raw nonce has to also be provided.
  */
@js.native
trait OAuthCredentialOptions extends js.Object {
  /**
    * The OAuth access token used to initialize the OAuthCredential.
    */
  var accessToken: js.UndefOr[String] = js.native
  /**
    * The OAuth ID token used to initialize the OAuthCredential.
    */
  var idToken: js.UndefOr[String] = js.native
  /**
    * The raw nonce associated with the ID token. It is required when an ID token
    * with a nonce field is provided. The SHA-256 hash of the raw nonce must match
    * the nonce field in the ID token.
    */
  var rawNonce: js.UndefOr[String] = js.native
}

object OAuthCredentialOptions {
  @scala.inline
  def apply(): OAuthCredentialOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuthCredentialOptions]
  }
  @scala.inline
  implicit class OAuthCredentialOptionsOps[Self <: OAuthCredentialOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessToken")(js.undefined)
        ret
    }
    @scala.inline
    def withIdToken(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idToken")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdToken: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idToken")(js.undefined)
        ret
    }
    @scala.inline
    def withRawNonce(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawNonce")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRawNonce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rawNonce")(js.undefined)
        ret
    }
  }
  
}

