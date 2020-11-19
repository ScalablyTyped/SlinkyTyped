package typingsSlinky.jupyterlabServices.sessionSessionMod

import typingsSlinky.jupyterlabServices.anon.OmitIOptionsconnectToKern
import typingsSlinky.jupyterlabServices.anon.OmitIOptionsmodelconnectT
import typingsSlinky.jupyterlabServices.mod.ServerConnection.NetworkError
import typingsSlinky.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typingsSlinky.luminoAlgorithm.iterMod.IIterator
import typingsSlinky.luminoDisposable.mod.IDisposable
import typingsSlinky.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IManager extends IDisposable {
  
  /**
    * Connect to a running session.
    *
    * @param model - The model of the target session.
    *
    * @param options - The session options to use.
    *
    * @returns The new session instance.
    */
  def connectTo(options: OmitIOptionsconnectToKern): ISessionConnection = js.native
  
  /**
    * A signal emitted when there is a connection failure.
    */
  var connectionFailure: ISignal[IManager, NetworkError] = js.native
  
  /**
    * Find a session by id.
    *
    * @param id - The id of the target session.
    *
    * @returns A promise that resolves with the session's model.
    */
  def findById(id: String): js.Promise[js.UndefOr[IModel]] = js.native
  
  /**
    * Find a session by path.
    *
    * @param path - The path of the target session.
    *
    * @returns A promise that resolves with the session's model.
    */
  def findByPath(path: String): js.Promise[js.UndefOr[IModel]] = js.native
  
  /**
    * Test whether the manager is ready.
    */
  val isReady: Boolean = js.native
  
  /**
    * A promise that is fulfilled when the manager is ready.
    */
  val ready: js.Promise[Unit] = js.native
  
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
    * Create an iterator over the known running sessions.
    *
    * @returns A new iterator over the running sessions.
    */
  def running(): IIterator[IModel] = js.native
  
  /**
    * A signal emitted when the running sessions change.
    */
  var runningChanged: ISignal[this.type, js.Array[IModel]] = js.native
  
  /**
    * The server settings for the manager.
    */
  var serverSettings: js.UndefOr[ISettings] = js.native
  
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
    * @param createOptions - Options for creating the session
    *
    * @param connectOptions - Options for connecting to the session
    *
    * @returns A promise that resolves with a session connection instance.
    *
    * #### Notes
    * The `serverSettings` and `connectToKernel` options of the manager will be used.
    */
  def startNew(createOptions: ISessionOptions): js.Promise[ISessionConnection] = js.native
  def startNew(createOptions: ISessionOptions, connectOptions: OmitIOptionsmodelconnectT): js.Promise[ISessionConnection] = js.native
  
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
