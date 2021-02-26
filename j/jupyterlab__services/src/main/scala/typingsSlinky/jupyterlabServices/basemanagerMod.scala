package typingsSlinky.jupyterlabServices

import typingsSlinky.jupyterlabServices.basemanagerMod.BaseManager.IOptions
import typingsSlinky.jupyterlabServices.serverconnectionMod.ServerConnection.ISettings
import typingsSlinky.jupyterlabServices.serverconnectionMod.ServerConnection.NetworkError
import typingsSlinky.luminoDisposable.mod.IObservableDisposable
import typingsSlinky.luminoSignaling.mod.ISignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basemanagerMod {
  
  @JSImport("@jupyterlab/services/lib/basemanager", "BaseManager")
  @js.native
  abstract class BaseManager protected () extends IManager {
    def this(options: IOptions) = this()
    
    var _disposed: js.Any = js.native
    
    var _isDisposed: js.Any = js.native
    
    /**
      * A signal emitted when there is a connection failure.
      */
    @JSName("connectionFailure")
    var connectionFailure_BaseManager: ISignal[this.type, js.Error] = js.native
    
    /**
      * A signal emitted when the delegate is disposed.
      */
    @JSName("disposed")
    def disposed_MBaseManager: ISignal[this.type, Unit] = js.native
    
    /**
      * Test whether the delegate has been disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MBaseManager: Boolean = js.native
  }
  object BaseManager {
    
    /**
      * The options used to initialize a SessionManager.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * The server settings for the manager.
        */
      var serverSettings: js.UndefOr[ISettings] = js.native
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
        def setServerSettings(value: ISettings): Self = StObject.set(x, "serverSettings", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setServerSettingsUndefined: Self = StObject.set(x, "serverSettings", js.undefined)
      }
    }
  }
  
  @js.native
  trait IManager extends IObservableDisposable {
    
    /**
      * A signal emitted when there is a connection failure.
      */
    var connectionFailure: ISignal[IManager, NetworkError] = js.native
    
    /**
      * Whether the manager is ready.
      */
    val isReady: Boolean = js.native
    
    /**
      * A promise that resolves when the manager is initially ready.
      */
    val ready: js.Promise[Unit] = js.native
    
    /**
      * The server settings for the manager.
      */
    val serverSettings: ISettings = js.native
  }
  object IManager {
    
    @scala.inline
    def apply(
      connectionFailure: ISignal[IManager, NetworkError],
      dispose: () => Unit,
      disposed: ISignal[IManager, Unit],
      isDisposed: Boolean,
      isReady: Boolean,
      ready: js.Promise[Unit],
      serverSettings: ISettings
    ): IManager = {
      val __obj = js.Dynamic.literal(connectionFailure = connectionFailure.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), disposed = disposed.asInstanceOf[js.Any], isDisposed = isDisposed.asInstanceOf[js.Any], isReady = isReady.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], serverSettings = serverSettings.asInstanceOf[js.Any])
      __obj.asInstanceOf[IManager]
    }
    
    @scala.inline
    implicit class IManagerMutableBuilder[Self <: IManager] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnectionFailure(value: ISignal[IManager, NetworkError]): Self = StObject.set(x, "connectionFailure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsReady(value: Boolean): Self = StObject.set(x, "isReady", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReady(value: js.Promise[Unit]): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerSettings(value: ISettings): Self = StObject.set(x, "serverSettings", value.asInstanceOf[js.Any])
    }
  }
}
