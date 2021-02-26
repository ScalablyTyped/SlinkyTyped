package typingsSlinky.openGraphScraper

import typingsSlinky.node.streamMod.PassThrough
import typingsSlinky.openGraphScraper.anon.Error
import typingsSlinky.openGraphScraper.anon.OgDescription
import typingsSlinky.openGraphScraper.openGraphScraperBooleans.`false`
import typingsSlinky.openGraphScraper.openGraphScraperBooleans.`true`
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("open-graph-scraper", JSImport.Namespace)
  @js.native
  def apply(options: Options): js.Promise[SuccessResult | ErrorResult] = js.native
  @JSImport("open-graph-scraper", JSImport.Namespace)
  @js.native
  def apply(
    options: Options,
    callback: js.Function3[
      /* error */ Boolean, 
      /* results */ SuccessResult | ErrorResult, 
      /* response */ PassThrough, 
      Unit
    ]
  ): Unit = js.native
  
  @js.native
  trait ErrorResult extends StObject {
    
    var error: `true` = js.native
    
    var result: Error = js.native
  }
  object ErrorResult {
    
    @scala.inline
    def apply(error: `true`, result: Error): ErrorResult = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorResult]
    }
    
    @scala.inline
    implicit class ErrorResultMutableBuilder[Self <: ErrorResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: `true`): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResult(value: Error): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /** By default, OGS will only send back the first image/video it finds (default: `false`). */
    var allMedia: js.UndefOr[Boolean] = js.native
    
    /** Pass in an array of sites you don't want `og`s to run on. */
    var blacklist: js.UndefOr[js.Array[String]] = js.native
    
    /** Set the accept-encoding to `gzip/deflate` (default: `true`). */
    var decompress: js.UndefOr[Boolean] = js.native
    
    /** Setting this to `null` might help with running `og`s on non english websites (default: `utf8`). */
    var encoding: js.UndefOr[String | Null] = js.native
    
    /** Defines if redirect responses should be followed automatically (default: `true`). */
    var followRedirect: js.UndefOr[Boolean] = js.native
    
    /** An object containing request headers. Useful for setting the user-agent. */
    var headers: js.UndefOr[Record[String, String]] = js.native
    
    /** You can pass in an HTML string to run `og`s on it (use without `options.url`). */
    var html: js.UndefOr[String] = js.native
    
    /** Max number of redirects `og`s will follow (default: `10`). */
    var maxRedirects: js.UndefOr[Double] = js.native
    
    /** Fetch other images if no open graph ones are found (default: `true`). */
    var ogImageFallback: js.UndefOr[Boolean] = js.native
    
    /** Only fetch open graph info and don't fall back on anything else (default: `false`). */
    var onlyGetOpenGraphInfo: js.UndefOr[Boolean] = js.native
    
    /** Sets the peekSize for the request (default: `1024`). */
    var peekSize: js.UndefOr[Double] = js.native
    
    /** Number of times `og`s will retry the request (default: `2`). */
    var retry: js.UndefOr[Double] = js.native
    
    /** Runs charset and icons on the request payload (default: `false`). */
    var runChar: js.UndefOr[Boolean] = js.native
    
    /** Timeout of the request in ms (default: `2000`). */
    var timeout: js.UndefOr[Double] = js.native
    
    /** URL of the site. */
    var url: String = js.native
    
    /** Returns the charset in the `og`s payload (default: `false`). */
    var withCharset: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(url: String): Options = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllMedia(value: Boolean): Self = StObject.set(x, "allMedia", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllMediaUndefined: Self = StObject.set(x, "allMedia", js.undefined)
      
      @scala.inline
      def setBlacklist(value: js.Array[String]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
      
      @scala.inline
      def setBlacklistVarargs(value: String*): Self = StObject.set(x, "blacklist", js.Array(value :_*))
      
      @scala.inline
      def setDecompress(value: Boolean): Self = StObject.set(x, "decompress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecompressUndefined: Self = StObject.set(x, "decompress", js.undefined)
      
      @scala.inline
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingNull: Self = StObject.set(x, "encoding", null)
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setFollowRedirect(value: Boolean): Self = StObject.set(x, "followRedirect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowRedirectUndefined: Self = StObject.set(x, "followRedirect", js.undefined)
      
      @scala.inline
      def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      @scala.inline
      def setMaxRedirects(value: Double): Self = StObject.set(x, "maxRedirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRedirectsUndefined: Self = StObject.set(x, "maxRedirects", js.undefined)
      
      @scala.inline
      def setOgImageFallback(value: Boolean): Self = StObject.set(x, "ogImageFallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOgImageFallbackUndefined: Self = StObject.set(x, "ogImageFallback", js.undefined)
      
      @scala.inline
      def setOnlyGetOpenGraphInfo(value: Boolean): Self = StObject.set(x, "onlyGetOpenGraphInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnlyGetOpenGraphInfoUndefined: Self = StObject.set(x, "onlyGetOpenGraphInfo", js.undefined)
      
      @scala.inline
      def setPeekSize(value: Double): Self = StObject.set(x, "peekSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeekSizeUndefined: Self = StObject.set(x, "peekSize", js.undefined)
      
      @scala.inline
      def setRetry(value: Double): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
      @scala.inline
      def setRunChar(value: Boolean): Self = StObject.set(x, "runChar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRunCharUndefined: Self = StObject.set(x, "runChar", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithCharset(value: Boolean): Self = StObject.set(x, "withCharset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithCharsetUndefined: Self = StObject.set(x, "withCharset", js.undefined)
    }
  }
  
  @js.native
  trait SuccessResult extends StObject {
    
    var error: `false` = js.native
    
    var response: PassThrough = js.native
    
    var result: OgDescription = js.native
  }
  object SuccessResult {
    
    @scala.inline
    def apply(error: `false`, response: PassThrough, result: OgDescription): SuccessResult = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuccessResult]
    }
    
    @scala.inline
    implicit class SuccessResultMutableBuilder[Self <: SuccessResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: `false`): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: PassThrough): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResult(value: OgDescription): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
}
