package typingsSlinky.jupyterlabCompleter

import typingsSlinky.jupyterlabCompleter.handlerMod.CompletionHandler.IReply
import typingsSlinky.jupyterlabCompleter.handlerMod.CompletionHandler.IRequest
import typingsSlinky.jupyterlabStatedb.mod.DataConnector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dummyconnectorMod {
  
  @JSImport("@jupyterlab/completer/lib/dummyconnector", "DummyConnector")
  @js.native
  class DummyConnector () extends DataConnector[IReply, Unit, IRequest, String]
}
