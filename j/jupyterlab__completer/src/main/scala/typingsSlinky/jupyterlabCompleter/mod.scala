package typingsSlinky.jupyterlabCompleter

import org.scalablytyped.runtime.Shortcut
import typingsSlinky.jupyterlabCompleter.jupyterlabCompleterStrings.ICompletionItemsReply
import typingsSlinky.jupyterlabCompleter.widgetMod.Completer.IOptions
import typingsSlinky.luminoCoreutils.mod.Token
import typingsSlinky.luminoMessaging.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/completer", "Completer")
  @js.native
  class Completer protected ()
    extends typingsSlinky.jupyterlabCompleter.widgetMod.Completer {
    /**
      * Construct a text completer menu widget.
      */
    def this(options: IOptions) = this()
  }
  object Completer {
    
    /**
      * The default implementation of an `IRenderer`.
      */
    @JSImport("@jupyterlab/completer", "Completer.Renderer")
    @js.native
    class Renderer ()
      extends typingsSlinky.jupyterlabCompleter.widgetMod.Completer.Renderer
    
    /**
      * The default `IRenderer` instance.
      */
    @JSImport("@jupyterlab/completer", "Completer.defaultRenderer")
    @js.native
    val defaultRenderer: typingsSlinky.jupyterlabCompleter.widgetMod.Completer.Renderer = js.native
  }
  
  @JSImport("@jupyterlab/completer", "CompleterModel")
  @js.native
  class CompleterModel ()
    extends typingsSlinky.jupyterlabCompleter.modelMod.CompleterModel
  
  @JSImport("@jupyterlab/completer", "CompletionConnector")
  @js.native
  class CompletionConnector protected ()
    extends typingsSlinky.jupyterlabCompleter.connectorMod.CompletionConnector {
    /**
      * Create a new connector for completion requests.
      *
      * @param options - The instatiation options for the connector.
      */
    def this(options: typingsSlinky.jupyterlabCompleter.connectorMod.CompletionConnector.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/completer", "CompletionHandler")
  @js.native
  class CompletionHandler protected ()
    extends typingsSlinky.jupyterlabCompleter.handlerMod.CompletionHandler {
    /**
      * Construct a new completion handler for a widget.
      */
    def this(options: typingsSlinky.jupyterlabCompleter.handlerMod.CompletionHandler.IOptions) = this()
  }
  object CompletionHandler {
    
    @JSImport("@jupyterlab/completer", "CompletionHandler.ICompletionItemsResponseType")
    @js.native
    val ICompletionItemsResponseType: ICompletionItemsReply = js.native
    
    /**
      * A namespace for completion handler messages.
      */
    object Msg {
      
      /**
        * A singleton `'invoke-request'` message.
        */
      @JSImport("@jupyterlab/completer", "CompletionHandler.Msg.InvokeRequest")
      @js.native
      val InvokeRequest: Message = js.native
    }
  }
  
  @JSImport("@jupyterlab/completer", "ContextConnector")
  @js.native
  class ContextConnector protected ()
    extends typingsSlinky.jupyterlabCompleter.contextconnectorMod.ContextConnector {
    /**
      * Create a new context connector for completion requests.
      *
      * @param options - The instatiation options for the context connector.
      */
    def this(options: typingsSlinky.jupyterlabCompleter.contextconnectorMod.ContextConnector.IOptions) = this()
  }
  
  object ICompletionManager extends Shortcut {
    
    @JSImport("@jupyterlab/completer", "ICompletionManager")
    @js.native
    val ^ : Token[typingsSlinky.jupyterlabCompleter.tokensMod.ICompletionManager] = js.native
    
    type _To = Token[typingsSlinky.jupyterlabCompleter.tokensMod.ICompletionManager]
    
    /* This means you don't have to write `^`, but can instead just say `ICompletionManager.foo` */
    override def _to: Token[typingsSlinky.jupyterlabCompleter.tokensMod.ICompletionManager] = ^
  }
  
  @JSImport("@jupyterlab/completer", "KernelConnector")
  @js.native
  class KernelConnector protected ()
    extends typingsSlinky.jupyterlabCompleter.kernelconnectorMod.KernelConnector {
    /**
      * Create a new kernel connector for completion requests.
      *
      * @param options - The instantiation options for the kernel connector.
      */
    def this(options: typingsSlinky.jupyterlabCompleter.kernelconnectorMod.KernelConnector.IOptions) = this()
  }
}
