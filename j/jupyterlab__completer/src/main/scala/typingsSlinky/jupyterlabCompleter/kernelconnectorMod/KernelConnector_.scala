package typingsSlinky.jupyterlabCompleter.kernelconnectorMod

import typingsSlinky.jupyterlabCompleter.handlerMod.CompletionHandler.IReply
import typingsSlinky.jupyterlabCompleter.handlerMod.CompletionHandler.IRequest
import typingsSlinky.jupyterlabCompleter.kernelconnectorMod.KernelConnector.IOptions
import typingsSlinky.jupyterlabStatedb.dataconnectorMod.DataConnector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/completer/lib/kernelconnector", "KernelConnector")
@js.native
class KernelConnector_ protected () extends DataConnector[IReply, Unit, IRequest, String] {
  /**
    * Create a new kernel connector for completion requests.
    *
    * @param options - The instantiation options for the kernel connector.
    */
  def this(options: IOptions) = this()
  
  var _session: js.Any = js.native
}
