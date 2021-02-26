package typingsSlinky.agentBase

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.agentBase.agentBaseBooleans.`false`
import typingsSlinky.agentBase.agentBaseBooleans.`true`
import typingsSlinky.agentBase.anon.PickAgentaddRequest
import typingsSlinky.node.Buffer
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.httpMod.ClientRequestArgs
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.OutgoingHttpHeaders
import typingsSlinky.node.netMod.Socket
import typingsSlinky.node.streamMod.Duplex
import typingsSlinky.node.tlsMod.KeyObject
import typingsSlinky.node.tlsMod.PxfObject
import typingsSlinky.node.tlsMod.SecureVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("agent-base", JSImport.Namespace)
  @js.native
  def apply(): Agent = js.native
  @JSImport("agent-base", JSImport.Namespace)
  @js.native
  def apply(callback: AgentCallback): Agent = js.native
  @JSImport("agent-base", JSImport.Namespace)
  @js.native
  def apply(callback: AgentCallback, opts: AgentOptions): Agent = js.native
  @JSImport("agent-base", JSImport.Namespace)
  @js.native
  def apply(opts: AgentOptions): Agent = js.native
  
  /**
    * Base `http.Agent` implementation.
    * No pooling/keep-alive is implemented by default.
    *
    * @param {Function} callback
    * @api public
    */
  @JSImport("agent-base", "Agent")
  @js.native
  class Agent () extends EventEmitter {
    def this(callback: AgentCallback) = this()
    def this(callback: AgentOptions) = this()
    def this(callback: js.UndefOr[scala.Nothing], _opts: AgentOptions) = this()
    def this(callback: AgentCallback, _opts: AgentOptions) = this()
    def this(callback: AgentOptions, _opts: AgentOptions) = this()
    
    /**
      * Called by node-core's "_http_client.js" module when creating
      * a new HTTP request with this Agent instance.
      *
      * @api public
      */
    def addRequest(req: ClientRequest, _opts: RequestOptions): Unit = js.native
    
    def callback(req: ClientRequest, opts: RequestOptions): AgentCallbackReturn | js.Promise[AgentCallbackReturn] = js.native
    def callback(req: ClientRequest, opts: RequestOptions, fn: AgentCallbackCallback): Unit = js.native
    
    def defaultPort: Double = js.native
    def defaultPort_=(v: Double): Unit = js.native
    
    def destroy(): Unit = js.native
    
    var explicitDefaultPort: js.Any = js.native
    
    var explicitProtocol: js.Any = js.native
    
    def freeSocket(socket: Socket, opts: AgentOptions): Unit = js.native
    
    var freeSockets: StringDictionary[js.Array[Socket]] = js.native
    
    var maxFreeSockets: Double = js.native
    
    var maxSockets: Double = js.native
    
    var maxTotalSockets: Double = js.native
    
    var options: typingsSlinky.node.httpsMod.AgentOptions = js.native
    
    var promisifiedCallback: js.Any = js.native
    
    def protocol: String = js.native
    def protocol_=(v: String): Unit = js.native
    
    var requests: StringDictionary[js.Array[IncomingMessage]] = js.native
    
    var sockets: StringDictionary[js.Array[Socket]] = js.native
    
    var timeout: Double | Null = js.native
  }
  
  @js.native
  trait AgentCallback extends StObject {
    
    def apply(req: ClientRequest, opts: RequestOptions): AgentCallbackReturn | js.Promise[AgentCallbackReturn] = js.native
    def apply(req: ClientRequest, opts: RequestOptions, fn: AgentCallbackCallback): Unit = js.native
  }
  
  type AgentCallbackCallback = js.Function2[
    /* err */ js.UndefOr[js.Error | Null], 
    /* socket */ js.UndefOr[AgentCallbackReturn], 
    Unit
  ]
  
  type AgentCallbackPromise = js.Function2[
    /* req */ ClientRequest, 
    /* opts */ RequestOptions, 
    AgentCallbackReturn | js.Promise[AgentCallbackReturn]
  ]
  
  type AgentCallbackReturn = Duplex | AgentLike
  
  type AgentLike = PickAgentaddRequest | typingsSlinky.node.httpMod.Agent
  
  @js.native
  trait AgentOptions extends StObject {
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object AgentOptions {
    
    @scala.inline
    def apply(): AgentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AgentOptions]
    }
    
    @scala.inline
    implicit class AgentOptionsMutableBuilder[Self <: AgentOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait AgentRequestOptions extends StObject {
    
    var host: js.UndefOr[String] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var port: Double = js.native
  }
  object AgentRequestOptions {
    
    @scala.inline
    def apply(port: Double): AgentRequestOptions = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[AgentRequestOptions]
    }
    
    @scala.inline
    implicit class AgentRequestOptionsMutableBuilder[Self <: AgentRequestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ClientRequest
    extends typingsSlinky.node.httpMod.ClientRequest {
    
    var _hadError: js.UndefOr[Boolean] = js.native
    
    var _last: js.UndefOr[Boolean] = js.native
  }
  
  /* Inlined parent agent-base.agent-base.AgentRequestOptions */
  /* Inlined parent std.Omit<node.http.RequestOptions, keyof agent-base.agent-base.AgentRequestOptions> */
  @js.native
  trait HttpRequestOptions extends RequestOptions {
    
    var _defaultAgent: js.UndefOr[typingsSlinky.node.httpMod.Agent] = js.native
    
    var agent: js.UndefOr[typingsSlinky.node.httpMod.Agent | Boolean] = js.native
    
    var auth: js.UndefOr[String | Null] = js.native
    
    var createConnection: js.UndefOr[
        js.Function2[
          /* options */ this.type, 
          /* oncreate */ js.Function2[/* err */ js.Error, /* socket */ Socket, Unit], 
          Socket
        ]
      ] = js.native
    
    var defaultPort: js.UndefOr[Double | String] = js.native
    
    var family: js.UndefOr[Double] = js.native
    
    var headers: js.UndefOr[OutgoingHttpHeaders] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var hostname: js.UndefOr[String | Null] = js.native
    
    var localAddress: js.UndefOr[String] = js.native
    
    var maxHeaderSize: js.UndefOr[Double] = js.native
    
    var method: js.UndefOr[String] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var port: Double = js.native
    
    var protocol: js.UndefOr[String | Null] = js.native
    
    var secureEndpoint: `false` = js.native
    
    var setHost: js.UndefOr[Boolean] = js.native
    
    var socketPath: js.UndefOr[String] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object HttpRequestOptions {
    
    @scala.inline
    def apply(port: Double, secureEndpoint: `false`): HttpRequestOptions = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], secureEndpoint = secureEndpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpRequestOptions]
    }
    
    @scala.inline
    implicit class HttpRequestOptionsMutableBuilder[Self <: HttpRequestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: typingsSlinky.node.httpMod.Agent | Boolean): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthNull: Self = StObject.set(x, "auth", null)
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setCreateConnection(
        value: (HttpRequestOptions, /* oncreate */ js.Function2[/* err */ js.Error, /* socket */ Socket, Unit]) => Socket
      ): Self = StObject.set(x, "createConnection", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCreateConnectionUndefined: Self = StObject.set(x, "createConnection", js.undefined)
      
      @scala.inline
      def setDefaultPort(value: Double | String): Self = StObject.set(x, "defaultPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPortUndefined: Self = StObject.set(x, "defaultPort", js.undefined)
      
      @scala.inline
      def setFamily(value: Double): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      @scala.inline
      def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameNull: Self = StObject.set(x, "hostname", null)
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      @scala.inline
      def setMaxHeaderSize(value: Double): Self = StObject.set(x, "maxHeaderSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeaderSizeUndefined: Self = StObject.set(x, "maxHeaderSize", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolNull: Self = StObject.set(x, "protocol", null)
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setSecureEndpoint(value: `false`): Self = StObject.set(x, "secureEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetHost(value: Boolean): Self = StObject.set(x, "setHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetHostUndefined: Self = StObject.set(x, "setHost", js.undefined)
      
      @scala.inline
      def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def set_defaultAgent(value: typingsSlinky.node.httpMod.Agent): Self = StObject.set(x, "_defaultAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_defaultAgentUndefined: Self = StObject.set(x, "_defaultAgent", js.undefined)
    }
  }
  
  /* Inlined parent agent-base.agent-base.AgentRequestOptions */
  /* Inlined parent std.Omit<node.https.RequestOptions, keyof agent-base.agent-base.AgentRequestOptions> */
  @js.native
  trait HttpsRequestOptions extends RequestOptions {
    
    var _defaultAgent: js.UndefOr[typingsSlinky.node.httpMod.Agent] = js.native
    
    var agent: js.UndefOr[typingsSlinky.node.httpMod.Agent | Boolean] = js.native
    
    var auth: js.UndefOr[String | Null] = js.native
    
    var ca: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
    
    var cert: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
    
    var ciphers: js.UndefOr[String] = js.native
    
    var clientCertEngine: js.UndefOr[String] = js.native
    
    var createConnection: js.UndefOr[
        js.Function2[
          /* options */ ClientRequestArgs, 
          /* oncreate */ js.Function2[/* err */ js.Error, /* socket */ Socket, Unit], 
          Socket
        ]
      ] = js.native
    
    var crl: js.UndefOr[String | Buffer | (js.Array[String | Buffer])] = js.native
    
    var defaultPort: js.UndefOr[Double | String] = js.native
    
    var dhparam: js.UndefOr[String | Buffer] = js.native
    
    var ecdhCurve: js.UndefOr[String] = js.native
    
    var family: js.UndefOr[Double] = js.native
    
    var headers: js.UndefOr[OutgoingHttpHeaders] = js.native
    
    var honorCipherOrder: js.UndefOr[Boolean] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var hostname: js.UndefOr[String | Null] = js.native
    
    var key: js.UndefOr[String | Buffer | (js.Array[Buffer | KeyObject])] = js.native
    
    var localAddress: js.UndefOr[String] = js.native
    
    var maxHeaderSize: js.UndefOr[Double] = js.native
    
    var maxVersion: js.UndefOr[SecureVersion] = js.native
    
    var method: js.UndefOr[String] = js.native
    
    var minVersion: js.UndefOr[SecureVersion] = js.native
    
    var passphrase: js.UndefOr[String] = js.native
    
    var path: js.UndefOr[String] = js.native
    
    var pfx: js.UndefOr[String | Buffer | (js.Array[String | Buffer | PxfObject])] = js.native
    
    var port: Double = js.native
    
    var privateKeyEngine: js.UndefOr[String] = js.native
    
    var privateKeyIdentifier: js.UndefOr[String] = js.native
    
    var protocol: js.UndefOr[String | Null] = js.native
    
    var rejectUnauthorized: js.UndefOr[Boolean] = js.native
    
    var secureEndpoint: `true` = js.native
    
    var secureOptions: js.UndefOr[Double] = js.native
    
    var secureProtocol: js.UndefOr[String] = js.native
    
    var servername: js.UndefOr[String] = js.native
    
    var sessionIdContext: js.UndefOr[String] = js.native
    
    var sessionTimeout: js.UndefOr[Double] = js.native
    
    var setHost: js.UndefOr[Boolean] = js.native
    
    var sigalgs: js.UndefOr[String] = js.native
    
    var socketPath: js.UndefOr[String] = js.native
    
    var ticketKeys: js.UndefOr[Buffer] = js.native
    
    var timeout: js.UndefOr[Double] = js.native
  }
  object HttpsRequestOptions {
    
    @scala.inline
    def apply(port: Double, secureEndpoint: `true`): HttpsRequestOptions = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], secureEndpoint = secureEndpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpsRequestOptions]
    }
    
    @scala.inline
    implicit class HttpsRequestOptionsMutableBuilder[Self <: HttpsRequestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: typingsSlinky.node.httpMod.Agent | Boolean): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setAuth(value: String): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthNull: Self = StObject.set(x, "auth", null)
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setCa(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "ca", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaUndefined: Self = StObject.set(x, "ca", js.undefined)
      
      @scala.inline
      def setCaVarargs(value: (String | Buffer)*): Self = StObject.set(x, "ca", js.Array(value :_*))
      
      @scala.inline
      def setCert(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "cert", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertUndefined: Self = StObject.set(x, "cert", js.undefined)
      
      @scala.inline
      def setCertVarargs(value: (String | Buffer)*): Self = StObject.set(x, "cert", js.Array(value :_*))
      
      @scala.inline
      def setCiphers(value: String): Self = StObject.set(x, "ciphers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCiphersUndefined: Self = StObject.set(x, "ciphers", js.undefined)
      
      @scala.inline
      def setClientCertEngine(value: String): Self = StObject.set(x, "clientCertEngine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientCertEngineUndefined: Self = StObject.set(x, "clientCertEngine", js.undefined)
      
      @scala.inline
      def setCreateConnection(
        value: (/* options */ ClientRequestArgs, /* oncreate */ js.Function2[/* err */ js.Error, /* socket */ Socket, Unit]) => Socket
      ): Self = StObject.set(x, "createConnection", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCreateConnectionUndefined: Self = StObject.set(x, "createConnection", js.undefined)
      
      @scala.inline
      def setCrl(value: String | Buffer | (js.Array[String | Buffer])): Self = StObject.set(x, "crl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrlUndefined: Self = StObject.set(x, "crl", js.undefined)
      
      @scala.inline
      def setCrlVarargs(value: (String | Buffer)*): Self = StObject.set(x, "crl", js.Array(value :_*))
      
      @scala.inline
      def setDefaultPort(value: Double | String): Self = StObject.set(x, "defaultPort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPortUndefined: Self = StObject.set(x, "defaultPort", js.undefined)
      
      @scala.inline
      def setDhparam(value: String | Buffer): Self = StObject.set(x, "dhparam", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDhparamUndefined: Self = StObject.set(x, "dhparam", js.undefined)
      
      @scala.inline
      def setEcdhCurve(value: String): Self = StObject.set(x, "ecdhCurve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEcdhCurveUndefined: Self = StObject.set(x, "ecdhCurve", js.undefined)
      
      @scala.inline
      def setFamily(value: Double): Self = StObject.set(x, "family", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFamilyUndefined: Self = StObject.set(x, "family", js.undefined)
      
      @scala.inline
      def setHeaders(value: OutgoingHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHonorCipherOrder(value: Boolean): Self = StObject.set(x, "honorCipherOrder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHonorCipherOrderUndefined: Self = StObject.set(x, "honorCipherOrder", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnameNull: Self = StObject.set(x, "hostname", null)
      
      @scala.inline
      def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
      
      @scala.inline
      def setKey(value: String | Buffer | (js.Array[Buffer | KeyObject])): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setKeyVarargs(value: (Buffer | KeyObject)*): Self = StObject.set(x, "key", js.Array(value :_*))
      
      @scala.inline
      def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocalAddressUndefined: Self = StObject.set(x, "localAddress", js.undefined)
      
      @scala.inline
      def setMaxHeaderSize(value: Double): Self = StObject.set(x, "maxHeaderSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeaderSizeUndefined: Self = StObject.set(x, "maxHeaderSize", js.undefined)
      
      @scala.inline
      def setMaxVersion(value: SecureVersion): Self = StObject.set(x, "maxVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxVersionUndefined: Self = StObject.set(x, "maxVersion", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setMinVersion(value: SecureVersion): Self = StObject.set(x, "minVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinVersionUndefined: Self = StObject.set(x, "minVersion", js.undefined)
      
      @scala.inline
      def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPfx(value: String | Buffer | (js.Array[String | Buffer | PxfObject])): Self = StObject.set(x, "pfx", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPfxUndefined: Self = StObject.set(x, "pfx", js.undefined)
      
      @scala.inline
      def setPfxVarargs(value: (String | Buffer | PxfObject)*): Self = StObject.set(x, "pfx", js.Array(value :_*))
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateKeyEngine(value: String): Self = StObject.set(x, "privateKeyEngine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateKeyEngineUndefined: Self = StObject.set(x, "privateKeyEngine", js.undefined)
      
      @scala.inline
      def setPrivateKeyIdentifier(value: String): Self = StObject.set(x, "privateKeyIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateKeyIdentifierUndefined: Self = StObject.set(x, "privateKeyIdentifier", js.undefined)
      
      @scala.inline
      def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProtocolNull: Self = StObject.set(x, "protocol", null)
      
      @scala.inline
      def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
      
      @scala.inline
      def setRejectUnauthorized(value: Boolean): Self = StObject.set(x, "rejectUnauthorized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRejectUnauthorizedUndefined: Self = StObject.set(x, "rejectUnauthorized", js.undefined)
      
      @scala.inline
      def setSecureEndpoint(value: `true`): Self = StObject.set(x, "secureEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureOptions(value: Double): Self = StObject.set(x, "secureOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureOptionsUndefined: Self = StObject.set(x, "secureOptions", js.undefined)
      
      @scala.inline
      def setSecureProtocol(value: String): Self = StObject.set(x, "secureProtocol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureProtocolUndefined: Self = StObject.set(x, "secureProtocol", js.undefined)
      
      @scala.inline
      def setServername(value: String): Self = StObject.set(x, "servername", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServernameUndefined: Self = StObject.set(x, "servername", js.undefined)
      
      @scala.inline
      def setSessionIdContext(value: String): Self = StObject.set(x, "sessionIdContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionIdContextUndefined: Self = StObject.set(x, "sessionIdContext", js.undefined)
      
      @scala.inline
      def setSessionTimeout(value: Double): Self = StObject.set(x, "sessionTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionTimeoutUndefined: Self = StObject.set(x, "sessionTimeout", js.undefined)
      
      @scala.inline
      def setSetHost(value: Boolean): Self = StObject.set(x, "setHost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetHostUndefined: Self = StObject.set(x, "setHost", js.undefined)
      
      @scala.inline
      def setSigalgs(value: String): Self = StObject.set(x, "sigalgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSigalgsUndefined: Self = StObject.set(x, "sigalgs", js.undefined)
      
      @scala.inline
      def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
      
      @scala.inline
      def setTicketKeys(value: Buffer): Self = StObject.set(x, "ticketKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTicketKeysUndefined: Self = StObject.set(x, "ticketKeys", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def set_defaultAgent(value: typingsSlinky.node.httpMod.Agent): Self = StObject.set(x, "_defaultAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_defaultAgentUndefined: Self = StObject.set(x, "_defaultAgent", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.agentBase.mod.HttpRequestOptions
    - typingsSlinky.agentBase.mod.HttpsRequestOptions
  */
  trait RequestOptions extends StObject
  object RequestOptions {
    
    @scala.inline
    def HttpRequestOptions(port: Double, secureEndpoint: `false`): typingsSlinky.agentBase.mod.HttpRequestOptions = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], secureEndpoint = secureEndpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.agentBase.mod.HttpRequestOptions]
    }
    
    @scala.inline
    def HttpsRequestOptions(port: Double, secureEndpoint: `true`): typingsSlinky.agentBase.mod.HttpsRequestOptions = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], secureEndpoint = secureEndpoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.agentBase.mod.HttpsRequestOptions]
    }
  }
}
