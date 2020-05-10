package typingsSlinky.jupyterlabServices.sessionManagerMod

import typingsSlinky.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typingsSlinky.jupyterlabServices.sessionManagerMod.SessionManager.IOptions
import typingsSlinky.jupyterlabServices.sessionSessionMod.Session.IManager
import typingsSlinky.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/session/manager", "SessionManager")
@js.native
/**
  * Construct a new session manager.
  *
  * @param options - The default options for each session.
  */
class SessionManager_ () extends IManager {
  def this(options: IOptions) = this()
  var _connectionFailure: js.Any = js.native
  var _isDisposed: js.Any = js.native
  var _isReady: js.Any = js.native
  var _models: js.Any = js.native
  /**
    * Handle a change to a session.
    */
  var _onChanged: js.Any = js.native
  /**
    * Handle a session starting.
    */
  var _onStarted: js.Any = js.native
  /**
    * Handle a session terminating.
    */
  var _onTerminated: js.Any = js.native
  var _pollModels: js.Any = js.native
  var _pollSpecs: js.Any = js.native
  var _ready: js.Any = js.native
  var _runningChanged: js.Any = js.native
  var _sessions: js.Any = js.native
  var _specs: js.Any = js.native
  var _specsChanged: js.Any = js.native
  /**
    * A signal emitted when there is a connection failure.
    */
  @JSName("connectionFailure")
  val connectionFailure_SessionManager_ : ISignal[this.type, js.Error] = js.native
  /**
    * The server settings of the manager.
    */
  @JSName("serverSettings")
  val serverSettings_SessionManager_ : ISettings = js.native
  /**
    * Execute a request to the server to poll running kernels and update state.
    */
  /* protected */ def requestRunning(): js.Promise[Unit] = js.native
  /**
    * Execute a request to the server to poll specs and update state.
    */
  /* protected */ def requestSpecs(): js.Promise[Unit] = js.native
}

