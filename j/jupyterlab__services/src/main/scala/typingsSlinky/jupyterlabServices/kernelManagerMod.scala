package typingsSlinky.jupyterlabServices

import typingsSlinky.jupyterlabServices.anon.OmitIOptionsmodelserverSe
import typingsSlinky.jupyterlabServices.anon.OmitIOptionsserverSetting
import typingsSlinky.jupyterlabServices.basemanagerMod.BaseManager
import typingsSlinky.jupyterlabServices.kernelKernelMod.IKernelConnection
import typingsSlinky.jupyterlabServices.kernelKernelMod.IManager
import typingsSlinky.jupyterlabServices.kernelManagerMod.KernelManager.IOptions
import typingsSlinky.jupyterlabServices.kernelRestapiMod.IKernelOptions
import typingsSlinky.jupyterlabServices.kernelRestapiMod.IModel
import typingsSlinky.luminoAlgorithm.iterMod.IIterator
import typingsSlinky.luminoPolling.pollMod.Poll.Standby
import typingsSlinky.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object kernelManagerMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.luminoDisposable.mod.IDisposable because Already inherited
  - typingsSlinky.luminoDisposable.mod.IObservableDisposable because Already inherited
  - typingsSlinky.jupyterlabServices.basemanagerMod.IManager because Already inherited
  - typingsSlinky.jupyterlabServices.kernelKernelMod.IManager because var conflicts: connectionFailure, disposed, isDisposed, isReady, ready. Inlined runningChanged, running, refreshRunning, startNew, startNew, startNew, startNew, findById, connectTo, shutdown, shutdownAll */ @JSImport("@jupyterlab/services/lib/kernel/manager", "KernelManager")
  @js.native
  /**
    * Construct a new kernel manager.
    *
    * @param options - The default options for kernel.
    */
  class KernelManager () extends BaseManager {
    def this(options: IOptions) = this()
    
    var _connectionFailure: js.Any = js.native
    
    var _isReady: js.Any = js.native
    
    var _kernelConnections: js.Any = js.native
    
    var _models: js.Any = js.native
    
    var _onDisposed: js.Any = js.native
    
    /**
      * Handle a kernel starting.
      */
    var _onStarted: js.Any = js.native
    
    var _onStatusChanged: js.Any = js.native
    
    var _pollModels: js.Any = js.native
    
    var _ready: js.Any = js.native
    
    var _runningChanged: js.Any = js.native
    
    /**
      * Connect to an existing kernel.
      *
      * @returns The new kernel connection.
      *
      * #### Notes
      * This will use the manager's server settings and ignore any server
      * settings passed in the options.
      */
    def connectTo(options: OmitIOptionsserverSetting): IKernelConnection = js.native
    /**
      * Connect to an existing kernel.
      *
      * @param model - The model of the target kernel.
      *
      * @returns A promise that resolves with the new kernel instance.
      */
    def connectTo(options: typingsSlinky.jupyterlabServices.kernelKernelMod.IKernelConnection.IOptions): IKernelConnection = js.native
    
    /**
      * A signal emitted when there is a connection failure.
      */
    @JSName("connectionFailure")
    def connectionFailure_MKernelManager: ISignal[this.type, js.Error] = js.native
    
    /**
      * Find a kernel by id.
      *
      * @param id - The id of the target kernel.
      *
      * @returns A promise that resolves with the kernel's model.
      */
    /**
      * Find a kernel by id.
      *
      * @param id - The id of the target kernel.
      *
      * @returns A promise that resolves with the kernel's model, or undefined if not found.
      */
    def findById(id: String): js.Promise[js.UndefOr[IModel]] = js.native
    
    /**
      * Test whether the manager is ready.
      */
    @JSName("isReady")
    def isReady_MKernelManager: Boolean = js.native
    
    /**
      * A promise that fulfills when the manager is ready.
      */
    @JSName("ready")
    def ready_MKernelManager: js.Promise[Unit] = js.native
    
    /**
      * Force a refresh of the running kernels.
      *
      * @returns A promise that resolves when the running list has been refreshed.
      *
      * #### Notes
      * This is not typically meant to be called by the user, since the
      * manager maintains its own internal state.
      */
    /**
      * Force a refresh of the running kernels.
      *
      * @returns A promise that resolves when the models are refreshed.
      *
      * #### Notes
      * This is intended to be called only in response to a user action,
      * since the manager maintains its internal state.
      */
    def refreshRunning(): js.Promise[Unit] = js.native
    
    /**
      * Execute a request to the server to poll running kernels and update state.
      */
    /* protected */ def requestRunning(): js.Promise[Unit] = js.native
    
    /**
      * Create an iterator over the most recent running kernels.
      *
      * @returns A new iterator over the running kernels.
      */
    /**
      * Create an iterator over the known running kernels.
      *
      * @returns A new iterator over the running kernels.
      */
    def running(): IIterator[IModel] = js.native
    
    /**
      * A signal emitted when the running kernels change.
      */
    def runningChanged: ISignal[this.type, js.Array[IModel]] = js.native
    /**
      * A signal emitted when the running kernels change.
      */
    @JSName("runningChanged")
    var runningChanged_FKernelManager: ISignal[IManager, js.Array[IModel]] = js.native
    
    /**
      * Shut down a kernel by id.
      *
      * @param id - The id of the target kernel.
      *
      * @returns A promise that resolves when the operation is complete.
      */
    def shutdown(id: String): js.Promise[Unit] = js.native
    
    /**
      * Shut down all kernels.
      *
      * @returns A promise that resolves when all of the kernels are shut down.
      */
    def shutdownAll(): js.Promise[Unit] = js.native
    
    /**
      * Start a new kernel.
      *
      * @param createOptions - The kernel creation options
      *
      * @param connectOptions - The kernel connection options
      *
      * @returns A promise that resolves with the kernel connection.
      *
      * #### Notes
      * The manager `serverSettings` will be always be used.
      */
    def startNew(): js.Promise[IKernelConnection] = js.native
    def startNew(createOptions: js.UndefOr[scala.Nothing], connectOptions: OmitIOptionsmodelserverSe): js.Promise[IKernelConnection] = js.native
    def startNew(createOptions: IKernelOptions): js.Promise[IKernelConnection] = js.native
    def startNew(createOptions: IKernelOptions, connectOptions: OmitIOptionsmodelserverSe): js.Promise[IKernelConnection] = js.native
  }
  object KernelManager {
    
    /**
      * The options used to initialize a KernelManager.
      */
    @js.native
    trait IOptions
      extends typingsSlinky.jupyterlabServices.basemanagerMod.BaseManager.IOptions {
      
      /**
        * When the manager stops polling the API. Defaults to `when-hidden`.
        */
      var standby: js.UndefOr[Standby] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(): IOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setStandby(value: Standby): Self = StObject.set(x, "standby", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStandbyUndefined: Self = StObject.set(x, "standby", js.undefined)
      }
    }
  }
}
