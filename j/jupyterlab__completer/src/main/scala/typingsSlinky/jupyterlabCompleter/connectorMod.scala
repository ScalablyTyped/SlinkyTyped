package typingsSlinky.jupyterlabCompleter

import typingsSlinky.jupyterlabCompleter.connectorMod.CompletionConnector.IOptions
import typingsSlinky.jupyterlabCompleter.handlerMod.CompletionHandler.IReply
import typingsSlinky.jupyterlabCompleter.handlerMod.CompletionHandler.IRequest
import typingsSlinky.jupyterlabCoreutils.dataconnectorMod.DataConnector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/completer/lib/connector", JSImport.Namespace)
@js.native
object connectorMod extends js.Object {
  @js.native
  class CompletionConnector protected () extends DataConnector[IReply, Unit, IRequest] {
    /**
      * Create a new connector for completion requests.
      *
      * @param options - The instatiation options for the connector.
      */
    def this(options: IOptions) = this()
    var _context: js.Any = js.native
    var _kernel: js.Any = js.native
  }
  
  @js.native
  object CompletionConnector extends js.Object {
    /**
      * The instantiation options for cell completion handlers.
      */
    type IOptions = typingsSlinky.jupyterlabCompleter.kernelconnectorMod.KernelConnector.IOptions with typingsSlinky.jupyterlabCompleter.contextconnectorMod.ContextConnector.IOptions
  }
  
}

