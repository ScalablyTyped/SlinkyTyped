package typingsSlinky.nodeResque.mod

import typingsSlinky.nodeResque.AnonArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkerStatus extends js.Object {
  var payload: AnonArgs = js.native
  var queue: String = js.native
  var run_at: String = js.native
  var worker: String = js.native
}

object WorkerStatus {
  @scala.inline
  def apply(payload: AnonArgs, queue: String, run_at: String, worker: String): WorkerStatus = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], run_at = run_at.asInstanceOf[js.Any], worker = worker.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerStatus]
  }
  @scala.inline
  implicit class WorkerStatusOps[Self <: WorkerStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withPayload(value: AnonArgs): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withQueue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("queue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRun_at(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("run_at")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorker(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worker")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

