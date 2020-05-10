package typingsSlinky.googleapis.firebasedynamiclinksV1Mod.firebasedynamiclinksV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Response for iSDK to execute strong match flow for post-install
  * attribution.
  */
@js.native
trait SchemaGetIosPostInstallAttributionResponse extends js.Object {
  /**
    * The minimum version for app, specified by dev through ?imv= parameter.
    * Return to iSDK to allow app to evaluate if current version meets this.
    */
  var appMinimumVersion: js.UndefOr[String] = js.native
  /**
    * The confidence of the returned attribution.
    */
  var attributionConfidence: js.UndefOr[String] = js.native
  /**
    * The deep-link attributed post-install via one of several techniques
    * (fingerprint, copy unique).
    */
  var deepLink: js.UndefOr[String] = js.native
  /**
    * User-agent specific custom-scheme URIs for iSDK to open. This will be set
    * according to the user-agent tha the click was originally made in. There
    * is no Safari-equivalent custom-scheme open URLs. ie:
    * googlechrome://www.example.com ie:
    * firefox://open-url?url=http://www.example.com ie:
    * opera-http://example.com
    */
  var externalBrowserDestinationLink: js.UndefOr[String] = js.native
  /**
    * The link to navigate to update the app if min version is not met. This is
    * either (in order): 1) fallback link (from ?ifl= parameter, if specified
    * by developer) or 2) AppStore URL (from ?isi= parameter, if specified), or
    * 3) the payload link (from required link= parameter).
    */
  var fallbackLink: js.UndefOr[String] = js.native
  /**
    * Invitation ID attributed post-install via one of several techniques
    * (fingerprint, copy unique).
    */
  var invitationId: js.UndefOr[String] = js.native
  /**
    * Instruction for iSDK to attemmpt to perform strong match. For instance,
    * if browser does not support/allow cookie or outside of support browsers,
    * this will be false.
    */
  var isStrongMatchExecutable: js.UndefOr[Boolean] = js.native
  /**
    * Describes why match failed, ie: &quot;discarded due to low
    * confidence&quot;. This message will be publicly visible.
    */
  var matchMessage: js.UndefOr[String] = js.native
  /**
    * Which IP version the request was made from.
    */
  var requestIpVersion: js.UndefOr[String] = js.native
  /**
    * Entire FDL (short or long) attributed post-install via one of several
    * techniques (fingerprint, copy unique).
    */
  var requestedLink: js.UndefOr[String] = js.native
  /**
    * The entire FDL, expanded from a short link. It is the same as the
    * requested_link, if it is long. Parameters from this should not be used
    * directly (ie: server can default utm_[campaign|medium|source] to a value
    * when requested_link lack them, server determine the best fallback_link
    * when requested_link specifies &gt;1 fallback links).
    */
  var resolvedLink: js.UndefOr[String] = js.native
  /**
    * Scion campaign value to be propagated by iSDK to Scion at post-install.
    */
  var utmCampaign: js.UndefOr[String] = js.native
  /**
    * Scion medium value to be propagated by iSDK to Scion at post-install.
    */
  var utmMedium: js.UndefOr[String] = js.native
  /**
    * Scion source value to be propagated by iSDK to Scion at post-install.
    */
  var utmSource: js.UndefOr[String] = js.native
}

object SchemaGetIosPostInstallAttributionResponse {
  @scala.inline
  def apply(): SchemaGetIosPostInstallAttributionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGetIosPostInstallAttributionResponse]
  }
  @scala.inline
  implicit class SchemaGetIosPostInstallAttributionResponseOps[Self <: SchemaGetIosPostInstallAttributionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppMinimumVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appMinimumVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppMinimumVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appMinimumVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributionConfidence(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributionConfidence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAttributionConfidence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributionConfidence")(js.undefined)
        ret
    }
    @scala.inline
    def withDeepLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deepLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeepLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deepLink")(js.undefined)
        ret
    }
    @scala.inline
    def withExternalBrowserDestinationLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalBrowserDestinationLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExternalBrowserDestinationLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("externalBrowserDestinationLink")(js.undefined)
        ret
    }
    @scala.inline
    def withFallbackLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFallbackLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fallbackLink")(js.undefined)
        ret
    }
    @scala.inline
    def withInvitationId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitationId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInvitationId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("invitationId")(js.undefined)
        ret
    }
    @scala.inline
    def withIsStrongMatchExecutable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStrongMatchExecutable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIsStrongMatchExecutable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isStrongMatchExecutable")(js.undefined)
        ret
    }
    @scala.inline
    def withMatchMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMatchMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestIpVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestIpVersion")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestIpVersion: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestIpVersion")(js.undefined)
        ret
    }
    @scala.inline
    def withRequestedLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRequestedLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("requestedLink")(js.undefined)
        ret
    }
    @scala.inline
    def withResolvedLink(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedLink")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResolvedLink: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolvedLink")(js.undefined)
        ret
    }
    @scala.inline
    def withUtmCampaign(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utmCampaign")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUtmCampaign: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utmCampaign")(js.undefined)
        ret
    }
    @scala.inline
    def withUtmMedium(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utmMedium")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUtmMedium: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utmMedium")(js.undefined)
        ret
    }
    @scala.inline
    def withUtmSource(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utmSource")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUtmSource: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("utmSource")(js.undefined)
        ret
    }
  }
  
}

