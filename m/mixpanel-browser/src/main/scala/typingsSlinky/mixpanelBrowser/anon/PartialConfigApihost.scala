package typingsSlinky.mixpanelBrowser.anon

import typingsSlinky.mixpanelBrowser.mod.Mixpanel
import typingsSlinky.mixpanelBrowser.mod.Persistence
import typingsSlinky.mixpanelBrowser.mod.XhrHeadersDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mixpanel-browser.mixpanel-browser.Config> */
@js.native
trait PartialConfigApihost extends js.Object {
  var api_host: js.UndefOr[String] = js.native
  var app_host: js.UndefOr[String] = js.native
  var autotrack: js.UndefOr[Boolean] = js.native
  var cdn: js.UndefOr[String] = js.native
  var cookie_domain: js.UndefOr[String] = js.native
  var cookie_expiration: js.UndefOr[Double] = js.native
  var cookie_name: js.UndefOr[String] = js.native
  var cross_site_cookie: js.UndefOr[Boolean] = js.native
  var cross_subdomain_cookie: js.UndefOr[Boolean] = js.native
  var debug: js.UndefOr[Boolean] = js.native
  var disable_cookie: js.UndefOr[Boolean] = js.native
  var disable_notifications: js.UndefOr[Boolean] = js.native
  var disable_persistence: js.UndefOr[Boolean] = js.native
  var img: js.UndefOr[Boolean] = js.native
  var ip: js.UndefOr[Boolean] = js.native
  var loaded: js.UndefOr[js.Function1[/* mixpanel */ Mixpanel, Unit]] = js.native
  var opt_out_tracking_by_default: js.UndefOr[Boolean] = js.native
  var opt_out_tracking_cookie_prefix: js.UndefOr[String] = js.native
  var opt_out_tracking_persistence_type: js.UndefOr[Persistence] = js.native
  var persistence: js.UndefOr[Persistence] = js.native
  var persistence_name: js.UndefOr[String] = js.native
  var property_blacklist: js.UndefOr[js.Array[String]] = js.native
  var save_referrer: js.UndefOr[Boolean] = js.native
  var secure_cookie: js.UndefOr[Boolean] = js.native
  var store_google: js.UndefOr[Boolean] = js.native
  var test: js.UndefOr[Boolean] = js.native
  var track_links_timeout: js.UndefOr[Double] = js.native
  var track_pageview: js.UndefOr[Boolean] = js.native
  var upgrade: js.UndefOr[Boolean] = js.native
  var verbose: js.UndefOr[Boolean] = js.native
  var xhr_headers: js.UndefOr[XhrHeadersDef] = js.native
}

object PartialConfigApihost {
  @scala.inline
  def apply(): PartialConfigApihost = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConfigApihost]
  }
  @scala.inline
  implicit class PartialConfigApihostOps[Self <: PartialConfigApihost] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withApi_host(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api_host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApi_host: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("api_host")(js.undefined)
        ret
    }
    @scala.inline
    def withApp_host(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app_host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutApp_host: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app_host")(js.undefined)
        ret
    }
    @scala.inline
    def withAutotrack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autotrack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutotrack: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autotrack")(js.undefined)
        ret
    }
    @scala.inline
    def withCdn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCdn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdn")(js.undefined)
        ret
    }
    @scala.inline
    def withCookie_domain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie_domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookie_domain: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie_domain")(js.undefined)
        ret
    }
    @scala.inline
    def withCookie_expiration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie_expiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookie_expiration: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie_expiration")(js.undefined)
        ret
    }
    @scala.inline
    def withCookie_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCookie_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie_name")(js.undefined)
        ret
    }
    @scala.inline
    def withCross_site_cookie(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cross_site_cookie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCross_site_cookie: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cross_site_cookie")(js.undefined)
        ret
    }
    @scala.inline
    def withCross_subdomain_cookie(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cross_subdomain_cookie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCross_subdomain_cookie: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cross_subdomain_cookie")(js.undefined)
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDebug: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(js.undefined)
        ret
    }
    @scala.inline
    def withDisable_cookie(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_cookie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable_cookie: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_cookie")(js.undefined)
        ret
    }
    @scala.inline
    def withDisable_notifications(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_notifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable_notifications: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_notifications")(js.undefined)
        ret
    }
    @scala.inline
    def withDisable_persistence(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_persistence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisable_persistence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_persistence")(js.undefined)
        ret
    }
    @scala.inline
    def withImg(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("img")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutImg: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("img")(js.undefined)
        ret
    }
    @scala.inline
    def withIp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(js.undefined)
        ret
    }
    @scala.inline
    def withLoaded(value: /* mixpanel */ Mixpanel => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutLoaded: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaded")(js.undefined)
        ret
    }
    @scala.inline
    def withOpt_out_tracking_by_default(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opt_out_tracking_by_default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpt_out_tracking_by_default: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opt_out_tracking_by_default")(js.undefined)
        ret
    }
    @scala.inline
    def withOpt_out_tracking_cookie_prefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opt_out_tracking_cookie_prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpt_out_tracking_cookie_prefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opt_out_tracking_cookie_prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withOpt_out_tracking_persistence_type(value: Persistence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opt_out_tracking_persistence_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpt_out_tracking_persistence_type: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opt_out_tracking_persistence_type")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistence(value: Persistence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistence: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistence")(js.undefined)
        ret
    }
    @scala.inline
    def withPersistence_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistence_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPersistence_name: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistence_name")(js.undefined)
        ret
    }
    @scala.inline
    def withProperty_blacklist(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property_blacklist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperty_blacklist: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property_blacklist")(js.undefined)
        ret
    }
    @scala.inline
    def withSave_referrer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save_referrer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSave_referrer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save_referrer")(js.undefined)
        ret
    }
    @scala.inline
    def withSecure_cookie(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure_cookie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecure_cookie: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure_cookie")(js.undefined)
        ret
    }
    @scala.inline
    def withStore_google(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store_google")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStore_google: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store_google")(js.undefined)
        ret
    }
    @scala.inline
    def withTest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTest: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(js.undefined)
        ret
    }
    @scala.inline
    def withTrack_links_timeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track_links_timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrack_links_timeout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track_links_timeout")(js.undefined)
        ret
    }
    @scala.inline
    def withTrack_pageview(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track_pageview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrack_pageview: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track_pageview")(js.undefined)
        ret
    }
    @scala.inline
    def withUpgrade(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upgrade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUpgrade: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upgrade")(js.undefined)
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutVerbose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(js.undefined)
        ret
    }
    @scala.inline
    def withXhr_headers(value: XhrHeadersDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhr_headers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutXhr_headers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhr_headers")(js.undefined)
        ret
    }
  }
  
}

