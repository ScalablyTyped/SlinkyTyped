package typingsSlinky.scopedHttpClient

import typingsSlinky.node.httpMod.Agent
import typingsSlinky.node.httpMod.ClientRequest
import typingsSlinky.node.httpMod.ClientRequestArgs
import typingsSlinky.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("scoped-http-client", "ScopedClient")
  @js.native
  class ScopedClient protected () extends StObject {
    def this(url: String, options: Options) = this()
    
    def auth(): ScopedClient = js.native
    def auth(user: js.UndefOr[scala.Nothing], pass: String): ScopedClient = js.native
    def auth(user: String): ScopedClient = js.native
    def auth(user: String, pass: String): ScopedClient = js.native
    
    def del(): ResponseCallback = js.native
    def del(callback: RequestCallback): ResponseCallback = js.native
    def del(reqBody: String): ResponseCallback = js.native
    def del(reqBody: String, callback: RequestCallback): ResponseCallback = js.native
    
    def delete(): ResponseCallback = js.native
    def delete(callback: RequestCallback): ResponseCallback = js.native
    def delete(reqBody: String): ResponseCallback = js.native
    def delete(reqBody: String, callback: RequestCallback): ResponseCallback = js.native
    
    def encoding(): ScopedClient = js.native
    def encoding(e: String): ScopedClient = js.native
    
    def fullPath(p: String): String = js.native
    
    def get(): ResponseCallback = js.native
    def get(callback: RequestCallback): ResponseCallback = js.native
    def get(reqBody: String): ResponseCallback = js.native
    def get(reqBody: String, callback: RequestCallback): ResponseCallback = js.native
    
    def head(): ResponseCallback = js.native
    def head(callback: RequestCallback): ResponseCallback = js.native
    def head(reqBody: String): ResponseCallback = js.native
    def head(reqBody: String, callback: RequestCallback): ResponseCallback = js.native
    
    def header(name: String, value: String): ScopedClient = js.native
    
    def headers(h: js.Any): ScopedClient = js.native
    
    def host(h: String): ScopedClient = js.native
    
    def join(suffix: String): String = js.native
    
    def patch(): ResponseCallback = js.native
    def patch(callback: RequestCallback): ResponseCallback = js.native
    def patch(reqBody: String): ResponseCallback = js.native
    def patch(reqBody: String, callback: RequestCallback): ResponseCallback = js.native
    
    def path(p: String): ScopedClient = js.native
    
    def port(p: String): ScopedClient = js.native
    def port(p: Double): ScopedClient = js.native
    
    def post(): ResponseCallback = js.native
    def post(callback: RequestCallback): ResponseCallback = js.native
    def post(reqBody: String): ResponseCallback = js.native
    def post(reqBody: String, callback: RequestCallback): ResponseCallback = js.native
    
    def protocol(p: String): ScopedClient = js.native
    
    def put(): ResponseCallback = js.native
    def put(callback: RequestCallback): ResponseCallback = js.native
    def put(reqBody: String): ResponseCallback = js.native
    def put(reqBody: String, callback: RequestCallback): ResponseCallback = js.native
    
    def query(key: js.Any): ScopedClient = js.native
    def query(key: js.Any, value: js.Any): ScopedClient = js.native
    
    def request(method: String): ResponseCallback = js.native
    def request(method: String, callback: RequestCallback): ResponseCallback = js.native
    def request(method: String, reqBody: String): ResponseCallback = js.native
    def request(method: String, reqBody: String, callback: RequestCallback): ResponseCallback = js.native
    
    def scope(options: Options): ScopedClient = js.native
    def scope(options: Options, callback: ScopeCallback): ScopedClient = js.native
    // tslint:disable-next-line unified-signatures
    def scope(url: String): ScopedClient = js.native
    def scope(url: String, callback: ScopeCallback): ScopedClient = js.native
    def scope(url: String, options: Options): ScopedClient = js.native
    def scope(url: String, options: Options, callback: ScopeCallback): ScopedClient = js.native
    
    def timeout(time: js.Any): ScopedClient = js.native
  }
  
  @JSImport("scoped-http-client", "create")
  @js.native
  def create(): ScopedClient = js.native
  @JSImport("scoped-http-client", "create")
  @js.native
  def create(options: Options): ScopedClient = js.native
  @JSImport("scoped-http-client", "create")
  @js.native
  def create(url: js.UndefOr[scala.Nothing], options: Options): ScopedClient = js.native
  @JSImport("scoped-http-client", "create")
  @js.native
  def create(url: String): ScopedClient = js.native
  @JSImport("scoped-http-client", "create")
  @js.native
  def create(url: String, options: Options): ScopedClient = js.native
  
  @js.native
  trait Options extends ClientRequestArgs {
    
    var encoding: js.UndefOr[String] = js.native
    
    var hash: js.UndefOr[String] = js.native
    
    var httpAgent: js.UndefOr[Agent | Boolean] = js.native
    
    var httpsAgent: js.UndefOr[Agent | Boolean] = js.native
    
    var pathname: js.UndefOr[String] = js.native
    
    var query: js.UndefOr[js.Any] = js.native
    
    var slashes: js.UndefOr[js.Any] = js.native
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
      def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      @scala.inline
      def setHttpAgent(value: Agent | Boolean): Self = StObject.set(x, "httpAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpAgentUndefined: Self = StObject.set(x, "httpAgent", js.undefined)
      
      @scala.inline
      def setHttpsAgent(value: Agent | Boolean): Self = StObject.set(x, "httpsAgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpsAgentUndefined: Self = StObject.set(x, "httpsAgent", js.undefined)
      
      @scala.inline
      def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
      
      @scala.inline
      def setQuery(value: js.Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setSlashes(value: js.Any): Self = StObject.set(x, "slashes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlashesUndefined: Self = StObject.set(x, "slashes", js.undefined)
    }
  }
  
  type RequestCallback = js.Function2[/* err */ js.Any, /* request */ ClientRequest, Unit]
  
  type ResponseCallback = js.Function1[
    /* cb */ js.UndefOr[
      js.Function3[/* err */ js.Any, /* response */ IncomingMessage, /* body */ String, Unit]
    ], 
    ScopedClient
  ]
  
  type ScopeCallback = js.Function1[/* scoped */ ScopedClient, Unit]
}
