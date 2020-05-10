package typingsSlinky.browserfs.workerFSMod

import org.scalajs.dom.raw.Worker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkerFSOptions extends js.Object {
  var worker: Worker = js.native
}

object WorkerFSOptions {
  @scala.inline
  def apply(worker: Worker): WorkerFSOptions = {
    val __obj = js.Dynamic.literal(worker = worker.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerFSOptions]
  }
  @scala.inline
  implicit class WorkerFSOptionsOps[Self <: WorkerFSOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWorker(value: Worker): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worker")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

