package typingsSlinky.googleapis.identitytoolkitV3Mod.identitytoolkitV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response of creating the IDP authentication URL.
  */
@js.native
trait SchemaCreateAuthUriResponse extends js.Object {
  /**
    * all providers the user has once used to do federated login
    */
  var allProviders: js.UndefOr[js.Array[String]] = js.native
  /**
    * The URI used by the IDP to authenticate the user.
    */
  var authUri: js.UndefOr[String] = js.native
  /**
    * True if captcha is required.
    */
  var captchaRequired: js.UndefOr[Boolean] = js.native
  /**
    * True if the authUri is for user&#39;s existing provider.
    */
  var forExistingProvider: js.UndefOr[Boolean] = js.native
  /**
    * The fixed string identitytoolkit#CreateAuthUriResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The provider ID of the auth URI.
    */
  var providerId: js.UndefOr[String] = js.native
  /**
    * Whether the user is registered if the identifier is an email.
    */
  var registered: js.UndefOr[Boolean] = js.native
  /**
    * Session ID which should be passed in the following verifyAssertion
    * request.
    */
  var sessionId: js.UndefOr[String] = js.native
  /**
    * All sign-in methods this user has used.
    */
  var signinMethods: js.UndefOr[js.Array[String]] = js.native
}

object SchemaCreateAuthUriResponse {
  @scala.inline
  def apply(): SchemaCreateAuthUriResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateAuthUriResponse]
  }
  @scala.inline
  implicit class SchemaCreateAuthUriResponseOps[Self <: SchemaCreateAuthUriResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllProviders(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allProviders")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllProviders: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allProviders")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthUri(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authUri")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthUri: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authUri")(js.undefined)
        ret
    }
    @scala.inline
    def withCaptchaRequired(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captchaRequired")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCaptchaRequired: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("captchaRequired")(js.undefined)
        ret
    }
    @scala.inline
    def withForExistingProvider(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forExistingProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForExistingProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forExistingProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withKind(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("kind")(js.undefined)
        ret
    }
    @scala.inline
    def withProviderId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProviderId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerId")(js.undefined)
        ret
    }
    @scala.inline
    def withRegistered(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registered")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRegistered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registered")(js.undefined)
        ret
    }
    @scala.inline
    def withSessionId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSessionId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionId")(js.undefined)
        ret
    }
    @scala.inline
    def withSigninMethods(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signinMethods")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSigninMethods: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signinMethods")(js.undefined)
        ret
    }
  }
  
}

