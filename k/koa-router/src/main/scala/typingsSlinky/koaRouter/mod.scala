package typingsSlinky.koaRouter

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.accepts.mod.Accepts
import typingsSlinky.contentDisposition.mod.Options
import typingsSlinky.cookies.mod.Cookies
import typingsSlinky.koa.anon.FnCall
import typingsSlinky.koa.mod.Application
import typingsSlinky.koa.mod.DefaultContext
import typingsSlinky.koa.mod.DefaultState
import typingsSlinky.koa.mod.Middleware
import typingsSlinky.koa.mod.ParameterizedContext
import typingsSlinky.koa.mod.Request
import typingsSlinky.koa.mod.Response
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.node.netMod.Socket
import typingsSlinky.node.urlMod.URL_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("koa-router", JSImport.Namespace)
  @js.native
  /**
    * Create a new router.
    */
  class ^[StateT, CustomT] () extends Router[StateT, CustomT] {
    def this(opt: IRouterOptions) = this()
  }
  
  @JSImport("koa-router", "Layer")
  @js.native
  class Layer protected () extends StObject {
    def this(path: String, methods: js.Array[String], middleware: js.Array[IMiddleware[_, js.Object]]) = this()
    def this(path: String, methods: js.Array[String], middleware: IMiddleware[_, js.Object]) = this()
    def this(path: js.RegExp, methods: js.Array[String], middleware: js.Array[IMiddleware[_, js.Object]]) = this()
    def this(path: js.RegExp, methods: js.Array[String], middleware: IMiddleware[_, js.Object]) = this()
    def this(
      path: String,
      methods: js.Array[String],
      middleware: js.Array[IMiddleware[_, js.Object]],
      opts: ILayerOptions
    ) = this()
    def this(
      path: String,
      methods: js.Array[String],
      middleware: IMiddleware[_, js.Object],
      opts: ILayerOptions
    ) = this()
    def this(
      path: js.RegExp,
      methods: js.Array[String],
      middleware: js.Array[IMiddleware[_, js.Object]],
      opts: ILayerOptions
    ) = this()
    def this(
      path: js.RegExp,
      methods: js.Array[String],
      middleware: IMiddleware[_, js.Object],
      opts: ILayerOptions
    ) = this()
    
    /**
      * Returns array of regexp url path captures.
      */
    def captures(path: String): js.Array[String] = js.native
    
    /**
      * Returns whether request `path` matches route.
      */
    def `match`(path: String): Boolean = js.native
    
    var methods: js.Array[String] = js.native
    
    var name: String = js.native
    
    var opts: ILayerOptions = js.native
    
    /**
      * Run validations on route named parameters.
      */
    def param(param: String, fn: IMiddleware[_, js.Object]): Layer = js.native
    
    var paramNames: js.Array[ParamName] = js.native
    
    /**
      * Returns map of URL parameters for given `path` and `paramNames`.
      */
    def params(path: String, captures: js.Array[String]): js.Object = js.native
    def params(path: String, captures: js.Array[String], existingParams: js.Object): js.Object = js.native
    def params(path: js.RegExp, captures: js.Array[String]): js.Object = js.native
    def params(path: js.RegExp, captures: js.Array[String], existingParams: js.Object): js.Object = js.native
    
    var path: String = js.native
    
    var regexp: js.RegExp = js.native
    
    /**
      * Prefix route path.
      */
    def setPrefix(prefix: String): Layer = js.native
    
    var stack: js.Array[IMiddleware[_, js.Object]] = js.native
    
    /**
      * Generate URL for route using given `params`.
      */
    def url(params: js.Object): String = js.native
  }
  
  @JSImport("koa-router", "ParamName")
  @js.native
  class ParamName () extends StObject {
    
    var asterisk: Boolean = js.native
    
    var delimiter: String = js.native
    
    var name: String = js.native
    
    var optional: Boolean = js.native
    
    var partial: Boolean = js.native
    
    var pattern: String = js.native
    
    var prefix: String = js.native
    
    var repeat: String = js.native
  }
  
  /**
    * Generate URL from url pattern and given `params`.
    */
  /* static member */
  @JSImport("koa-router", "url")
  @js.native
  def url(path: String, params: js.Object): String = js.native
  @JSImport("koa-router", "url")
  @js.native
  def url(path: js.RegExp, params: js.Object): String = js.native
  
  @js.native
  trait ILayerOptions extends StObject {
    
    var end: js.UndefOr[Boolean] = js.native
    
    var ignoreCaptures: js.UndefOr[Boolean] = js.native
    
    var name: String = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var sensitive: js.UndefOr[Boolean] = js.native
    
    var strict: js.UndefOr[Boolean] = js.native
  }
  object ILayerOptions {
    
    @scala.inline
    def apply(name: String): ILayerOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILayerOptions]
    }
    
    @scala.inline
    implicit class ILayerOptionsMutableBuilder[Self <: ILayerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setIgnoreCaptures(value: Boolean): Self = StObject.set(x, "ignoreCaptures", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreCapturesUndefined: Self = StObject.set(x, "ignoreCaptures", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setSensitive(value: Boolean): Self = StObject.set(x, "sensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSensitiveUndefined: Self = StObject.set(x, "sensitive", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  type IMiddleware[StateT, CustomT] = Middleware[StateT, CustomT with (IRouterParamContext[StateT, CustomT])]
  
  type IParamMiddleware[STateT, CustomT] = js.Function3[
    /* param */ String, 
    /* ctx */ RouterContext[STateT, CustomT], 
    /* next */ js.Function0[js.Promise[js.Any]], 
    js.Any
  ]
  
  @js.native
  trait IRouterAllowedMethodsOptions extends StObject {
    
    /**
      * throw the returned value in place of the default MethodNotAllowed error
      */
    var methodNotAllowed: js.UndefOr[js.Function0[_]] = js.native
    
    /**
      * throw the returned value in place of the default NotImplemented error
      */
    var notImplemented: js.UndefOr[js.Function0[_]] = js.native
    
    /**
      * throw error instead of setting status and header
      */
    var `throw`: js.UndefOr[Boolean] = js.native
  }
  object IRouterAllowedMethodsOptions {
    
    @scala.inline
    def apply(): IRouterAllowedMethodsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRouterAllowedMethodsOptions]
    }
    
    @scala.inline
    implicit class IRouterAllowedMethodsOptionsMutableBuilder[Self <: IRouterAllowedMethodsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethodNotAllowed(value: () => _): Self = StObject.set(x, "methodNotAllowed", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMethodNotAllowedUndefined: Self = StObject.set(x, "methodNotAllowed", js.undefined)
      
      @scala.inline
      def setNotImplemented(value: () => _): Self = StObject.set(x, "notImplemented", js.Any.fromFunction0(value))
      
      @scala.inline
      def setNotImplementedUndefined: Self = StObject.set(x, "notImplemented", js.undefined)
      
      @scala.inline
      def setThrow(value: Boolean): Self = StObject.set(x, "throw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrowUndefined: Self = StObject.set(x, "throw", js.undefined)
    }
  }
  
  /* Inlined parent koa-router.koa-router.RouterContext<any, {}> */
  @js.native
  trait IRouterContext extends StObject {
    
    /**
      * Get WHATWG parsed URL object.
      */
    var URL: URL_ = js.native
    
    /**
      * Matched route
      */
    var _matchedRoute: js.UndefOr[String | js.RegExp] = js.native
    
    var _matchedRouteName: js.UndefOr[String] = js.native
    
    var accept: Accepts = js.native
    
    /**
      * Check if the given `type(s)` is acceptable, returning
      * the best match when true, otherwise `undefined`, in which
      * case you should respond with 406 "Not Acceptable".
      *
      * The `type` value may be a single mime type string
      * such as "application/json", the extension name
      * such as "json" or an array `["json", "html", "text/plain"]`. When a list
      * or array is given the _best_ match, if any is returned.
      *
      * Examples:
      *
      *     // Accept: text/html
      *     this.accepts('html');
      *     // => "html"
      *
      *     // Accept: text/ *, application/json
      *     this.accepts('html');
      *     // => "html"
      *     this.accepts('text/html');
      *     // => "text/html"
      *     this.accepts('json', 'text');
      *     // => "json"
      *     this.accepts('application/json');
      *     // => "application/json"
      *
      *     // Accept: text/ *, application/json
      *     this.accepts('image/png');
      *     this.accepts('png');
      *     // => undefined
      *
      *     // Accept: text/ *;q=.5, application/json
      *     this.accepts(['html', 'json']);
      *     this.accepts('html', 'json');
      *     // => "json"
      */
    def accepts(): js.Array[String] | Boolean = js.native
    def accepts(types: String*): String | Boolean = js.native
    def accepts(types: js.Array[String]): String | Boolean = js.native
    
    /**
      * Return accepted charsets or best fit based on `charsets`.
      *
      * Given `Accept-Charset: utf-8, iso-8859-1;q=0.2, utf-7;q=0.5`
      * an array sorted by quality is returned:
      *
      *     ['utf-8', 'utf-7', 'iso-8859-1']
      */
    def acceptsCharsets(): js.Array[String] | Boolean = js.native
    def acceptsCharsets(charsets: String*): String | Boolean = js.native
    def acceptsCharsets(charsets: js.Array[String]): String | Boolean = js.native
    
    /**
      * Return accepted encodings or best fit based on `encodings`.
      *
      * Given `Accept-Encoding: gzip, deflate`
      * an array sorted by quality is returned:
      *
      *     ['gzip', 'deflate']
      */
    def acceptsEncodings(): js.Array[String] | Boolean = js.native
    def acceptsEncodings(encodings: String*): String | Boolean = js.native
    def acceptsEncodings(encodings: js.Array[String]): String | Boolean = js.native
    
    /**
      * Return accepted languages or best fit based on `langs`.
      *
      * Given `Accept-Language: en;q=0.8, es, pt`
      * an array sorted by quality is returned:
      *
      *     ['es', 'pt', 'en']
      */
    def acceptsLanguages(): js.Array[String] | Boolean = js.native
    def acceptsLanguages(langs: String*): String | Boolean = js.native
    def acceptsLanguages(langs: js.Array[String]): String | Boolean = js.native
    
    var app: Application[DefaultState, DefaultContext] = js.native
    
    /**
      * Append additional header `field` with value `val`.
      *
      * Examples:
      *
      * ```
      * this.append('Link', ['<http://localhost/>', '<http://localhost:3000/>']);
      * this.append('Set-Cookie', 'foo=bar; Path=/; HttpOnly');
      * this.append('Warning', '199 Miscellaneous warning');
      * ```
      */
    def append(field: String, `val`: String): Unit = js.native
    def append(field: String, `val`: js.Array[String]): Unit = js.native
    
    /**
      * Similar to .throw(), adds assertion.
      *
      *    this.assert(this.user, 401, 'Please login!');
      *
      * See: https://github.com/jshttp/http-assert
      */
    def assert(value: js.Any): Unit = js.native
    /**
      * Similar to .throw(), adds assertion.
      *
      *    this.assert(this.user, 401, 'Please login!');
      *
      * See: https://github.com/jshttp/http-assert
      */
    def assert(value: js.Any, status: js.UndefOr[scala.Nothing], msg: js.UndefOr[scala.Nothing], opts: js.Object): Unit = js.native
    /**
      * Similar to .throw(), adds assertion.
      *
      *    this.assert(this.user, 401, 'Please login!');
      *
      * See: https://github.com/jshttp/http-assert
      */
    def assert(value: js.Any, status: js.UndefOr[scala.Nothing], msg: String): Unit = js.native
    /**
      * Similar to .throw(), adds assertion.
      *
      *    this.assert(this.user, 401, 'Please login!');
      *
      * See: https://github.com/jshttp/http-assert
      */
    def assert(value: js.Any, status: js.UndefOr[scala.Nothing], msg: String, opts: js.Object): Unit = js.native
    /**
      * Similar to .throw(), adds assertion.
      *
      *    this.assert(this.user, 401, 'Please login!');
      *
      * See: https://github.com/jshttp/http-assert
      */
    def assert(value: js.Any, status: js.UndefOr[scala.Nothing], opts: js.Object): Unit = js.native
    /**
      * Similar to .throw(), adds assertion.
      *
      *    this.assert(this.user, 401, 'Please login!');
      *
      * See: https://github.com/jshttp/http-assert
      */
    def assert(value: js.Any, status: Double): Unit = js.native
    /**
      * Similar to .throw(), adds assertion.
      *
      *    this.assert(this.user, 401, 'Please login!');
      *
      * See: https://github.com/jshttp/http-assert
      */
    def assert(value: js.Any, status: Double, msg: js.UndefOr[scala.Nothing], opts: js.Object): Unit = js.native
    /**
      * Similar to .throw(), adds assertion.
      *
      *    this.assert(this.user, 401, 'Please login!');
      *
      * See: https://github.com/jshttp/http-assert
      */
    def assert(value: js.Any, status: Double, msg: String): Unit = js.native
    /**
      * Similar to .throw(), adds assertion.
      *
      *    this.assert(this.user, 401, 'Please login!');
      *
      * See: https://github.com/jshttp/http-assert
      */
    def assert(value: js.Any, status: Double, msg: String, opts: js.Object): Unit = js.native
    /**
      * Similar to .throw(), adds assertion.
      *
      *    this.assert(this.user, 401, 'Please login!');
      *
      * See: https://github.com/jshttp/http-assert
      */
    def assert(value: js.Any, status: Double, opts: js.Object): Unit = js.native
    /**
      * Similar to .throw(), adds assertion.
      *
      *    this.assert(this.user, 401, 'Please login!');
      *
      * See: https://github.com/jshttp/http-assert
      */
    @JSName("assert")
    var assert_Original: FnCall = js.native
    
    /**
      * Set Content-Disposition to "attachment" to signal the client to prompt for download.
      * Optionally specify the filename of the download and some options.
      */
    def attachment(): Unit = js.native
    def attachment(filename: js.UndefOr[scala.Nothing], options: Options): Unit = js.native
    def attachment(filename: String): Unit = js.native
    def attachment(filename: String, options: Options): Unit = js.native
    
    /**
      * Get/Set response body.
      */
    var body: js.Any = js.native
    
    var cookies: Cookies = js.native
    
    /**
      * Get/Set the ETag of a response.
      * This will normalize the quotes if necessary.
      *
      *     this.response.etag = 'md5hashsum';
      *     this.response.etag = '"md5hashsum"';
      *     this.response.etag = 'W/"123456789"';
      *
      * @param {String} etag
      * @api public
      */
    var etag: String = js.native
    
    /**
      * Flush any set headers, and begin the body
      */
    def flushHeaders(): Unit = js.native
    
    /**
      * Check if the request is fresh, aka
      * Last-Modified and/or the ETag
      * still match.
      */
    var fresh: Boolean = js.native
    
    /**
      * Return request header. If the header is not set, will return an empty
      * string.
      *
      * The `Referrer` header field is special-cased, both `Referrer` and
      * `Referer` are interchangeable.
      *
      * Examples:
      *
      *     this.get('Content-Type');
      *     // => "text/plain"
      *
      *     this.get('content-type');
      *     // => "text/plain"
      *
      *     this.get('Something');
      *     // => ''
      */
    def get(field: String): String = js.native
    
    /**
      * Return request header.
      */
    var header: js.Any = js.native
    
    /**
      * Check if a header has been written to the socket.
      */
    var headerSent: Boolean = js.native
    
    /**
      * Return request header, alias as request.header
      */
    var headers: js.Any = js.native
    
    /**
      * Parse the "Host" header field host
      * and support X-Forwarded-Host when a
      * proxy is enabled.
      */
    var host: String = js.native
    
    /**
      * Parse the "Host" header field hostname
      * and support X-Forwarded-Host when a
      * proxy is enabled.
      */
    var hostname: String = js.native
    
    /**
      * Get full request URL.
      */
    var href: String = js.native
    
    /**
      * Check if the request is idempotent.
      */
    var idempotent: Boolean = js.native
    
    /**
      * util.inspect() implementation, which
      * just returns the JSON output.
      */
    def inspect(): js.Any = js.native
    
    /**
      * Request remote address. Supports X-Forwarded-For when app.proxy is true.
      */
    var ip: String = js.native
    
    /**
      * When `app.proxy` is `true`, parse
      * the "X-Forwarded-For" ip address list.
      *
      * For example if the value were "client, proxy1, proxy2"
      * you would receive the array `["client", "proxy1", "proxy2"]`
      * where "proxy2" is the furthest down-stream.
      */
    var ips: js.Array[String] = js.native
    
    /**
      * Check if the incoming request contains the "Content-Type"
      * header field, and it contains any of the give mime `type`s.
      * If there is no request body, `null` is returned.
      * If there is no content type, `false` is returned.
      * Otherwise, it returns the first `type` that matches.
      *
      * Examples:
      *
      *     // With Content-Type: text/html; charset=utf-8
      *     this.is('html'); // => 'html'
      *     this.is('text/html'); // => 'text/html'
      *     this.is('text/ *', 'application/json'); // => 'text/html'
      *
      *     // When Content-Type is application/json
      *     this.is('json', 'urlencoded'); // => 'json'
      *     this.is('application/json'); // => 'application/json'
      *     this.is('html', 'application/ *'); // => 'application/json'
      *
      *     this.is('html'); // => false
      */
    // is(): string | boolean;
    def is(types: String*): String | Boolean = js.native
    def is(types: js.Array[String]): String | Boolean = js.native
    
    /**
      * Get the Last-Modified date in Date form, if it exists.
      * Set the Last-Modified date using a string or a Date.
      *
      *     this.response.lastModified = new Date();
      *     this.response.lastModified = '2013-09-13';
      */
    var lastModified: js.Date = js.native
    
    /**
      * Return parsed response Content-Length when present.
      * Set Content-Length field to `n`.
      */
    var length: Double = js.native
    
    /**
      * Get response status message
      */
    var message: String = js.native
    
    /**
      * Get/Set request method.
      */
    var method: String = js.native
    
    /**
      * Default error handling.
      */
    def onerror(err: js.Error): Unit = js.native
    
    /**
      * Get origin of URL.
      */
    var origin: String = js.native
    
    var originalUrl: String = js.native
    
    /**
      * url params
      */
    var params: js.Any = js.native
    
    /**
      * Get request pathname.
      * Set pathname, retaining the query-string when present.
      */
    var path: String = js.native
    
    /**
      * Return the protocol string "http" or "https"
      * when requested with TLS. When the proxy setting
      * is enabled the "X-Forwarded-Proto" header
      * field will be trusted. If you're running behind
      * a reverse proxy that supplies https for you this
      * may be enabled.
      */
    var protocol: String = js.native
    
    /**
      * Get parsed query-string.
      * Set query-string as an object.
      */
    var query: js.Any = js.native
    
    /**
      * Get/Set query string.
      */
    var querystring: String = js.native
    
    /**
      * Perform a 302 redirect to `url`.
      *
      * The string "back" is special-cased
      * to provide Referrer support, when Referrer
      * is not present `alt` or "/" is used.
      *
      * Examples:
      *
      *    this.redirect('back');
      *    this.redirect('back', '/index.html');
      *    this.redirect('/login');
      *    this.redirect('http://google.com');
      */
    def redirect(url: String): Unit = js.native
    def redirect(url: String, alt: String): Unit = js.native
    
    /**
      * Remove header `field`.
      */
    def remove(field: String): Unit = js.native
    
    var req: IncomingMessage = js.native
    
    var request: Request = js.native
    
    var res: ServerResponse = js.native
    
    /**
      * To bypass Koa's built-in response handling, you may explicitly set `ctx.respond = false;`
      */
    var respond: js.UndefOr[Boolean] = js.native
    
    var response: Response = js.native
    
    /**
      * the router instance
      */
    var router: Router[_, js.Object] = js.native
    
    /**
      * Get the search string. Same as the querystring
      * except it includes the leading ?.
      *
      * Set the search string. Same as
      * response.querystring= but included for ubiquity.
      */
    var search: String = js.native
    
    /**
      * Short-hand for:
      *
      *    this.protocol == 'https'
      */
    var secure: Boolean = js.native
    
    def set(field: String, `val`: String): Unit = js.native
    def set(field: String, `val`: js.Array[String]): Unit = js.native
    /**
      * Set header `field` to `val`, or pass
      * an object of header fields.
      *
      * Examples:
      *
      *    this.set('Foo', ['bar', 'baz']);
      *    this.set('Accept', 'application/json');
      *    this.set({ Accept: 'text/plain', 'X-API-Key': 'tobi' });
      */
    def set(field: StringDictionary[String | js.Array[String]]): Unit = js.native
    
    /**
      * Return the request socket.
      */
    var socket: Socket = js.native
    
    /**
      * Check if the request is stale, aka
      * "Last-Modified" and / or the "ETag" for the
      * resource has changed.
      */
    var stale: Boolean = js.native
    
    var state: js.Any = js.native
    
    /**
      * Get/Set response status code.
      */
    var status: Double = js.native
    
    /**
      * Return subdomains as an array.
      *
      * Subdomains are the dot-separated parts of the host before the main domain
      * of the app. By default, the domain of the app is assumed to be the last two
      * parts of the host. This can be changed by setting `app.subdomainOffset`.
      *
      * For example, if the domain is "tobi.ferrets.example.com":
      * If `app.subdomainOffset` is not set, this.subdomains is
      * `["ferrets", "tobi"]`.
      * If `app.subdomainOffset` is 3, this.subdomains is `["tobi"]`.
      */
    var subdomains: js.Array[String] = js.native
    
    /**
      * Throw an error with `msg` and optional `status`
      * defaulting to 500. Note that these are user-level
      * errors, and the message may be exposed to the client.
      *
      *    this.throw(403)
      *    this.throw('name required', 400)
      *    this.throw(400, 'name required')
      *    this.throw('something exploded')
      *    this.throw(new Error('invalid'), 400);
      *    this.throw(400, new Error('invalid'));
      *
      * See: https://github.com/jshttp/http-errors
      */
    def `throw`(message: String): scala.Nothing = js.native
    def `throw`(message: String, code: js.UndefOr[scala.Nothing], properties: js.Object): scala.Nothing = js.native
    def `throw`(message: String, code: Double): scala.Nothing = js.native
    def `throw`(message: String, code: Double, properties: js.Object): scala.Nothing = js.native
    def `throw`(properties: (Double | String | js.Object)*): scala.Nothing = js.native
    def `throw`(status: Double): scala.Nothing = js.native
    
    /**
      * Return JSON representation.
      *
      * Here we explicitly invoke .toJSON() on each
      * object, as iteration will otherwise fail due
      * to the getters and cause utilities such as
      * clone() to fail.
      */
    def toJSON(): js.Any = js.native
    
    /**
      * Return the response mime type void of
      * parameters such as "charset".
      *
      * Set Content-Type response header with `type` through `mime.lookup()`
      * when it does not contain a charset.
      *
      * Examples:
      *
      *     this.type = '.html';
      *     this.type = 'html';
      *     this.type = 'json';
      *     this.type = 'application/json';
      *     this.type = 'png';
      */
    var `type`: String = js.native
    
    /**
      * Get/Set request URL.
      */
    var url: String = js.native
    
    /**
      * Vary on `field`.
      */
    def vary(field: String): Unit = js.native
    
    /**
      * Checks if the request is writable.
      * Tests for the existence of the socket
      * as node sometimes does not set it.
      */
    var writable: Boolean = js.native
  }
  
  @js.native
  trait IRouterOptions extends StObject {
    
    /**
      * Methods which should be supported by the router.
      */
    var methods: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Prefix for all routes.
      */
    var prefix: js.UndefOr[String] = js.native
    
    var routerPath: js.UndefOr[String] = js.native
    
    /**
      * Whether or not routing should be case-sensitive.
      */
    var sensitive: js.UndefOr[Boolean] = js.native
    
    /**
      * Whether or not routes should matched strictly.
      *
      * If strict matching is enabled, the trailing slash is taken into
      * account when matching routes.
      */
    var strict: js.UndefOr[Boolean] = js.native
  }
  object IRouterOptions {
    
    @scala.inline
    def apply(): IRouterOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRouterOptions]
    }
    
    @scala.inline
    implicit class IRouterOptionsMutableBuilder[Self <: IRouterOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMethods(value: js.Array[String]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      @scala.inline
      def setMethodsVarargs(value: String*): Self = StObject.set(x, "methods", js.Array(value :_*))
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setRouterPath(value: String): Self = StObject.set(x, "routerPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouterPathUndefined: Self = StObject.set(x, "routerPath", js.undefined)
      
      @scala.inline
      def setSensitive(value: Boolean): Self = StObject.set(x, "sensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSensitiveUndefined: Self = StObject.set(x, "sensitive", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  @js.native
  trait IRouterParamContext[StateT, CustomT] extends StObject {
    
    /**
      * Matched route
      */
    var _matchedRoute: js.UndefOr[String | js.RegExp] = js.native
    
    var _matchedRouteName: js.UndefOr[String] = js.native
    
    /**
      * url params
      */
    var params: js.Any = js.native
    
    /**
      * the router instance
      */
    var router: Router[StateT, CustomT] = js.native
  }
  object IRouterParamContext {
    
    @scala.inline
    def apply[StateT, CustomT](params: js.Any, router: Router[StateT, CustomT]): IRouterParamContext[StateT, CustomT] = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRouterParamContext[StateT, CustomT]]
    }
    
    @scala.inline
    implicit class IRouterParamContextMutableBuilder[Self <: IRouterParamContext[_, _], StateT, CustomT] (val x: Self with (IRouterParamContext[StateT, CustomT])) extends AnyVal {
      
      @scala.inline
      def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRouter(value: Router[StateT, CustomT]): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_matchedRoute(value: String | js.RegExp): Self = StObject.set(x, "_matchedRoute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_matchedRouteName(value: String): Self = StObject.set(x, "_matchedRouteName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_matchedRouteNameUndefined: Self = StObject.set(x, "_matchedRouteName", js.undefined)
      
      @scala.inline
      def set_matchedRouteRegExp(value: js.RegExp): Self = StObject.set(x, "_matchedRoute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_matchedRouteUndefined: Self = StObject.set(x, "_matchedRoute", js.undefined)
    }
  }
  
  @js.native
  trait IRoutesMatch extends StObject {
    
    var path: js.Array[Layer] = js.native
    
    var pathAndMethod: js.Array[Layer] = js.native
    
    var route: Boolean = js.native
  }
  object IRoutesMatch {
    
    @scala.inline
    def apply(path: js.Array[Layer], pathAndMethod: js.Array[Layer], route: Boolean): IRoutesMatch = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], pathAndMethod = pathAndMethod.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRoutesMatch]
    }
    
    @scala.inline
    implicit class IRoutesMatchMutableBuilder[Self <: IRoutesMatch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPath(value: js.Array[Layer]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathAndMethod(value: js.Array[Layer]): Self = StObject.set(x, "pathAndMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathAndMethodVarargs(value: Layer*): Self = StObject.set(x, "pathAndMethod", js.Array(value :_*))
      
      @scala.inline
      def setPathVarargs(value: Layer*): Self = StObject.set(x, "path", js.Array(value :_*))
      
      @scala.inline
      def setRoute(value: Boolean): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IUrlOptionsQuery extends StObject {
    
    var query: js.Object | String = js.native
  }
  object IUrlOptionsQuery {
    
    @scala.inline
    def apply(query: js.Object | String): IUrlOptionsQuery = {
      val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[IUrlOptionsQuery]
    }
    
    @scala.inline
    implicit class IUrlOptionsQueryMutableBuilder[Self <: IUrlOptionsQuery] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuery(value: js.Object | String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Router[StateT, CustomT] extends StObject {
    
    /**
      * Register route with all methods.
      */
    def all(name: String, path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def all(name: String, path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def all(path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def all(path: js.Array[String | js.RegExp], middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def all(path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def all[T, U](
      name: String,
      path: String,
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    def all[T, U](
      name: String,
      path: js.RegExp,
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    def all[T, U](
      path: String,
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    def all[T, U](
      path: js.Array[String | js.RegExp],
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    def all[T, U](
      path: js.RegExp,
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    
    /**
      * Returns separate middleware for responding to `OPTIONS` requests with
      * an `Allow` header containing the allowed methods, as well as responding
      * with `405 Method Not Allowed` and `501 Not Implemented` as appropriate.
      */
    def allowedMethods(): IMiddleware[StateT, CustomT] = js.native
    def allowedMethods(options: IRouterAllowedMethodsOptions): IMiddleware[StateT, CustomT] = js.native
    
    /**
      * Alias for `router.delete()` because delete is a reserved word
      */
    def del(name: String, path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def del(name: String, path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def del(path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def del(path: js.Array[String | js.RegExp], middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def del(path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def del[T, U](
      name: String,
      path: String,
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    def del[T, U](
      name: String,
      path: js.RegExp,
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    def del[T, U](
      path: String,
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    def del[T, U](
      path: js.Array[String | js.RegExp],
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    def del[T, U](
      path: js.RegExp,
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    
    /**
      * HTTP delete method
      */
    def delete(name: String, path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def delete(name: String, path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def delete(path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def delete(path: js.Array[String | js.RegExp], middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def delete(path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def delete[T, U](
      name: String,
      path: String,
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    def delete[T, U](
      name: String,
      path: js.RegExp,
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    def delete[T, U](
      path: String,
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    def delete[T, U](
      path: js.Array[String | js.RegExp],
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    def delete[T, U](
      path: js.RegExp,
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    
    /**
      * HTTP get method
      */
    def get(name: String, path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def get(name: String, path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def get(path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def get(path: js.Array[String | js.RegExp], middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def get(path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def get[T, U](
      name: String,
      path: String,
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    def get[T, U](
      name: String,
      path: js.RegExp,
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    def get[T, U](
      path: String,
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    def get[T, U](
      path: js.Array[String | js.RegExp],
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    def get[T, U](
      path: js.RegExp,
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    
    /**
      * HTTP head method
      */
    def head(name: String, path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def head(name: String, path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def head(path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def head(path: js.Array[String | js.RegExp], middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def head(path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def head[T, U](
      name: String,
      path: String,
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    def head[T, U](
      name: String,
      path: js.RegExp,
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    def head[T, U](
      path: String,
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    def head[T, U](
      path: js.Array[String | js.RegExp],
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    def head[T, U](
      path: js.RegExp,
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    
    /**
      * HTTP link method
      */
    def link(name: String, path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def link(name: String, path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def link(path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def link(path: js.Array[String | js.RegExp], middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def link(path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def link[T, U](
      name: String,
      path: String,
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    def link[T, U](
      name: String,
      path: js.RegExp,
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    def link[T, U](
      path: String,
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    def link[T, U](
      path: js.Array[String | js.RegExp],
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    def link[T, U](
      path: js.RegExp,
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    
    /**
      * Match given `path` and return corresponding routes.
      */
    def `match`(path: String, method: String): IRoutesMatch = js.native
    
    /**
      * Returns router middleware which dispatches a route matching the request.
      */
    def middleware(): IMiddleware[StateT, CustomT] = js.native
    
    /**
      * HTTP options method
      */
    def options(name: String, path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def options(name: String, path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def options(path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def options(path: js.Array[String | js.RegExp], middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def options(path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def options[T, U](
      name: String,
      path: String,
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    def options[T, U](
      name: String,
      path: js.RegExp,
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    def options[T, U](
      path: String,
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    def options[T, U](
      path: js.Array[String | js.RegExp],
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    def options[T, U](
      path: js.RegExp,
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    
    /**
      * Run middleware for named route parameters. Useful for auto-loading or validation.
      */
    def param(param: String, middleware: IParamMiddleware[StateT, CustomT]): Router[StateT, CustomT] = js.native
    
    var params: js.Object = js.native
    
    /**
      * HTTP patch method
      */
    def patch(name: String, path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def patch(name: String, path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def patch(path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def patch(path: js.Array[String | js.RegExp], middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def patch(path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def patch[T, U](
      name: String,
      path: String,
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    def patch[T, U](
      name: String,
      path: js.RegExp,
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    def patch[T, U](
      path: String,
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    def patch[T, U](
      path: js.Array[String | js.RegExp],
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    def patch[T, U](
      path: js.RegExp,
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    
    /**
      * HTTP post method
      */
    def post(name: String, path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def post(name: String, path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def post(path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def post(path: js.Array[String | js.RegExp], middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def post(path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def post[T, U](
      name: String,
      path: String,
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    def post[T, U](
      name: String,
      path: js.RegExp,
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    def post[T, U](
      path: String,
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    def post[T, U](
      path: js.Array[String | js.RegExp],
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    def post[T, U](
      path: js.RegExp,
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    
    /**
      * Set the path prefix for a Router instance that was already initialized.
      */
    def prefix(prefix: String): Router[StateT, CustomT] = js.native
    
    /**
      * HTTP put method
      */
    def put(name: String, path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def put(name: String, path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def put(path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def put(path: js.Array[String | js.RegExp], middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def put(path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def put[T, U](
      name: String,
      path: String,
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    def put[T, U](
      name: String,
      path: js.RegExp,
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    def put[T, U](
      path: String,
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    def put[T, U](
      path: js.Array[String | js.RegExp],
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    def put[T, U](
      path: js.RegExp,
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    
    /**
      * Redirect `source` to `destination` URL with optional 30x status `code`.
      *
      * Both `source` and `destination` can be route names.
      */
    def redirect(source: String, destination: String): Router[StateT, CustomT] = js.native
    def redirect(source: String, destination: String, code: Double): Router[StateT, CustomT] = js.native
    
    def register(path: String, methods: js.Array[String], middleware: js.Array[IMiddleware[StateT, CustomT]]): Layer = js.native
    def register(
      path: String,
      methods: js.Array[String],
      middleware: js.Array[IMiddleware[StateT, CustomT]],
      opts: ILayerOptions
    ): Layer = js.native
    /**
      * Create and register a route.
      */
    def register(path: String, methods: js.Array[String], middleware: IMiddleware[StateT, CustomT]): Layer = js.native
    def register(
      path: String,
      methods: js.Array[String],
      middleware: IMiddleware[StateT, CustomT],
      opts: ILayerOptions
    ): Layer = js.native
    def register(path: js.RegExp, methods: js.Array[String], middleware: js.Array[IMiddleware[StateT, CustomT]]): Layer = js.native
    def register(
      path: js.RegExp,
      methods: js.Array[String],
      middleware: js.Array[IMiddleware[StateT, CustomT]],
      opts: ILayerOptions
    ): Layer = js.native
    def register(path: js.RegExp, methods: js.Array[String], middleware: IMiddleware[StateT, CustomT]): Layer = js.native
    def register(
      path: js.RegExp,
      methods: js.Array[String],
      middleware: IMiddleware[StateT, CustomT],
      opts: ILayerOptions
    ): Layer = js.native
    
    def route(name: String): Boolean = js.native
    /**
      * Lookup route with given `name`.
      */
    @JSName("route")
    def route_Layer(name: String): Layer = js.native
    
    /**
      * Returns router middleware which dispatches a route matching the request.
      */
    def routes(): IMiddleware[StateT, CustomT] = js.native
    
    var stack: js.Array[Layer] = js.native
    
    /**
      * HTTP unlink method
      */
    def unlink(name: String, path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def unlink(name: String, path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def unlink(path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def unlink(path: js.Array[String | js.RegExp], middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def unlink(path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def unlink[T, U](
      name: String,
      path: String,
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    def unlink[T, U](
      name: String,
      path: js.RegExp,
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    def unlink[T, U](
      path: String,
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    def unlink[T, U](
      path: js.Array[String | js.RegExp],
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    def unlink[T, U](
      path: js.RegExp,
      middleware: Middleware[T, U],
      routeHandler: IMiddleware[StateT with T, CustomT with U]
    ): Router[StateT with T, CustomT with U] = js.native
    
    /**
      * Generate URL for route. Takes either map of named `params` or series of
      * arguments (for regular expression routes)
      *
      * router = new Router();
      * router.get('user', "/users/:id", ...
      *
      * router.url('user', { id: 3 });
      * // => "/users/3"
      *
      * Query can be generated from third argument:
      *
      * router.url('user', { id: 3 }, { query: { limit: 1 } });
      * // => "/users/3?limit=1"
      *
      * router.url('user', { id: 3 }, { query: "limit=1" });
      * // => "/users/3?limit=1"
      *
      */
    def url(name: String, params: js.Any): String = js.native
    def url(name: String, params: js.Any, options: IUrlOptionsQuery): String = js.native
    @JSName("url")
    def url_Error(name: String, params: js.Any): js.Error = js.native
    @JSName("url")
    def url_Error(name: String, params: js.Any, options: IUrlOptionsQuery): js.Error = js.native
    
    /**
      * Use given middleware.
      *
      * Middleware run in the order they are defined by `.use()`. They are invoked
      * sequentially, requests start at the first middleware and work their way
      * "down" the middleware stack.
      */
    def use(middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def use(path: String, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def use(path: js.Array[String], middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
    def use(path: js.RegExp, middleware: (IMiddleware[StateT, CustomT])*): Router[StateT, CustomT] = js.native
  }
  
  type RouterContext[StateT, CustomT] = ParameterizedContext[StateT, CustomT with (IRouterParamContext[StateT, CustomT])]
}
