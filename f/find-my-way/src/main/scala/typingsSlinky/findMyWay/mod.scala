package typingsSlinky.findMyWay

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.findMyWay.anon.DeriveVersion
import typingsSlinky.node.http2Mod.Http2ServerRequest
import typingsSlinky.node.http2Mod.Http2ServerResponse
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("find-my-way", JSImport.Namespace)
  @js.native
  def apply[V /* <: HTTPVersion */](): Instance[V] = js.native
  @JSImport("find-my-way", JSImport.Namespace)
  @js.native
  def apply[V /* <: HTTPVersion */](config: Config[V]): Instance[V] = js.native
  
  @js.native
  sealed trait HTTPVersion extends StObject
  @JSImport("find-my-way", "HTTPVersion")
  @js.native
  object HTTPVersion extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[HTTPVersion with String] = js.native
    
    @js.native
    sealed trait V1 extends HTTPVersion
    /* "http1" */ val V1: typingsSlinky.findMyWay.mod.HTTPVersion.V1 with String = js.native
    
    @js.native
    sealed trait V2 extends HTTPVersion
    /* "http2" */ val V2: typingsSlinky.findMyWay.mod.HTTPVersion.V2 with String = js.native
  }
  
  @js.native
  trait Config[V /* <: HTTPVersion */] extends StObject {
    
    var allowUnsafeRegex: js.UndefOr[Boolean] = js.native
    
    var caseSensitive: js.UndefOr[Boolean] = js.native
    
    var defaultRoute: js.UndefOr[js.Function2[/* req */ Req[V], /* res */ Res[V], Unit]] = js.native
    
    var ignoreTrailingSlash: js.UndefOr[Boolean] = js.native
    
    var maxParamLength: js.UndefOr[Double] = js.native
    
    var onBadUrl: js.UndefOr[js.Function3[/* path */ String, /* req */ Req[V], /* res */ Res[V], Unit]] = js.native
    
    var versioning: js.UndefOr[DeriveVersion[V]] = js.native
  }
  object Config {
    
    @scala.inline
    def apply[V /* <: HTTPVersion */](): Config[V] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config[V]]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config[_], V /* <: HTTPVersion */] (val x: Self with Config[V]) extends AnyVal {
      
      @scala.inline
      def setAllowUnsafeRegex(value: Boolean): Self = StObject.set(x, "allowUnsafeRegex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowUnsafeRegexUndefined: Self = StObject.set(x, "allowUnsafeRegex", js.undefined)
      
      @scala.inline
      def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      @scala.inline
      def setDefaultRoute(value: (/* req */ Req[V], /* res */ Res[V]) => Unit): Self = StObject.set(x, "defaultRoute", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDefaultRouteUndefined: Self = StObject.set(x, "defaultRoute", js.undefined)
      
      @scala.inline
      def setIgnoreTrailingSlash(value: Boolean): Self = StObject.set(x, "ignoreTrailingSlash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreTrailingSlashUndefined: Self = StObject.set(x, "ignoreTrailingSlash", js.undefined)
      
      @scala.inline
      def setMaxParamLength(value: Double): Self = StObject.set(x, "maxParamLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxParamLengthUndefined: Self = StObject.set(x, "maxParamLength", js.undefined)
      
      @scala.inline
      def setOnBadUrl(value: (/* path */ String, /* req */ Req[V], /* res */ Res[V]) => Unit): Self = StObject.set(x, "onBadUrl", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnBadUrlUndefined: Self = StObject.set(x, "onBadUrl", js.undefined)
      
      @scala.inline
      def setVersioning(value: DeriveVersion[V]): Self = StObject.set(x, "versioning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersioningUndefined: Self = StObject.set(x, "versioning", js.undefined)
    }
  }
  
  @js.native
  trait FindResult[V /* <: HTTPVersion */] extends StObject {
    
    def handler(req: Req[V], res: Res[V], params: StringDictionary[js.UndefOr[String]], store: js.Any): Unit = js.native
    @JSName("handler")
    var handler_Original: Handler[V] = js.native
    
    var params: StringDictionary[js.UndefOr[String]] = js.native
    
    var store: js.Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.findMyWay.findMyWayStrings.ACL
    - typingsSlinky.findMyWay.findMyWayStrings.BIND
    - typingsSlinky.findMyWay.findMyWayStrings.CHECKOUT
    - typingsSlinky.findMyWay.findMyWayStrings.CONNECT
    - typingsSlinky.findMyWay.findMyWayStrings.COPY
    - typingsSlinky.findMyWay.findMyWayStrings.DELETE
    - typingsSlinky.findMyWay.findMyWayStrings.GET
    - typingsSlinky.findMyWay.findMyWayStrings.HEAD
    - typingsSlinky.findMyWay.findMyWayStrings.LINK
    - typingsSlinky.findMyWay.findMyWayStrings.LOCK
    - typingsSlinky.findMyWay.findMyWayStrings.`M-SEARCH`
    - typingsSlinky.findMyWay.findMyWayStrings.MERGE
    - typingsSlinky.findMyWay.findMyWayStrings.MKACTIVITY
    - typingsSlinky.findMyWay.findMyWayStrings.MKCALENDAR
    - typingsSlinky.findMyWay.findMyWayStrings.MKCOL
    - typingsSlinky.findMyWay.findMyWayStrings.MOVE
    - typingsSlinky.findMyWay.findMyWayStrings.NOTIFY
    - typingsSlinky.findMyWay.findMyWayStrings.OPTIONS
    - typingsSlinky.findMyWay.findMyWayStrings.PATCH
    - typingsSlinky.findMyWay.findMyWayStrings.POST
    - typingsSlinky.findMyWay.findMyWayStrings.PROPFIND
    - typingsSlinky.findMyWay.findMyWayStrings.PROPPATCH
    - typingsSlinky.findMyWay.findMyWayStrings.PURGE
    - typingsSlinky.findMyWay.findMyWayStrings.PUT
    - typingsSlinky.findMyWay.findMyWayStrings.REBIND
    - typingsSlinky.findMyWay.findMyWayStrings.REPORT
    - typingsSlinky.findMyWay.findMyWayStrings.SEARCH
    - typingsSlinky.findMyWay.findMyWayStrings.SOURCE
    - typingsSlinky.findMyWay.findMyWayStrings.SUBSCRIBE
    - typingsSlinky.findMyWay.findMyWayStrings.TRACE
    - typingsSlinky.findMyWay.findMyWayStrings.UNBIND
    - typingsSlinky.findMyWay.findMyWayStrings.UNLINK
    - typingsSlinky.findMyWay.findMyWayStrings.UNLOCK
    - typingsSlinky.findMyWay.findMyWayStrings.UNSUBSCRIBE
  */
  trait HTTPMethod extends StObject
  object HTTPMethod {
    
    @scala.inline
    def ACL: typingsSlinky.findMyWay.findMyWayStrings.ACL = "ACL".asInstanceOf[typingsSlinky.findMyWay.findMyWayStrings.ACL]
    
    @scala.inline
    def BIND: typingsSlinky.findMyWay.findMyWayStrings.BIND = "BIND".asInstanceOf[typingsSlinky.findMyWay.findMyWayStrings.BIND]
    
    @scala.inline
    def CHECKOUT: typingsSlinky.findMyWay.findMyWayStrings.CHECKOUT = "CHECKOUT".asInstanceOf[typingsSlinky.findMyWay.findMyWayStrings.CHECKOUT]
    
    @scala.inline
    def CONNECT: typingsSlinky.findMyWay.findMyWayStrings.CONNECT = "CONNECT".asInstanceOf[typingsSlinky.findMyWay.findMyWayStrings.CONNECT]
    
    @scala.inline
    def COPY: typingsSlinky.findMyWay.findMyWayStrings.COPY = "COPY".asInstanceOf[typingsSlinky.findMyWay.findMyWayStrings.COPY]
    
    @scala.inline
    def DELETE: typingsSlinky.findMyWay.findMyWayStrings.DELETE = "DELETE".asInstanceOf[typingsSlinky.findMyWay.findMyWayStrings.DELETE]
    
    @scala.inline
    def GET: typingsSlinky.findMyWay.findMyWayStrings.GET = "GET".asInstanceOf[typingsSlinky.findMyWay.findMyWayStrings.GET]
    
    @scala.inline
    def HEAD: typingsSlinky.findMyWay.findMyWayStrings.HEAD = "HEAD".asInstanceOf[typingsSlinky.findMyWay.findMyWayStrings.HEAD]
    
    @scala.inline
    def LINK: typingsSlinky.findMyWay.findMyWayStrings.LINK = "LINK".asInstanceOf[typingsSlinky.findMyWay.findMyWayStrings.LINK]
    
    @scala.inline
    def LOCK: typingsSlinky.findMyWay.findMyWayStrings.LOCK = "LOCK".asInstanceOf[typingsSlinky.findMyWay.findMyWayStrings.LOCK]
    
    @scala.inline
    def `M-SEARCH`: typingsSlinky.findMyWay.findMyWayStrings.`M-SEARCH` = "M-SEARCH".asInstanceOf[typingsSlinky.findMyWay.findMyWayStrings.`M-SEARCH`]
    
    @scala.inline
    def MERGE: typingsSlinky.findMyWay.findMyWayStrings.MERGE = "MERGE".asInstanceOf[typingsSlinky.findMyWay.findMyWayStrings.MERGE]
    
    @scala.inline
    def MKACTIVITY: typingsSlinky.findMyWay.findMyWayStrings.MKACTIVITY = "MKACTIVITY".asInstanceOf[typingsSlinky.findMyWay.findMyWayStrings.MKACTIVITY]
    
    @scala.inline
    def MKCALENDAR: typingsSlinky.findMyWay.findMyWayStrings.MKCALENDAR = "MKCALENDAR".asInstanceOf[typingsSlinky.findMyWay.findMyWayStrings.MKCALENDAR]
    
    @scala.inline
    def MKCOL: typingsSlinky.findMyWay.findMyWayStrings.MKCOL = "MKCOL".asInstanceOf[typingsSlinky.findMyWay.findMyWayStrings.MKCOL]
    
    @scala.inline
    def MOVE: typingsSlinky.findMyWay.findMyWayStrings.MOVE = "MOVE".asInstanceOf[typingsSlinky.findMyWay.findMyWayStrings.MOVE]
    
    @scala.inline
    def NOTIFY: typingsSlinky.findMyWay.findMyWayStrings.NOTIFY = "NOTIFY".asInstanceOf[typingsSlinky.findMyWay.findMyWayStrings.NOTIFY]
    
    @scala.inline
    def OPTIONS: typingsSlinky.findMyWay.findMyWayStrings.OPTIONS = "OPTIONS".asInstanceOf[typingsSlinky.findMyWay.findMyWayStrings.OPTIONS]
    
    @scala.inline
    def PATCH: typingsSlinky.findMyWay.findMyWayStrings.PATCH = "PATCH".asInstanceOf[typingsSlinky.findMyWay.findMyWayStrings.PATCH]
    
    @scala.inline
    def POST: typingsSlinky.findMyWay.findMyWayStrings.POST = "POST".asInstanceOf[typingsSlinky.findMyWay.findMyWayStrings.POST]
    
    @scala.inline
    def PROPFIND: typingsSlinky.findMyWay.findMyWayStrings.PROPFIND = "PROPFIND".asInstanceOf[typingsSlinky.findMyWay.findMyWayStrings.PROPFIND]
    
    @scala.inline
    def PROPPATCH: typingsSlinky.findMyWay.findMyWayStrings.PROPPATCH = "PROPPATCH".asInstanceOf[typingsSlinky.findMyWay.findMyWayStrings.PROPPATCH]
    
    @scala.inline
    def PURGE: typingsSlinky.findMyWay.findMyWayStrings.PURGE = "PURGE".asInstanceOf[typingsSlinky.findMyWay.findMyWayStrings.PURGE]
    
    @scala.inline
    def PUT: typingsSlinky.findMyWay.findMyWayStrings.PUT = "PUT".asInstanceOf[typingsSlinky.findMyWay.findMyWayStrings.PUT]
    
    @scala.inline
    def REBIND: typingsSlinky.findMyWay.findMyWayStrings.REBIND = "REBIND".asInstanceOf[typingsSlinky.findMyWay.findMyWayStrings.REBIND]
    
    @scala.inline
    def REPORT: typingsSlinky.findMyWay.findMyWayStrings.REPORT = "REPORT".asInstanceOf[typingsSlinky.findMyWay.findMyWayStrings.REPORT]
    
    @scala.inline
    def SEARCH: typingsSlinky.findMyWay.findMyWayStrings.SEARCH = "SEARCH".asInstanceOf[typingsSlinky.findMyWay.findMyWayStrings.SEARCH]
    
    @scala.inline
    def SOURCE: typingsSlinky.findMyWay.findMyWayStrings.SOURCE = "SOURCE".asInstanceOf[typingsSlinky.findMyWay.findMyWayStrings.SOURCE]
    
    @scala.inline
    def SUBSCRIBE: typingsSlinky.findMyWay.findMyWayStrings.SUBSCRIBE = "SUBSCRIBE".asInstanceOf[typingsSlinky.findMyWay.findMyWayStrings.SUBSCRIBE]
    
    @scala.inline
    def TRACE: typingsSlinky.findMyWay.findMyWayStrings.TRACE = "TRACE".asInstanceOf[typingsSlinky.findMyWay.findMyWayStrings.TRACE]
    
    @scala.inline
    def UNBIND: typingsSlinky.findMyWay.findMyWayStrings.UNBIND = "UNBIND".asInstanceOf[typingsSlinky.findMyWay.findMyWayStrings.UNBIND]
    
    @scala.inline
    def UNLINK: typingsSlinky.findMyWay.findMyWayStrings.UNLINK = "UNLINK".asInstanceOf[typingsSlinky.findMyWay.findMyWayStrings.UNLINK]
    
    @scala.inline
    def UNLOCK: typingsSlinky.findMyWay.findMyWayStrings.UNLOCK = "UNLOCK".asInstanceOf[typingsSlinky.findMyWay.findMyWayStrings.UNLOCK]
    
    @scala.inline
    def UNSUBSCRIBE: typingsSlinky.findMyWay.findMyWayStrings.UNSUBSCRIBE = "UNSUBSCRIBE".asInstanceOf[typingsSlinky.findMyWay.findMyWayStrings.UNSUBSCRIBE]
  }
  
  type Handler[V /* <: HTTPVersion */] = js.Function4[
    /* req */ Req[V], 
    /* res */ Res[V], 
    /* params */ StringDictionary[js.UndefOr[String]], 
    /* store */ js.Any, 
    Unit
  ]
  
  @js.native
  trait Instance[V /* <: HTTPVersion */] extends StObject {
    
    def acl(path: String, handler: Handler[V]): Unit = js.native
    def acl(path: String, handler: Handler[V], store: js.Any): Unit = js.native
    def acl(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def acl(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
    @JSName("acl")
    var acl_Original: ShortHandRoute[V] = js.native
    
    def all(path: String, handler: Handler[V]): Unit = js.native
    def all(path: String, handler: Handler[V], store: js.Any): Unit = js.native
    def all(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def all(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
    @JSName("all")
    var all_Original: ShortHandRoute[V] = js.native
    
    def bind(path: String, handler: Handler[V]): Unit = js.native
    def bind(path: String, handler: Handler[V], store: js.Any): Unit = js.native
    def bind(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def bind(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
    @JSName("bind")
    var bind_Original: ShortHandRoute[V] = js.native
    
    def checkout(path: String, handler: Handler[V]): Unit = js.native
    def checkout(path: String, handler: Handler[V], store: js.Any): Unit = js.native
    def checkout(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def checkout(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
    @JSName("checkout")
    var checkout_Original: ShortHandRoute[V] = js.native
    
    def connect(path: String, handler: Handler[V]): Unit = js.native
    def connect(path: String, handler: Handler[V], store: js.Any): Unit = js.native
    def connect(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def connect(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
    @JSName("connect")
    var connect_Original: ShortHandRoute[V] = js.native
    
    def copy(path: String, handler: Handler[V]): Unit = js.native
    def copy(path: String, handler: Handler[V], store: js.Any): Unit = js.native
    def copy(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def copy(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
    @JSName("copy")
    var copy_Original: ShortHandRoute[V] = js.native
    
    def delete(path: String, handler: Handler[V]): Unit = js.native
    def delete(path: String, handler: Handler[V], store: js.Any): Unit = js.native
    def delete(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def delete(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
    @JSName("delete")
    var delete_Original: ShortHandRoute[V] = js.native
    
    def find(method: HTTPMethod, path: String): FindResult[V] | Null = js.native
    def find(method: HTTPMethod, path: String, version: String): FindResult[V] | Null = js.native
    
    def get(path: String, handler: Handler[V]): Unit = js.native
    def get(path: String, handler: Handler[V], store: js.Any): Unit = js.native
    def get(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def get(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
    @JSName("get")
    var get_Original: ShortHandRoute[V] = js.native
    
    def head(path: String, handler: Handler[V]): Unit = js.native
    def head(path: String, handler: Handler[V], store: js.Any): Unit = js.native
    def head(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def head(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
    @JSName("head")
    var head_Original: ShortHandRoute[V] = js.native
    
    def link(path: String, handler: Handler[V]): Unit = js.native
    def link(path: String, handler: Handler[V], store: js.Any): Unit = js.native
    def link(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def link(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
    @JSName("link")
    var link_Original: ShortHandRoute[V] = js.native
    
    def lock(path: String, handler: Handler[V]): Unit = js.native
    def lock(path: String, handler: Handler[V], store: js.Any): Unit = js.native
    def lock(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def lock(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
    @JSName("lock")
    var lock_Original: ShortHandRoute[V] = js.native
    
    def lookup[Context](req: Req[V], res: Res[V]): Unit = js.native
    def lookup[Context](req: Req[V], res: Res[V], ctx: Context): Unit = js.native
    
    def `m-search`(path: String, handler: Handler[V]): Unit = js.native
    def `m-search`(path: String, handler: Handler[V], store: js.Any): Unit = js.native
    def `m-search`(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def `m-search`(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
    @JSName("m-search")
    var `m-search_Original`: ShortHandRoute[V] = js.native
    
    def merge(path: String, handler: Handler[V]): Unit = js.native
    def merge(path: String, handler: Handler[V], store: js.Any): Unit = js.native
    def merge(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def merge(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
    @JSName("merge")
    var merge_Original: ShortHandRoute[V] = js.native
    
    def mkactivity(path: String, handler: Handler[V]): Unit = js.native
    def mkactivity(path: String, handler: Handler[V], store: js.Any): Unit = js.native
    def mkactivity(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def mkactivity(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
    @JSName("mkactivity")
    var mkactivity_Original: ShortHandRoute[V] = js.native
    
    def mkcalendar(path: String, handler: Handler[V]): Unit = js.native
    def mkcalendar(path: String, handler: Handler[V], store: js.Any): Unit = js.native
    def mkcalendar(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def mkcalendar(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
    @JSName("mkcalendar")
    var mkcalendar_Original: ShortHandRoute[V] = js.native
    
    def mkcol(path: String, handler: Handler[V]): Unit = js.native
    def mkcol(path: String, handler: Handler[V], store: js.Any): Unit = js.native
    def mkcol(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def mkcol(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
    @JSName("mkcol")
    var mkcol_Original: ShortHandRoute[V] = js.native
    
    def move(path: String, handler: Handler[V]): Unit = js.native
    def move(path: String, handler: Handler[V], store: js.Any): Unit = js.native
    def move(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def move(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
    @JSName("move")
    var move_Original: ShortHandRoute[V] = js.native
    
    def notify(path: String, handler: Handler[V]): Unit = js.native
    def notify(path: String, handler: Handler[V], store: js.Any): Unit = js.native
    def notify(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def notify(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
    @JSName("notify")
    var notify_Original: ShortHandRoute[V] = js.native
    
    def off(method: js.Array[HTTPMethod], path: String): Unit = js.native
    def off(method: HTTPMethod, path: String): Unit = js.native
    
    def on(method: js.Array[HTTPMethod], path: String, handler: Handler[V]): Unit = js.native
    def on(method: js.Array[HTTPMethod], path: String, handler: Handler[V], store: js.Any): Unit = js.native
    def on(method: js.Array[HTTPMethod], path: String, options: RouteOptions, handler: Handler[V]): Unit = js.native
    def on(
      method: js.Array[HTTPMethod],
      path: String,
      options: RouteOptions,
      handler: Handler[V],
      store: js.Any
    ): Unit = js.native
    def on(method: HTTPMethod, path: String, handler: Handler[V]): Unit = js.native
    def on(method: HTTPMethod, path: String, handler: Handler[V], store: js.Any): Unit = js.native
    def on(method: HTTPMethod, path: String, options: RouteOptions, handler: Handler[V]): Unit = js.native
    def on(method: HTTPMethod, path: String, options: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
    
    def options(path: String, handler: Handler[V]): Unit = js.native
    def options(path: String, handler: Handler[V], store: js.Any): Unit = js.native
    def options(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def options(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
    @JSName("options")
    var options_Original: ShortHandRoute[V] = js.native
    
    def patch(path: String, handler: Handler[V]): Unit = js.native
    def patch(path: String, handler: Handler[V], store: js.Any): Unit = js.native
    def patch(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def patch(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
    @JSName("patch")
    var patch_Original: ShortHandRoute[V] = js.native
    
    def post(path: String, handler: Handler[V]): Unit = js.native
    def post(path: String, handler: Handler[V], store: js.Any): Unit = js.native
    def post(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def post(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
    @JSName("post")
    var post_Original: ShortHandRoute[V] = js.native
    
    def prettyPrint(): String = js.native
    
    def propfind(path: String, handler: Handler[V]): Unit = js.native
    def propfind(path: String, handler: Handler[V], store: js.Any): Unit = js.native
    def propfind(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def propfind(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
    @JSName("propfind")
    var propfind_Original: ShortHandRoute[V] = js.native
    
    def proppatch(path: String, handler: Handler[V]): Unit = js.native
    def proppatch(path: String, handler: Handler[V], store: js.Any): Unit = js.native
    def proppatch(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def proppatch(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
    @JSName("proppatch")
    var proppatch_Original: ShortHandRoute[V] = js.native
    
    def purge(path: String, handler: Handler[V]): Unit = js.native
    def purge(path: String, handler: Handler[V], store: js.Any): Unit = js.native
    def purge(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def purge(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
    @JSName("purge")
    var purge_Original: ShortHandRoute[V] = js.native
    
    def put(path: String, handler: Handler[V]): Unit = js.native
    def put(path: String, handler: Handler[V], store: js.Any): Unit = js.native
    def put(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def put(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
    @JSName("put")
    var put_Original: ShortHandRoute[V] = js.native
    
    def rebind(path: String, handler: Handler[V]): Unit = js.native
    def rebind(path: String, handler: Handler[V], store: js.Any): Unit = js.native
    def rebind(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def rebind(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
    @JSName("rebind")
    var rebind_Original: ShortHandRoute[V] = js.native
    
    def report(path: String, handler: Handler[V]): Unit = js.native
    def report(path: String, handler: Handler[V], store: js.Any): Unit = js.native
    def report(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def report(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
    @JSName("report")
    var report_Original: ShortHandRoute[V] = js.native
    
    def reset(): Unit = js.native
    
    def search(path: String, handler: Handler[V]): Unit = js.native
    def search(path: String, handler: Handler[V], store: js.Any): Unit = js.native
    def search(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def search(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
    @JSName("search")
    var search_Original: ShortHandRoute[V] = js.native
    
    def source(path: String, handler: Handler[V]): Unit = js.native
    def source(path: String, handler: Handler[V], store: js.Any): Unit = js.native
    def source(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def source(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
    @JSName("source")
    var source_Original: ShortHandRoute[V] = js.native
    
    def subscribe(path: String, handler: Handler[V]): Unit = js.native
    def subscribe(path: String, handler: Handler[V], store: js.Any): Unit = js.native
    def subscribe(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def subscribe(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
    @JSName("subscribe")
    var subscribe_Original: ShortHandRoute[V] = js.native
    
    def trace(path: String, handler: Handler[V]): Unit = js.native
    def trace(path: String, handler: Handler[V], store: js.Any): Unit = js.native
    def trace(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def trace(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
    @JSName("trace")
    var trace_Original: ShortHandRoute[V] = js.native
    
    def unbind(path: String, handler: Handler[V]): Unit = js.native
    def unbind(path: String, handler: Handler[V], store: js.Any): Unit = js.native
    def unbind(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def unbind(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
    @JSName("unbind")
    var unbind_Original: ShortHandRoute[V] = js.native
    
    def unlink(path: String, handler: Handler[V]): Unit = js.native
    def unlink(path: String, handler: Handler[V], store: js.Any): Unit = js.native
    def unlink(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def unlink(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
    @JSName("unlink")
    var unlink_Original: ShortHandRoute[V] = js.native
    
    def unlock(path: String, handler: Handler[V]): Unit = js.native
    def unlock(path: String, handler: Handler[V], store: js.Any): Unit = js.native
    def unlock(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def unlock(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
    @JSName("unlock")
    var unlock_Original: ShortHandRoute[V] = js.native
    
    def unsubscribe(path: String, handler: Handler[V]): Unit = js.native
    def unsubscribe(path: String, handler: Handler[V], store: js.Any): Unit = js.native
    def unsubscribe(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def unsubscribe(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
    @JSName("unsubscribe")
    var unsubscribe_Original: ShortHandRoute[V] = js.native
  }
  
  type Req[V] = Http2ServerRequest | IncomingMessage
  
  type Res[V] = Http2ServerResponse | ServerResponse
  
  @js.native
  trait RouteOptions extends StObject {
    
    var version: String = js.native
  }
  object RouteOptions {
    
    @scala.inline
    def apply(version: String): RouteOptions = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteOptions]
    }
    
    @scala.inline
    implicit class RouteOptionsMutableBuilder[Self <: RouteOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ShortHandRoute[V /* <: HTTPVersion */] extends StObject {
    
    def apply(path: String, handler: Handler[V]): Unit = js.native
    def apply(path: String, handler: Handler[V], store: js.Any): Unit = js.native
    def apply(path: String, opts: RouteOptions, handler: Handler[V]): Unit = js.native
    def apply(path: String, opts: RouteOptions, handler: Handler[V], store: js.Any): Unit = js.native
  }
}
