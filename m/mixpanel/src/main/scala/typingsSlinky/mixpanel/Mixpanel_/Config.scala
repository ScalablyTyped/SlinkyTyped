package typingsSlinky.mixpanel.Mixpanel_

import typingsSlinky.mixpanel.mixpanelStrings.cookie
import typingsSlinky.mixpanel.mixpanelStrings.localStorage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Config extends js.Object {
  /**
    * @default HTTP_PROTOCOL + 'api.mixpanel.com'
    */
  var api_host: js.UndefOr[String] = js.native
  /**
    * @default HTTP_PROTOCOL + 'mixpanel.com'
    */
  var app_host: js.UndefOr[String] = js.native
  /**
    * @default true
    */
  var autotrack: js.UndefOr[Boolean] = js.native
  /**
    * @default HTTP_PROTOCOL + 'cdn.mxpnl.com'
    */
  var cdn: js.UndefOr[String] = js.native
  /**
    * Super properties cookie expiration (in days)
    *
    * @default 365
    */
  var cookie_expiration: js.UndefOr[Double] = js.native
  /**
    * @deprecated Use `persistence_name` instead
    * @default ''
    */
  var cookie_name: js.UndefOr[String] = js.native
  /**
    * Super properties span subdomains
    *
    * @default true
    */
  var cross_subdomain_cookie: js.UndefOr[Boolean] = js.native
  /**
    * Debug mode
    *
    * @default false
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * @deprecated Use `disable_persistence` instead
    * @default false
    */
  var disable_cookie: js.UndefOr[Boolean] = js.native
  /**
    * If this is true, the mixpanel cookie or localStorage entry
    * will be deleted, and no user persistence will take place
    *
    * @default false
    */
  var disable_persistence: js.UndefOr[Boolean] = js.native
  /**
    * @default false
    */
  var img: js.UndefOr[Boolean] = js.native
  /**
    * If this is true, Mixpanel will automatically determine City,
    * Region and Country data using the IP address of the client
    *
    * @default true
    */
  var ip: js.UndefOr[Boolean] = js.native
  /**
    * @default function() {}
    */
  var loaded: js.UndefOr[js.Function1[/* lib */ typingsSlinky.mixpanel.Mixpanel_, Unit]] = js.native
  /**
    * Type of persistent store for super properties
    *
    * If set to 'localStorage', any existing mixpanel cookie
    * value with the same `persistence_name` will be transferred
    * to localStorage and deleted.
    *
    * @default 'cookie'
    */
  var persistence: js.UndefOr[localStorage | cookie] = js.native
  /**
    * Name for super properties persistent store
    *
    * @default ''
    */
  var persistence_name: js.UndefOr[String] = js.native
  /**
    * Names of (super) properties which should never be sent
    * with track() calls
    *
    * @default []
    */
  var property_blacklist: js.UndefOr[js.Array[String]] = js.native
  /**
    * @default true
    */
  var save_referrer: js.UndefOr[Boolean] = js.native
  /**
    * If this is true, mixpanel cookies will be marked as secure,
    * meaning they will only be transmitted over https
    *
    * @default false
    */
  var secure_cookie: js.UndefOr[Boolean] = js.native
  /**
    * @default true
    */
  var store_google: js.UndefOr[Boolean] = js.native
  /**
    * @default false
    */
  var test: js.UndefOr[Boolean] = js.native
  /**
    * The amount of time track_links will wait for Mixpanel's
    * servers to respond
    *
    * @default 300
    */
  var track_links_timeout: js.UndefOr[Double] = js.native
  /**
    * Should we track a page view on page load
    *
    * @default true
    */
  var track_pageview: js.UndefOr[Boolean] = js.native
  /**
    * If you set upgrade to be true, the library will check for
    * a cookie from our old js library and import super
    * properties from it, then the old cookie is deleted
    * The upgrade config option only works in the initialization,
    * so make sure you set it when you create the library.
    *
    * @default false
    */
  var upgrade: js.UndefOr[Boolean] = js.native
  /**
    * @default false
    */
  var verbose: js.UndefOr[Boolean] = js.native
}

object Config {
  @scala.inline
  def apply(): Config = {
    val __obj = js.Dynamic.literal()
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
    def withLoaded(value: /* lib */ typingsSlinky.mixpanel.Mixpanel_ => Unit): Self = {
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
    def withPersistence(value: localStorage | cookie): Self = {
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
  }
  
}

