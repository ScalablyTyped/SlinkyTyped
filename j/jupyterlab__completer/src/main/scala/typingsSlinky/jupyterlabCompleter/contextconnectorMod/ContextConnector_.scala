package typingsSlinky.jupyterlabCompleter.contextconnectorMod

import typingsSlinky.jupyterlabCompleter.contextconnectorMod.ContextConnector.IOptions
import typingsSlinky.jupyterlabCompleter.handlerMod.CompletionHandler.IReply
import typingsSlinky.jupyterlabCompleter.handlerMod.CompletionHandler.IRequest
import typingsSlinky.jupyterlabCoreutils.dataconnectorMod.DataConnector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@jupyterlab/completer/lib/contextconnector", "ContextConnector")
@js.native
class ContextConnector_ protected () extends DataConnector[IReply, Unit, IRequest] {
  /**
    * Create a new context connector for completion requests.
    *
    * @param options - The instatiation options for the context connector.
    */
  def this(options: IOptions) = this()
  var _editor: js.Any = js.native
}

