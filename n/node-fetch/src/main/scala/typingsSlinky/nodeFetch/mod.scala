package typingsSlinky.nodeFetch

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.formData.mod.^
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.ReadableStream
import typingsSlinky.node.httpMod.Agent
import typingsSlinky.node.urlMod.URLSearchParams
import typingsSlinky.node.urlMod.URL_
import typingsSlinky.nodeFetch.anon.Size
import typingsSlinky.nodeFetch.externalsMod.AbortSignal
import typingsSlinky.nodeFetch.nodeFetchStrings.native
import typingsSlinky.nodeFetch.nodeFetchStrings.transparent
import typingsSlinky.std.Error
import typingsSlinky.std.Iterable
import typingsSlinky.std.IterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("node-fetch", JSImport.Default)
    @js.native
    def apply(url: RequestInfo): js.Promise[Response] = js.native
    @JSImport("node-fetch", JSImport.Default)
    @js.native
    def apply(url: RequestInfo, init: RequestInit): js.Promise[Response] = js.native
    
    @JSImport("node-fetch", "default.isRedirect")
    @js.native
    def isRedirect(code: Double): Boolean = js.native
  }
  
  @JSImport("node-fetch", "Blob")
  @js.native
  class Blob () extends StObject {
    def this(blobParts: js.Array[BlobPart]) = this()
    def this(blobParts: js.UndefOr[scala.Nothing], options: BlobOptions) = this()
    def this(blobParts: js.Array[BlobPart], options: BlobOptions) = this()
    
    val size: Double = js.native
    
    def slice(): Blob = js.native
    def slice(start: js.UndefOr[scala.Nothing], end: Double): Blob = js.native
    def slice(start: Double): Blob = js.native
    def slice(start: Double, end: Double): Blob = js.native
    
    val `type`: String = js.native
  }
  
  @JSImport("node-fetch", "Body")
  @js.native
  class Body () extends StObject {
    def this(body: js.Any) = this()
    def this(body: js.UndefOr[scala.Nothing], opts: Size) = this()
    def this(body: js.Any, opts: Size) = this()
    
    def arrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    def blob(): js.Promise[Blob] = js.native
    
    var body: ReadableStream = js.native
    
    var bodyUsed: Boolean = js.native
    
    def buffer(): js.Promise[Buffer] = js.native
    
    def json(): js.Promise[_] = js.native
    
    var size: Double = js.native
    
    def text(): js.Promise[String] = js.native
    
    def textConverted(): js.Promise[String] = js.native
    
    var timeout: Double = js.native
  }
  
  @JSImport("node-fetch", "FetchError")
  @js.native
  class FetchError protected () extends Error {
    def this(message: String, `type`: String) = this()
    def this(message: String, `type`: String, systemError: SystemError) = this()
    
    var code: js.UndefOr[String] = js.native
    
    var errno: js.UndefOr[String] = js.native
    
    @JSName("name")
    var name_FetchError: typingsSlinky.nodeFetch.nodeFetchStrings.FetchError = js.native
    
    var `type`: String = js.native
  }
  
  @JSImport("node-fetch", "Headers")
  @js.native
  class Headers ()
    extends Iterable[js.Tuple2[String, String]] {
    def this(init: HeadersInit) = this()
    
    def append(name: String, value: String): Unit = js.native
    
    def delete(name: String): Unit = js.native
    
    // Iterable methods
    def entries(): IterableIterator[js.Tuple2[String, String]] = js.native
    
    def forEach(callback: js.Function2[/* value */ String, /* name */ String, Unit]): Unit = js.native
    
    def get(name: String): String | Null = js.native
    
    def has(name: String): Boolean = js.native
    
    def keys(): IterableIterator[String] = js.native
    
    def raw(): StringDictionary[js.Array[String]] = js.native
    
    def set(name: String, value: String): Unit = js.native
    
    def values(): IterableIterator[js.Array[String]] = js.native
  }
  
  @JSImport("node-fetch", "Request")
  @js.native
  class Request protected ()
    extends Body
       with _RequestInfo {
    def this(input: RequestInfo) = this()
    def this(input: RequestInfo, init: RequestInit) = this()
    
    // node-fetch extensions to the whatwg/fetch spec
    var agent: js.UndefOr[Agent | (js.Function1[/* parsedUrl */ URL_, Agent])] = js.native
    
    var compress: Boolean = js.native
    
    var context: RequestContext = js.native
    
    var counter: Double = js.native
    
    var follow: Double = js.native
    
    var headers: Headers = js.native
    
    var hostname: String = js.native
    
    var method: String = js.native
    
    var port: js.UndefOr[Double] = js.native
    
    var protocol: String = js.native
    
    var redirect: RequestRedirect = js.native
    
    var referrer: String = js.native
    
    var url: String = js.native
  }
  
  @JSImport("node-fetch", "Response")
  @js.native
  class Response () extends Body {
    def this(body: BodyInit) = this()
    def this(body: js.UndefOr[BodyInit], init: ResponseInit) = this()
    
    var headers: Headers = js.native
    
    var ok: Boolean = js.native
    
    var redirected: Boolean = js.native
    
    var status: Double = js.native
    
    var statusText: String = js.native
    
    var `type`: ResponseType = js.native
    
    var url: String = js.native
  }
  /* static members */
  object Response {
    
    @JSImport("node-fetch", "Response.error")
    @js.native
    def error(): Response = js.native
    
    @JSImport("node-fetch", "Response.redirect")
    @js.native
    def redirect(url: String, status: Double): Response = js.native
  }
  
  @js.native
  trait BlobOptions extends StObject {
    
    var endings: js.UndefOr[transparent | native] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  object BlobOptions {
    
    @scala.inline
    def apply(): BlobOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlobOptions]
    }
    
    @scala.inline
    implicit class BlobOptionsMutableBuilder[Self <: BlobOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndings(value: transparent | native): Self = StObject.set(x, "endings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndingsUndefined: Self = StObject.set(x, "endings", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type BlobPart = js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | Blob | String
  
  type BodyInit = js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | ReadableStream | String | URLSearchParams | ^
  
  type HeaderInit = HeadersInit
  
  type HeadersInit = Headers | js.Array[js.Array[String]] | StringDictionary[String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.nodeFetch.nodeFetchStrings.default
    - typingsSlinky.nodeFetch.nodeFetchStrings.`force-cache`
    - typingsSlinky.nodeFetch.nodeFetchStrings.`no-cache`
    - typingsSlinky.nodeFetch.nodeFetchStrings.`no-store`
    - typingsSlinky.nodeFetch.nodeFetchStrings.`only-if-cached`
    - typingsSlinky.nodeFetch.nodeFetchStrings.reload
  */
  trait RequestCache extends StObject
  object RequestCache {
    
    @scala.inline
    def default: typingsSlinky.nodeFetch.nodeFetchStrings.default = "default".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.default]
    
    @scala.inline
    def `force-cache`: typingsSlinky.nodeFetch.nodeFetchStrings.`force-cache` = "force-cache".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.`force-cache`]
    
    @scala.inline
    def `no-cache`: typingsSlinky.nodeFetch.nodeFetchStrings.`no-cache` = "no-cache".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.`no-cache`]
    
    @scala.inline
    def `no-store`: typingsSlinky.nodeFetch.nodeFetchStrings.`no-store` = "no-store".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.`no-store`]
    
    @scala.inline
    def `only-if-cached`: typingsSlinky.nodeFetch.nodeFetchStrings.`only-if-cached` = "only-if-cached".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.`only-if-cached`]
    
    @scala.inline
    def reload: typingsSlinky.nodeFetch.nodeFetchStrings.reload = "reload".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.reload]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.nodeFetch.nodeFetchStrings.audio
    - typingsSlinky.nodeFetch.nodeFetchStrings.beacon
    - typingsSlinky.nodeFetch.nodeFetchStrings.cspreport
    - typingsSlinky.nodeFetch.nodeFetchStrings.download
    - typingsSlinky.nodeFetch.nodeFetchStrings.embed
    - typingsSlinky.nodeFetch.nodeFetchStrings.eventsource
    - typingsSlinky.nodeFetch.nodeFetchStrings.favicon
    - typingsSlinky.nodeFetch.nodeFetchStrings.fetch
    - typingsSlinky.nodeFetch.nodeFetchStrings.font
    - typingsSlinky.nodeFetch.nodeFetchStrings.form
    - typingsSlinky.nodeFetch.nodeFetchStrings.frame
    - typingsSlinky.nodeFetch.nodeFetchStrings.hyperlink
    - typingsSlinky.nodeFetch.nodeFetchStrings.iframe
    - typingsSlinky.nodeFetch.nodeFetchStrings.image
    - typingsSlinky.nodeFetch.nodeFetchStrings.imageset
    - typingsSlinky.nodeFetch.nodeFetchStrings.`import`
    - typingsSlinky.nodeFetch.nodeFetchStrings.internal
    - typingsSlinky.nodeFetch.nodeFetchStrings.location
    - typingsSlinky.nodeFetch.nodeFetchStrings.manifest
    - typingsSlinky.nodeFetch.nodeFetchStrings.`object`
    - typingsSlinky.nodeFetch.nodeFetchStrings.ping
    - typingsSlinky.nodeFetch.nodeFetchStrings.plugin
    - typingsSlinky.nodeFetch.nodeFetchStrings.prefetch
    - typingsSlinky.nodeFetch.nodeFetchStrings.script
    - typingsSlinky.nodeFetch.nodeFetchStrings.serviceworker
    - typingsSlinky.nodeFetch.nodeFetchStrings.sharedworker
    - typingsSlinky.nodeFetch.nodeFetchStrings.style
    - typingsSlinky.nodeFetch.nodeFetchStrings.subresource
    - typingsSlinky.nodeFetch.nodeFetchStrings.track
    - typingsSlinky.nodeFetch.nodeFetchStrings.video
    - typingsSlinky.nodeFetch.nodeFetchStrings.worker
    - typingsSlinky.nodeFetch.nodeFetchStrings.xmlhttprequest
    - typingsSlinky.nodeFetch.nodeFetchStrings.xslt
  */
  trait RequestContext extends StObject
  object RequestContext {
    
    @scala.inline
    def audio: typingsSlinky.nodeFetch.nodeFetchStrings.audio = "audio".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.audio]
    
    @scala.inline
    def beacon: typingsSlinky.nodeFetch.nodeFetchStrings.beacon = "beacon".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.beacon]
    
    @scala.inline
    def cspreport: typingsSlinky.nodeFetch.nodeFetchStrings.cspreport = "cspreport".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.cspreport]
    
    @scala.inline
    def download: typingsSlinky.nodeFetch.nodeFetchStrings.download = "download".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.download]
    
    @scala.inline
    def embed: typingsSlinky.nodeFetch.nodeFetchStrings.embed = "embed".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.embed]
    
    @scala.inline
    def eventsource: typingsSlinky.nodeFetch.nodeFetchStrings.eventsource = "eventsource".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.eventsource]
    
    @scala.inline
    def favicon: typingsSlinky.nodeFetch.nodeFetchStrings.favicon = "favicon".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.favicon]
    
    @scala.inline
    def fetch: typingsSlinky.nodeFetch.nodeFetchStrings.fetch = "fetch".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.fetch]
    
    @scala.inline
    def font: typingsSlinky.nodeFetch.nodeFetchStrings.font = "font".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.font]
    
    @scala.inline
    def form: typingsSlinky.nodeFetch.nodeFetchStrings.form = "form".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.form]
    
    @scala.inline
    def frame: typingsSlinky.nodeFetch.nodeFetchStrings.frame = "frame".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.frame]
    
    @scala.inline
    def hyperlink: typingsSlinky.nodeFetch.nodeFetchStrings.hyperlink = "hyperlink".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.hyperlink]
    
    @scala.inline
    def iframe: typingsSlinky.nodeFetch.nodeFetchStrings.iframe = "iframe".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.iframe]
    
    @scala.inline
    def image: typingsSlinky.nodeFetch.nodeFetchStrings.image = "image".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.image]
    
    @scala.inline
    def imageset: typingsSlinky.nodeFetch.nodeFetchStrings.imageset = "imageset".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.imageset]
    
    @scala.inline
    def `import`: typingsSlinky.nodeFetch.nodeFetchStrings.`import` = "import".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.`import`]
    
    @scala.inline
    def internal: typingsSlinky.nodeFetch.nodeFetchStrings.internal = "internal".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.internal]
    
    @scala.inline
    def location: typingsSlinky.nodeFetch.nodeFetchStrings.location = "location".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.location]
    
    @scala.inline
    def manifest: typingsSlinky.nodeFetch.nodeFetchStrings.manifest = "manifest".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.manifest]
    
    @scala.inline
    def `object`: typingsSlinky.nodeFetch.nodeFetchStrings.`object` = "object".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.`object`]
    
    @scala.inline
    def ping: typingsSlinky.nodeFetch.nodeFetchStrings.ping = "ping".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.ping]
    
    @scala.inline
    def plugin: typingsSlinky.nodeFetch.nodeFetchStrings.plugin = "plugin".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.plugin]
    
    @scala.inline
    def prefetch: typingsSlinky.nodeFetch.nodeFetchStrings.prefetch = "prefetch".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.prefetch]
    
    @scala.inline
    def script: typingsSlinky.nodeFetch.nodeFetchStrings.script = "script".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.script]
    
    @scala.inline
    def serviceworker: typingsSlinky.nodeFetch.nodeFetchStrings.serviceworker = "serviceworker".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.serviceworker]
    
    @scala.inline
    def sharedworker: typingsSlinky.nodeFetch.nodeFetchStrings.sharedworker = "sharedworker".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.sharedworker]
    
    @scala.inline
    def style: typingsSlinky.nodeFetch.nodeFetchStrings.style = "style".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.style]
    
    @scala.inline
    def subresource: typingsSlinky.nodeFetch.nodeFetchStrings.subresource = "subresource".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.subresource]
    
    @scala.inline
    def track: typingsSlinky.nodeFetch.nodeFetchStrings.track = "track".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.track]
    
    @scala.inline
    def video: typingsSlinky.nodeFetch.nodeFetchStrings.video = "video".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.video]
    
    @scala.inline
    def worker: typingsSlinky.nodeFetch.nodeFetchStrings.worker = "worker".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.worker]
    
    @scala.inline
    def xmlhttprequest: typingsSlinky.nodeFetch.nodeFetchStrings.xmlhttprequest = "xmlhttprequest".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.xmlhttprequest]
    
    @scala.inline
    def xslt: typingsSlinky.nodeFetch.nodeFetchStrings.xslt = "xslt".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.xslt]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.nodeFetch.nodeFetchStrings.omit
    - typingsSlinky.nodeFetch.nodeFetchStrings.include
    - typingsSlinky.nodeFetch.nodeFetchStrings.`same-origin`
  */
  trait RequestCredentials extends StObject
  object RequestCredentials {
    
    @scala.inline
    def include: typingsSlinky.nodeFetch.nodeFetchStrings.include = "include".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.include]
    
    @scala.inline
    def omit: typingsSlinky.nodeFetch.nodeFetchStrings.omit = "omit".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.omit]
    
    @scala.inline
    def `same-origin`: typingsSlinky.nodeFetch.nodeFetchStrings.`same-origin` = "same-origin".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.`same-origin`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typingsSlinky.nodeFetch.mod.URLLike
    - typingsSlinky.nodeFetch.mod.Request
  */
  type RequestInfo = _RequestInfo | String
  
  @js.native
  trait RequestInit extends StObject {
    
    // node-fetch extensions
    var agent: js.UndefOr[Agent | (js.Function1[/* parsedUrl */ URL_, Agent])] = js.native
    
    // whatwg/fetch standard options
    var body: js.UndefOr[BodyInit] = js.native
    
    // =null http.Agent instance, allows custom proxy, certificate etc.
    var compress: js.UndefOr[Boolean] = js.native
    
    // =true support gzip/deflate content encoding. false to disable
    var follow: js.UndefOr[Double] = js.native
    
    var headers: js.UndefOr[HeadersInit] = js.native
    
    var method: js.UndefOr[String] = js.native
    
    var redirect: js.UndefOr[RequestRedirect] = js.native
    
    var signal: js.UndefOr[AbortSignal | Null] = js.native
    
    // =20 maximum redirect count. 0 to not follow redirect
    var size: js.UndefOr[Double] = js.native
    
    // =0 maximum response body size in bytes. 0 to disable
    var timeout: js.UndefOr[Double] = js.native
  }
  object RequestInit {
    
    @scala.inline
    def apply(): RequestInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestInit]
    }
    
    @scala.inline
    implicit class RequestInitMutableBuilder[Self <: RequestInit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: Agent | (js.Function1[/* parsedUrl */ URL_, Agent])): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentFunction1(value: /* parsedUrl */ URL_ => Agent): Self = StObject.set(x, "agent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setBody(value: BodyInit): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyArrayBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyArrayBufferView(value: js.typedarray.ArrayBufferView): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      @scala.inline
      def setFollow(value: Double): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
      
      @scala.inline
      def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHeadersVarargs(value: js.Array[String]*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setRedirect(value: RequestRedirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      @scala.inline
      def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignalNull: Self = StObject.set(x, "signal", null)
      
      @scala.inline
      def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.nodeFetch.nodeFetchStrings.cors
    - typingsSlinky.nodeFetch.nodeFetchStrings.`no-cors`
    - typingsSlinky.nodeFetch.nodeFetchStrings.`same-origin`
  */
  trait RequestMode extends StObject
  object RequestMode {
    
    @scala.inline
    def cors: typingsSlinky.nodeFetch.nodeFetchStrings.cors = "cors".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.cors]
    
    @scala.inline
    def `no-cors`: typingsSlinky.nodeFetch.nodeFetchStrings.`no-cors` = "no-cors".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.`no-cors`]
    
    @scala.inline
    def `same-origin`: typingsSlinky.nodeFetch.nodeFetchStrings.`same-origin` = "same-origin".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.`same-origin`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.nodeFetch.nodeFetchStrings.error
    - typingsSlinky.nodeFetch.nodeFetchStrings.follow
    - typingsSlinky.nodeFetch.nodeFetchStrings.manual
  */
  trait RequestRedirect extends StObject
  object RequestRedirect {
    
    @scala.inline
    def error: typingsSlinky.nodeFetch.nodeFetchStrings.error = "error".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.error]
    
    @scala.inline
    def follow: typingsSlinky.nodeFetch.nodeFetchStrings.follow = "follow".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.follow]
    
    @scala.inline
    def manual: typingsSlinky.nodeFetch.nodeFetchStrings.manual = "manual".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.manual]
  }
  
  @js.native
  trait ResponseInit extends StObject {
    
    var headers: js.UndefOr[HeadersInit] = js.native
    
    var size: js.UndefOr[Double] = js.native
    
    var status: js.UndefOr[Double] = js.native
    
    var statusText: js.UndefOr[String] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var url: js.UndefOr[String] = js.native
  }
  object ResponseInit {
    
    @scala.inline
    def apply(): ResponseInit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponseInit]
    }
    
    @scala.inline
    implicit class ResponseInitMutableBuilder[Self <: ResponseInit] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHeadersVarargs(value: js.Array[String]*): Self = StObject.set(x, "headers", js.Array(value :_*))
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.nodeFetch.nodeFetchStrings.basic
    - typingsSlinky.nodeFetch.nodeFetchStrings.cors
    - typingsSlinky.nodeFetch.nodeFetchStrings.default
    - typingsSlinky.nodeFetch.nodeFetchStrings.error
    - typingsSlinky.nodeFetch.nodeFetchStrings.opaque
    - typingsSlinky.nodeFetch.nodeFetchStrings.opaqueredirect
  */
  trait ResponseType extends StObject
  object ResponseType {
    
    @scala.inline
    def default: typingsSlinky.nodeFetch.nodeFetchStrings.default = "default".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.default]
    
    @scala.inline
    def basic: typingsSlinky.nodeFetch.nodeFetchStrings.basic = "basic".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.basic]
    
    @scala.inline
    def cors: typingsSlinky.nodeFetch.nodeFetchStrings.cors = "cors".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.cors]
    
    @scala.inline
    def error: typingsSlinky.nodeFetch.nodeFetchStrings.error = "error".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.error]
    
    @scala.inline
    def opaque: typingsSlinky.nodeFetch.nodeFetchStrings.opaque = "opaque".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.opaque]
    
    @scala.inline
    def opaqueredirect: typingsSlinky.nodeFetch.nodeFetchStrings.opaqueredirect = "opaqueredirect".asInstanceOf[typingsSlinky.nodeFetch.nodeFetchStrings.opaqueredirect]
  }
  
  @js.native
  trait SystemError extends Error {
    
    var code: js.UndefOr[String] = js.native
  }
  object SystemError {
    
    @scala.inline
    def apply(message: String, name: String): SystemError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SystemError]
    }
    
    @scala.inline
    implicit class SystemErrorMutableBuilder[Self <: SystemError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    }
  }
  
  @js.native
  trait URLLike extends _RequestInfo {
    
    var href: String = js.native
  }
  object URLLike {
    
    @scala.inline
    def apply(href: String): URLLike = {
      val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any])
      __obj.asInstanceOf[URLLike]
    }
    
    @scala.inline
    implicit class URLLikeMutableBuilder[Self <: URLLike] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    }
  }
  
  trait _RequestInfo extends StObject
}
