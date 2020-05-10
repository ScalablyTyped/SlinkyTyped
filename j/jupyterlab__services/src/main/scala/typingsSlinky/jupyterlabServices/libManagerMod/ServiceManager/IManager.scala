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
@js.native
trait IManager extends IDisposable {
  /**
    * The builder for the manager.
    */
  val builder: typingsSlinky.jupyterlabServices.builderMod.Builder.IManager = js.native
  /**
    * A signal emitted when there is a connection failure with the server.
    */
  val connectionFailure: ISignal[IManager, js.Error] = js.native
  /**
    * The contents manager for the manager.
    */
  val contents: typingsSlinky.jupyterlabServices.contentsMod.Contents.IManager = js.native
  /**
    * Test whether the manager is ready.
    */
  val isReady: Boolean = js.native
  /**
    * The nbconvert manager for the manager.
    */
  val nbconvert: typingsSlinky.jupyterlabServices.nbconvertMod.NbConvert.IManager = js.native
  /**
    * A promise that fulfills when the manager is initially ready.
    */
  val ready: js.Promise[Unit] = js.native
  /**
    * The server settings of the manager.
    */
  val serverSettings: ISettings = js.native
  /**
    * The session manager for the manager.
    */
  val sessions: typingsSlinky.jupyterlabServices.sessionSessionMod.Session.IManager = js.native
  /**
    * The setting manager for the manager.
    */
  val settings: typingsSlinky.jupyterlabServices.settingMod.Setting.IManager = js.native
  /**
    * The kernel spec models.
    */
  val specs: ISpecModels | Null = js.native
  /**
    * A signal emitted when the kernel specs change.
    */
  val specsChanged: ISignal[IManager, ISpecModels] = js.native
  /**
    * The terminals manager for the manager.
    */
  val terminals: typingsSlinky.jupyterlabServices.terminalTerminalMod.TerminalSession.IManager = js.native
  /**
    * The workspace manager for the manager.
    */
  val workspaces: typingsSlinky.jupyterlabServices.workspaceMod.Workspace.IManager = js.native
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
    workspaces: typingsSlinky.jupyterlabServices.workspaceMod.Workspace.IManager
  ): IManager = {
    val __obj = js.Dynamic.literal(builder = builder.asInstanceOf[js.Any], connectionFailure = connectionFailure.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), isDisposed = isDisposed.asInstanceOf[js.Any], isReady = isReady.asInstanceOf[js.Any], nbconvert = nbconvert.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], serverSettings = serverSettings.asInstanceOf[js.Any], sessions = sessions.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], specsChanged = specsChanged.asInstanceOf[js.Any], terminals = terminals.asInstanceOf[js.Any], workspaces = workspaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[IManager]
  }
  @scala.inline
  implicit class IManagerOps[Self <: IManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBuilder(value: typingsSlinky.jupyterlabServices.builderMod.Builder.IManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("builder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withConnectionFailure(value: ISignal[IManager, js.Error]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("connectionFailure")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withContents(value: typingsSlinky.jupyterlabServices.contentsMod.Contents.IManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("contents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsReady(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isReady")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNbconvert(value: typingsSlinky.jupyterlabServices.nbconvertMod.NbConvert.IManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("nbconvert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReady(value: js.Promise[Unit]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withServerSettings(value: ISettings): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serverSettings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSessions(value: typingsSlinky.jupyterlabServices.sessionSessionMod.Session.IManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSettings(value: typingsSlinky.jupyterlabServices.settingMod.Setting.IManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("settings")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSpecsChanged(value: ISignal[IManager, ISpecModels]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("specsChanged")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTerminals(value: typingsSlinky.jupyterlabServices.terminalTerminalMod.TerminalSession.IManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("terminals")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkspaces(value: typingsSlinky.jupyterlabServices.workspaceMod.Workspace.IManager): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workspaces")(value.asInstanceOf[js.Any])
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

