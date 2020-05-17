package typingsSlinky.babylonjs.BABYLON

import org.scalajs.dom.raw.Worker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class WorkerPoolOps[Self <: WorkerPool] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def with_execute(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_execute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_pendingActions(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_pendingActions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with_workerInfos(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("_workerInfos")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPush(value: js.Function2[/* worker */ Worker, /* onComplete */ js.Function0[Unit], Unit] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

