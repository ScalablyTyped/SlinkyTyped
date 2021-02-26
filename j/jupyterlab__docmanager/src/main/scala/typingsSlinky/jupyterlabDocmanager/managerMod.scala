package typingsSlinky.jupyterlabDocmanager

import typingsSlinky.jupyterlabApputils.sessioncontextMod.ISessionContext.IDialogs
import typingsSlinky.jupyterlabDocmanager.managerMod.DocumentManager.IOptions
import typingsSlinky.jupyterlabDocmanager.tokensMod.IDocumentManager
import typingsSlinky.jupyterlabDocregistry.mod.DocumentRegistry
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IModel
import typingsSlinky.jupyterlabDocregistry.registryMod.DocumentRegistry.IOpenOptions
import typingsSlinky.jupyterlabDocregistry.registryMod.IDocumentWidget
import typingsSlinky.jupyterlabServices.libManagerMod.ServiceManager.IManager
import typingsSlinky.luminoDisposable.mod.IDisposable
import typingsSlinky.luminoSignaling.mod.ISignal
import typingsSlinky.luminoWidgets.mod.Widget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object managerMod {
  
  @JSImport("@jupyterlab/docmanager/lib/manager", "DocumentManager")
  @js.native
  class DocumentManager protected () extends IDocumentManager {
    /**
      * Construct a new document manager.
      */
    def this(options: IOptions) = this()
    
    var _activateRequested: js.Any = js.native
    
    var _autosave: js.Any = js.native
    
    var _autosaveInterval: js.Any = js.native
    
    var _contexts: js.Any = js.native
    
    /**
      * Get the contexts for a given path.
      *
      * #### Notes
      * There may be more than one context for a given path if the path is open
      * with multiple model factories (for example, a notebook can be open with a
      * notebook model factory and a text model factory).
      */
    var _contextsForPath: js.Any = js.native
    
    /**
      * Create a context from a path and a model factory.
      */
    var _createContext: js.Any = js.native
    
    /**
      * Creates a new document, or loads one from disk, depending on the `which` argument.
      * If `which==='create'`, then it creates a new document. If `which==='open'`,
      * then it loads the document from disk.
      *
      * The two cases differ in how the document context is handled, but the creation
      * of the widget and launching of the kernel are identical.
      */
    var _createOrOpenDocument: js.Any = js.native
    
    var _dialogs: js.Any = js.native
    
    /**
      * Find a context for a given path and factory name.
      */
    var _findContext: js.Any = js.native
    
    var _isDisposed: js.Any = js.native
    
    /**
      * Handle an activateRequested signal from the widget manager.
      */
    var _onActivateRequested: js.Any = js.native
    
    /**
      * Handle a context disposal.
      */
    var _onContextDisposed: js.Any = js.native
    
    var _opener: js.Any = js.native
    
    var _setBusy: js.Any = js.native
    
    var _when: js.Any = js.native
    
    /**
      * Get the widget factory for a given widget name.
      */
    var _widgetFactoryFor: js.Any = js.native
    
    var _widgetManager: js.Any = js.native
    
    /**
      * A signal emitted when one of the documents is activated.
      */
    @JSName("activateRequested")
    def activateRequested_MDocumentManager: ISignal[this.type, String] = js.native
    
    /**
      * Determines the time interval for autosave in seconds.
      */
    @JSName("autosaveInterval")
    def autosaveInterval_MDocumentManager: Double = js.native
    
    /**
      * Whether to autosave documents.
      */
    @JSName("autosave")
    def autosave_MDocumentManager: Boolean = js.native
    
    /**
      * Get whether the document manager has been disposed.
      */
    @JSName("isDisposed")
    def isDisposed_MDocumentManager: Boolean = js.native
  }
  object DocumentManager {
    
    /**
      * The options used to initialize a document manager.
      */
    @js.native
    trait IOptions extends StObject {
      
      /**
        * A service manager instance.
        */
      var manager: IManager = js.native
      
      /**
        * A widget opener for sibling widgets.
        */
      var opener: IWidgetOpener = js.native
      
      /**
        * A document registry instance.
        */
      var registry: DocumentRegistry = js.native
      
      /**
        * The provider for session dialogs.
        */
      var sessionDialogs: js.UndefOr[IDialogs] = js.native
      
      /**
        * A function called when a kernel is busy.
        */
      var setBusy: js.UndefOr[js.Function0[IDisposable]] = js.native
      
      /**
        * A promise for when to start using the manager.
        */
      var when: js.UndefOr[js.Promise[Unit]] = js.native
    }
    object IOptions {
      
      @scala.inline
      def apply(manager: IManager, opener: IWidgetOpener, registry: DocumentRegistry): IOptions = {
        val __obj = js.Dynamic.literal(manager = manager.asInstanceOf[js.Any], opener = opener.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      @scala.inline
      implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setManager(value: IManager): Self = StObject.set(x, "manager", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setOpener(value: IWidgetOpener): Self = StObject.set(x, "opener", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setRegistry(value: DocumentRegistry): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSessionDialogs(value: IDialogs): Self = StObject.set(x, "sessionDialogs", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSessionDialogsUndefined: Self = StObject.set(x, "sessionDialogs", js.undefined)
        
        @scala.inline
        def setSetBusy(value: () => IDisposable): Self = StObject.set(x, "setBusy", js.Any.fromFunction0(value))
        
        @scala.inline
        def setSetBusyUndefined: Self = StObject.set(x, "setBusy", js.undefined)
        
        @scala.inline
        def setWhen(value: js.Promise[Unit]): Self = StObject.set(x, "when", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWhenUndefined: Self = StObject.set(x, "when", js.undefined)
      }
    }
    
    /**
      * An interface for a widget opener.
      */
    @js.native
    trait IWidgetOpener extends StObject {
      
      /**
        * Open the given widget.
        */
      def open(widget: IDocumentWidget[Widget, IModel]): Unit = js.native
      def open(widget: IDocumentWidget[Widget, IModel], options: IOpenOptions): Unit = js.native
    }
  }
}
