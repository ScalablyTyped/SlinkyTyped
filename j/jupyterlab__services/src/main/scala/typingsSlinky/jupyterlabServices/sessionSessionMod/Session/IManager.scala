package typingsSlinky.jupyterlabServices.sessionSessionMod.Session

import typingsSlinky.jupyterlabServices.kernelKernelMod.Kernel.ISpecModels
import typingsSlinky.jupyterlabServices.mod.ServerConnection.NetworkError
import typingsSlinky.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typingsSlinky.phosphorAlgorithm.iterMod.IIterator
import typingsSlinky.phosphorDisposable.mod.IDisposable
import typingsSlinky.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object which manages session instances.
  *
  * #### Notes
  * The manager is responsible for maintaining the state of running
  * sessions and the initial fetch of kernel specs.
  */
@js.native
trait IManager extends IDisposable {
  /**
    * A signal emitted when there is a connection failure.
    */
  var connectionFailure: ISignal[IManager, NetworkError] = js.native
  /**
    * Test whether the manager is ready.
    */
  val isReady: Boolean = js.native
  /**
    * A promise that is fulfilled when the manager is ready.
    */
  val ready: js.Promise[Unit] = js.native
  /**
    * A signal emitted when the running sessions change.
    */
  var runningChanged: ISignal[this.type, js.Array[IModel]] = js.native
  /**
    * The server settings for the manager.
    */
  var serverSettings: js.UndefOr[ISettings] = js.native
  /**
    * The cached kernel specs.
    *
    * #### Notes
    * This value will be null until the manager is ready.
    */
  val specs: ISpecModels | Null = js.native
  /**
    * A signal emitted when the kernel specs change.
    */
  var specsChanged: ISignal[this.type, ISpecModels] = js.native
  /**
    * Connect to a running session.
    *
    * @param model - The model of the target session.
    *
    * @param options - The session options to use.
    *
    * @returns The new session instance.
    */
  def connectTo(model: IModel): ISession = js.native
  /**
    * Find a session by id.
    *
    * @param id - The id of the target session.
    *
    * @returns A promise that resolves with the session's model.
    */
  def findById(id: String): js.Promise[IModel] = js.native
  /**
    * Find a session by path.
    *
    * @param path - The path of the target session.
    *
    * @returns A promise that resolves with the session's model.
    */
  def findByPath(path: String): js.Promise[IModel] = js.native
  /**
    * Force a refresh of the running sessions.
    *
    * @returns A promise that resolves when the models are refreshed.
    *
    * #### Notes
    * This is intended to be called only in response to a user action,
    * since the manager maintains its internal state.
    */
  def refreshRunning(): js.Promise[Unit] = js.native
  /**
    * Force a refresh of the specs from the server.
    *
    * @returns A promise that resolves when the specs are fetched.
    *
    * #### Notes
    * This is intended to be called only in response to a user action,
    * since the manager maintains its internal state.
    */
  def refreshSpecs(): js.Promise[Unit] = js.native
  /**
    * Create an iterator over the known running sessions.
    *
    * @returns A new iterator over the running sessions.
    */
  def running(): IIterator[IModel] = js.native
  /**
    * Shut down a session by id.
    *
    * @param id - The id of the target kernel.
    *
    * @returns A promise that resolves when the operation is complete.
    */
  def shutdown(id: String): js.Promise[Unit] = js.native
  /**
    * Shut down all sessions.
    *
    * @returns A promise that resolves when all of the sessions are shut down.
    */
  def shutdownAll(): js.Promise[Unit] = js.native
  /**
    * Start a new session.
    *
    * @param options - The session options to use.
    *
    * @returns A promise that resolves with the session instance.
    *
    * #### Notes
    * The `serverSettings` of the manager will be used.
    */
  def startNew(options: IOptions): js.Promise[ISession] = js.native
  /**
    * Find a session associated with a path and stop it is the only session
    * using that kernel.
    *
    * @param path - The path in question.
    *
    * @returns A promise that resolves when the relevant sessions are stopped.
    */
  def stopIfNeeded(path: String): js.Promise[Unit] = js.native
}

object IManager {
  @scala.inline
  def apply(
    connectTo: IModel => ISession,
    connectionFailure: ISignal[IManager, NetworkError],
    dispose: () => Unit,
    findById: String => js.Promise[IModel],
    findByPath: String => js.Promise[IModel],
    isDisposed: Boolean,
    isReady: Boolean,
    ready: js.Promise[Unit],
    refreshRunning: () => js.Promise[Unit],
    refreshSpecs: () => js.Promise[Unit],
    running: () => IIterator[IModel],
    runningChanged: ISignal[IManager, js.Array[IModel]],
    shutdown: String => js.Promise[Unit],
    shutdownAll: () => js.Promise[Unit],
    specsChanged: ISignal[IManager, ISpecModels],
    startNew: IOptions => js.Promise[ISession],
    stopIfNeeded: String => js.Promise[Unit]
  ): IManager = {
    val __obj = js.Dynamic.literal(connectTo = js.Any.fromFunction1(connectTo), connectionFailure = connectionFailure.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), findById = js.Any.fromFunction1(findById), findByPath = js.Any.fromFunction1(findByPath), isDisposed = isDisposed.asInstanceOf[js.Any], isReady = isReady.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], refreshRunning = js.Any.fromFunction0(refreshRunning), refreshSpecs = js.Any.fromFunction0(refreshSpecs), running = js.Any.fromFunction0(running), runningChanged = runningChanged.asInstanceOf[js.Any], shutdown = js.Any.fromFunction1(shutdown), shutdownAll = js.Any.fromFunction0(shutdownAll), specsChanged = specsChanged.asInstanceOf[js.Any], startNew = js.Any.fromFunction1(startNew), stopIfNeeded = js.Any.fromFunction1(stopIfNeeded))
    __obj.asInstanceOf[IManager]
  }
  @scala.inline
  implicit class IManagerOps[Self <: IManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withConnectTo(value: IModel => ISession): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectTo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withConnectionFailure(value: ISignal[IManager, NetworkError]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionFailure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFindById(value: String => js.Promise[IModel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findById")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFindByPath(value: String => js.Promise[IModel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findByPath")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withIsReady(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReady")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReady(value: js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRefreshRunning(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshRunning")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRefreshSpecs(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("refreshSpecs")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRunning(value: () => IIterator[IModel]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("running")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRunningChanged(value: ISignal[IManager, js.Array[IModel]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("runningChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShutdown(value: String => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shutdown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withShutdownAll(value: () => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shutdownAll")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withSpecsChanged(value: ISignal[IManager, ISpecModels]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specsChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStartNew(value: IOptions => js.Promise[ISession]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startNew")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withStopIfNeeded(value: String => js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("stopIfNeeded")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withServerSettings(value: ISettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutServerSettings: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSettings")(js.undefined)
        ret
    }
    @scala.inline
    def withSpecs(value: ISpecModels): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specs")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpecsNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specs")(null)
        ret
    }
  }
  
}

