package typingsSlinky.babylonjs

import org.scalajs.dom.raw.Worker
import typingsSlinky.babylonjs.sceneMod.IDisposable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workerPoolMod {
  
  @JSImport("babylonjs/Misc/workerPool", "WorkerPool")
  @js.native
  class WorkerPool protected () extends IDisposable {
    /**
      * Constructor
      * @param workers Array of workers to use for actions
      */
    def this(workers: js.Array[Worker]) = this()
    
    var _execute: js.Any = js.native
    
    var _pendingActions: js.Any = js.native
    
    var _workerInfos: js.Any = js.native
    
    /**
      * Pushes an action to the worker pool. If all the workers are active, the action will be
      * pended until a worker has completed its action.
      * @param action The action to perform. Call onComplete when the action is complete.
      */
    def push(action: js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit]): Unit = js.native
  }
}
