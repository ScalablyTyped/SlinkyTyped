package typingsSlinky.firefoxWebextBrowser.browser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Permissions: `privacy`
  *
  * Not allowed in: Content scripts, Devtools pages
  */
object privacy {
  
  /**
    * Use the `browser.privacy` API to control usage of the features in the browser that can affect a user's privacy.
    *
    * Permissions: `privacy`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  object network {
    
    /* privacy.network types */
    /** The IP handling policy of WebRTC. */
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.default
      - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.default_public_and_private_interfaces
      - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.default_public_interface_only
      - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.disable_non_proxied_udp
      - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.proxy_only
    */
    trait IPHandlingPolicy extends StObject
    object IPHandlingPolicy {
      
      @scala.inline
      def default: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.default = "default".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.default]
      
      @scala.inline
      def default_public_and_private_interfaces: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.default_public_and_private_interfaces = "default_public_and_private_interfaces".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.default_public_and_private_interfaces]
      
      @scala.inline
      def default_public_interface_only: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.default_public_interface_only = "default_public_interface_only".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.default_public_interface_only]
      
      @scala.inline
      def disable_non_proxied_udp: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.disable_non_proxied_udp = "disable_non_proxied_udp".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.disable_non_proxied_udp]
      
      @scala.inline
      def proxy_only: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.proxy_only = "proxy_only".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.proxy_only]
    }
    
    /** The maximum TLS version supported. */
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1
      - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot1
      - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot2
      - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot3
      - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown
    */
    trait TlsVersionRestrictionConfigMaximum extends StObject
    object TlsVersionRestrictionConfigMaximum {
      
      @scala.inline
      def TLSv1: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1 = "TLSv1".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1]
      
      @scala.inline
      def TLSv1Dot1: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot1 = "TLSv1.1".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot1]
      
      @scala.inline
      def TLSv1Dot2: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot2 = "TLSv1.2".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot2]
      
      @scala.inline
      def TLSv1Dot3: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot3 = "TLSv1.3".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot3]
      
      @scala.inline
      def unknown: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown = "unknown".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown]
    }
    
    /** The minimum TLS version supported. */
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1
      - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot1
      - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot2
      - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot3
      - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown
    */
    trait TlsVersionRestrictionConfigMinimum extends StObject
    object TlsVersionRestrictionConfigMinimum {
      
      @scala.inline
      def TLSv1: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1 = "TLSv1".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1]
      
      @scala.inline
      def TLSv1Dot1: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot1 = "TLSv1.1".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot1]
      
      @scala.inline
      def TLSv1Dot2: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot2 = "TLSv1.2".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot2]
      
      @scala.inline
      def TLSv1Dot3: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot3 = "TLSv1.3".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.TLSv1Dot3]
      
      @scala.inline
      def unknown: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown = "unknown".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.unknown]
    }
    
    /** An object which describes TLS minimum and maximum versions. */
    @js.native
    trait tlsVersionRestrictionConfig extends StObject {
      
      /** The maximum TLS version supported. */
      var maximum: js.UndefOr[TlsVersionRestrictionConfigMaximum] = js.native
      
      /** The minimum TLS version supported. */
      var minimum: js.UndefOr[TlsVersionRestrictionConfigMinimum] = js.native
    }
    object tlsVersionRestrictionConfig {
      
      @scala.inline
      def apply(): tlsVersionRestrictionConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[tlsVersionRestrictionConfig]
      }
      
      @scala.inline
      implicit class tlsVersionRestrictionConfigMutableBuilder[Self <: tlsVersionRestrictionConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMaximum(value: TlsVersionRestrictionConfigMaximum): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
        
        @scala.inline
        def setMinimum(value: TlsVersionRestrictionConfigMinimum): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
      }
    }
  }
  
  /**
    * Use the `browser.privacy` API to control usage of the features in the browser that can affect a user's privacy.
    *
    * Permissions: `privacy`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  object services
  
  /**
    * Use the `browser.privacy` API to control usage of the features in the browser that can affect a user's privacy.
    *
    * Permissions: `privacy`
    *
    * Not allowed in: Content scripts, Devtools pages
    */
  object websites {
    
    /** The settings for cookies. */
    @js.native
    trait CookieConfig extends StObject {
      
      /** The type of cookies to allow. */
      var behavior: js.UndefOr[CookieConfigBehavior] = js.native
      
      /** Whether to create all cookies as nonPersistent (i.e., session) cookies. */
      var nonPersistentCookies: js.UndefOr[Boolean] = js.native
    }
    object CookieConfig {
      
      @scala.inline
      def apply(): CookieConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CookieConfig]
      }
      
      @scala.inline
      implicit class CookieConfigMutableBuilder[Self <: CookieConfig] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBehavior(value: CookieConfigBehavior): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBehaviorUndefined: Self = StObject.set(x, "behavior", js.undefined)
        
        @scala.inline
        def setNonPersistentCookies(value: Boolean): Self = StObject.set(x, "nonPersistentCookies", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNonPersistentCookiesUndefined: Self = StObject.set(x, "nonPersistentCookies", js.undefined)
      }
    }
    
    /** The type of cookies to allow. */
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.allow_all
      - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.reject_all
      - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.reject_third_party
      - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.allow_visited
      - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.reject_trackers
      - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.reject_trackers_and_partition_foreign
    */
    trait CookieConfigBehavior extends StObject
    object CookieConfigBehavior {
      
      @scala.inline
      def allow_all: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.allow_all = "allow_all".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.allow_all]
      
      @scala.inline
      def allow_visited: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.allow_visited = "allow_visited".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.allow_visited]
      
      @scala.inline
      def reject_all: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.reject_all = "reject_all".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.reject_all]
      
      @scala.inline
      def reject_third_party: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.reject_third_party = "reject_third_party".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.reject_third_party]
      
      @scala.inline
      def reject_trackers: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.reject_trackers = "reject_trackers".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.reject_trackers]
      
      @scala.inline
      def reject_trackers_and_partition_foreign: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.reject_trackers_and_partition_foreign = "reject_trackers_and_partition_foreign".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.reject_trackers_and_partition_foreign]
    }
    
    /* privacy.websites types */
    /** The mode for tracking protection. */
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.always
      - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.never
      - typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.private_browsing
    */
    trait TrackingProtectionModeOption extends StObject
    object TrackingProtectionModeOption {
      
      @scala.inline
      def always: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.always = "always".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.always]
      
      @scala.inline
      def never: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.never = "never".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.never]
      
      @scala.inline
      def private_browsing: typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.private_browsing = "private_browsing".asInstanceOf[typingsSlinky.firefoxWebextBrowser.firefoxWebextBrowserStrings.private_browsing]
    }
  }
}
