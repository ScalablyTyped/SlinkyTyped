package typingsSlinky.metascraperMediaProvider

import typingsSlinky.metascraper.mod.Rule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("metascraper-media-provider", JSImport.Namespace)
  @js.native
  def apply(): Rule = js.native
  @JSImport("metascraper-media-provider", JSImport.Namespace)
  @js.native
  def apply(options: Options): Rule = js.native
  
  @js.native
  trait GetProxyData extends StObject {
    
    var retryCount: Double = js.native
    
    var url: String = js.native
  }
  object GetProxyData {
    
    @scala.inline
    def apply(retryCount: Double, url: String): GetProxyData = {
      val __obj = js.Dynamic.literal(retryCount = retryCount.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetProxyData]
    }
    
    @scala.inline
    implicit class GetProxyDataMutableBuilder[Self <: GetProxyData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRetryCount(value: Double): Self = StObject.set(x, "retryCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type GetProxyFunction = js.Function1[/* data */ GetProxyData, String]
  
  type OnErrorFunction = js.Function2[/* url */ String, /* error */ js.Error, Unit]
  
  @js.native
  trait Options extends StObject {
    
    /**
      * It specifies cache based on file system to be used by
      * [youtube-dl](https://github.com/microlinkhq/metascraper/blob/master/packages/metascraper-media-provider/youtube-dl).
      */
    var cacheDir: js.UndefOr[String] = js.native
    
    /**
      * It will be called to determinate if a proxy should be used for
      * resolving the next request URL.
      */
    var getProxy: js.UndefOr[GetProxyFunction] = js.native
    
    /** A function to be called when something wrong happens. */
    var onError: js.UndefOr[OnErrorFunction] = js.native
    
    /**
      * The maximum time allowed to wait until considering the request as
      * timed out. Default is `30000`.
      */
    var timeout: js.UndefOr[Double] = js.native
    
    /** It specifies a custom user agent. */
    var userAgent: js.UndefOr[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheDir(value: String): Self = StObject.set(x, "cacheDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheDirUndefined: Self = StObject.set(x, "cacheDir", js.undefined)
      
      @scala.inline
      def setGetProxy(value: /* data */ GetProxyData => String): Self = StObject.set(x, "getProxy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetProxyUndefined: Self = StObject.set(x, "getProxy", js.undefined)
      
      @scala.inline
      def setOnError(value: (/* url */ String, /* error */ js.Error) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    }
  }
}
