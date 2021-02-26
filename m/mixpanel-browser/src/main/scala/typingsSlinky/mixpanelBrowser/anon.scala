package typingsSlinky.mixpanelBrowser

import typingsSlinky.mixpanelBrowser.mixpanelBrowserNumbers.`0`
import typingsSlinky.mixpanelBrowser.mixpanelBrowserNumbers.`1`
import typingsSlinky.mixpanelBrowser.mod.Dict
import typingsSlinky.mixpanelBrowser.mod.Mixpanel
import typingsSlinky.mixpanelBrowser.mod.Persistence
import typingsSlinky.mixpanelBrowser.mod.VerboseResponse
import typingsSlinky.mixpanelBrowser.mod.XhrHeadersDef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Error extends VerboseResponse {
    
    var error: Null = js.native
    
    var status: `1` = js.native
  }
  object Error {
    
    @scala.inline
    def apply(error: Null, status: `1`): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: Null): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: `1`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<mixpanel-browser.mixpanel-browser.ClearOptOutInOutOptions> */
  @js.native
  trait PartialClearOptOutInOutOp extends StObject {
    
    var cookie_expiration: js.UndefOr[Double] = js.native
    
    var cookie_prefix: js.UndefOr[String] = js.native
    
    var cross_subdomain_cookie: js.UndefOr[Boolean] = js.native
    
    var persistence_type: js.UndefOr[Persistence] = js.native
    
    var secure_cookie: js.UndefOr[Boolean] = js.native
  }
  object PartialClearOptOutInOutOp {
    
    @scala.inline
    def apply(): PartialClearOptOutInOutOp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialClearOptOutInOutOp]
    }
    
    @scala.inline
    implicit class PartialClearOptOutInOutOpMutableBuilder[Self <: PartialClearOptOutInOutOp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCookie_expiration(value: Double): Self = StObject.set(x, "cookie_expiration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookie_expirationUndefined: Self = StObject.set(x, "cookie_expiration", js.undefined)
      
      @scala.inline
      def setCookie_prefix(value: String): Self = StObject.set(x, "cookie_prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookie_prefixUndefined: Self = StObject.set(x, "cookie_prefix", js.undefined)
      
      @scala.inline
      def setCross_subdomain_cookie(value: Boolean): Self = StObject.set(x, "cross_subdomain_cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCross_subdomain_cookieUndefined: Self = StObject.set(x, "cross_subdomain_cookie", js.undefined)
      
      @scala.inline
      def setPersistence_type(value: Persistence): Self = StObject.set(x, "persistence_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistence_typeUndefined: Self = StObject.set(x, "persistence_type", js.undefined)
      
      @scala.inline
      def setSecure_cookie(value: Boolean): Self = StObject.set(x, "secure_cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecure_cookieUndefined: Self = StObject.set(x, "secure_cookie", js.undefined)
    }
  }
  
  /* Inlined std.Partial<mixpanel-browser.mixpanel-browser.Config> */
  @js.native
  trait PartialConfig extends StObject {
    
    var api_host: js.UndefOr[String] = js.native
    
    var api_method: js.UndefOr[String] = js.native
    
    var api_transport: js.UndefOr[String] = js.native
    
    var app_host: js.UndefOr[String] = js.native
    
    var autotrack: js.UndefOr[Boolean] = js.native
    
    var batch_flush_interval_ms: js.UndefOr[Double] = js.native
    
    var batch_request_timeout_ms: js.UndefOr[Double] = js.native
    
    var batch_requests: js.UndefOr[Boolean] = js.native
    
    var batch_size: js.UndefOr[Double] = js.native
    
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
    
    var ignore_dnt: js.UndefOr[Boolean] = js.native
    
    var img: js.UndefOr[Boolean] = js.native
    
    var inapp_link_new_window: js.UndefOr[Boolean] = js.native
    
    var inapp_protocol: js.UndefOr[String] = js.native
    
    var ip: js.UndefOr[Boolean] = js.native
    
    var loaded: js.UndefOr[js.Function1[/* mixpanel */ this.type, Unit]] = js.native
    
    var opt_out_persistence_by_default: js.UndefOr[Boolean] = js.native
    
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
  object PartialConfig {
    
    @scala.inline
    def apply(): PartialConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialConfig]
    }
    
    @scala.inline
    implicit class PartialConfigMutableBuilder[Self <: PartialConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApi_host(value: String): Self = StObject.set(x, "api_host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApi_hostUndefined: Self = StObject.set(x, "api_host", js.undefined)
      
      @scala.inline
      def setApi_method(value: String): Self = StObject.set(x, "api_method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApi_methodUndefined: Self = StObject.set(x, "api_method", js.undefined)
      
      @scala.inline
      def setApi_transport(value: String): Self = StObject.set(x, "api_transport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApi_transportUndefined: Self = StObject.set(x, "api_transport", js.undefined)
      
      @scala.inline
      def setApp_host(value: String): Self = StObject.set(x, "app_host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApp_hostUndefined: Self = StObject.set(x, "app_host", js.undefined)
      
      @scala.inline
      def setAutotrack(value: Boolean): Self = StObject.set(x, "autotrack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutotrackUndefined: Self = StObject.set(x, "autotrack", js.undefined)
      
      @scala.inline
      def setBatch_flush_interval_ms(value: Double): Self = StObject.set(x, "batch_flush_interval_ms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatch_flush_interval_msUndefined: Self = StObject.set(x, "batch_flush_interval_ms", js.undefined)
      
      @scala.inline
      def setBatch_request_timeout_ms(value: Double): Self = StObject.set(x, "batch_request_timeout_ms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatch_request_timeout_msUndefined: Self = StObject.set(x, "batch_request_timeout_ms", js.undefined)
      
      @scala.inline
      def setBatch_requests(value: Boolean): Self = StObject.set(x, "batch_requests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatch_requestsUndefined: Self = StObject.set(x, "batch_requests", js.undefined)
      
      @scala.inline
      def setBatch_size(value: Double): Self = StObject.set(x, "batch_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatch_sizeUndefined: Self = StObject.set(x, "batch_size", js.undefined)
      
      @scala.inline
      def setCdn(value: String): Self = StObject.set(x, "cdn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCdnUndefined: Self = StObject.set(x, "cdn", js.undefined)
      
      @scala.inline
      def setCookie_domain(value: String): Self = StObject.set(x, "cookie_domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookie_domainUndefined: Self = StObject.set(x, "cookie_domain", js.undefined)
      
      @scala.inline
      def setCookie_expiration(value: Double): Self = StObject.set(x, "cookie_expiration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookie_expirationUndefined: Self = StObject.set(x, "cookie_expiration", js.undefined)
      
      @scala.inline
      def setCookie_name(value: String): Self = StObject.set(x, "cookie_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookie_nameUndefined: Self = StObject.set(x, "cookie_name", js.undefined)
      
      @scala.inline
      def setCross_site_cookie(value: Boolean): Self = StObject.set(x, "cross_site_cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCross_site_cookieUndefined: Self = StObject.set(x, "cross_site_cookie", js.undefined)
      
      @scala.inline
      def setCross_subdomain_cookie(value: Boolean): Self = StObject.set(x, "cross_subdomain_cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCross_subdomain_cookieUndefined: Self = StObject.set(x, "cross_subdomain_cookie", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDisable_cookie(value: Boolean): Self = StObject.set(x, "disable_cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisable_cookieUndefined: Self = StObject.set(x, "disable_cookie", js.undefined)
      
      @scala.inline
      def setDisable_notifications(value: Boolean): Self = StObject.set(x, "disable_notifications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisable_notificationsUndefined: Self = StObject.set(x, "disable_notifications", js.undefined)
      
      @scala.inline
      def setDisable_persistence(value: Boolean): Self = StObject.set(x, "disable_persistence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisable_persistenceUndefined: Self = StObject.set(x, "disable_persistence", js.undefined)
      
      @scala.inline
      def setIgnore_dnt(value: Boolean): Self = StObject.set(x, "ignore_dnt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnore_dntUndefined: Self = StObject.set(x, "ignore_dnt", js.undefined)
      
      @scala.inline
      def setImg(value: Boolean): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
      
      @scala.inline
      def setInapp_link_new_window(value: Boolean): Self = StObject.set(x, "inapp_link_new_window", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInapp_link_new_windowUndefined: Self = StObject.set(x, "inapp_link_new_window", js.undefined)
      
      @scala.inline
      def setInapp_protocol(value: String): Self = StObject.set(x, "inapp_protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInapp_protocolUndefined: Self = StObject.set(x, "inapp_protocol", js.undefined)
      
      @scala.inline
      def setIp(value: Boolean): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
      
      @scala.inline
      def setLoaded(value: PartialConfig => Unit): Self = StObject.set(x, "loaded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
      
      @scala.inline
      def setOpt_out_persistence_by_default(value: Boolean): Self = StObject.set(x, "opt_out_persistence_by_default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpt_out_persistence_by_defaultUndefined: Self = StObject.set(x, "opt_out_persistence_by_default", js.undefined)
      
      @scala.inline
      def setOpt_out_tracking_by_default(value: Boolean): Self = StObject.set(x, "opt_out_tracking_by_default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpt_out_tracking_by_defaultUndefined: Self = StObject.set(x, "opt_out_tracking_by_default", js.undefined)
      
      @scala.inline
      def setOpt_out_tracking_cookie_prefix(value: String): Self = StObject.set(x, "opt_out_tracking_cookie_prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpt_out_tracking_cookie_prefixUndefined: Self = StObject.set(x, "opt_out_tracking_cookie_prefix", js.undefined)
      
      @scala.inline
      def setOpt_out_tracking_persistence_type(value: Persistence): Self = StObject.set(x, "opt_out_tracking_persistence_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpt_out_tracking_persistence_typeUndefined: Self = StObject.set(x, "opt_out_tracking_persistence_type", js.undefined)
      
      @scala.inline
      def setPersistence(value: Persistence): Self = StObject.set(x, "persistence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistenceUndefined: Self = StObject.set(x, "persistence", js.undefined)
      
      @scala.inline
      def setPersistence_name(value: String): Self = StObject.set(x, "persistence_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistence_nameUndefined: Self = StObject.set(x, "persistence_name", js.undefined)
      
      @scala.inline
      def setProperty_blacklist(value: js.Array[String]): Self = StObject.set(x, "property_blacklist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperty_blacklistUndefined: Self = StObject.set(x, "property_blacklist", js.undefined)
      
      @scala.inline
      def setProperty_blacklistVarargs(value: String*): Self = StObject.set(x, "property_blacklist", js.Array(value :_*))
      
      @scala.inline
      def setSave_referrer(value: Boolean): Self = StObject.set(x, "save_referrer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSave_referrerUndefined: Self = StObject.set(x, "save_referrer", js.undefined)
      
      @scala.inline
      def setSecure_cookie(value: Boolean): Self = StObject.set(x, "secure_cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecure_cookieUndefined: Self = StObject.set(x, "secure_cookie", js.undefined)
      
      @scala.inline
      def setStore_google(value: Boolean): Self = StObject.set(x, "store_google", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStore_googleUndefined: Self = StObject.set(x, "store_google", js.undefined)
      
      @scala.inline
      def setTest(value: Boolean): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
      
      @scala.inline
      def setTrack_links_timeout(value: Double): Self = StObject.set(x, "track_links_timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrack_links_timeoutUndefined: Self = StObject.set(x, "track_links_timeout", js.undefined)
      
      @scala.inline
      def setTrack_pageview(value: Boolean): Self = StObject.set(x, "track_pageview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrack_pageviewUndefined: Self = StObject.set(x, "track_pageview", js.undefined)
      
      @scala.inline
      def setUpgrade(value: Boolean): Self = StObject.set(x, "upgrade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpgradeUndefined: Self = StObject.set(x, "upgrade", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      @scala.inline
      def setXhr_headers(value: XhrHeadersDef): Self = StObject.set(x, "xhr_headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXhr_headersUndefined: Self = StObject.set(x, "xhr_headers", js.undefined)
    }
  }
  
  /* Inlined std.Partial<mixpanel-browser.mixpanel-browser.Config> */
  @js.native
  trait PartialConfigApihost extends StObject {
    
    var api_host: js.UndefOr[String] = js.native
    
    var api_method: js.UndefOr[String] = js.native
    
    var api_transport: js.UndefOr[String] = js.native
    
    var app_host: js.UndefOr[String] = js.native
    
    var autotrack: js.UndefOr[Boolean] = js.native
    
    var batch_flush_interval_ms: js.UndefOr[Double] = js.native
    
    var batch_request_timeout_ms: js.UndefOr[Double] = js.native
    
    var batch_requests: js.UndefOr[Boolean] = js.native
    
    var batch_size: js.UndefOr[Double] = js.native
    
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
    
    var ignore_dnt: js.UndefOr[Boolean] = js.native
    
    var img: js.UndefOr[Boolean] = js.native
    
    var inapp_link_new_window: js.UndefOr[Boolean] = js.native
    
    var inapp_protocol: js.UndefOr[String] = js.native
    
    var ip: js.UndefOr[Boolean] = js.native
    
    var loaded: js.UndefOr[js.Function1[/* mixpanel */ Mixpanel, Unit]] = js.native
    
    var opt_out_persistence_by_default: js.UndefOr[Boolean] = js.native
    
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
    implicit class PartialConfigApihostMutableBuilder[Self <: PartialConfigApihost] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApi_host(value: String): Self = StObject.set(x, "api_host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApi_hostUndefined: Self = StObject.set(x, "api_host", js.undefined)
      
      @scala.inline
      def setApi_method(value: String): Self = StObject.set(x, "api_method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApi_methodUndefined: Self = StObject.set(x, "api_method", js.undefined)
      
      @scala.inline
      def setApi_transport(value: String): Self = StObject.set(x, "api_transport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApi_transportUndefined: Self = StObject.set(x, "api_transport", js.undefined)
      
      @scala.inline
      def setApp_host(value: String): Self = StObject.set(x, "app_host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApp_hostUndefined: Self = StObject.set(x, "app_host", js.undefined)
      
      @scala.inline
      def setAutotrack(value: Boolean): Self = StObject.set(x, "autotrack", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutotrackUndefined: Self = StObject.set(x, "autotrack", js.undefined)
      
      @scala.inline
      def setBatch_flush_interval_ms(value: Double): Self = StObject.set(x, "batch_flush_interval_ms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatch_flush_interval_msUndefined: Self = StObject.set(x, "batch_flush_interval_ms", js.undefined)
      
      @scala.inline
      def setBatch_request_timeout_ms(value: Double): Self = StObject.set(x, "batch_request_timeout_ms", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatch_request_timeout_msUndefined: Self = StObject.set(x, "batch_request_timeout_ms", js.undefined)
      
      @scala.inline
      def setBatch_requests(value: Boolean): Self = StObject.set(x, "batch_requests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatch_requestsUndefined: Self = StObject.set(x, "batch_requests", js.undefined)
      
      @scala.inline
      def setBatch_size(value: Double): Self = StObject.set(x, "batch_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatch_sizeUndefined: Self = StObject.set(x, "batch_size", js.undefined)
      
      @scala.inline
      def setCdn(value: String): Self = StObject.set(x, "cdn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCdnUndefined: Self = StObject.set(x, "cdn", js.undefined)
      
      @scala.inline
      def setCookie_domain(value: String): Self = StObject.set(x, "cookie_domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookie_domainUndefined: Self = StObject.set(x, "cookie_domain", js.undefined)
      
      @scala.inline
      def setCookie_expiration(value: Double): Self = StObject.set(x, "cookie_expiration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookie_expirationUndefined: Self = StObject.set(x, "cookie_expiration", js.undefined)
      
      @scala.inline
      def setCookie_name(value: String): Self = StObject.set(x, "cookie_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookie_nameUndefined: Self = StObject.set(x, "cookie_name", js.undefined)
      
      @scala.inline
      def setCross_site_cookie(value: Boolean): Self = StObject.set(x, "cross_site_cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCross_site_cookieUndefined: Self = StObject.set(x, "cross_site_cookie", js.undefined)
      
      @scala.inline
      def setCross_subdomain_cookie(value: Boolean): Self = StObject.set(x, "cross_subdomain_cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCross_subdomain_cookieUndefined: Self = StObject.set(x, "cross_subdomain_cookie", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDisable_cookie(value: Boolean): Self = StObject.set(x, "disable_cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisable_cookieUndefined: Self = StObject.set(x, "disable_cookie", js.undefined)
      
      @scala.inline
      def setDisable_notifications(value: Boolean): Self = StObject.set(x, "disable_notifications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisable_notificationsUndefined: Self = StObject.set(x, "disable_notifications", js.undefined)
      
      @scala.inline
      def setDisable_persistence(value: Boolean): Self = StObject.set(x, "disable_persistence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisable_persistenceUndefined: Self = StObject.set(x, "disable_persistence", js.undefined)
      
      @scala.inline
      def setIgnore_dnt(value: Boolean): Self = StObject.set(x, "ignore_dnt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnore_dntUndefined: Self = StObject.set(x, "ignore_dnt", js.undefined)
      
      @scala.inline
      def setImg(value: Boolean): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
      
      @scala.inline
      def setInapp_link_new_window(value: Boolean): Self = StObject.set(x, "inapp_link_new_window", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInapp_link_new_windowUndefined: Self = StObject.set(x, "inapp_link_new_window", js.undefined)
      
      @scala.inline
      def setInapp_protocol(value: String): Self = StObject.set(x, "inapp_protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInapp_protocolUndefined: Self = StObject.set(x, "inapp_protocol", js.undefined)
      
      @scala.inline
      def setIp(value: Boolean): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpUndefined: Self = StObject.set(x, "ip", js.undefined)
      
      @scala.inline
      def setLoaded(value: /* mixpanel */ Mixpanel => Unit): Self = StObject.set(x, "loaded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadedUndefined: Self = StObject.set(x, "loaded", js.undefined)
      
      @scala.inline
      def setOpt_out_persistence_by_default(value: Boolean): Self = StObject.set(x, "opt_out_persistence_by_default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpt_out_persistence_by_defaultUndefined: Self = StObject.set(x, "opt_out_persistence_by_default", js.undefined)
      
      @scala.inline
      def setOpt_out_tracking_by_default(value: Boolean): Self = StObject.set(x, "opt_out_tracking_by_default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpt_out_tracking_by_defaultUndefined: Self = StObject.set(x, "opt_out_tracking_by_default", js.undefined)
      
      @scala.inline
      def setOpt_out_tracking_cookie_prefix(value: String): Self = StObject.set(x, "opt_out_tracking_cookie_prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpt_out_tracking_cookie_prefixUndefined: Self = StObject.set(x, "opt_out_tracking_cookie_prefix", js.undefined)
      
      @scala.inline
      def setOpt_out_tracking_persistence_type(value: Persistence): Self = StObject.set(x, "opt_out_tracking_persistence_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpt_out_tracking_persistence_typeUndefined: Self = StObject.set(x, "opt_out_tracking_persistence_type", js.undefined)
      
      @scala.inline
      def setPersistence(value: Persistence): Self = StObject.set(x, "persistence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistenceUndefined: Self = StObject.set(x, "persistence", js.undefined)
      
      @scala.inline
      def setPersistence_name(value: String): Self = StObject.set(x, "persistence_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistence_nameUndefined: Self = StObject.set(x, "persistence_name", js.undefined)
      
      @scala.inline
      def setProperty_blacklist(value: js.Array[String]): Self = StObject.set(x, "property_blacklist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProperty_blacklistUndefined: Self = StObject.set(x, "property_blacklist", js.undefined)
      
      @scala.inline
      def setProperty_blacklistVarargs(value: String*): Self = StObject.set(x, "property_blacklist", js.Array(value :_*))
      
      @scala.inline
      def setSave_referrer(value: Boolean): Self = StObject.set(x, "save_referrer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSave_referrerUndefined: Self = StObject.set(x, "save_referrer", js.undefined)
      
      @scala.inline
      def setSecure_cookie(value: Boolean): Self = StObject.set(x, "secure_cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecure_cookieUndefined: Self = StObject.set(x, "secure_cookie", js.undefined)
      
      @scala.inline
      def setStore_google(value: Boolean): Self = StObject.set(x, "store_google", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStore_googleUndefined: Self = StObject.set(x, "store_google", js.undefined)
      
      @scala.inline
      def setTest(value: Boolean): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
      
      @scala.inline
      def setTrack_links_timeout(value: Double): Self = StObject.set(x, "track_links_timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrack_links_timeoutUndefined: Self = StObject.set(x, "track_links_timeout", js.undefined)
      
      @scala.inline
      def setTrack_pageview(value: Boolean): Self = StObject.set(x, "track_pageview", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrack_pageviewUndefined: Self = StObject.set(x, "track_pageview", js.undefined)
      
      @scala.inline
      def setUpgrade(value: Boolean): Self = StObject.set(x, "upgrade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpgradeUndefined: Self = StObject.set(x, "upgrade", js.undefined)
      
      @scala.inline
      def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
      
      @scala.inline
      def setXhr_headers(value: XhrHeadersDef): Self = StObject.set(x, "xhr_headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXhr_headersUndefined: Self = StObject.set(x, "xhr_headers", js.undefined)
    }
  }
  
  /* Inlined std.Partial<mixpanel-browser.mixpanel-browser.HasOptedInOutOptions> */
  @js.native
  trait PartialHasOptedInOutOptio extends StObject {
    
    var cookie_prefix: js.UndefOr[String] = js.native
    
    var persistence_type: js.UndefOr[Persistence] = js.native
  }
  object PartialHasOptedInOutOptio {
    
    @scala.inline
    def apply(): PartialHasOptedInOutOptio = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialHasOptedInOutOptio]
    }
    
    @scala.inline
    implicit class PartialHasOptedInOutOptioMutableBuilder[Self <: PartialHasOptedInOutOptio] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCookie_prefix(value: String): Self = StObject.set(x, "cookie_prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookie_prefixUndefined: Self = StObject.set(x, "cookie_prefix", js.undefined)
      
      @scala.inline
      def setPersistence_type(value: Persistence): Self = StObject.set(x, "persistence_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistence_typeUndefined: Self = StObject.set(x, "persistence_type", js.undefined)
    }
  }
  
  /* Inlined std.Partial<mixpanel-browser.mixpanel-browser.InTrackingOptions> */
  @js.native
  trait PartialInTrackingOptions extends StObject {
    
    var cookie_expiration: js.UndefOr[Double] = js.native
    
    var cookie_prefix: js.UndefOr[String] = js.native
    
    var cross_subdomain_cookie: js.UndefOr[Boolean] = js.native
    
    var persistence_type: js.UndefOr[Persistence] = js.native
    
    var secure_cookie: js.UndefOr[Boolean] = js.native
    
    var track: js.UndefOr[js.Function0[Unit]] = js.native
    
    var track_event_name: js.UndefOr[String] = js.native
    
    var track_event_properties: js.UndefOr[Dict] = js.native
  }
  object PartialInTrackingOptions {
    
    @scala.inline
    def apply(): PartialInTrackingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialInTrackingOptions]
    }
    
    @scala.inline
    implicit class PartialInTrackingOptionsMutableBuilder[Self <: PartialInTrackingOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCookie_expiration(value: Double): Self = StObject.set(x, "cookie_expiration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookie_expirationUndefined: Self = StObject.set(x, "cookie_expiration", js.undefined)
      
      @scala.inline
      def setCookie_prefix(value: String): Self = StObject.set(x, "cookie_prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookie_prefixUndefined: Self = StObject.set(x, "cookie_prefix", js.undefined)
      
      @scala.inline
      def setCross_subdomain_cookie(value: Boolean): Self = StObject.set(x, "cross_subdomain_cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCross_subdomain_cookieUndefined: Self = StObject.set(x, "cross_subdomain_cookie", js.undefined)
      
      @scala.inline
      def setPersistence_type(value: Persistence): Self = StObject.set(x, "persistence_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistence_typeUndefined: Self = StObject.set(x, "persistence_type", js.undefined)
      
      @scala.inline
      def setSecure_cookie(value: Boolean): Self = StObject.set(x, "secure_cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecure_cookieUndefined: Self = StObject.set(x, "secure_cookie", js.undefined)
      
      @scala.inline
      def setTrack(value: () => Unit): Self = StObject.set(x, "track", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTrackUndefined: Self = StObject.set(x, "track", js.undefined)
      
      @scala.inline
      def setTrack_event_name(value: String): Self = StObject.set(x, "track_event_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrack_event_nameUndefined: Self = StObject.set(x, "track_event_name", js.undefined)
      
      @scala.inline
      def setTrack_event_properties(value: Dict): Self = StObject.set(x, "track_event_properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrack_event_propertiesUndefined: Self = StObject.set(x, "track_event_properties", js.undefined)
    }
  }
  
  /* Inlined std.Partial<mixpanel-browser.mixpanel-browser.OutTrackingOptions> */
  @js.native
  trait PartialOutTrackingOptions extends StObject {
    
    var cookie_expiration: js.UndefOr[Double] = js.native
    
    var cookie_prefix: js.UndefOr[String] = js.native
    
    var cross_subdomain_cookie: js.UndefOr[Boolean] = js.native
    
    var delete_user: js.UndefOr[Boolean] = js.native
    
    var persistence_type: js.UndefOr[Persistence] = js.native
    
    var secure_cookie: js.UndefOr[Boolean] = js.native
  }
  object PartialOutTrackingOptions {
    
    @scala.inline
    def apply(): PartialOutTrackingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOutTrackingOptions]
    }
    
    @scala.inline
    implicit class PartialOutTrackingOptionsMutableBuilder[Self <: PartialOutTrackingOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCookie_expiration(value: Double): Self = StObject.set(x, "cookie_expiration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookie_expirationUndefined: Self = StObject.set(x, "cookie_expiration", js.undefined)
      
      @scala.inline
      def setCookie_prefix(value: String): Self = StObject.set(x, "cookie_prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookie_prefixUndefined: Self = StObject.set(x, "cookie_prefix", js.undefined)
      
      @scala.inline
      def setCross_subdomain_cookie(value: Boolean): Self = StObject.set(x, "cross_subdomain_cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCross_subdomain_cookieUndefined: Self = StObject.set(x, "cross_subdomain_cookie", js.undefined)
      
      @scala.inline
      def setDelete_user(value: Boolean): Self = StObject.set(x, "delete_user", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelete_userUndefined: Self = StObject.set(x, "delete_user", js.undefined)
      
      @scala.inline
      def setPersistence_type(value: Persistence): Self = StObject.set(x, "persistence_type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPersistence_typeUndefined: Self = StObject.set(x, "persistence_type", js.undefined)
      
      @scala.inline
      def setSecure_cookie(value: Boolean): Self = StObject.set(x, "secure_cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecure_cookieUndefined: Self = StObject.set(x, "secure_cookie", js.undefined)
    }
  }
  
  @js.native
  trait Status extends VerboseResponse {
    
    var error: String = js.native
    
    var status: `0` = js.native
  }
  object Status {
    
    @scala.inline
    def apply(error: String, status: `0`): Status = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Status]
    }
    
    @scala.inline
    implicit class StatusMutableBuilder[Self <: Status] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: `0`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
