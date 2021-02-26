package typingsSlinky.httpProxyMiddleware

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.connect.mod.NextHandleFunction
import typingsSlinky.httpProxy.mod.ServerOptions
import typingsSlinky.httpProxyMiddleware.httpProxyMiddlewareBooleans.`false`
import typingsSlinky.httpProxyMiddleware.httpProxyMiddlewareStrings.debug
import typingsSlinky.httpProxyMiddleware.httpProxyMiddlewareStrings.error
import typingsSlinky.httpProxyMiddleware.httpProxyMiddlewareStrings.info
import typingsSlinky.httpProxyMiddleware.httpProxyMiddlewareStrings.silent
import typingsSlinky.httpProxyMiddleware.httpProxyMiddlewareStrings.warn
import typingsSlinky.node.httpMod.Agent
import typingsSlinky.node.httpMod.ClientRequest
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.node.netMod.Socket
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.tlsMod.TlsOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("http-proxy-middleware", JSImport.Namespace)
  @js.native
  def apply(config: Config): Proxy = js.native
  @JSImport("http-proxy-middleware", JSImport.Namespace)
  @js.native
  def apply(contextOrUri: String): Proxy = js.native
  @JSImport("http-proxy-middleware", JSImport.Namespace)
  @js.native
  def apply(contextOrUri: String, config: Config): Proxy = js.native
  @JSImport("http-proxy-middleware", JSImport.Namespace)
  @js.native
  def apply(contextOrUri: js.Array[String]): Proxy = js.native
  @JSImport("http-proxy-middleware", JSImport.Namespace)
  @js.native
  def apply(contextOrUri: js.Array[String], config: Config): Proxy = js.native
  @JSImport("http-proxy-middleware", JSImport.Namespace)
  @js.native
  def apply(contextOrUri: Filter): Proxy = js.native
  @JSImport("http-proxy-middleware", JSImport.Namespace)
  @js.native
  def apply(contextOrUri: Filter, config: Config): Proxy = js.native
  
  @js.native
  trait Config extends StObject {
    
    var agent: js.UndefOr[Agent] = js.native
    
    var auth: js.UndefOr[String] = js.native
    
    var autoRewrite: js.UndefOr[Boolean] = js.native
    
    var buffer: js.UndefOr[Readable] = js.native
    
    var changeOrigin: js.UndefOr[Boolean] = js.native
    
    var cookieDomainRewrite: js.UndefOr[`false` | String | StringDictionary[String]] = js.native
    
    var cookiePathRewrite: js.UndefOr[`false` | String | StringDictionary[String]] = js.native
    
    var followRedirects: js.UndefOr[Boolean] = js.native
    
    var forward: js.UndefOr[String] = js.native
    
    var headers: js.UndefOr[StringDictionary[String]] = js.native
    
    var hostRewrite: js.UndefOr[String] = js.native
    
    var ignorePath: js.UndefOr[Boolean] = js.native
    
    var localAddress: js.UndefOr[String] = js.native
    
    var logLevel: js.UndefOr[debug | info | warn | error | silent] = js.native
    
    var logProvider: js.UndefOr[js.Function1[/* provider */ LogProvider, LogProvider]] = js.native
    
    var onClose: js.UndefOr[
        js.Function3[/* res */ IncomingMessage, /* socket */ Socket, /* head */ js.Any, Unit]
      ] = js.native
    
    var onError: js.UndefOr[
        js.Function3[/* err */ js.Error, /* req */ IncomingMessage, /* res */ ServerResponse, Unit]
      ] = js.native
    
    var onOpen: js.UndefOr[js.Function1[/* proxySocket */ Socket, Unit]] = js.native
    
    var onProxyReq: js.UndefOr[
        js.Function3[
          /* proxyReq */ ClientRequest, 
          /* req */ IncomingMessage, 
          /* res */ ServerResponse, 
          Unit
        ]
      ] = js.native
    
    var onProxyReqWs: js.UndefOr[
        js.Function5[
          /* proxyReq */ ClientRequest, 
          /* req */ IncomingMessage, 
          /* socket */ Socket, 
          /* options */ ServerOptions, 
          /* head */ js.Any, 
          Unit
        ]
      ] = js.native
    
    var onProxyRes: js.UndefOr[
        js.Function3[
          /* proxyRes */ IncomingMessage, 
          /* req */ IncomingMessage, 
          /* res */ ServerResponse, 
          Unit
        ]
      ] = js.native
    
    var pathRewrite: js.UndefOr[
        StringDictionary[String] | (js.Function2[/* path */ String, /* req */ IncomingMessage, String])
      ] = js.native
    
    var prependPath: js.UndefOr[Boolean] = js.native
    
    var preserveHeaderKeyCase: js.UndefOr[Boolean] = js.native
    
    var protocolRewrite: js.UndefOr[String] = js.native
    
    /**
      * @deprecated
      */
    var proxyHost: js.UndefOr[js.Any] = js.native
    
    /**
      * @deprecated
      */
    var proxyTable: js.UndefOr[js.Any] = js.native
    
    var proxyTimeout: js.UndefOr[Double] = js.native
    
    var router: js.UndefOr[StringDictionary[String] | (js.Function1[/* req */ IncomingMessage, String])] = js.native
    
    var secure: js.UndefOr[Boolean] = js.native
    
    var selfHandleResponse: js.UndefOr[Boolean] = js.native
    
    var ssl: js.UndefOr[TlsOptions] = js.native
    
    var target: js.UndefOr[String] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
    
    var toProxy: js.UndefOr[Boolean] = js.native
    
    var ws: js.UndefOr[Boolean] = js.native
    
    var xfwd: js.UndefOr[Boolean] = js.native
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setAutoRewrite(value: Boolean): Self = StObject.set(x, "autoRewrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoRewriteUndefined: Self = StObject.set(x, "autoRewrite", js.undefined)
      
      @scala.inline
      def setBuffer(value: Readable): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
      
      @scala.inline
      def setChangeOrigin(value: Boolean): Self = StObject.set(x, "changeOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangeOriginUndefined: Self = StObject.set(x, "changeOrigin", js.undefined)
      
      @scala.inline
      def setCookieDomainRewrite(value: `false` | String | StringDictionary[String]): Self = StObject.set(x, "cookieDomainRewrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieDomainRewriteUndefined: Self = StObject.set(x, "cookieDomainRewrite", js.undefined)
      
      @scala.inline
      def setCookiePathRewrite(value: `false` | String | StringDictionary[String]): Self = StObject.set(x, "cookiePathRewrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookiePathRewriteUndefined: Self = StObject.set(x, "cookiePathRewrite", js.undefined)
      
      @scala.inline
      def setFollowRedirects(value: Boolean): Self = StObject.set(x, "followRedirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFollowRedirectsUndefined: Self = StObject.set(x, "followRedirects", js.undefined)
      
      @scala.inline
      def setForward(value: String): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForwardUndefined: Self = StObject.set(x, "forward", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHostRewrite(value: String): Self = StObject.set(x, "hostRewrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostRewriteUndefined: Self = StObject.set(x, "hostRewrite", js.undefined)
      
      @scala.inline
      def setIgnorePath(value: Boolean): Self = StObject.set(x, "ignorePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnorePathUndefined: Self = StObject.set(x, "ignorePath", js.undefined)
      
      @scala.inline
      def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      @scala.inline
      def setLogLevel(value: debug | info | warn | error | silent): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      @scala.inline
      def setLogProvider(value: /* provider */ LogProvider => LogProvider): Self = StObject.set(x, "logProvider", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLogProviderUndefined: Self = StObject.set(x, "logProvider", js.undefined)
      
      @scala.inline
      def setOnClose(value: (/* res */ IncomingMessage, /* socket */ Socket, /* head */ js.Any) => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnError(value: (/* err */ js.Error, /* req */ IncomingMessage, /* res */ ServerResponse) => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnOpen(value: /* proxySocket */ Socket => Unit): Self = StObject.set(x, "onOpen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOpenUndefined: Self = StObject.set(x, "onOpen", js.undefined)
      
      @scala.inline
      def setOnProxyReq(value: (/* proxyReq */ ClientRequest, /* req */ IncomingMessage, /* res */ ServerResponse) => Unit): Self = StObject.set(x, "onProxyReq", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnProxyReqUndefined: Self = StObject.set(x, "onProxyReq", js.undefined)
      
      @scala.inline
      def setOnProxyReqWs(
        value: (/* proxyReq */ ClientRequest, /* req */ IncomingMessage, /* socket */ Socket, /* options */ ServerOptions, /* head */ js.Any) => Unit
      ): Self = StObject.set(x, "onProxyReqWs", js.Any.fromFunction5(value))
      
      @scala.inline
      def setOnProxyReqWsUndefined: Self = StObject.set(x, "onProxyReqWs", js.undefined)
      
      @scala.inline
      def setOnProxyRes(
        value: (/* proxyRes */ IncomingMessage, /* req */ IncomingMessage, /* res */ ServerResponse) => Unit
      ): Self = StObject.set(x, "onProxyRes", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnProxyResUndefined: Self = StObject.set(x, "onProxyRes", js.undefined)
      
      @scala.inline
      def setPathRewrite(
        value: StringDictionary[String] | (js.Function2[/* path */ String, /* req */ IncomingMessage, String])
      ): Self = StObject.set(x, "pathRewrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathRewriteFunction2(value: (/* path */ String, /* req */ IncomingMessage) => String): Self = StObject.set(x, "pathRewrite", js.Any.fromFunction2(value))
      
      @scala.inline
      def setPathRewriteUndefined: Self = StObject.set(x, "pathRewrite", js.undefined)
      
      @scala.inline
      def setPrependPath(value: Boolean): Self = StObject.set(x, "prependPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrependPathUndefined: Self = StObject.set(x, "prependPath", js.undefined)
      
      @scala.inline
      def setPreserveHeaderKeyCase(value: Boolean): Self = StObject.set(x, "preserveHeaderKeyCase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveHeaderKeyCaseUndefined: Self = StObject.set(x, "preserveHeaderKeyCase", js.undefined)
      
      @scala.inline
      def setProtocolRewrite(value: String): Self = StObject.set(x, "protocolRewrite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolRewriteUndefined: Self = StObject.set(x, "protocolRewrite", js.undefined)
      
      @scala.inline
      def setProxyHost(value: js.Any): Self = StObject.set(x, "proxyHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyHostUndefined: Self = StObject.set(x, "proxyHost", js.undefined)
      
      @scala.inline
      def setProxyTable(value: js.Any): Self = StObject.set(x, "proxyTable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyTableUndefined: Self = StObject.set(x, "proxyTable", js.undefined)
      
      @scala.inline
      def setProxyTimeout(value: Double): Self = StObject.set(x, "proxyTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyTimeoutUndefined: Self = StObject.set(x, "proxyTimeout", js.undefined)
      
      @scala.inline
      def setRouter(value: StringDictionary[String] | (js.Function1[/* req */ IncomingMessage, String])): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouterFunction1(value: /* req */ IncomingMessage => String): Self = StObject.set(x, "router", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRouterUndefined: Self = StObject.set(x, "router", js.undefined)
      
      @scala.inline
      def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      @scala.inline
      def setSelfHandleResponse(value: Boolean): Self = StObject.set(x, "selfHandleResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelfHandleResponseUndefined: Self = StObject.set(x, "selfHandleResponse", js.undefined)
      
      @scala.inline
      def setSsl(value: TlsOptions): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setToProxy(value: Boolean): Self = StObject.set(x, "toProxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToProxyUndefined: Self = StObject.set(x, "toProxy", js.undefined)
      
      @scala.inline
      def setWs(value: Boolean): Self = StObject.set(x, "ws", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWsUndefined: Self = StObject.set(x, "ws", js.undefined)
      
      @scala.inline
      def setXfwd(value: Boolean): Self = StObject.set(x, "xfwd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXfwdUndefined: Self = StObject.set(x, "xfwd", js.undefined)
    }
  }
  
  type Filter = js.Function2[/* pathname */ String, /* req */ IncomingMessage, Boolean]
  
  @js.native
  trait LogProvider extends StObject {
    
    var debug: js.UndefOr[Logger] = js.native
    
    var error: js.UndefOr[Logger] = js.native
    
    var info: js.UndefOr[Logger] = js.native
    
    def log(args: js.Any*): Unit = js.native
    @JSName("log")
    var log_Original: Logger = js.native
    
    var warn: js.UndefOr[Logger] = js.native
  }
  
  type Logger = js.Function1[/* repeated */ js.Any, Unit]
  
  type Proxy = NextHandleFunction
}
