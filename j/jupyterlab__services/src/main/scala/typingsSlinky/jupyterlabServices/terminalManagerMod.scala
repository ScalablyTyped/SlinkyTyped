package typingsSlinky.jupyterlabServices

import typingsSlinky.jupyterlabServices.anon.OmitIOptionsserverSettingModel
import typingsSlinky.jupyterlabServices.basemanagerMod.BaseManager
import typingsSlinky.jupyterlabServices.terminalManagerMod.TerminalManager.IOptions
import typingsSlinky.jupyterlabServices.terminalRestapiMod.IModel
import typingsSlinky.jupyterlabServices.terminalTerminalMod.IManager
import typingsSlinky.jupyterlabServices.terminalTerminalMod.ITerminalConnection
import typingsSlinky.luminoAlgorithm.iterMod.IIterator
import typingsSlinky.luminoPolling.pollMod.Poll.Standby
import typingsSlinky.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object terminalManagerMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.luminoDisposable.mod.IDisposable because Already inherited
  - typingsSlinky.luminoDisposable.mod.IObservableDisposable because Already inherited
  - typingsSlinky.jupyterlabServices.basemanagerMod.IManager because Already inherited
  - typingsSlinky.jupyterlabServices.terminalTerminalMod.IManager because var conflicts: connectionFailure, disposed, isDisposed, isReady, ready. Inlined runningChanged, isAvailable, running, startNew, startNew, connectTo, shutdown, shutdownAll, refreshRunning */ @JSImport("@jupyterlab/services/lib/terminal/manager", "TerminalManager")
  @js.native
  /**
    * Construct a new terminal manager.
    */
  class TerminalManager () extends BaseManager {
    def this(options: IOptions) = this()
    
    var _connectionFailure: js.Any = js.native
    
    var _isReady: js.Any = js.native
    
    /* private */ def _models: js.Any = js.native
    
    var _names: js.Any = js.native
    
    /**
      * Handle a session terminating.
      */
    var _onDisposed: js.Any = js.native
    
    /**
      * Handle a session starting.
      */
    var _onStarted: js.Any = js.native
    
    var _pollModels: js.Any = js.native
    
    var _ready: js.Any = js.native
    
    var _runningChanged: js.Any = js.native
    
    var _terminalConnections: js.Any = js.native
    
    def connectTo(options: OmitIOptionsserverSettingModel): ITerminalConnection = js.native
    
    /**
      * A signal emitted when there is a connection failure.
      */
    @JSName("connectionFailure")
    def connectionFailure_MTerminalManager: ISignal[this.type, js.Error] = js.native
    
    /**
      * Whether the terminal service is available.
      */
    def isAvailable(): Boolean = js.native
    
    /**
      * Test whether the manager is ready.
      */
    @JSName("isReady")
    def isReady_MTerminalManager: Boolean = js.native
    
    /**
      * A promise that fulfills when the manager is ready.
      */
    @JSName("ready")
    def ready_MTerminalManager: js.Promise[Unit] = js.native
    
    /**
      * Force a refresh of the running terminals.
      *
      * @returns A promise that with the list of running terminals.
      *
      * #### Notes
      * This is intended to be called only in response to a user action,
      * since the manager maintains its internal state.
      */
    /**
      * Force a refresh of the running terminal sessions.
      *
      * @returns A promise that with the list of running sessions.
      *
      * #### Notes
      * This is not typically meant to be called by the user, since the
      * manager maintains its own internal state.
      */
    def refreshRunning(): js.Promise[Unit] = js.native
    
    /**
      * Execute a request to the server to poll running terminals and update state.
      */
    /* protected */ def requestRunning(): js.Promise[Unit] = js.native
    
    /**
      * Create an iterator over the most recent running terminals.
      *
      * @returns A new iterator over the running terminals.
      */
    /**
      * Create an iterator over the known running terminals.
      *
      * @returns A new iterator over the running terminals.
      */
    def running(): IIterator[IModel] = js.native
    
    /**
      * A signal emitted when the running terminals change.
      */
    def runningChanged: ISignal[this.type, js.Array[IModel]] = js.native
    /**
      * A signal emitted when the running terminals change.
      */
    @JSName("runningChanged")
    var runningChanged_FTerminalManager: ISignal[IManager, js.Array[IModel]] = js.native
    
    /**
      * Shut down a terminal session by name.
      */
    /**
      * Shut down a terminal session by name.
      *
      * @param name - The name of the terminal session.
      *
      * @returns A promise that resolves when the session is shut down.
      */
    def shutdown(name: String): js.Promise[Unit] = js.native
    
    /**
      * Shut down all terminal sessions.
      *
      * @returns A promise that resolves when all of the sessions are shut down.
      */
    def shutdownAll(): js.Promise[Unit] = js.native
    
    /**
      * Create a new terminal session.
      *
      * @returns A promise that resolves with the terminal instance.
      *
      * #### Notes
      * The manager `serverSettings` will be used unless overridden in the
      * options.
      */
    /**
      * Create a new terminal session.
      *
      * @param options - The options used to create the session.
      *
      * @returns A promise that resolves with the terminal instance.
      *
      * #### Notes
      * The manager `serverSettings` will be always be used.
      */
    def startNew(): js.Promise[ITerminalConnection] = js.native
    def startNew(options: typingsSlinky.jupyterlabServices.terminalTerminalMod.ITerminalConnection.IOptions): js.Promise[ITerminalConnection] = js.native
  }
  object TerminalManager {
    
    /**
      * The options used to initialize a terminal manager.
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
