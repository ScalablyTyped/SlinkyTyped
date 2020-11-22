package typingsSlinky.jupyterlabInspector.kernelconnectorMod

import typingsSlinky.jupyterlabInspector.handlerMod.InspectionHandler.IReply
import typingsSlinky.jupyterlabInspector.handlerMod.InspectionHandler.IRequest
import typingsSlinky.jupyterlabInspector.kernelconnectorMod.KernelConnector.IOptions
import typingsSlinky.jupyterlabStatedb.dataconnectorMod.DataConnector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/inspector/lib/kernelconnector", "KernelConnector")
@js.native
class KernelConnector_ protected () extends DataConnector[IReply, Unit, IRequest, String] {
  /**
    * Create a new kernel connector for inspection requests.
    *
    * @param options - The instatiation options for the kernel connector.
    */
  def this(options: IOptions) = this()
  
  var _sessionContext: js.Any = js.native
}
