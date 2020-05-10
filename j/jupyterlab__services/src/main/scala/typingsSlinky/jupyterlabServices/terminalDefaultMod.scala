package typingsSlinky.jupyterlabServices

import typingsSlinky.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typingsSlinky.jupyterlabServices.terminalTerminalMod.TerminalSession.IMessage
import typingsSlinky.jupyterlabServices.terminalTerminalMod.TerminalSession.IModel
import typingsSlinky.jupyterlabServices.terminalTerminalMod.TerminalSession.IOptions
import typingsSlinky.jupyterlabServices.terminalTerminalMod.TerminalSession.ISession
import typingsSlinky.phosphorSignaling.mod.ISignal
import typingsSlinky.phosphorSignaling.mod.Signal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/terminal/default", JSImport.Namespace)
@js.native
object terminalDefaultMod extends js.Object {
  @js.native
  class DefaultTerminalSession protected () extends ISession {
    /**
      * Construct a new terminal session.
      */
    def this(name: String) = this()
    def this(name: String, options: IOptions) = this()
    var _disconnected: js.Any = js.native
    /**
      * Connect to the websocket.
      */
    var _initializeSocket: js.Any = js.native
    var _isDisposed: js.Any = js.native
    var _isReady: js.Any = js.native
    var _messageReceived: js.Any = js.native
    var _name: js.Any = js.native
    var _noOp: js.Any = js.native
    var _readyPromise: js.Any = js.native
    var _reconnectAttempt: js.Any = js.native
    var _reconnectLimit: js.Any = js.native
    var _reconnectSocket: js.Any = js.native
    var _terminated: js.Any = js.native
    var _url: js.Any = js.native
    var _ws: js.Any = js.native
    /**
      * A signal emitted when a message is received from the server.
      */
    @JSName("messageReceived")
    val messageReceived_DefaultTerminalSession: ISignal[this.type, IMessage] = js.native
    /**
      * A signal emitted when the session is shut down.
      */
    @JSName("terminated")
    val terminated_DefaultTerminalSession: Signal[this.type, Unit] = js.native
  }
  
  @js.native
  object DefaultTerminalSession extends js.Object {
    def connectTo(name: String): js.Promise[ISession] = js.native
    def connectTo(name: String, options: IOptions): js.Promise[ISession] = js.native
    /**
      * Whether the terminal service is available.
      */
    def isAvailable(): Boolean = js.native
    /**
      * List the running terminal sessions.
      *
      * @param settings - The server settings to use.
      *
      * @returns A promise that resolves with the list of running session models.
      */
    def listRunning(): js.Promise[js.Array[IModel]] = js.native
    def listRunning(settings: ISettings): js.Promise[js.Array[IModel]] = js.native
    /**
      * Shut down a terminal session by name.
      *
      * @param name - The name of the target session.
      *
      * @param settings - The server settings to use.
      *
      * @returns A promise that resolves when the session is shut down.
      */
    def shutdown(name: String): js.Promise[Unit] = js.native
    def shutdown(name: String, settings: ISettings): js.Promise[Unit] = js.native
    /**
      * Shut down all terminal sessions.
      *
      * @param settings - The server settings to use.
      *
      * @returns A promise that resolves when all the sessions are shut down.
      */
    def shutdownAll(): js.Promise[Unit] = js.native
    def shutdownAll(settings: ISettings): js.Promise[Unit] = js.native
    /**
      * Start a new terminal session.
      *
      * @param options - The session options to use.
      *
      * @returns A promise that resolves with the session instance.
      */
    def startNew(): js.Promise[ISession] = js.native
    def startNew(options: IOptions): js.Promise[ISession] = js.native
  }
  
}

