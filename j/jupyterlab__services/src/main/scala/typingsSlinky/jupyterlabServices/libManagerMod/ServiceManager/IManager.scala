package typingsSlinky.jupyterlabServices.libManagerMod.ServiceManager

import typingsSlinky.jupyterlabServices.kernelKernelMod.Kernel.ISpecModels
import typingsSlinky.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typingsSlinky.phosphorDisposable.mod.IDisposable
import typingsSlinky.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A service manager interface.
  */
trait IManager extends IDisposable {
  /**
    * The builder for the manager.
    */
  val builder: typingsSlinky.jupyterlabServices.builderMod.Builder.IManager
  /**
    * A signal emitted when there is a connection failure with the server.
    */
  val connectionFailure: ISignal[IManager, js.Error]
  /**
    * The contents manager for the manager.
    */
  val contents: typingsSlinky.jupyterlabServices.contentsMod.Contents.IManager
  /**
    * Test whether the manager is ready.
    */
  val isReady: Boolean
  /**
    * The nbconvert manager for the manager.
    */
  val nbconvert: typingsSlinky.jupyterlabServices.nbconvertMod.NbConvert.IManager
  /**
    * A promise that fulfills when the manager is initially ready.
    */
  val ready: js.Promise[Unit]
  /**
    * The server settings of the manager.
    */
  val serverSettings: ISettings
  /**
    * The session manager for the manager.
    */
  val sessions: typingsSlinky.jupyterlabServices.sessionSessionMod.Session.IManager
  /**
    * The setting manager for the manager.
    */
  val settings: typingsSlinky.jupyterlabServices.settingMod.Setting.IManager
  /**
    * The kernel spec models.
    */
  val specs: ISpecModels | Null
  /**
    * A signal emitted when the kernel specs change.
    */
  val specsChanged: ISignal[IManager, ISpecModels]
  /**
    * The terminals manager for the manager.
    */
  val terminals: typingsSlinky.jupyterlabServices.terminalTerminalMod.TerminalSession.IManager
  /**
    * The workspace manager for the manager.
    */
  val workspaces: typingsSlinky.jupyterlabServices.workspaceMod.Workspace.IManager
}

object IManager {
  @scala.inline
  def apply(
    builder: typingsSlinky.jupyterlabServices.builderMod.Builder.IManager,
    connectionFailure: ISignal[IManager, js.Error],
    contents: typingsSlinky.jupyterlabServices.contentsMod.Contents.IManager,
    dispose: () => Unit,
    isDisposed: Boolean,
    isReady: Boolean,
    nbconvert: typingsSlinky.jupyterlabServices.nbconvertMod.NbConvert.IManager,
    ready: js.Promise[Unit],
    serverSettings: ISettings,
    sessions: typingsSlinky.jupyterlabServices.sessionSessionMod.Session.IManager,
    settings: typingsSlinky.jupyterlabServices.settingMod.Setting.IManager,
    specsChanged: ISignal[IManager, ISpecModels],
    terminals: typingsSlinky.jupyterlabServices.terminalTerminalMod.TerminalSession.IManager,
    workspaces: typingsSlinky.jupyterlabServices.workspaceMod.Workspace.IManager,
    specs: ISpecModels = null
  ): IManager = {
    val __obj = js.Dynamic.literal(builder = builder.asInstanceOf[js.Any], connectionFailure = connectionFailure.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), isDisposed = isDisposed.asInstanceOf[js.Any], isReady = isReady.asInstanceOf[js.Any], nbconvert = nbconvert.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], serverSettings = serverSettings.asInstanceOf[js.Any], sessions = sessions.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], specsChanged = specsChanged.asInstanceOf[js.Any], terminals = terminals.asInstanceOf[js.Any], workspaces = workspaces.asInstanceOf[js.Any], specs = specs.asInstanceOf[js.Any])
    __obj.asInstanceOf[IManager]
  }
}

