package typingsSlinky.offscreenCanvas

import org.scalajs.dom.raw.MessageEvent
import typingsSlinky.std.PostMessageOptions
import typingsSlinky.std.Transferable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object insideWorkerMod {
  
  @JSImport("offscreen-canvas/inside-worker", JSImport.Namespace)
  @js.native
  def apply(listener: js.Function1[/* ev */ MessageEvent, _]): WorkerInterface = js.native
  
  @js.native
  trait WorkerInterface extends StObject {
    
    var isWorker: Boolean = js.native
    
    def post(message: js.Any): Unit = js.native
    def post(message: js.Any, options: PostMessageOptions): Unit = js.native
    def post(message: js.Any, transfer: js.Array[Transferable]): Unit = js.native
  }
}
