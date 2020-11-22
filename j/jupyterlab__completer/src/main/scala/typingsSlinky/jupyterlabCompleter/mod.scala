package typingsSlinky.jupyterlabCompleter

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.jupyterlabCompleter.jupyterlabCompleterStrings.ICompletionItemsReply
import typingsSlinky.jupyterlabCompleter.widgetMod.Completer.IOptions
import typingsSlinky.luminoCoreutils.mod.Token
import typingsSlinky.luminoMessaging.mod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/completer", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class Completer protected ()
    extends typingsSlinky.jupyterlabCompleter.widgetMod.Completer {
    /**
      * Construct a text completer menu widget.
      */
    def this(options: IOptions) = this()
  }
  @js.native
  object Completer extends js.Object {
    
    /**
      * The default `IRenderer` instance.
      */
    val defaultRenderer: typingsSlinky.jupyterlabCompleter.widgetMod.Completer.Renderer = js.native
    
    /**
      * The default implementation of an `IRenderer`.
      */
    @js.native
    class Renderer ()
      extends typingsSlinky.jupyterlabCompleter.widgetMod.Completer.Renderer
  }
  
  @js.native
  class CompleterModel ()
    extends typingsSlinky.jupyterlabCompleter.modelMod.CompleterModel
  
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
  
  @js.native
  class CompletionHandler protected ()
    extends typingsSlinky.jupyterlabCompleter.handlerMod.CompletionHandler {
    /**
      * Construct a new completion handler for a widget.
      */
    def this(options: typingsSlinky.jupyterlabCompleter.handlerMod.CompletionHandler.IOptions) = this()
  }
  @js.native
  object CompletionHandler extends js.Object {
    
    val ICompletionItemsResponseType: ICompletionItemsReply = js.native
    
    /**
      * A namespace for completion handler messages.
      */
    @js.native
    object Msg extends js.Object {
      
      /**
        * A singleton `'invoke-request'` message.
        */
      val InvokeRequest: Message = js.native
    }
  }
  
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
  
  @js.native
  object ICompletionManager
    extends TopLevel[Token[typingsSlinky.jupyterlabCompleter.tokensMod.ICompletionManager]]
  
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
