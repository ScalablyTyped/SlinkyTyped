package typingsSlinky.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodesSubProcessEvent extends js.Object {
  /** Sets the type of the event by which the sub-process will be triggered
    * @Default {ej.datavisualization.Diagram.BPMNEvents.Start}
    */
  var event: js.UndefOr[BPMNEvents | String] = js.native
  /** A collection of objects where each object represents a label
    * @Default {[]}
    */
  var labels: js.UndefOr[js.Array[_]] = js.native
  /** Sets the name of the BPMN event shape.
    */
  var name: js.UndefOr[String] = js.native
  /** Sets the fraction/ratio(relative to parent) that defines the position of the event shape
    * @Default {ej.datavisualization.Diagram.Point(0.5, 0.5)}
    */
  var offset: js.UndefOr[js.Any] = js.native
  /** An array of objects where each object represents a port
    * @Default {[]}
    */
  var ports: js.UndefOr[js.Array[_]] = js.native
  /** Defines the type of the event trigger
    * @Default {ej.datavisualization.Diagram.BPMNTriggers.Message}
    */
  var trigger: js.UndefOr[BPMNTriggers | String] = js.native
}

object NodesSubProcessEvent {
  @scala.inline
  def apply(): NodesSubProcessEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesSubProcessEvent]
  }
  @scala.inline
  implicit class NodesSubProcessEventOps[Self <: NodesSubProcessEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
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
    def withLabels(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLabels: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("labels")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withOffset(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOffset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("offset")(js.undefined)
        ret
    }
    @scala.inline
    def withPorts(value: js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ports")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPorts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ports")(js.undefined)
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
  }
  
}

