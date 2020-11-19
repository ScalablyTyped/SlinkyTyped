package typingsSlinky.gapiClientDataflow.gapi.client.dataflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCurrentNumWorkers(value: String): Self = this.set("currentNumWorkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentNumWorkers: Self = this.set("currentNumWorkers", js.undefined)
    
    @scala.inline
    def setDescription(value: StructuredMessage): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEventType(value: String): Self = this.set("eventType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventType: Self = this.set("eventType", js.undefined)
    
    @scala.inline
    def setTargetNumWorkers(value: String): Self = this.set("targetNumWorkers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetNumWorkers: Self = this.set("targetNumWorkers", js.undefined)
    
    @scala.inline
    def setTime(value: String): Self = this.set("time", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTime: Self = this.set("time", js.undefined)
  }
}
