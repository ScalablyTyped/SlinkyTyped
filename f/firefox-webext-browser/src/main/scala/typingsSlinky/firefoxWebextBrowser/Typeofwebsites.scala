package typingsSlinky.firefoxWebextBrowser

import typingsSlinky.firefoxWebextBrowser.browser.types.Setting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofwebsites extends js.Object {
  /**
    * Allow users to specify the default settings for allowing cookies, as well as whether all cookies should be
    * created as non-persistent cookies. This setting's value is of type CookieConfig.
    */
  val cookieConfig: Setting = js.native
  /**
    * If enabled, the browser will associate all data (including cookies, HSTS data, cached images, and more) for any
    * third party domains with the domain in the address bar. This prevents third party trackers from using directly
    * stored information to identify you across different websites, but may break websites where you login with a
    * third party account (such as a Facebook or Google login.) The value of this preference is of type boolean, and
    * the default value is `false`.
    */
  val firstPartyIsolate: Setting = js.native
  /**
    * If enabled, the browser sends auditing pings when requested by a website (`<a ping>`). The value of this
    * preference is of type boolean, and the default value is `true`.
    */
  val hyperlinkAuditingEnabled: Setting = js.native
  /**
    * **Available on Windows and ChromeOS only**: If enabled, the browser provides a unique ID to plugins in order to
    * run protected content. The value of this preference is of type boolean, and the default value is `true`.
    * @deprecated Unsupported on Firefox at this time.
    */
  val protectedContentEnabled: js.UndefOr[Setting] = js.native
  /**
    * If enabled, the browser sends `referer` headers with your requests. Yes, the name of this preference doesn't
    * match the misspelled header. No, we're not going to change it. The value of this preference is of type boolean,
    * and the default value is `true`.
    */
  val referrersEnabled: Setting = js.native
  /**
    * If enabled, the browser attempts to appear similar to other users by reporting generic information to websites.
    * This can prevent websites from uniquely identifying users. Examples of data that is spoofed include number of
    * CPU cores, precision of JavaScript timers, the local timezone, and disabling features such as GamePad support,
    * and the WebSpeech and Navigator APIs. The value of this preference is of type boolean, and the default value is
    * `false`.
    */
  val resistFingerprinting: Setting = js.native
  /* privacy.websites properties */
  /**
    * If disabled, the browser blocks third-party sites from setting cookies. The value of this preference is of type
    * boolean, and the default value is `true`.
    * @deprecated Unsupported on Firefox at this time.
    */
  val thirdPartyCookiesAllowed: js.UndefOr[Setting] = js.native
  /**
    * Allow users to specify the mode for tracking protection. This setting's value is of type
    * TrackingProtectionModeOption, defaulting to `private_browsing_only`.
    */
  val trackingProtectionMode: Setting = js.native
}

object Typeofwebsites {
  @scala.inline
  def apply(
    cookieConfig: Setting,
    firstPartyIsolate: Setting,
    hyperlinkAuditingEnabled: Setting,
    referrersEnabled: Setting,
    resistFingerprinting: Setting,
    trackingProtectionMode: Setting
  ): Typeofwebsites = {
    val __obj = js.Dynamic.literal(cookieConfig = cookieConfig.asInstanceOf[js.Any], firstPartyIsolate = firstPartyIsolate.asInstanceOf[js.Any], hyperlinkAuditingEnabled = hyperlinkAuditingEnabled.asInstanceOf[js.Any], referrersEnabled = referrersEnabled.asInstanceOf[js.Any], resistFingerprinting = resistFingerprinting.asInstanceOf[js.Any], trackingProtectionMode = trackingProtectionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofwebsites]
  }
  @scala.inline
  implicit class TypeofwebsitesOps[Self <: Typeofwebsites] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCookieConfig(value: Setting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookieConfig")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstPartyIsolate(value: Setting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstPartyIsolate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHyperlinkAuditingEnabled(value: Setting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hyperlinkAuditingEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReferrersEnabled(value: Setting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("referrersEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResistFingerprinting(value: Setting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resistFingerprinting")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrackingProtectionMode(value: Setting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trackingProtectionMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProtectedContentEnabled(value: Setting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectedContentEnabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProtectedContentEnabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("protectedContentEnabled")(js.undefined)
        ret
    }
    @scala.inline
    def withThirdPartyCookiesAllowed(value: Setting): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thirdPartyCookiesAllowed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutThirdPartyCookiesAllowed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thirdPartyCookiesAllowed")(js.undefined)
        ret
    }
  }
  
}

