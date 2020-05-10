package typingsSlinky.log4js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonWorker extends js.Object {
  var worker: Double = js.native
  var workerId: Double = js.native
}

object AnonWorker {
  @scala.inline
  def apply(worker: Double, workerId: Double): AnonWorker = {
    val __obj = js.Dynamic.literal(worker = worker.asInstanceOf[js.Any], workerId = workerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWorker]
  }
  @scala.inline
  implicit class AnonWorkerOps[Self <: AnonWorker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWorker(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("worker")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkerId(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workerId")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

