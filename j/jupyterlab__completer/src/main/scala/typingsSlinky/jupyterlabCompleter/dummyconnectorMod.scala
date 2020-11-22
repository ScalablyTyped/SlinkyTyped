package typingsSlinky.jupyterlabCompleter

import typingsSlinky.jupyterlabCompleter.handlerMod.CompletionHandler.IReply
import typingsSlinky.jupyterlabCompleter.handlerMod.CompletionHandler.IRequest
import typingsSlinky.jupyterlabStatedb.dataconnectorMod.DataConnector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@jupyterlab/completer/lib/dummyconnector", JSImport.Namespace)
@js.native
object dummyconnectorMod extends js.Object {
  
  @js.native
  class DummyConnector () extends DataConnector[IReply, Unit, IRequest, String]
}
