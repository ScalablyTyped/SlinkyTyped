package typingsSlinky.mixpanelBrowser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  var api_host: String = js.native
  var app_host: String = js.native
  var autotrack: Boolean = js.native
  var cdn: String = js.native
  var cookie_domain: String = js.native
  var cookie_expiration: Double = js.native
  var cookie_name: String = js.native
  var cross_site_cookie: Boolean = js.native
  var cross_subdomain_cookie: Boolean = js.native
  var debug: Boolean = js.native
  var disable_cookie: Boolean = js.native
  var disable_notifications: Boolean = js.native
  var disable_persistence: Boolean = js.native
  var img: Boolean = js.native
  var ip: Boolean = js.native
  var opt_out_tracking_by_default: Boolean = js.native
  var opt_out_tracking_cookie_prefix: String = js.native
  var opt_out_tracking_persistence_type: Persistence = js.native
  var persistence: Persistence = js.native
  var persistence_name: String = js.native
  var property_blacklist: js.Array[String] = js.native
  var save_referrer: Boolean = js.native
  var secure_cookie: Boolean = js.native
  var store_google: Boolean = js.native
  var test: Boolean = js.native
  var track_links_timeout: Double = js.native
  var track_pageview: Boolean = js.native
  var upgrade: Boolean = js.native
  var verbose: Boolean = js.native
  var xhr_headers: XhrHeadersDef = js.native
  def loaded(mixpanel: Mixpanel): Unit = js.native
}

object Config {
  @scala.inline
  def apply(
    api_host: String,
    app_host: String,
    autotrack: Boolean,
    cdn: String,
    cookie_domain: String,
    cookie_expiration: Double,
    cookie_name: String,
    cross_site_cookie: Boolean,
    cross_subdomain_cookie: Boolean,
    debug: Boolean,
    disable_cookie: Boolean,
    disable_notifications: Boolean,
    disable_persistence: Boolean,
    img: Boolean,
    ip: Boolean,
    loaded: Mixpanel => Unit,
    opt_out_tracking_by_default: Boolean,
    opt_out_tracking_cookie_prefix: String,
    opt_out_tracking_persistence_type: Persistence,
    persistence: Persistence,
    persistence_name: String,
    property_blacklist: js.Array[String],
    save_referrer: Boolean,
    secure_cookie: Boolean,
    store_google: Boolean,
    test: Boolean,
    track_links_timeout: Double,
    track_pageview: Boolean,
    upgrade: Boolean,
    verbose: Boolean,
    xhr_headers: XhrHeadersDef
  ): Config = {
    val __obj = js.Dynamic.literal(api_host = api_host.asInstanceOf[js.Any], app_host = app_host.asInstanceOf[js.Any], autotrack = autotrack.asInstanceOf[js.Any], cdn = cdn.asInstanceOf[js.Any], cookie_domain = cookie_domain.asInstanceOf[js.Any], cookie_expiration = cookie_expiration.asInstanceOf[js.Any], cookie_name = cookie_name.asInstanceOf[js.Any], cross_site_cookie = cross_site_cookie.asInstanceOf[js.Any], cross_subdomain_cookie = cross_subdomain_cookie.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], disable_cookie = disable_cookie.asInstanceOf[js.Any], disable_notifications = disable_notifications.asInstanceOf[js.Any], disable_persistence = disable_persistence.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], loaded = js.Any.fromFunction1(loaded), opt_out_tracking_by_default = opt_out_tracking_by_default.asInstanceOf[js.Any], opt_out_tracking_cookie_prefix = opt_out_tracking_cookie_prefix.asInstanceOf[js.Any], opt_out_tracking_persistence_type = opt_out_tracking_persistence_type.asInstanceOf[js.Any], persistence = persistence.asInstanceOf[js.Any], persistence_name = persistence_name.asInstanceOf[js.Any], property_blacklist = property_blacklist.asInstanceOf[js.Any], save_referrer = save_referrer.asInstanceOf[js.Any], secure_cookie = secure_cookie.asInstanceOf[js.Any], store_google = store_google.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any], track_links_timeout = track_links_timeout.asInstanceOf[js.Any], track_pageview = track_pageview.asInstanceOf[js.Any], upgrade = upgrade.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any], xhr_headers = xhr_headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
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
    def withApp_host(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("app_host")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAutotrack(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autotrack")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCdn(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cdn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCookie_domain(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie_domain")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCookie_expiration(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie_expiration")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCookie_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cookie_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCross_site_cookie(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cross_site_cookie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCross_subdomain_cookie(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cross_subdomain_cookie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDebug(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debug")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisable_cookie(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_cookie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisable_notifications(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_notifications")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisable_persistence(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disable_persistence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withImg(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("img")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIp(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ip")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLoaded(value: Mixpanel => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loaded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withOpt_out_tracking_by_default(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opt_out_tracking_by_default")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpt_out_tracking_cookie_prefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opt_out_tracking_cookie_prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOpt_out_tracking_persistence_type(value: Persistence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("opt_out_tracking_persistence_type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersistence(value: Persistence): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistence")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPersistence_name(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("persistence_name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withProperty_blacklist(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("property_blacklist")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSave_referrer(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("save_referrer")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSecure_cookie(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secure_cookie")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStore_google(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("store_google")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTest(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("test")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrack_links_timeout(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track_links_timeout")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTrack_pageview(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("track_pageview")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withUpgrade(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("upgrade")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVerbose(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("verbose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withXhr_headers(value: XhrHeadersDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("xhr_headers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

