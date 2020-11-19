package typingsSlinky.offscreenCanvas

import org.scalajs.dom.raw.MessageEvent
import typingsSlinky.std.PostMessageOptions
import typingsSlinky.std.Transferable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("offscreen-canvas/inside-worker", JSImport.Namespace)
@js.native
object insideWorkerMod extends js.Object {
  
  def apply(listener: js.Function1[/* ev */ MessageEvent, _]): WorkerInterface = js.native
  
  @js.native
  trait WorkerInterface extends js.Object {
    
    var isWorker: Boolean = js.native
    
    def post(message: js.Any): Unit = js.native
    def post(message: js.Any, options: PostMessageOptions): Unit = js.native
    def post(message: js.Any, transfer: js.Array[Transferable]): Unit = js.native
  }
}
