package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodesSubProcess extends js.Object {
  /** Defines the children for BPMN's SubProcess
    * @Default {[]}
    */
  var Processes: js.UndefOr[js.Array[_]] = js.native
  /** Defines whether the BPMN sub process is without any prescribed order or not
    * @Default {false}
    */
  var adhoc: js.UndefOr[Boolean] = js.native
  /** Sets the boundary of the BPMN process
    * @Default {ej.datavisualization.Diagram.BPMNBoundary.Default}
    */
  var boundary: js.UndefOr[BPMNBoundary | String] = js.native
  /** Sets whether the BPMN subprocess is triggered as a collapsed of a specific activity
    * @Default {true}
    */
  var collapsed: js.UndefOr[Boolean] = js.native
  /** Sets whether the BPMN subprocess is triggered as a compensation of a specific activity
    * @Default {false}
    */
  var compensation: js.UndefOr[Boolean] = js.native
  /** Sets the type of the event by which the sub-process will be triggered
    * @Default {ej.datavisualization.Diagram.BPMNEvents.Start}
    */
  var event: js.UndefOr[BPMNEvents | String] = js.native
  /** Defines the collection of events that need to be appended with BPMN Sub-Process
    */
  var events: js.UndefOr[js.Array[NodesSubProcessEvent]] = js.native
  /** Defines the loop type of a sub process.
    * @Default {ej.datavisualization.Diagram.BPMNLoops.None}
    */
  var loop: js.UndefOr[BPMNLoops | String] = js.native
  /** Defines the type of the event trigger
    * @Default {ej.datavisualization.Diagram.BPMNTriggers.Message}
    */
  var trigger: js.UndefOr[BPMNTriggers | String] = js.native
  /** Defines the type of a sub process
    * @Default {ej.datavisualization.Diagram.BPMNSubProcessTypes.None}
    */
  var `type`: js.UndefOr[BPMNSubProcessTypes | String] = js.native
}

object NodesSubProcess {
  @scala.inline
  def apply(): NodesSubProcess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesSubProcess]
  }
  @scala.inline
  implicit class NodesSubProcessOps[Self <: NodesSubProcess] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withProcesses(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Processes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProcesses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Processes")(js.undefined)
        ret
    }
    @scala.inline
    def withAdhoc(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adhoc")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdhoc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adhoc")(js.undefined)
        ret
    }
    @scala.inline
    def withBoundary(value: BPMNBoundary | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundary")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBoundary: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("boundary")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapsed(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapsed: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapsed")(js.undefined)
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
    def withEvent(value: BPMNEvents | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(js.undefined)
        ret
    }
    @scala.inline
    def withEvents(value: js.Array[NodesSubProcessEvent]): Self = {
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
    def withTrigger(value: BPMNTriggers | String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTrigger: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("trigger")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: BPMNSubProcessTypes | String): Self = {
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

