package typingsSlinky.babylonjs.BABYLON

import org.scalajs.dom.raw.Worker
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkerPool extends IDisposable {
  
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
object WorkerPool {
  
  @scala.inline
  def apply(
    _execute: js.Any,
    _pendingActions: js.Any,
    _workerInfos: js.Any,
    dispose: () => Unit,
    push: js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit] => Unit
  ): WorkerPool = {
    val __obj = js.Dynamic.literal(_execute = _execute.asInstanceOf[js.Any], _pendingActions = _pendingActions.asInstanceOf[js.Any], _workerInfos = _workerInfos.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), push = js.Any.fromFunction1(push))
    __obj.asInstanceOf[WorkerPool]
  }
  
  @scala.inline
  implicit class WorkerPoolMutableBuilder[Self <: WorkerPool] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPush(value: js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit] => Unit): Self = StObject.set(x, "push", js.Any.fromFunction1(value))
    
    @scala.inline
    def set_execute(value: js.Any): Self = StObject.set(x, "_execute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_pendingActions(value: js.Any): Self = StObject.set(x, "_pendingActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_workerInfos(value: js.Any): Self = StObject.set(x, "_workerInfos", value.asInstanceOf[js.Any])
  }
}
