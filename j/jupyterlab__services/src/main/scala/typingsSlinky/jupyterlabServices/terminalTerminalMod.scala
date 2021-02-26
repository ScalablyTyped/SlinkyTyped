package typingsSlinky.jupyterlabServices

import typingsSlinky.jupyterlabServices.anon.OmitIOptionsserverSettingModel
import typingsSlinky.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typingsSlinky.jupyterlabServices.terminalRestapiMod.IModel
import typingsSlinky.jupyterlabServices.terminalTerminalMod.ITerminalConnection.IOptions
import typingsSlinky.luminoAlgorithm.iterMod.IIterator
import typingsSlinky.luminoCoreutils.jsonMod.JSONPrimitive
import typingsSlinky.luminoDisposable.mod.IObservableDisposable
import typingsSlinky.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object terminalTerminalMod {
  
  @JSImport("@jupyterlab/services/lib/terminal/terminal", "isAvailable")
  @js.native
  def isAvailable(): Boolean = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.connected
    - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.connecting
    - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.disconnected
  */
  trait ConnectionStatus extends StObject
  object ConnectionStatus {
    
    @scala.inline
    def connected: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.connected = "connected".asInstanceOf[typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.connected]
    
    @scala.inline
    def connecting: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.connecting = "connecting".asInstanceOf[typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.connecting]
    
    @scala.inline
    def disconnected: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.disconnected = "disconnected".asInstanceOf[typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.disconnected]
  }
  
  @js.native
  trait IManager
    extends typingsSlinky.jupyterlabServices.basemanagerMod.IManager {
    
    def connectTo(options: OmitIOptionsserverSettingModel): ITerminalConnection = js.native
    
    /**
      * Whether the terminal service is available.
      */
    def isAvailable(): Boolean = js.native
    
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
      * Create an iterator over the known running terminals.
      *
      * @returns A new iterator over the running terminals.
      */
    def running(): IIterator[IModel] = js.native
    
    /**
      * A signal emitted when the running terminals change.
      */
    var runningChanged: ISignal[IManager, js.Array[IModel]] = js.native
    
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
      * @param options - The options used to create the session.
      *
      * @returns A promise that resolves with the terminal instance.
      *
      * #### Notes
      * The manager `serverSettings` will be always be used.
      */
    def startNew(): js.Promise[ITerminalConnection] = js.native
    def startNew(options: IOptions): js.Promise[ITerminalConnection] = js.native
  }
  
  @js.native
  trait IMessage extends StObject {
    
    /**
      * The content of the message.
      */
    val content: js.UndefOr[js.Array[JSONPrimitive]] = js.native
    
    /**
      * The type of the message.
      */
    val `type`: MessageType = js.native
  }
  object IMessage {
    
    @scala.inline
    def apply(`type`: MessageType): IMessage = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMessage]
    }
    
    @scala.inline
    implicit class IMessageMutableBuilder[Self <: IMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: js.Array[JSONPrimitive]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setContentVarargs(value: JSONPrimitive*): Self = StObject.set(x, "content", js.Array(value :_*))
      
      @scala.inline
      def setType(value: MessageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ITerminalConnection extends IObservableDisposable {
    
    /**
      * The current connection status of the terminal.
      */
    val connectionStatus: ConnectionStatus = js.native
    
    /**
      * A signal emitted when the terminal connection status changes.
      */
    var connectionStatusChanged: ISignal[this.type, ConnectionStatus] = js.native
    
    /**
      * A signal emitted when a message is received from the server.
      */
    var messageReceived: ISignal[ITerminalConnection, IMessage] = js.native
    
    /**
      * The model associated with the session.
      */
    val model: IModel = js.native
    
    /**
      * Get the name of the terminal session.
      */
    val name: String = js.native
    
    /**
      * Reconnect to the terminal.
      *
      * @returns A promise that resolves when the terminal has reconnected.
      */
    def reconnect(): js.Promise[Unit] = js.native
    
    /**
      * Send a message to the terminal session.
      */
    def send(message: IMessage): Unit = js.native
    
    /**
      * The server settings for the session.
      */
    val serverSettings: ISettings = js.native
    
    /**
      * Shut down the terminal session.
      */
    def shutdown(): js.Promise[Unit] = js.native
  }
  object ITerminalConnection {
    
    @scala.inline
    def apply(
      connectionStatus: ConnectionStatus,
      connectionStatusChanged: ISignal[ITerminalConnection, ConnectionStatus],
      dispose: () => Unit,
      disposed: ISignal[ITerminalConnection, Unit],
      isDisposed: Boolean,
      messageReceived: ISignal[ITerminalConnection, IMessage],
      model: IModel,
      name: String,
      reconnect: () => js.Promise[Unit],
      send: IMessage => Unit,
      serverSettings: ISettings,
      shutdown: () => js.Promise[Unit]
    ): ITerminalConnection = {
      val __obj = js.Dynamic.literal(connectionStatus = connectionStatus.asInstanceOf[js.Any], connectionStatusChanged = connectionStatusChanged.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), disposed = disposed.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], messageReceived = messageReceived.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], reconnect = js.Any.fromFunction0(reconnect), send = js.Any.fromFunction1(send), serverSettings = serverSettings.asInstanceOf[js.Any], shutdown = js.Any.fromFunction0(shutdown))
      __obj.asInstanceOf[ITerminalConnection]
    }
    
    @js.native
    trait IOptions extends StObject {
      
      /**
        * Terminal model.
        */
      var model: IModel = js.native
      
      /**
        * The server settings.
        */
      var serverSettings: js.UndefOr[ISettings] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(model: IModel): IOptions = {
        val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setModel(value: IModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setServerSettings(value: ISettings): Self = StObject.set(x, "serverSettings", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setServerSettingsUndefined: Self = StObject.set(x, "serverSettings", js.undefined)
      }
    }
    
    @scala.inline
    implicit class ITerminalConnectionMutableBuilder[Self <: ITerminalConnection] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnectionStatus(value: ConnectionStatus): Self = StObject.set(x, "connectionStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConnectionStatusChanged(value: ISignal[ITerminalConnection, ConnectionStatus]): Self = StObject.set(x, "connectionStatusChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageReceived(value: ISignal[ITerminalConnection, IMessage]): Self = StObject.set(x, "messageReceived", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModel(value: IModel): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReconnect(value: () => js.Promise[Unit]): Self = StObject.set(x, "reconnect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSend(value: IMessage => Unit): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
      
      @scala.inline
      def setServerSettings(value: ISettings): Self = StObject.set(x, "serverSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShutdown(value: () => js.Promise[Unit]): Self = StObject.set(x, "shutdown", js.Any.fromFunction0(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.stdout
    - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.disconnect
    - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.set_size
    - typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.stdin
  */
  trait MessageType extends StObject
  object MessageType {
    
    @scala.inline
    def disconnect: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.disconnect = "disconnect".asInstanceOf[typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.disconnect]
    
    @scala.inline
    def set_size: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.set_size = "set_size".asInstanceOf[typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.set_size]
    
    @scala.inline
    def stdin: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.stdin = "stdin".asInstanceOf[typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.stdin]
    
    @scala.inline
    def stdout: typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.stdout = "stdout".asInstanceOf[typingsSlinky.jupyterlabServices.jupyterlabServicesStrings.stdout]
  }
}
