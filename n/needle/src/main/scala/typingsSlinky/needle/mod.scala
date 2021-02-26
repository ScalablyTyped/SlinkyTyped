package typingsSlinky.needle

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.needle.mod.core.NeedleReadonlyHttpVerbs
import typingsSlinky.needle.needleStrings.auto
import typingsSlinky.needle.needleStrings.basic
import typingsSlinky.needle.needleStrings.digest
import typingsSlinky.needle.needleStrings.json
import typingsSlinky.needle.needleStrings.xml
import typingsSlinky.node.Buffer
import typingsSlinky.node.httpMod.Agent
import typingsSlinky.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Calling needle() directly returns a Promise.
    *
    * Since needle 2.0
    * @param method Designates an HTTP verb for the request.
    * @param data May be null when issuing an HTTP DELETE request, but you need to explicity pass it.
    */
  @JSImport("needle", JSImport.Namespace)
  @js.native
  def apply(
    method: typingsSlinky.needle.mod.core.NeedleHttpVerbs,
    url: String,
    data: typingsSlinky.needle.mod.core.BodyData
  ): js.Promise[typingsSlinky.needle.mod.core.NeedleResponse] = js.native
  @JSImport("needle", JSImport.Namespace)
  @js.native
  def apply(
    method: typingsSlinky.needle.mod.core.NeedleHttpVerbs,
    url: String,
    data: typingsSlinky.needle.mod.core.BodyData,
    options: typingsSlinky.needle.mod.core.NeedleOptions
  ): js.Promise[typingsSlinky.needle.mod.core.NeedleResponse] = js.native
  /**
    * Calling needle() directly returns a Promise.
    *
    * Since needle 2.0
    * @param method Designates an HTTP verb for the request.
    */
  @JSImport("needle", JSImport.Namespace)
  @js.native
  def apply(method: NeedleReadonlyHttpVerbs, url: String): js.Promise[typingsSlinky.needle.mod.core.NeedleResponse] = js.native
  @JSImport("needle", JSImport.Namespace)
  @js.native
  def apply(method: NeedleReadonlyHttpVerbs, url: String, options: typingsSlinky.needle.mod.core.NeedleOptions): js.Promise[typingsSlinky.needle.mod.core.NeedleResponse] = js.native
  
  @JSImport("needle", "defaults")
  @js.native
  def defaults(options: NeedleOptions): NeedleOptions = js.native
  
  /**
    * Issues an HTTP DELETE request.
    */
  @JSImport("needle", "delete")
  @js.native
  def delete(url: String, data: BodyData): ReadableStream = js.native
  @JSImport("needle", "delete")
  @js.native
  def delete(url: String, data: BodyData, callback: NeedleCallback): ReadableStream = js.native
  @JSImport("needle", "delete")
  @js.native
  def delete(url: String, data: BodyData, options: js.UndefOr[scala.Nothing], callback: NeedleCallback): ReadableStream = js.native
  @JSImport("needle", "delete")
  @js.native
  def delete(url: String, data: BodyData, options: NeedleOptions): ReadableStream = js.native
  @JSImport("needle", "delete")
  @js.native
  def delete(url: String, data: BodyData, options: NeedleOptions, callback: NeedleCallback): ReadableStream = js.native
  
  /**
    * Issues an HTTP DELETE request.
    */
  @JSImport("needle", "deleteFunc")
  @js.native
  def deleteFunc(url: String, data: BodyData): ReadableStream = js.native
  @JSImport("needle", "deleteFunc")
  @js.native
  def deleteFunc(url: String, data: BodyData, callback: NeedleCallback): ReadableStream = js.native
  @JSImport("needle", "deleteFunc")
  @js.native
  def deleteFunc(url: String, data: BodyData, options: js.UndefOr[scala.Nothing], callback: NeedleCallback): ReadableStream = js.native
  @JSImport("needle", "deleteFunc")
  @js.native
  def deleteFunc(url: String, data: BodyData, options: NeedleOptions): ReadableStream = js.native
  @JSImport("needle", "deleteFunc")
  @js.native
  def deleteFunc(url: String, data: BodyData, options: NeedleOptions, callback: NeedleCallback): ReadableStream = js.native
  
  @JSImport("needle", "get")
  @js.native
  def get(url: String): ReadableStream = js.native
  @JSImport("needle", "get")
  @js.native
  def get(url: String, callback: NeedleCallback): ReadableStream = js.native
  @JSImport("needle", "get")
  @js.native
  def get(url: String, options: js.UndefOr[scala.Nothing], callback: NeedleCallback): ReadableStream = js.native
  @JSImport("needle", "get")
  @js.native
  def get(url: String, options: NeedleOptions): ReadableStream = js.native
  @JSImport("needle", "get")
  @js.native
  def get(url: String, options: NeedleOptions, callback: NeedleCallback): ReadableStream = js.native
  
  @JSImport("needle", "head")
  @js.native
  def head(url: String): ReadableStream = js.native
  @JSImport("needle", "head")
  @js.native
  def head(url: String, callback: NeedleCallback): ReadableStream = js.native
  @JSImport("needle", "head")
  @js.native
  def head(url: String, options: js.UndefOr[scala.Nothing], callback: NeedleCallback): ReadableStream = js.native
  @JSImport("needle", "head")
  @js.native
  def head(url: String, options: NeedleOptions): ReadableStream = js.native
  @JSImport("needle", "head")
  @js.native
  def head(url: String, options: NeedleOptions, callback: NeedleCallback): ReadableStream = js.native
  
  @JSImport("needle", "patch")
  @js.native
  def patch(url: String, data: BodyData): ReadableStream = js.native
  @JSImport("needle", "patch")
  @js.native
  def patch(url: String, data: BodyData, callback: NeedleCallback): ReadableStream = js.native
  @JSImport("needle", "patch")
  @js.native
  def patch(url: String, data: BodyData, options: js.UndefOr[scala.Nothing], callback: NeedleCallback): ReadableStream = js.native
  @JSImport("needle", "patch")
  @js.native
  def patch(url: String, data: BodyData, options: NeedleOptions): ReadableStream = js.native
  @JSImport("needle", "patch")
  @js.native
  def patch(url: String, data: BodyData, options: NeedleOptions, callback: NeedleCallback): ReadableStream = js.native
  
  @JSImport("needle", "post")
  @js.native
  def post(url: String, data: BodyData): ReadableStream = js.native
  @JSImport("needle", "post")
  @js.native
  def post(url: String, data: BodyData, callback: NeedleCallback): ReadableStream = js.native
  @JSImport("needle", "post")
  @js.native
  def post(url: String, data: BodyData, options: js.UndefOr[scala.Nothing], callback: NeedleCallback): ReadableStream = js.native
  @JSImport("needle", "post")
  @js.native
  def post(url: String, data: BodyData, options: NeedleOptions): ReadableStream = js.native
  @JSImport("needle", "post")
  @js.native
  def post(url: String, data: BodyData, options: NeedleOptions, callback: NeedleCallback): ReadableStream = js.native
  
  @JSImport("needle", "put")
  @js.native
  def put(url: String, data: BodyData): ReadableStream = js.native
  @JSImport("needle", "put")
  @js.native
  def put(url: String, data: BodyData, callback: NeedleCallback): ReadableStream = js.native
  @JSImport("needle", "put")
  @js.native
  def put(url: String, data: BodyData, options: js.UndefOr[scala.Nothing], callback: NeedleCallback): ReadableStream = js.native
  @JSImport("needle", "put")
  @js.native
  def put(url: String, data: BodyData, options: NeedleOptions): ReadableStream = js.native
  @JSImport("needle", "put")
  @js.native
  def put(url: String, data: BodyData, options: NeedleOptions, callback: NeedleCallback): ReadableStream = js.native
  
  @JSImport("needle", "request")
  @js.native
  def request(method: NeedleHttpVerbs, url: String, data: BodyData): ReadableStream = js.native
  @JSImport("needle", "request")
  @js.native
  def request(method: NeedleHttpVerbs, url: String, data: BodyData, callback: NeedleCallback): ReadableStream = js.native
  @JSImport("needle", "request")
  @js.native
  def request(
    method: NeedleHttpVerbs,
    url: String,
    data: BodyData,
    options: js.UndefOr[scala.Nothing],
    callback: NeedleCallback
  ): ReadableStream = js.native
  @JSImport("needle", "request")
  @js.native
  def request(method: NeedleHttpVerbs, url: String, data: BodyData, options: NeedleOptions): ReadableStream = js.native
  @JSImport("needle", "request")
  @js.native
  def request(
    method: NeedleHttpVerbs,
    url: String,
    data: BodyData,
    options: NeedleOptions,
    callback: NeedleCallback
  ): ReadableStream = js.native
  
  type BodyData = typingsSlinky.needle.mod.core.BodyData
  
  type NeedleCallback = typingsSlinky.needle.mod.core.NeedleCallback
  
  type NeedleHttpVerbs = typingsSlinky.needle.mod.core.NeedleHttpVerbs
  
  type NeedleOptions = typingsSlinky.needle.mod.core.NeedleOptions
  
  type NeedleResponse = typingsSlinky.needle.mod.core.NeedleResponse
  
  type ReadableStream = typingsSlinky.needle.mod.core.ReadableStream
  
  object core {
    
    type BodyData = Buffer | KeyValue | typingsSlinky.node.NodeJS.ReadableStream | String | Null
    
    type Cookies = StringDictionary[js.Any]
    
    type KeyValue = StringDictionary[js.Any]
    
    type NeedleCallback = js.Function3[
        /* error */ js.Error | Null, 
        /* response */ typingsSlinky.needle.mod.core.NeedleResponse, 
        /* body */ js.Any, 
        Unit
      ]
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.needle.needleStrings.get
      - typingsSlinky.needle.needleStrings.head
      - typingsSlinky.needle.needleStrings.delete
      - typingsSlinky.needle.needleStrings.patch
      - typingsSlinky.needle.needleStrings.post
      - typingsSlinky.needle.needleStrings.put
    */
    trait NeedleHttpVerbs extends StObject
    object NeedleHttpVerbs {
      
      @scala.inline
      def delete: typingsSlinky.needle.needleStrings.delete = "delete".asInstanceOf[typingsSlinky.needle.needleStrings.delete]
      
      @scala.inline
      def get: typingsSlinky.needle.needleStrings.get = "get".asInstanceOf[typingsSlinky.needle.needleStrings.get]
      
      @scala.inline
      def head: typingsSlinky.needle.needleStrings.head = "head".asInstanceOf[typingsSlinky.needle.needleStrings.head]
      
      @scala.inline
      def patch: typingsSlinky.needle.needleStrings.patch = "patch".asInstanceOf[typingsSlinky.needle.needleStrings.patch]
      
      @scala.inline
      def post: typingsSlinky.needle.needleStrings.post = "post".asInstanceOf[typingsSlinky.needle.needleStrings.post]
      
      @scala.inline
      def put: typingsSlinky.needle.needleStrings.put = "put".asInstanceOf[typingsSlinky.needle.needleStrings.put]
    }
    
    type NeedleOptions = RequestOptions with ResponseOptions with RedirectOptions with typingsSlinky.node.httpsMod.RequestOptions
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.needle.needleStrings.delete
      - typingsSlinky.needle.needleStrings.patch
      - typingsSlinky.needle.needleStrings.post
      - typingsSlinky.needle.needleStrings.put
    */
    trait NeedleReadWriteHttpVerbs extends StObject
    object NeedleReadWriteHttpVerbs {
      
      @scala.inline
      def delete: typingsSlinky.needle.needleStrings.delete = "delete".asInstanceOf[typingsSlinky.needle.needleStrings.delete]
      
      @scala.inline
      def patch: typingsSlinky.needle.needleStrings.patch = "patch".asInstanceOf[typingsSlinky.needle.needleStrings.patch]
      
      @scala.inline
      def post: typingsSlinky.needle.needleStrings.post = "post".asInstanceOf[typingsSlinky.needle.needleStrings.post]
      
      @scala.inline
      def put: typingsSlinky.needle.needleStrings.put = "put".asInstanceOf[typingsSlinky.needle.needleStrings.put]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsSlinky.needle.needleStrings.get
      - typingsSlinky.needle.needleStrings.head
    */
    trait NeedleReadonlyHttpVerbs extends StObject
    object NeedleReadonlyHttpVerbs {
      
      @scala.inline
      def get: typingsSlinky.needle.needleStrings.get = "get".asInstanceOf[typingsSlinky.needle.needleStrings.get]
      
      @scala.inline
      def head: typingsSlinky.needle.needleStrings.head = "head".asInstanceOf[typingsSlinky.needle.needleStrings.head]
    }
    
    @js.native
    trait NeedleResponse extends IncomingMessage {
      
      var body: js.Any = js.native
      
      var bytes: Double = js.native
      
      var cookies: js.UndefOr[Cookies] = js.native
      
      var raw: Buffer = js.native
    }
    
    type ReadableStream = typingsSlinky.node.NodeJS.ReadableStream
    
    @js.native
    trait RedirectOptions extends StObject {
      
      /**
        * When true, Needle will only follow redirects that point to the same host
        * as the original request.
        * false by default.
        */
      var follow_if_same_host: js.UndefOr[Boolean] = js.native
      
      /**
        * Unless true, Needle will not follow redirects that point to same location (as set in the response header) as the original request URL. false by default.
        */
      var follow_if_same_location: js.UndefOr[Boolean] = js.native
      
      /**
        * When true, Needle will only follow redirects that point to the same protocol
        * as the original request.
        * false by default.
        */
      var follow_if_same_protocol: js.UndefOr[Boolean] = js.native
      
      /**
        * If enabled, resends the request using the original verb
        * instead of being rewritten to get with no data.
        * false by default.
        */
      var follow_keep_method: js.UndefOr[Boolean] = js.native
      
      /**
        * Sends the cookies received in the set-cookie header
        * as part of the following request.
        * false by default.
        */
      var follow_set_cookie: js.UndefOr[Boolean] = js.native
      
      /**
        * Sets the 'Referer' header to the requested URI
        * when following a redirect.
        * false by default.
        */
      var follow_set_referer: js.UndefOr[Boolean] = js.native
    }
    object RedirectOptions {
      
      @scala.inline
      def apply(): RedirectOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RedirectOptions]
      }
      
      @scala.inline
      implicit class RedirectOptionsMutableBuilder[Self <: RedirectOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFollow_if_same_host(value: Boolean): Self = StObject.set(x, "follow_if_same_host", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFollow_if_same_hostUndefined: Self = StObject.set(x, "follow_if_same_host", js.undefined)
        
        @scala.inline
        def setFollow_if_same_location(value: Boolean): Self = StObject.set(x, "follow_if_same_location", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFollow_if_same_locationUndefined: Self = StObject.set(x, "follow_if_same_location", js.undefined)
        
        @scala.inline
        def setFollow_if_same_protocol(value: Boolean): Self = StObject.set(x, "follow_if_same_protocol", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFollow_if_same_protocolUndefined: Self = StObject.set(x, "follow_if_same_protocol", js.undefined)
        
        @scala.inline
        def setFollow_keep_method(value: Boolean): Self = StObject.set(x, "follow_keep_method", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFollow_keep_methodUndefined: Self = StObject.set(x, "follow_keep_method", js.undefined)
        
        @scala.inline
        def setFollow_set_cookie(value: Boolean): Self = StObject.set(x, "follow_set_cookie", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFollow_set_cookieUndefined: Self = StObject.set(x, "follow_set_cookie", js.undefined)
        
        @scala.inline
        def setFollow_set_referer(value: Boolean): Self = StObject.set(x, "follow_set_referer", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFollow_set_refererUndefined: Self = StObject.set(x, "follow_set_referer", js.undefined)
      }
    }
    
    @js.native
    trait RequestOptions extends StObject {
      
      /**
        * Sets 'Accept' HTTP header. Defaults to &#x2a;&#x2f;&#x2a;.
        */
      var accept: js.UndefOr[String] = js.native
      
      /**
        * Uses an http.Agent of your choice, instead of the global, default one.
        * Useful for tweaking the behaviour at the connection level, such as when doing tunneling.
        */
      var agent: js.UndefOr[Agent | Boolean] = js.native
      
      /**
        * Determines what to do with provided username/password.
        * Options are auto, digest or basic (default).
        * auto will detect the type of authentication depending on the response headers.
        */
      var auth: js.UndefOr[auto | digest | basic] = js.native
      
      /**
        * If true, sets 'Accept-Encoding' header to 'gzip,deflate',
        * and inflates content if zipped.
        * Defaults to false.
        */
      var compressed: js.UndefOr[Boolean] = js.native
      
      /**
        * Sets 'Connection' HTTP header.
        * Not set by default, unless running Node < 0.11.4
        * in which case it defaults to close.
        */
      var connection: js.UndefOr[String] = js.native
      
      /**
        * Sets the 'Content-Type' header.
        * Unset by default, unless you're sending data
        * in which case it's set accordingly to whatever is being sent
        * (application/x-www-form-urlencoded, application/json or multipart/form-data).
        * That is, of course, unless the option is passed,
        * either here or through options.headers.
        */
      var content_type: js.UndefOr[String] = js.native
      
      // These properties are overwritten by those in the 'headers' field
      /**
        * Builds and sets a Cookie header from a { key: 'value' } object.
        */
      var cookies: js.UndefOr[Cookies] = js.native
      
      /**
        * Alias for follow_max
        */
      var follow: js.UndefOr[Double] = js.native
      
      /**
        * Number of redirects to follow. Defaults to 0.
        */
      var follow_max: js.UndefOr[Double] = js.native
      
      /**
        * Object containing custom HTTP headers for request.
        */
      var headers: js.UndefOr[js.Object] = js.native
      
      /**
        * When true, sets content type to application/json and sends request body as JSON string,
        * instead of a query string.
        */
      var json: js.UndefOr[Boolean] = js.native
      
      /**
        * IP address. Passed to http/https request. Local interface from which the request should be emitted.
        */
      var localAddress: js.UndefOr[String] = js.native
      
      /**
        * Enables multipart/form-data encoding. Defaults to false.
        * Use it when uploading files.
        */
      var multipart: js.UndefOr[Boolean] = js.native
      
      /**
        * Returns error if connection takes longer than X milisecs to establish.
        * Defaults to 10000 (10 secs). 0 means no timeout.
        */
      var open_timeout: js.UndefOr[Double] = js.native
      
      /**
        * For HTTP basic auth. Requires username to be passed, but is optional.
        */
      var password: js.UndefOr[String] = js.native
      
      /**
        * Forwards request through HTTP(s) proxy.
        * Eg. proxy: 'http://user:pass@proxy.server.com:3128'.
        * For more advanced proxying/tunneling use a custom agent.
        */
      var proxy: js.UndefOr[String] = js.native
      
      /**
        * Returns error if data transfer takes longer than X milisecs,
        * after connection is established. Defaults to 0 (no timeout).
        */
      var read_timeout: js.UndefOr[Double] = js.native
      
      /**
        * Returns error if no response headers are received in X milisecs,
        * counting from when the connection is opened. Defaults to `0` (no response timeout).
        */
      var response_timeout: js.UndefOr[Double] = js.native
      
      /**
        * When sending streams, this lets manually set the Content-Length header
        * --if the stream's bytecount is known beforehand--,
        * preventing ECONNRESET (socket hang up) errors on some servers that misbehave
        * when receiving payloads of unknown size.
        * Set it to 0 and Needle will get and set the stream's length,
        * or leave unset for the default behavior,
        * which is no Content-Length header for stream payloads.
        */
      var stream_length: js.UndefOr[Double] = js.native
      
      /**
        * Alias for open_timeout
        */
      var timeout: js.UndefOr[Double] = js.native
      
      /**
        * Anonymous function taking request (or redirect location if following redirects) URI as an argument and modifying it given logic.
        * It has to return a valid URI string for successful request.
        */
      var uri_modifier: js.UndefOr[js.Function1[/* uri */ String, String]] = js.native
      
      /**
        * Sets the 'User-Agent' HTTP header.
        * Defaults to Needle/{version} (Node.js {node_version}).
        */
      var user_agent: js.UndefOr[String] = js.native
      
      // Overwritten if present in the URI
      /**
        * For HTTP basic auth.
        */
      var username: js.UndefOr[String] = js.native
    }
    object RequestOptions {
      
      @scala.inline
      def apply(): RequestOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[RequestOptions]
      }
      
      @scala.inline
      implicit class RequestOptionsMutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
        
        @scala.inline
        def setAgent(value: Agent | Boolean): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
        
        @scala.inline
        def setAuth(value: auto | digest | basic): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
        
        @scala.inline
        def setCompressed(value: Boolean): Self = StObject.set(x, "compressed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCompressedUndefined: Self = StObject.set(x, "compressed", js.undefined)
        
        @scala.inline
        def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConnectionUndefined: Self = StObject.set(x, "connection", js.undefined)
        
        @scala.inline
        def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setContent_typeUndefined: Self = StObject.set(x, "content_type", js.undefined)
        
        @scala.inline
        def setCookies(value: Cookies): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
        
        @scala.inline
        def setFollow(value: Double): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
        
        @scala.inline
        def setFollow_max(value: Double): Self = StObject.set(x, "follow_max", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFollow_maxUndefined: Self = StObject.set(x, "follow_max", js.undefined)
        
        @scala.inline
        def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
        
        @scala.inline
        def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
        
        @scala.inline
        def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
        
        @scala.inline
        def setMultipart(value: Boolean): Self = StObject.set(x, "multipart", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMultipartUndefined: Self = StObject.set(x, "multipart", js.undefined)
        
        @scala.inline
        def setOpen_timeout(value: Double): Self = StObject.set(x, "open_timeout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOpen_timeoutUndefined: Self = StObject.set(x, "open_timeout", js.undefined)
        
        @scala.inline
        def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
        
        @scala.inline
        def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
        
        @scala.inline
        def setRead_timeout(value: Double): Self = StObject.set(x, "read_timeout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRead_timeoutUndefined: Self = StObject.set(x, "read_timeout", js.undefined)
        
        @scala.inline
        def setResponse_timeout(value: Double): Self = StObject.set(x, "response_timeout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setResponse_timeoutUndefined: Self = StObject.set(x, "response_timeout", js.undefined)
        
        @scala.inline
        def setStream_length(value: Double): Self = StObject.set(x, "stream_length", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStream_lengthUndefined: Self = StObject.set(x, "stream_length", js.undefined)
        
        @scala.inline
        def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
        
        @scala.inline
        def setUri_modifier(value: /* uri */ String => String): Self = StObject.set(x, "uri_modifier", js.Any.fromFunction1(value))
        
        @scala.inline
        def setUri_modifierUndefined: Self = StObject.set(x, "uri_modifier", js.undefined)
        
        @scala.inline
        def setUser_agent(value: String): Self = StObject.set(x, "user_agent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUser_agentUndefined: Self = StObject.set(x, "user_agent", js.undefined)
        
        @scala.inline
        def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      }
    }
    
    @js.native
    trait ResponseOptions extends StObject {
      
      /**
        * Alias for decode_response
        */
      var decode: js.UndefOr[Boolean] = js.native
      
      /**
        * Whether to decode the text responses to UTF-8,
        * if Content-Type header shows a different charset. Defaults to true.
        */
      var decode_response: js.UndefOr[Boolean] = js.native
      
      /**
        * Dump response output to file.
        * This occurs after parsing and charset decoding is done.
        */
      var output: js.UndefOr[String] = js.native
      
      /**
        * Alias for parse_response
        */
      var parse: js.UndefOr[Boolean | json | xml] = js.native
      
      /**
        * Whether to parse response’s Set-Cookie header.
        * Defaults to true.
        * If parsed, response cookies will be available at resp.cookies.
        */
      var parse_cookies: js.UndefOr[Boolean] = js.native
      
      /**
        * Whether to parse XML or JSON response bodies automagically.
        * Defaults to true.
        * You can also set this to 'xml' or 'json' in which case Needle
        * will only parse the response if the content type matches.
        */
      var parse_response: js.UndefOr[Boolean | json | xml] = js.native
    }
    object ResponseOptions {
      
      @scala.inline
      def apply(): ResponseOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ResponseOptions]
      }
      
      @scala.inline
      implicit class ResponseOptionsMutableBuilder[Self <: ResponseOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDecode(value: Boolean): Self = StObject.set(x, "decode", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDecodeUndefined: Self = StObject.set(x, "decode", js.undefined)
        
        @scala.inline
        def setDecode_response(value: Boolean): Self = StObject.set(x, "decode_response", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDecode_responseUndefined: Self = StObject.set(x, "decode_response", js.undefined)
        
        @scala.inline
        def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
        
        @scala.inline
        def setParse(value: Boolean | json | xml): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
        
        @scala.inline
        def setParse_cookies(value: Boolean): Self = StObject.set(x, "parse_cookies", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParse_cookiesUndefined: Self = StObject.set(x, "parse_cookies", js.undefined)
        
        @scala.inline
        def setParse_response(value: Boolean | json | xml): Self = StObject.set(x, "parse_response", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setParse_responseUndefined: Self = StObject.set(x, "parse_response", js.undefined)
      }
    }
  }
}
