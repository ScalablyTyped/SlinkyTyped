package typingsSlinky.onfleetNodeOnfleet

import typingsSlinky.onfleetNodeOnfleet.workersMod.OnfleetWorker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonWorkers extends js.Object {
  var workers: js.Array[OnfleetWorker] = js.native
}

object AnonWorkers {
  @scala.inline
  def apply(workers: js.Array[OnfleetWorker]): AnonWorkers = {
    val __obj = js.Dynamic.literal(workers = workers.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWorkers]
  }
  @scala.inline
  implicit class AnonWorkersOps[Self <: AnonWorkers] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWorkers(value: js.Array[OnfleetWorker]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

