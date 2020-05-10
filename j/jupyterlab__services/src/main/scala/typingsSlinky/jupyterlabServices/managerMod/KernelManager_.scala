package typingsSlinky.jupyterlabServices.managerMod

import typingsSlinky.jupyterlabServices.kernelKernelMod.Kernel.IManager
import typingsSlinky.jupyterlabServices.kernelKernelMod.Kernel.IModel
import typingsSlinky.jupyterlabServices.kernelKernelMod.Kernel.ISpecModels
import typingsSlinky.jupyterlabServices.managerMod.KernelManager.IOptions
import typingsSlinky.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typingsSlinky.phosphorSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/services/lib/kernel/manager", "KernelManager")
@js.native
/**
  * Construct a new kernel manager.
  *
  * @param options - The default options for kernel.
  */
class KernelManager_ () extends IManager {
  def this(options: IOptions) = this()
  var _connectionFailure: js.Any = js.native
  var _isDisposed: js.Any = js.native
  var _isReady: js.Any = js.native
  var _kernels: js.Any = js.native
  var _models: js.Any = js.native
  /**
    * Handle a kernel starting.
    */
  var _onStarted: js.Any = js.native
  /**
    * Handle a kernel terminating.
    */
  var _onTerminated: js.Any = js.native
  var _pollModels: js.Any = js.native
  var _pollSpecs: js.Any = js.native
  var _ready: js.Any = js.native
  var _runningChanged: js.Any = js.native
  var _specs: js.Any = js.native
  var _specsChanged: js.Any = js.native
  /**
    * A signal emitted when there is a connection failure.
    */
  @JSName("connectionFailure")
  val connectionFailure_KernelManager_ : ISignal[this.type, js.Error] = js.native
  /**
    * A signal emitted when the running kernels change.
    */
  @JSName("runningChanged")
  val runningChanged_KernelManager_ : ISignal[this.type, js.Array[IModel]] = js.native
  /**
    * The server settings for the manager.
    */
  @JSName("serverSettings")
  val serverSettings_KernelManager_ : ISettings = js.native
  /**
    * A signal emitted when the specs change.
    */
  @JSName("specsChanged")
  val specsChanged_KernelManager_ : ISignal[this.type, ISpecModels] = js.native
  /**
    * Execute a request to the server to poll running kernels and update state.
    */
  /* protected */ def requestRunning(): js.Promise[Unit] = js.native
  /**
    * Execute a request to the server to poll specs and update state.
    */
  /* protected */ def requestSpecs(): js.Promise[Unit] = js.native
}

