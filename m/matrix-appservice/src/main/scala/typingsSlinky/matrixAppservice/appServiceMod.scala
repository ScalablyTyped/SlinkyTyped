package typingsSlinky.matrixAppservice

import typingsSlinky.express.mod.Application_
import typingsSlinky.expressServeStaticCore.mod.ParamsDictionary
import typingsSlinky.expressServeStaticCore.mod.Request
import typingsSlinky.expressServeStaticCore.mod.Response
import typingsSlinky.matrixAppservice.anon.HomeserverToken
import typingsSlinky.matrixAppservice.matrixAppserviceStrings.`http-log`
import typingsSlinky.matrixAppservice.matrixAppserviceStrings.ephemeral
import typingsSlinky.matrixAppservice.matrixAppserviceStrings.event
import typingsSlinky.node.eventsMod.EventEmitter
import typingsSlinky.node.httpMod.IncomingMessage
import typingsSlinky.node.httpMod.ServerResponse
import typingsSlinky.qs.mod.ParsedQs
import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matrix-appservice/lib/app-service", JSImport.Namespace)
@js.native
object appServiceMod extends js.Object {
  
  @js.native
  class AppService protected () extends EventEmitter {
    /**
      * Construct a new application service.
      * @constructor
      * @param {Object} config Configuration for this service.
      * @param {String} config.homeserverToken The incoming HS token to expect. Must
      * be set prior to calling listen(port).
      * @param {Number} config.httpMaxSizeBytes The max number of bytes allowed on an
      * incoming HTTP request. Default: 5000000.
      * @throws If a homeserver token is not supplied.
      */
    def this(config: HomeserverToken) = this()
    
    /**
      * Express instance itself is a request handler, which could be invoked without
      * third argument.
      */
    /**
      * @deprecated Use `AppService.expressApp`
      */
    def app(req: Request[ParamsDictionary, _, _, ParsedQs], res: Response[_, Double]): js.Any = js.native
    /**
      * @deprecated Use `AppService.expressApp`
      */
    def app(req: Request[ParamsDictionary, _, _, ParsedQs], res: ServerResponse): js.Any = js.native
    /**
      * @deprecated Use `AppService.expressApp`
      */
    def app(req: IncomingMessage, res: Response[_, Double]): js.Any = js.native
    /**
      * @deprecated Use `AppService.expressApp`
      */
    def app(req: IncomingMessage, res: ServerResponse): js.Any = js.native
    /**
      * @deprecated Use `AppService.expressApp`
      */
    @JSName("app")
    val app_Original: Application_ = js.native
    
    /**
      * Closes the HTTP server.
      * @returns {Promise} When the operation has completed
      * @throws If the server has not been started.
      */
    def close(): js.Promise[Unit] = js.native
    
    var config: js.Any = js.native
    
    /**
      * The Express App instance for the appservice, which
      * can be extended with paths.
      */
    def expressApp: Application_ = js.native
    
    var isInvalidToken: js.Any = js.native
    
    var lastProcessedTxnId: js.Any = js.native
    
    /***
      * Begin listening on the specified port.
      * @param {Number} port The port to listen on.
      * @param {String} hostname Optional hostname to listen on
      * @param {Number} backlog Maximum length of the queue of pending connections
      * @param {Function} callback The callback for the "listening" event. Optional.
      * @returns {Promise} When the server is listening, if a callback is not provided.
      */
    def listen(port: Double, hostname: String, backlog: Double): js.UndefOr[js.Promise[_]] = js.native
    def listen(port: Double, hostname: String, backlog: Double, callback: js.Function0[Unit]): js.UndefOr[js.Promise[_]] = js.native
    
    /**
      * Override this method to handle alias queries.
      * @param {string} alias The queried room alias
      * @param {Function} callback The callback to invoke when complete.
      * @return {Promise} A promise to resolve when complete (if callback isn't supplied)
      */
    def onAliasQuery(alias: String, callback: js.Function0[Unit]): js.Thenable[Unit] | Null = js.native
    
    var onGetRoomAlias: js.Any = js.native
    
    var onGetUsers: js.Any = js.native
    
    var onMorganLog: js.Any = js.native
    
    var onTransaction: js.Any = js.native
    
    /**
      * Override this method to handle user queries.
      * @param {string} userId The queried user ID.
      * @param {Function} callback The callback to invoke when complete.
      * @return {Promise} A promise to resolve when complete (if callback isn't supplied)
      */
    def onUserQuery(userId: String, callback: js.Function0[Unit]): js.Thenable[Unit] | Null = js.native
    
    /**
      * Emitted when an ephemeral event is pushed to the appservice.
      * The format of the event object is documented at
      * https://github.com/matrix-org/matrix-doc/pull/2409
      * @event
      * @example
      * appService.on("ephemeral", function(ev) {
      *   console.log("ID: %s", ev.type);
      * });
      */
    @JSName("on")
    def on_ephemeral(event: ephemeral, cb: js.Function1[/* event */ Record[String, _], Unit]): this.type = js.native
    /**
      * Emitted when an event is pushed to the appservice.
      * The format of the event object is documented at
      * https://matrix.org/docs/spec/application_service/r0.1.2#put-matrix-app-v1-transactions-txnid
      * @event
      * @example
      * appService.on("event", function(ev) {
      *   console.log("ID: %s", ev.event_id);
      * });
      */
    @JSName("on")
    def on_event(event: event, cb: js.Function1[/* event */ Record[String, _], Unit]): this.type = js.native
    /**
      * Emitted when the HTTP listener logs some information.
      * `access_tokens` are stripped from requests
      * @event
      * @example
      * appService.on("http-log", function(line) {
      *   console.log(line);
      * });
      */
    @JSName("on")
    def on_httplog(event: `http-log`, cb: js.Function1[/* line */ String, Unit]): this.type = js.native
    
    var server: js.Any = js.native
    
    /**
      * Set the token that should be used to verify incoming events.
      * @param {string} hsToken The home server token
      */
    def setHomeserverToken(hsToken: String): Unit = js.native
  }
}
