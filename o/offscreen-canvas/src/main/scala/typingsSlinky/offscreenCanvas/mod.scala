package typingsSlinky.offscreenCanvas

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.MessageEvent
import typingsSlinky.offscreenCanvas.createWorkerMod.WorkerInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("offscreen-canvas", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object createWorker extends js.Object {
    
    def apply(canvas: HTMLCanvasElement, workerUrl: String, listener: js.Function1[/* ev */ MessageEvent, _]): WorkerInterface = js.native
  }
  
  @js.native
  object insideWorker extends js.Object {
    
    def apply(listener: js.Function1[/* ev */ MessageEvent, _]): typingsSlinky.offscreenCanvas.insideWorkerMod.WorkerInterface = js.native
  }
}
