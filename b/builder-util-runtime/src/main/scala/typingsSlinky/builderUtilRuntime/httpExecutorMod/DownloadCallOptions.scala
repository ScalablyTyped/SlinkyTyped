package typingsSlinky.builderUtilRuntime.httpExecutorMod

import typingsSlinky.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DownloadCallOptions extends js.Object {
  
  def callback(): Unit = js.native
  def callback(error: js.Error): Unit = js.native
  
  var destination: String | Null = js.native
  
  def onCancel(callback: js.Function0[Unit]): Unit = js.native
  
  var options: DownloadOptions = js.native
  
  var responseHandler: (js.Function2[
    /* response */ IncomingMessage, 
    /* callback */ js.Function1[/* error */ js.Error | Null, Unit], 
    Unit
  ]) | Null = js.native
}
