package typingsSlinky.cloudflareApps

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Element
import typingsSlinky.cloudflareApps.cloudflareAppsStrings.after
import typingsSlinky.cloudflareApps.cloudflareAppsStrings.append
import typingsSlinky.cloudflareApps.cloudflareAppsStrings.before
import typingsSlinky.cloudflareApps.cloudflareAppsStrings.http
import typingsSlinky.cloudflareApps.cloudflareAppsStrings.https
import typingsSlinky.cloudflareApps.cloudflareAppsStrings.prepend
import typingsSlinky.cloudflareApps.cloudflareAppsStrings.replace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CloudflareApps {
  
  @js.native
  trait App extends StObject {
    
    var appId: String = js.native
    
    var options: InstallOptions = js.native
    
    var scope: InstallScope = js.native
  }
  object App {
    
    @scala.inline
    def apply(appId: String, options: InstallOptions, scope: InstallScope): App = {
      val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[App]
    }
    
    @scala.inline
    implicit class AppMutableBuilder[Self <: App] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: InstallOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScope(value: InstallScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CloudflareApps extends CloudflareAppsMethods {
    
    var installs: StringDictionary[js.UndefOr[App]] = js.native
    
    var proxy: CloudflareAppsProxy = js.native
    
    var siteId: String = js.native
  }
  
  @js.native
  trait CloudflareAppsMethods extends StObject {
    
    def createElement[T /* <: Element */](options: ElementLocation): T = js.native
    def createElement[T /* <: Element */](options: ElementLocation, previousElement: T): T = js.native
    
    def matchPage(patterns: js.Array[String]): Boolean = js.native
    
    def querySelector(selectors: String): Element | Null = js.native
    def querySelector[K /* <: /* keyof cloudflare-apps.anon.ElementTagNameMap */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 172 */ js.Any */](selectors: K): (/* import warning: importer.ImportType#apply Failed type conversion: cloudflare-apps.anon.ElementTagNameMap[K] */ js.Any) | Null = js.native
  }
  
  @js.native
  trait CloudflareAppsProxy extends StObject {
    
    var embedSiteId: String = js.native
    
    var hasRocketEmbed: Boolean = js.native
    
    var originalURL: OriginalURL = js.native
  }
  object CloudflareAppsProxy {
    
    @scala.inline
    def apply(embedSiteId: String, hasRocketEmbed: Boolean, originalURL: OriginalURL): CloudflareAppsProxy = {
      val __obj = js.Dynamic.literal(embedSiteId = embedSiteId.asInstanceOf[js.Any], hasRocketEmbed = hasRocketEmbed.asInstanceOf[js.Any], originalURL = originalURL.asInstanceOf[js.Any])
      __obj.asInstanceOf[CloudflareAppsProxy]
    }
    
    @scala.inline
    implicit class CloudflareAppsProxyMutableBuilder[Self <: CloudflareAppsProxy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmbedSiteId(value: String): Self = StObject.set(x, "embedSiteId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasRocketEmbed(value: Boolean): Self = StObject.set(x, "hasRocketEmbed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginalURL(value: OriginalURL): Self = StObject.set(x, "originalURL", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ElementLocation extends StObject {
    
    var method: before | prepend | append | after | replace = js.native
    
    var selector: String = js.native
  }
  object ElementLocation {
    
    @scala.inline
    def apply(method: before | prepend | append | after | replace, selector: String): ElementLocation = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElementLocation]
    }
    
    @scala.inline
    implicit class ElementLocationMutableBuilder[Self <: ElementLocation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethod(value: before | prepend | append | after | replace): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    }
  }
  
  type InstallOptions = StringDictionary[js.Any]
  
  @js.native
  trait InstallProduct extends StObject {
    
    var id: String = js.native
  }
  object InstallProduct {
    
    @scala.inline
    def apply(id: String): InstallProduct = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[InstallProduct]
    }
    
    @scala.inline
    implicit class InstallProductMutableBuilder[Self <: InstallProduct] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  type InstallScope = StringDictionary[js.Any]
  
  @js.native
  trait OriginalURL extends StObject {
    
    var parsed: OriginalURLParsed = js.native
    
    var raw: String = js.native
  }
  object OriginalURL {
    
    @scala.inline
    def apply(parsed: OriginalURLParsed, raw: String): OriginalURL = {
      val __obj = js.Dynamic.literal(parsed = parsed.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any])
      __obj.asInstanceOf[OriginalURL]
    }
    
    @scala.inline
    implicit class OriginalURLMutableBuilder[Self <: OriginalURL] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParsed(value: OriginalURLParsed): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OriginalURLParsed extends StObject {
    
    var fragment: String = js.native
    
    var host: String = js.native
    
    var path: String = js.native
    
    var query: URLQuery = js.native
    
    var scheme: https | http = js.native
  }
  object OriginalURLParsed {
    
    @scala.inline
    def apply(fragment: String, host: String, path: String, query: URLQuery, scheme: https | http): OriginalURLParsed = {
      val __obj = js.Dynamic.literal(fragment = fragment.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
      __obj.asInstanceOf[OriginalURLParsed]
    }
    
    @scala.inline
    implicit class OriginalURLParsedMutableBuilder[Self <: OriginalURLParsed] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFragment(value: String): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: URLQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScheme(value: https | http): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    }
  }
  
  type URLQuery = StringDictionary[js.Array[String]]
}
