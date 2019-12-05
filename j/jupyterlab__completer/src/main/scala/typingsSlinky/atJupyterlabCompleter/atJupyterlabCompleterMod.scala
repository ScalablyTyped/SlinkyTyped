package typingsSlinky.atJupyterlabCompleter

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.atJupyterlabCompleter.libWidgetMod.Completer.IOptions
import typingsSlinky.atPhosphorCoreutils.atPhosphorCoreutilsMod.Token
import typingsSlinky.atPhosphorMessaging.atPhosphorMessagingMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/completer", JSImport.Namespace)
@js.native
object atJupyterlabCompleterMod extends js.Object {
  @js.native
  class Completer protected ()
    extends typingsSlinky.atJupyterlabCompleter.libWidgetMod.Completer {
    /**
      * Construct a text completer menu widget.
      */
    def this(options: IOptions) = this()
  }
  
  @js.native
  class CompleterModel ()
    extends typingsSlinky.atJupyterlabCompleter.libModelMod.CompleterModel
  
  @js.native
  class CompletionConnector protected ()
    extends typingsSlinky.atJupyterlabCompleter.libConnectorMod.CompletionConnector {
    /**
      * Create a new connector for completion requests.
      *
      * @param options - The instatiation options for the connector.
      */
    def this(options: typingsSlinky.atJupyterlabCompleter.libConnectorMod.CompletionConnector.IOptions) = this()
  }
  
  @js.native
  class CompletionHandler protected ()
    extends typingsSlinky.atJupyterlabCompleter.libHandlerMod.CompletionHandler {
    /**
      * Construct a new completion handler for a widget.
      */
    def this(options: typingsSlinky.atJupyterlabCompleter.libHandlerMod.CompletionHandler.IOptions) = this()
  }
  
  @js.native
  class ContextConnector protected ()
    extends typingsSlinky.atJupyterlabCompleter.libContextconnectorMod.ContextConnector {
    /**
      * Create a new context connector for completion requests.
      *
      * @param options - The instatiation options for the context connector.
      */
    def this(options: typingsSlinky.atJupyterlabCompleter.libContextconnectorMod.ContextConnector.IOptions) = this()
  }
  
  @js.native
  class KernelConnector protected ()
    extends typingsSlinky.atJupyterlabCompleter.libKernelconnectorMod.KernelConnector {
    /**
      * Create a new kernel connector for completion requests.
      *
      * @param options - The instatiation options for the kernel connector.
      */
    def this(options: typingsSlinky.atJupyterlabCompleter.libKernelconnectorMod.KernelConnector.IOptions) = this()
  }
  
  @js.native
  object Completer extends js.Object {
    /**
      * The default implementation of an `IRenderer`.
      */
    @js.native
    class Renderer ()
      extends typingsSlinky.atJupyterlabCompleter.libWidgetMod.Completer.Renderer
    
    /**
      * The default `IRenderer` instance.
      */
    val defaultRenderer: typingsSlinky.atJupyterlabCompleter.libWidgetMod.Completer.Renderer = js.native
  }
  
  @js.native
  object CompletionHandler extends js.Object {
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
  object ICompletionManager
    extends TopLevel[Token[typingsSlinky.atJupyterlabCompleter.libTokensMod.ICompletionManager]]
  
}

