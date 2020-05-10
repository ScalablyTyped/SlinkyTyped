package typingsSlinky.ontime.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OntimeReport extends js.Object {
  /**
    * Clears timers for scheduling jobs that the ontime instance knows.
    * This does not terminate the current execution of a job; you still need to call ot.done() for that purpose.
    */
  def cancel(): Unit = js.native
  /**
    * Should be called after the job has been finished.
    * This is important especially when single is set to true because scheduling the next run is done in the method.
    */
  def done(): Unit = js.native
}

object OntimeReport {
  @scala.inline
  def apply(cancel: () => Unit, done: () => Unit): OntimeReport = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), done = js.Any.fromFunction0(done))
    __obj.asInstanceOf[OntimeReport]
  }
  @scala.inline
  implicit class OntimeReportOps[Self <: OntimeReport] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCancel(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancel")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withDone(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("done")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

