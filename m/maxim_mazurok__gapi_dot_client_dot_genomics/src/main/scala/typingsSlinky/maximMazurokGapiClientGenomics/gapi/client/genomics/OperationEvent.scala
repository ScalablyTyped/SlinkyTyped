package typingsSlinky.maximMazurokGapiClientGenomics.gapi.client.genomics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OperationEvent extends js.Object {
  
  /** Required description of event. */
  var description: js.UndefOr[String] = js.native
  
  /** Optional time of when event finished. An event can have a start time and no finish time. If an event has a finish time, there must be a start time. */
  var endTime: js.UndefOr[String] = js.native
  
  /** Optional time of when event started. */
  var startTime: js.UndefOr[String] = js.native
}
object OperationEvent {
  
  @scala.inline
  def apply(): OperationEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationEvent]
  }
  
  @scala.inline
  implicit class OperationEventOps[Self <: OperationEvent] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
}
