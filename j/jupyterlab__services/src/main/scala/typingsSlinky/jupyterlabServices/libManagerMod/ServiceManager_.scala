package typingsSlinky.jupyterlabServices.libManagerMod

import typingsSlinky.jupyterlabServices.builderMod.BuildManager
import typingsSlinky.jupyterlabServices.contentsMod.ContentsManager
import typingsSlinky.jupyterlabServices.kernelKernelMod.Kernel.ISpecModels
import typingsSlinky.jupyterlabServices.libManagerMod.ServiceManager.IManager
import typingsSlinky.jupyterlabServices.libManagerMod.ServiceManager.IOptions
import typingsSlinky.jupyterlabServices.nbconvertMod.NbConvertManager
import typingsSlinky.jupyterlabServices.sessionMod.SessionManager
import typingsSlinky.jupyterlabServices.settingMod.SettingManager
import typingsSlinky.jupyterlabServices.terminalMod.TerminalManager
import typingsSlinky.jupyterlabServices.workspaceMod.WorkspaceManager
import typingsSlinky.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/manager", "ServiceManager")
@js.native
/**
  * Construct a new services provider.
  */
class ServiceManager_ () extends IManager {
  def this(options: IOptions) = this()
  var _connectionFailure: js.Any = js.native
  var _isDisposed: js.Any = js.native
  var _isReady: js.Any = js.native
  var _onConnectionFailure: js.Any = js.native
  var _readyPromise: js.Any = js.native
  var _specsChanged: js.Any = js.native
  /**
    * The builder for the manager.
    */
  @JSName("builder")
  val builder_ServiceManager_ : BuildManager = js.native
  /**
    * A signal emitted when there is a connection failure with the kernel.
    */
  @JSName("connectionFailure")
  val connectionFailure_ServiceManager_ : ISignal[this.type, js.Error] = js.native
  /**
    * Get the contents manager instance.
    */
  @JSName("contents")
  val contents_ServiceManager_ : ContentsManager = js.native
  /**
    * Get the nbconvert manager instance.
    */
  @JSName("nbconvert")
  val nbconvert_ServiceManager_ : NbConvertManager = js.native
  /**
    * Get the session manager instance.
    */
  @JSName("sessions")
  val sessions_ServiceManager_ : SessionManager = js.native
  /**
    * Get the setting manager instance.
    */
  @JSName("settings")
  val settings_ServiceManager_ : SettingManager = js.native
  /**
    * A signal emitted when the kernel specs change.
    */
  @JSName("specsChanged")
  val specsChanged_ServiceManager_ : ISignal[this.type, ISpecModels] = js.native
  /**
    * Get the terminal manager instance.
    */
  @JSName("terminals")
  val terminals_ServiceManager_ : TerminalManager = js.native
  /**
    * Get the workspace manager instance.
    */
  @JSName("workspaces")
  val workspaces_ServiceManager_ : WorkspaceManager = js.native
}

