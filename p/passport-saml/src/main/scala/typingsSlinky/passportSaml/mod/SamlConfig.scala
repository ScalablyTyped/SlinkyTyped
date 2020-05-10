package typingsSlinky.passportSaml.mod

import typingsSlinky.passportSaml.passportSamlStrings.better
import typingsSlinky.passportSaml.passportSamlStrings.exact
import typingsSlinky.passportSaml.passportSamlStrings.maximum
import typingsSlinky.passportSaml.passportSamlStrings.minimum
import typingsSlinky.passportSaml.passportSamlStrings.sha1
import typingsSlinky.passportSaml.passportSamlStrings.sha256
import typingsSlinky.passportSaml.passportSamlStrings.sha512
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SamlConfig extends js.Object {
  var RACComparison: js.UndefOr[exact | minimum | maximum | better] = js.native
  var acceptedClockSkewMs: js.UndefOr[Double] = js.native
  var additionalAuthorizeParams: js.UndefOr[js.Any] = js.native
  var additionalLogoutParams: js.UndefOr[js.Any] = js.native
  // Additional SAML behaviors
  var additionalParams: js.UndefOr[js.Any] = js.native
  var attributeConsumingServiceIndex: js.UndefOr[String] = js.native
  var audience: js.UndefOr[String] = js.native
  var authnContext: js.UndefOr[String] = js.native
  var authnRequestBinding: js.UndefOr[String] = js.native
  var cacheProvider: js.UndefOr[CacheProvider] = js.native
  // Core
  var callbackUrl: js.UndefOr[String] = js.native
  var cert: js.UndefOr[String | js.Array[String] | CertCallback] = js.native
  var decryptionPvk: js.UndefOr[String] = js.native
  var disableRequestedAuthnContext: js.UndefOr[Boolean] = js.native
  var entryPoint: js.UndefOr[String] = js.native
  var forceAuthn: js.UndefOr[Boolean] = js.native
  var host: js.UndefOr[String] = js.native
  var identifierFormat: js.UndefOr[String] = js.native
  var idpIssuer: js.UndefOr[String] = js.native
  var issuer: js.UndefOr[String] = js.native
  var logoutCallbackUrl: js.UndefOr[String] = js.native
  // Logout
  var logoutUrl: js.UndefOr[String] = js.native
  // Passport
  var name: js.UndefOr[String] = js.native
  var passReqToCallback: js.UndefOr[Boolean] = js.native
  var passive: js.UndefOr[Boolean] = js.native
  var path: js.UndefOr[String] = js.native
  var privateCert: js.UndefOr[String] = js.native
  var protocol: js.UndefOr[String] = js.native
  var providerName: js.UndefOr[String] = js.native
  var requestIdExpirationPeriodMs: js.UndefOr[Double] = js.native
  var signatureAlgorithm: js.UndefOr[sha1 | sha256 | sha512] = js.native
  var skipRequestCompression: js.UndefOr[Boolean] = js.native
  // InResponseTo Validation
  var validateInResponseTo: js.UndefOr[Boolean] = js.native
}

object SamlConfig {
  @scala.inline
  def apply(): SamlConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SamlConfig]
  }
  @scala.inline
  implicit class SamlConfigOps[Self <: SamlConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRACComparison(value: exact | minimum | maximum | better): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RACComparison")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRACComparison: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RACComparison")(js.undefined)
        ret
    }
    @scala.inline
    def withAcceptedClockSkewMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptedClockSkewMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAcceptedClockSkewMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("acceptedClockSkewMs")(js.undefined)
        ret
    }
    @scala.inline
    def withAdditionalAuthorizeParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalAuthorizeParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalAuthorizeParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalAuthorizeParams")(js.undefined)
        ret
    }
    @scala.inline
    def withAdditionalLogoutParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalLogoutParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalLogoutParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalLogoutParams")(js.undefined)
        ret
    }
    @scala.inline
    def withAdditionalParams(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalParams")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdditionalParams: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("additionalParams")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributeConsumingServiceIndex(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeConsumingServiceIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributeConsumingServiceIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeConsumingServiceIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withAudience(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audience")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAudience: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("audience")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthnContext(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authnContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthnContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authnContext")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthnRequestBinding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authnRequestBinding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthnRequestBinding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authnRequestBinding")(js.undefined)
        ret
    }
    @scala.inline
    def withCacheProvider(value: CacheProvider): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheProvider")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCacheProvider: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cacheProvider")(js.undefined)
        ret
    }
    @scala.inline
    def withCallbackUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCallbackUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("callbackUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withCertFunction1(
      value: /* callback */ js.Function2[/* err */ js.Error | Null, /* cert */ js.UndefOr[String | js.Array[String]], Unit] => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cert")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withCert(value: String | js.Array[String] | CertCallback): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cert")(js.undefined)
        ret
    }
    @scala.inline
    def withDecryptionPvk(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decryptionPvk")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDecryptionPvk: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decryptionPvk")(js.undefined)
        ret
    }
    @scala.inline
    def withDisableRequestedAuthnContext(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableRequestedAuthnContext")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisableRequestedAuthnContext: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disableRequestedAuthnContext")(js.undefined)
        ret
    }
    @scala.inline
    def withEntryPoint(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryPoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntryPoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entryPoint")(js.undefined)
        ret
    }
    @scala.inline
    def withForceAuthn(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceAuthn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceAuthn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceAuthn")(js.undefined)
        ret
    }
    @scala.inline
    def withHost(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("host")(js.undefined)
        ret
    }
    @scala.inline
    def withIdentifierFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifierFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdentifierFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("identifierFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withIdpIssuer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idpIssuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIdpIssuer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("idpIssuer")(js.undefined)
        ret
    }
    @scala.inline
    def withIssuer(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIssuer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("issuer")(js.undefined)
        ret
    }
    @scala.inline
    def withLogoutCallbackUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logoutCallbackUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogoutCallbackUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logoutCallbackUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withLogoutUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logoutUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogoutUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logoutUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withPassReqToCallback(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passReqToCallback")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassReqToCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passReqToCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withPassive(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passive")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPassive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("passive")(js.undefined)
        ret
    }
    @scala.inline
    def withPath(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("path")(js.undefined)
        ret
    }
    @scala.inline
    def withPrivateCert(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateCert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrivateCert: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("privateCert")(js.undefined)
        ret
    }
    @scala.inline
    def withProtocol(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtocol: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protocol")(js.undefined)
        ret
    }
    @scala.inline
    def withProviderName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProviderName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("providerName")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestIdExpirationPeriodMs(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestIdExpirationPeriodMs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestIdExpirationPeriodMs: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestIdExpirationPeriodMs")(js.undefined)
        ret
    }
    @scala.inline
    def withSignatureAlgorithm(value: sha1 | sha256 | sha512): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureAlgorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSignatureAlgorithm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("signatureAlgorithm")(js.undefined)
        ret
    }
    @scala.inline
    def withSkipRequestCompression(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipRequestCompression")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSkipRequestCompression: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("skipRequestCompression")(js.undefined)
        ret
    }
    @scala.inline
    def withValidateInResponseTo(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateInResponseTo")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValidateInResponseTo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("validateInResponseTo")(js.undefined)
        ret
    }
  }
  
}

