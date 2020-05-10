package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodesTask extends js.Object {
  /** To set whether the task is a global task or not
    * @Default {false}
    */
  var call: js.UndefOr[Boolean] = js.native
  /** Sets whether the task is triggered as a compensation of another specific activity
    * @Default {false}
    */
  var compensation: js.UndefOr[Boolean] = js.native
  /** Defines the collection of events that need to be appended with BPMN tasks
    */
  var events: js.UndefOr[js.Array[_]] = js.native
  /** Sets the loop type of a BPMN task.
    * @Default {ej.datavisualization.Diagram.BPMNLoops.None}
    */
  var loop: js.UndefOr[BPMNLoops | String] = js.native
  /** Sets the type of the BPMN task.
    * @Default {ej.datavisualization.Diagram.BPMNTasks.None}
    */
  var `type`: js.UndefOr[BPMNTasks | String] = js.native
}

object NodesTask {
  @scala.inline
  def apply(): NodesTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesTask]
  }
  @scala.inline
  implicit class NodesTaskOps[Self <: NodesTask] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCall(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("call")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCall: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("call")(js.undefined)
        ret
    }
    @scala.inline
    def withCompensation(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compensation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCompensation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("compensation")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withLoop(value: BPMNLoops | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLoop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("loop")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: BPMNTasks | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
  }
  
}

