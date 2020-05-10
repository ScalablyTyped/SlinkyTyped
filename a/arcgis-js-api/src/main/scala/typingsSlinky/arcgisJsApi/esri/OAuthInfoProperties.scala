package typingsSlinky.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OAuthInfoProperties extends js.Object {
  /**
    * The registered application id.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#appId)
    */
  var appId: js.UndefOr[String] = js.native
  /**
    * Applications with the same value will share the stored token on the same host.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#authNamespace)
    *
    * @default / (forward slash)
    */
  var authNamespace: js.UndefOr[String] = js.native
  /**
    * The number of minutes that the token is valid.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#expiration)
    *
    * @default 20160 (two weeks)
    */
  var expiration: js.UndefOr[Double] = js.native
  /**
    * The locale for the OAuth sign in page. The default locale is based on your browser/OS and the organization locale. You can use the locale property to change this. The locale needs to follow the language dash country code syntax supported by ArcGIS.com.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#locale)
    *
    * @default Based on your browser/OS and the organization locale.
    */
  var locale: js.UndefOr[String] = js.native
  /**
    * The minimum time in minutes before a saved token is due to expire that it should still be considered valid for use.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#minTimeUntilExpiration)
    *
    * @default 30
    */
  var minTimeUntilExpiration: js.UndefOr[Double] = js.native
  /**
    * Set to `true` to show the OAuth sign in page in a popup window.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#popup)
    *
    * @default false
    */
  var popup: js.UndefOr[Boolean] = js.native
  /**
    * Applicable if working with the popup user-login workflow. This is a relative page URL that redirects the user back to the secured application after successful login.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#popupCallbackUrl)
    *
    * @default "oauth-callback.html"
    */
  var popupCallbackUrl: js.UndefOr[String] = js.native
  /**
    * The window features passed to [window.open()](https://developer.mozilla.org/en-US/docs/Web/API/Window/open).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#popupWindowFeatures)
    *
    * @default height=490,width=800,resizable,scrollbars,status
    */
  var popupWindowFeatures: js.UndefOr[String] = js.native
  /**
    * The ArcGIS Enterprise portal URL.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#portalUrl)
    *
    * @default "https://www.arcgis.com"
    */
  var portalUrl: js.UndefOr[String] = js.native
  /**
    * Set this property to `true` when [popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#popup) is `false` in order to have the window's location hash value restored after signing in.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-OAuthInfo.html#preserveUrlHash)
    *
    * @default false
    */
  var preserveUrlHash: js.UndefOr[Boolean] = js.native
}

object OAuthInfoProperties {
  @scala.inline
  def apply(): OAuthInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuthInfoProperties]
  }
  @scala.inline
  implicit class OAuthInfoPropertiesOps[Self <: OAuthInfoProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appId")(js.undefined)
        ret
    }
    @scala.inline
    def withAuthNamespace(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authNamespace")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthNamespace: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authNamespace")(js.undefined)
        ret
    }
    @scala.inline
    def withExpiration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExpiration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("expiration")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withMinTimeUntilExpiration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTimeUntilExpiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinTimeUntilExpiration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minTimeUntilExpiration")(js.undefined)
        ret
    }
    @scala.inline
    def withPopup(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popup")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupCallbackUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupCallbackUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupCallbackUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupCallbackUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupWindowFeatures(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupWindowFeatures")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupWindowFeatures: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupWindowFeatures")(js.undefined)
        ret
    }
    @scala.inline
    def withPortalUrl(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portalUrl")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPortalUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("portalUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withPreserveUrlHash(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveUrlHash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreserveUrlHash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preserveUrlHash")(js.undefined)
        ret
    }
  }
  
}

