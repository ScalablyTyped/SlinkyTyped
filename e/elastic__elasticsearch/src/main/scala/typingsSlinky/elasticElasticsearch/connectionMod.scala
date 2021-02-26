package typingsSlinky.elasticElasticsearch

import typingsSlinky.elasticElasticsearch.anon.ALIVE
import typingsSlinky.elasticElasticsearch.anon.DATA_
import typingsSlinky.elasticElasticsearch.poolMod.ApiKeyAuth
import typingsSlinky.elasticElasticsearch.poolMod.BasicAuth
import typingsSlinky.hpagent.mod.HttpProxyAgent
import typingsSlinky.hpagent.mod.HttpsProxyAgent
import typingsSlinky.node.Buffer
import typingsSlinky.node.httpMod.Agent
import typingsSlinky.node.httpMod.ClientRequest
import typingsSlinky.node.httpMod.ClientRequestArgs
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.urlMod.URL_
import typingsSlinky.node.utilMod.InspectOptions
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object connectionMod {
  
  @JSImport("@elastic/elasticsearch/lib/Connection", JSImport.Default)
  @js.native
  class default () extends Connection {
    def this(opts: ConnectionOptions) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@elastic/elasticsearch/lib/Connection", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@elastic/elasticsearch/lib/Connection", "default.roles")
    @js.native
    def roles: DATA_ = js.native
    @scala.inline
    def roles_=(x: DATA_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("roles")(x.asInstanceOf[js.Any])
    
    @JSImport("@elastic/elasticsearch/lib/Connection", "default.statuses")
    @js.native
    def statuses: ALIVE = js.native
    @scala.inline
    def statuses_=(x: ALIVE): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("statuses")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait AgentOptions extends StObject {
    
    var keepAlive: js.UndefOr[Boolean] = js.native
    
    var keepAliveMsecs: js.UndefOr[Double] = js.native
    
    var maxFreeSockets: js.UndefOr[Double] = js.native
    
    var maxSockets: js.UndefOr[Double] = js.native
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
      def setKeepAlive(value: Boolean): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepAliveMsecs(value: Double): Self = StObject.set(x, "keepAliveMsecs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepAliveMsecsUndefined: Self = StObject.set(x, "keepAliveMsecs", js.undefined)
      
      @scala.inline
      def setKeepAliveUndefined: Self = StObject.set(x, "keepAlive", js.undefined)
      
      @scala.inline
      def setMaxFreeSockets(value: Double): Self = StObject.set(x, "maxFreeSockets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxFreeSocketsUndefined: Self = StObject.set(x, "maxFreeSockets", js.undefined)
      
      @scala.inline
      def setMaxSockets(value: Double): Self = StObject.set(x, "maxSockets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSocketsUndefined: Self = StObject.set(x, "maxSockets", js.undefined)
    }
  }
  
  @js.native
  trait Connection extends StObject {
    
    def apply(`object`: js.Any, options: InspectOptions): String = js.native
    
    var _agent: Agent | typingsSlinky.node.httpsMod.Agent | HttpProxyAgent | HttpsProxyAgent = js.native
    
    var _openRequests: Double = js.native
    
    var _status: String = js.native
    
    def buildRequestObject(params: js.Any): /* import warning: importer.ImportType#apply Failed type conversion: node.http.ClientRequestArgs[/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify inspect.custom * / any] */ js.Any = js.native
    
    def close(): Connection = js.native
    
    var deadCount: Double = js.native
    
    var headers: Record[String, _] = js.native
    
    var id: String = js.native
    
    var makeRequest: js.Any = js.native
    
    def request(
      params: RequestOptions,
      callback: js.Function2[/* err */ js.Error | Null, /* response */ IncomingMessage | Null, Unit]
    ): ClientRequest = js.native
    
    var resurrectTimeout: Double = js.native
    
    var roles: ConnectionRoles = js.native
    
    def setRole(role: String, enabled: Boolean): Connection = js.native
    
    var ssl: typingsSlinky.node.tlsMod.ConnectionOptions | Null = js.native
    
    var status: String = js.native
    
    def toJSON(): js.Any = js.native
    
    var url: URL_ = js.native
  }
  
  @js.native
  trait ConnectionOptions extends StObject {
    
    var agent: js.UndefOr[AgentOptions | agentFn] = js.native
    
    var auth: js.UndefOr[BasicAuth | ApiKeyAuth] = js.native
    
    var headers: js.UndefOr[Record[String, _]] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var proxy: js.UndefOr[String | URL_] = js.native
    
    var roles: js.UndefOr[ConnectionRoles] = js.native
    
    var ssl: js.UndefOr[typingsSlinky.node.tlsMod.ConnectionOptions] = js.native
    
    var status: js.UndefOr[String] = js.native
    
    var url: URL_ = js.native
  }
  object ConnectionOptions {
    
    @scala.inline
    def apply(url: URL_): ConnectionOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionOptions]
    }
    
    @scala.inline
    implicit class ConnectionOptionsMutableBuilder[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: AgentOptions | agentFn): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentFunction1(value: /* opts */ ConnectionOptions => js.Any): Self = StObject.set(x, "agent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setAuth(value: BasicAuth | ApiKeyAuth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
      
      @scala.inline
      def setHeaders(value: Record[String, _]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setProxy(value: String | URL_): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
      
      @scala.inline
      def setRoles(value: ConnectionRoles): Self = StObject.set(x, "roles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRolesUndefined: Self = StObject.set(x, "roles", js.undefined)
      
      @scala.inline
      def setSsl(value: typingsSlinky.node.tlsMod.ConnectionOptions): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setUrl(value: URL_): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ConnectionRoles extends StObject {
    
    var data: js.UndefOr[Boolean] = js.native
    
    var ingest: js.UndefOr[Boolean] = js.native
    
    var master: js.UndefOr[Boolean] = js.native
    
    var ml: js.UndefOr[Boolean] = js.native
  }
  object ConnectionRoles {
    
    @scala.inline
    def apply(): ConnectionRoles = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionRoles]
    }
    
    @scala.inline
    implicit class ConnectionRolesMutableBuilder[Self <: ConnectionRoles] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Boolean): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setIngest(value: Boolean): Self = StObject.set(x, "ingest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIngestUndefined: Self = StObject.set(x, "ingest", js.undefined)
      
      @scala.inline
      def setMaster(value: Boolean): Self = StObject.set(x, "master", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMasterUndefined: Self = StObject.set(x, "master", js.undefined)
      
      @scala.inline
      def setMl(value: Boolean): Self = StObject.set(x, "ml", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMlUndefined: Self = StObject.set(x, "ml", js.undefined)
    }
  }
  
  @js.native
  trait RequestOptions extends ClientRequestArgs {
    
    var asStream: js.UndefOr[Boolean] = js.native
    
    var body: js.UndefOr[String | Buffer | Readable | Null] = js.native
    
    var querystring: js.UndefOr[String] = js.native
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
      def setAsStream(value: Boolean): Self = StObject.set(x, "asStream", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsStreamUndefined: Self = StObject.set(x, "asStream", js.undefined)
      
      @scala.inline
      def setBody(value: String | Buffer | Readable): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyNull: Self = StObject.set(x, "body", null)
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setQuerystring(value: String): Self = StObject.set(x, "querystring", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuerystringUndefined: Self = StObject.set(x, "querystring", js.undefined)
    }
  }
  
  type agentFn = js.Function1[/* opts */ ConnectionOptions, js.Any]
}
