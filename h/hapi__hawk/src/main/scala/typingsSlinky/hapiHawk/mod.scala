package typingsSlinky.hapiHawk

import typingsSlinky.hapiBoom.mod.Boom
import typingsSlinky.hapiBoom.mod.unauthorized.Attributes
import typingsSlinky.hapiBoom.mod.unauthorized.MissingAuth
import typingsSlinky.hapiHapi.mod.Server_
import typingsSlinky.hapiHawk.clientMod.AuthenticateOptions
import typingsSlinky.hapiHawk.clientMod.Authentication
import typingsSlinky.hapiHawk.clientMod.BewitOptions
import typingsSlinky.hapiHawk.clientMod.Credentials
import typingsSlinky.hapiHawk.clientMod.HeaderOptions
import typingsSlinky.hapiHawk.clientMod.Header_
import typingsSlinky.hapiHawk.clientMod.MessageOptions
import typingsSlinky.hapiHawk.clientMod.Message_
import typingsSlinky.hapiHawk.cryptoMod.Artifacts
import typingsSlinky.hapiHawk.cryptoMod.TimestampMessage_
import typingsSlinky.hapiHawk.serverMod.AuthenticateBewitOptions
import typingsSlinky.hapiHawk.serverMod.AuthenticateMessageOptions
import typingsSlinky.hapiHawk.serverMod.AuthenticatedBewit
import typingsSlinky.hapiHawk.serverMod.AuthenticatedMessage
import typingsSlinky.hapiHawk.serverMod.CredentialsFunc
import typingsSlinky.hapiHawk.utilsMod.CustomRequest
import typingsSlinky.hapiHawk.utilsMod.Host
import typingsSlinky.hapiHawk.utilsMod.ParseRequestOptions
import typingsSlinky.hapiSntp.mod.Options
import typingsSlinky.hapiSntp.mod.TimeOptions
import typingsSlinky.node.cryptoMod.Hash
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.RequestOptions
import typingsSlinky.request.mod.Response
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object client {
    
    @JSImport("@hapi/hawk", "client.authenticate")
    @js.native
    def authenticate(res: IncomingMessage, credentials: Credentials, artifacts: Artifacts): Authentication = js.native
    @JSImport("@hapi/hawk", "client.authenticate")
    @js.native
    def authenticate(res: IncomingMessage, credentials: Credentials, artifacts: Artifacts, options: AuthenticateOptions): Authentication = js.native
    @JSImport("@hapi/hawk", "client.authenticate")
    @js.native
    def authenticate(res: Response, credentials: Credentials, artifacts: Artifacts): Authentication = js.native
    @JSImport("@hapi/hawk", "client.authenticate")
    @js.native
    def authenticate(res: Response, credentials: Credentials, artifacts: Artifacts, options: AuthenticateOptions): Authentication = js.native
    
    @JSImport("@hapi/hawk", "client.getBewit")
    @js.native
    def getBewit(uri: String, options: BewitOptions): String = js.native
    
    @JSImport("@hapi/hawk", "client.header")
    @js.native
    def header(uri: String, method: String): Header_ = js.native
    @JSImport("@hapi/hawk", "client.header")
    @js.native
    def header(uri: String, method: String, options: HeaderOptions): Header_ = js.native
    
    @JSImport("@hapi/hawk", "client.message")
    @js.native
    def message(host: String, port: Double, message: String): Message_ = js.native
    @JSImport("@hapi/hawk", "client.message")
    @js.native
    def message(host: String, port: Double, message: String, options: MessageOptions): Message_ = js.native
  }
  
  object crypto {
    
    @JSImport("@hapi/hawk", "crypto.algorithms")
    @js.native
    val algorithms: js.Array[String] = js.native
    
    @JSImport("@hapi/hawk", "crypto.calculateMac")
    @js.native
    def calculateMac(`type`: String, credentials: Credentials, options: Artifacts): String = js.native
    
    @JSImport("@hapi/hawk", "crypto.calculatePayloadHash")
    @js.native
    def calculatePayloadHash(payload: String, algorithm: String, contentType: String): String = js.native
    
    @JSImport("@hapi/hawk", "crypto.calculateTsMac")
    @js.native
    def calculateTsMac(ts: String, credentials: Credentials): String = js.native
    
    @JSImport("@hapi/hawk", "crypto.finalizePayloadHash")
    @js.native
    def finalizePayloadHash(hash: Hash): String = js.native
    
    @JSImport("@hapi/hawk", "crypto.generateNormalizedString")
    @js.native
    def generateNormalizedString(`type`: String, options: Artifacts): String = js.native
    
    @JSImport("@hapi/hawk", "crypto.headerVersion")
    @js.native
    val headerVersion: String = js.native
    
    @JSImport("@hapi/hawk", "crypto.initializePayloadHash")
    @js.native
    def initializePayloadHash(algorithm: String, contentType: String): String = js.native
    
    @JSImport("@hapi/hawk", "crypto.timestampMessage")
    @js.native
    def timestampMessage(credentials: Credentials, localtimeOffsetMsec: Double): TimestampMessage_ = js.native
  }
  
  object plugin {
    
    object plugin {
      
      @JSImport("@hapi/hawk", "plugin.plugin.pkg")
      @js.native
      val pkg: Record[String, js.Any] = js.native
      
      @JSImport("@hapi/hawk", "plugin.plugin.register")
      @js.native
      def register(server: Server_): Unit = js.native
      
      @JSImport("@hapi/hawk", "plugin.plugin.requirements")
      @js.native
      val requirements: Record[String, String] = js.native
    }
  }
  
  object server {
    
    @JSImport("@hapi/hawk", "server.authenticate")
    @js.native
    def authenticate(req: IncomingMessage, credentialsFunc: CredentialsFunc): js.Promise[typingsSlinky.hapiHawk.serverMod.Authentication] = js.native
    @JSImport("@hapi/hawk", "server.authenticate")
    @js.native
    def authenticate(
      req: IncomingMessage,
      credentialsFunc: CredentialsFunc,
      options: typingsSlinky.hapiHawk.serverMod.AuthenticateOptions
    ): js.Promise[typingsSlinky.hapiHawk.serverMod.Authentication] = js.native
    
    @JSImport("@hapi/hawk", "server.authenticateBewit")
    @js.native
    def authenticateBewit(req: IncomingMessage, credentialsFunc: CredentialsFunc): AuthenticatedBewit = js.native
    @JSImport("@hapi/hawk", "server.authenticateBewit")
    @js.native
    def authenticateBewit(req: IncomingMessage, credentialsFunc: CredentialsFunc, options: AuthenticateBewitOptions): AuthenticatedBewit = js.native
    
    @JSImport("@hapi/hawk", "server.authenticateMessage")
    @js.native
    def authenticateMessage(
      host: String,
      port: Double,
      message: String,
      authorization: Message_,
      credentialsFunc: CredentialsFunc,
      options: AuthenticateMessageOptions
    ): js.Promise[AuthenticatedMessage] = js.native
    
    @JSImport("@hapi/hawk", "server.authenticatePayload")
    @js.native
    def authenticatePayload(
      payload: String,
      credentials: typingsSlinky.hapiHawk.serverMod.Credentials,
      artifacts: Artifacts,
      contentType: String
    ): Unit = js.native
    
    @JSImport("@hapi/hawk", "server.authenticatePayloadHash")
    @js.native
    def authenticatePayloadHash(calculatedHash: String, artifacts: Artifacts): Unit = js.native
    
    @JSImport("@hapi/hawk", "server.header")
    @js.native
    def header(credentials: typingsSlinky.hapiHawk.serverMod.Credentials, artifacts: Artifacts): String = js.native
    @JSImport("@hapi/hawk", "server.header")
    @js.native
    def header(
      credentials: typingsSlinky.hapiHawk.serverMod.Credentials,
      artifacts: Artifacts,
      options: typingsSlinky.hapiHawk.serverMod.HeaderOptions
    ): String = js.native
  }
  
  object sntp {
    
    @JSImport("@hapi/hawk", "sntp.now")
    @js.native
    def now(): Double = js.native
    
    @JSImport("@hapi/hawk", "sntp.offset")
    @js.native
    def offset(): js.Promise[Double] = js.native
    
    @JSImport("@hapi/hawk", "sntp.start")
    @js.native
    def start(): js.Promise[Unit] = js.native
    @JSImport("@hapi/hawk", "sntp.start")
    @js.native
    def start(options: Options): js.Promise[Unit] = js.native
    
    @JSImport("@hapi/hawk", "sntp.stop")
    @js.native
    def stop(): Unit = js.native
    
    @JSImport("@hapi/hawk", "sntp.time")
    @js.native
    def time(): js.Promise[TimeOptions] = js.native
    @JSImport("@hapi/hawk", "sntp.time")
    @js.native
    def time(options: Options): js.Promise[TimeOptions] = js.native
  }
  
  object uri {
    
    /* was `typeof server.authenticateBewit` */
    @JSImport("@hapi/hawk", "uri.authenticate")
    @js.native
    def authenticate(req: IncomingMessage, credentialsFunc: CredentialsFunc): AuthenticatedBewit = js.native
    @JSImport("@hapi/hawk", "uri.authenticate")
    @js.native
    def authenticate(req: IncomingMessage, credentialsFunc: CredentialsFunc, options: AuthenticateBewitOptions): AuthenticatedBewit = js.native
    
    /* was `typeof client.getBewit` */
    @JSImport("@hapi/hawk", "uri.getBewit")
    @js.native
    def getBewit(uri: String, options: BewitOptions): String = js.native
  }
  
  object utils {
    
    object limits {
      
      @JSImport("@hapi/hawk", "utils.limits")
      @js.native
      val ^ : js.Any = js.native
      
      /** Limit the length of uris and headers to avoid a DoS attack on string matching */
      @JSImport("@hapi/hawk", "utils.limits.maxMatchLength")
      @js.native
      def maxMatchLength: Double = js.native
      @scala.inline
      def maxMatchLength_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxMatchLength")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("@hapi/hawk", "utils.now")
    @js.native
    def now(localtimeOffsetMsec: Double): Double = js.native
    
    @JSImport("@hapi/hawk", "utils.nowSecs")
    @js.native
    def nowSecs(localtimeOffsetMsec: Double): Double = js.native
    
    @JSImport("@hapi/hawk", "utils.parseAuthorizationHeader")
    @js.native
    def parseAuthorizationHeader(header: String): Record[String, String] = js.native
    @JSImport("@hapi/hawk", "utils.parseAuthorizationHeader")
    @js.native
    def parseAuthorizationHeader(header: String, keys: js.Array[String]): Record[String, String] = js.native
    
    @JSImport("@hapi/hawk", "utils.parseContentType")
    @js.native
    def parseContentType(): String = js.native
    @JSImport("@hapi/hawk", "utils.parseContentType")
    @js.native
    def parseContentType(header: String): String = js.native
    
    @JSImport("@hapi/hawk", "utils.parseHost")
    @js.native
    def parseHost(req: RequestOptions): Host | Null = js.native
    @JSImport("@hapi/hawk", "utils.parseHost")
    @js.native
    def parseHost(req: RequestOptions, hostHeaderName: String): Host | Null = js.native
    @JSImport("@hapi/hawk", "utils.parseHost")
    @js.native
    def parseHost(req: typingsSlinky.node.httpsMod.RequestOptions): Host | Null = js.native
    @JSImport("@hapi/hawk", "utils.parseHost")
    @js.native
    def parseHost(req: typingsSlinky.node.httpsMod.RequestOptions, hostHeaderName: String): Host | Null = js.native
    
    @JSImport("@hapi/hawk", "utils.parseRequest")
    @js.native
    def parseRequest(req: RequestOptions): CustomRequest = js.native
    @JSImport("@hapi/hawk", "utils.parseRequest")
    @js.native
    def parseRequest(req: RequestOptions, options: ParseRequestOptions): CustomRequest = js.native
    @JSImport("@hapi/hawk", "utils.parseRequest")
    @js.native
    def parseRequest(req: typingsSlinky.node.httpsMod.RequestOptions): CustomRequest = js.native
    @JSImport("@hapi/hawk", "utils.parseRequest")
    @js.native
    def parseRequest(req: typingsSlinky.node.httpsMod.RequestOptions, options: ParseRequestOptions): CustomRequest = js.native
    
    @JSImport("@hapi/hawk", "utils.unauthorized")
    @js.native
    def unauthorized(): Boom[_] with MissingAuth = js.native
    @JSImport("@hapi/hawk", "utils.unauthorized")
    @js.native
    def unauthorized(message: js.UndefOr[scala.Nothing], attributes: String): Boom[_] with MissingAuth = js.native
    @JSImport("@hapi/hawk", "utils.unauthorized")
    @js.native
    def unauthorized(message: js.UndefOr[scala.Nothing], attributes: Attributes): Boom[_] with MissingAuth = js.native
    @JSImport("@hapi/hawk", "utils.unauthorized")
    @js.native
    def unauthorized(message: String): Boom[_] with MissingAuth = js.native
    @JSImport("@hapi/hawk", "utils.unauthorized")
    @js.native
    def unauthorized(message: String, attributes: String): Boom[_] with MissingAuth = js.native
    @JSImport("@hapi/hawk", "utils.unauthorized")
    @js.native
    def unauthorized(message: String, attributes: Attributes): Boom[_] with MissingAuth = js.native
    
    @JSImport("@hapi/hawk", "utils.version")
    @js.native
    val version: String = js.native
  }
}
