package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoscalingEvent extends js.Object {
  /** The current number of workers the job has. */
  var currentNumWorkers: js.UndefOr[String] = js.native
  /**
    * A message describing why the system decided to adjust the current
    * number of workers, why it failed, or why the system decided to
    * not make any changes to the number of workers.
    */
  var description: js.UndefOr[StructuredMessage] = js.native
  /** The type of autoscaling event to report. */
  var eventType: js.UndefOr[String] = js.native
  /** The target number of workers the worker pool wants to resize to use. */
  var targetNumWorkers: js.UndefOr[String] = js.native
  /**
    * The time this event was emitted to indicate a new target or current
    * num_workers value.
    */
  var time: js.UndefOr[String] = js.native
}

object AutoscalingEvent {
  @scala.inline
  def apply(): AutoscalingEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoscalingEvent]
  }
  @scala.inline
  implicit class AutoscalingEventOps[Self <: AutoscalingEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCurrentNumWorkers(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentNumWorkers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCurrentNumWorkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("currentNumWorkers")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: StructuredMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withEventType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventType")(js.undefined)
        ret
    }
    @scala.inline
    def withTargetNumWorkers(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetNumWorkers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTargetNumWorkers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("targetNumWorkers")(js.undefined)
        ret
    }
    @scala.inline
    def withTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(js.undefined)
        ret
    }
  }
  
}

