package typingsSlinky.offscreenCanvas

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.MessageEvent
import typingsSlinky.offscreenCanvas.createWorkerMod.WorkerInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object createWorker {
    
    @JSImport("offscreen-canvas", "createWorker")
    @js.native
    def apply(canvas: HTMLCanvasElement, workerUrl: String, listener: js.Function1[/* ev */ MessageEvent, _]): WorkerInterface = js.native
  }
  
  object insideWorker {
    
    @JSImport("offscreen-canvas", "insideWorker")
    @js.native
    def apply(listener: js.Function1[/* ev */ MessageEvent, _]): typingsSlinky.offscreenCanvas.insideWorkerMod.WorkerInterface = js.native
  }
}
