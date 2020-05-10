package typingsSlinky.passportAzureAd.oidcStrategyMod

import typingsSlinky.passportAzureAd.AnonIv
import typingsSlinky.passportAzureAd.commonMod.IBaseStrategyOption
import typingsSlinky.passportAzureAd.passportAzureAdStrings.`code id_token`
import typingsSlinky.passportAzureAd.passportAzureAdStrings.`id_token code`
import typingsSlinky.passportAzureAd.passportAzureAdStrings.code
import typingsSlinky.passportAzureAd.passportAzureAdStrings.form_post
import typingsSlinky.passportAzureAd.passportAzureAdStrings.id_token
import typingsSlinky.passportAzureAd.passportAzureAdStrings.query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOIDCStrategyOption extends IBaseStrategyOption {
  var allowHttpForRedirectUrl: js.UndefOr[Boolean] = js.native
  var clientSecret: js.UndefOr[String] = js.native
  var cookieEncryptionKeys: js.UndefOr[js.Array[AnonIv]] = js.native
  var cookieSameSite: js.UndefOr[Boolean] = js.native
  var nonceLifetime: js.UndefOr[Double] = js.native
  var nonceMaxAmount: js.UndefOr[Double] = js.native
  var privatePEMKey: js.UndefOr[String] = js.native
  var redirectUrl: String = js.native
  var responseMode: query | form_post = js.native
  var responseType: code | (`code id_token`) | (`id_token code`) | id_token = js.native
  var scope: js.UndefOr[String | js.Array[String]] = js.native
  var thumbprint: js.UndefOr[String] = js.native
  var useCookieInsteadOfSession: js.UndefOr[Boolean] = js.native
}

object IOIDCStrategyOption {
  @scala.inline
  def apply(
    clientID: String,
    identityMetadata: String,
    redirectUrl: String,
    responseMode: query | form_post,
    responseType: code | (`code id_token`) | (`id_token code`) | id_token
  ): IOIDCStrategyOption = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], identityMetadata = identityMetadata.asInstanceOf[js.Any], redirectUrl = redirectUrl.asInstanceOf[js.Any], responseMode = responseMode.asInstanceOf[js.Any], responseType = responseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOIDCStrategyOption]
  }
  @scala.inline
  implicit class IOIDCStrategyOptionOps[Self <: IOIDCStrategyOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRedirectUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("redirectUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseMode(value: query | form_post): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResponseType(value: code | (`code id_token`) | (`id_token code`) | id_token): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("responseType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAllowHttpForRedirectUrl(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHttpForRedirectUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllowHttpForRedirectUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allowHttpForRedirectUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withClientSecret(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientSecret")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClientSecret: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientSecret")(js.undefined)
        ret
    }
    @scala.inline
    def withCookieEncryptionKeys(value: js.Array[AnonIv]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieEncryptionKeys")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookieEncryptionKeys: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieEncryptionKeys")(js.undefined)
        ret
    }
    @scala.inline
    def withCookieSameSite(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieSameSite")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookieSameSite: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieSameSite")(js.undefined)
        ret
    }
    @scala.inline
    def withNonceLifetime(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonceLifetime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonceLifetime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonceLifetime")(js.undefined)
        ret
    }
    @scala.inline
    def withNonceMaxAmount(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonceMaxAmount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNonceMaxAmount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nonceMaxAmount")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivatePEMKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privatePEMKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivatePEMKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privatePEMKey")(js.undefined)
        ret
    }
    @scala.inline
    def withScope(value: String | js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutScope: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scope")(js.undefined)
        ret
    }
    @scala.inline
    def withThumbprint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbprint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThumbprint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thumbprint")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCookieInsteadOfSession(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCookieInsteadOfSession")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCookieInsteadOfSession: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCookieInsteadOfSession")(js.undefined)
        ret
    }
  }
  
}

