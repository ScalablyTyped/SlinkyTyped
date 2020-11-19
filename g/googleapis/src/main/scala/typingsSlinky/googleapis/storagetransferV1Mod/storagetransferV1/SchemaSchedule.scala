package typingsSlinky.googleapis.storagetransferV1Mod.storagetransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Transfers can be scheduled to recur or to run just once.
  */
@js.native
trait SchemaSchedule extends js.Object {
  
  /**
    * The last day the recurring transfer will be run. If `scheduleEndDate` is
    * the same as `scheduleStartDate`, the transfer will be executed only once.
    */
  var scheduleEndDate: js.UndefOr[SchemaDate] = js.native
  
  /**
    * The first day the recurring transfer is scheduled to run. If
    * `scheduleStartDate` is in the past, the transfer will run for the first
    * time on the following day. Required.
    */
  var scheduleStartDate: js.UndefOr[SchemaDate] = js.native
  
  /**
    * The time in UTC at which the transfer will be scheduled to start in a
    * day. Transfers may start later than this time. If not specified,
    * recurring and one-time transfers that are scheduled to run today will run
    * immediately; recurring transfers that are scheduled to run on a future
    * date will start at approximately midnight UTC on that date. Note that
    * when configuring a transfer with the Cloud Platform Console, the
    * transfer&#39;s start time in a day is specified in your local timezone.
    */
  var startTimeOfDay: js.UndefOr[SchemaTimeOfDay] = js.native
}
object SchemaSchedule {
  
  @scala.inline
  def apply(): SchemaSchedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSchedule]
  }
  
  @scala.inline
  implicit class SchemaScheduleOps[Self <: SchemaSchedule] (val x: Self) extends AnyVal {
    
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
    def setScheduleEndDate(value: SchemaDate): Self = this.set("scheduleEndDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduleEndDate: Self = this.set("scheduleEndDate", js.undefined)
    
    @scala.inline
    def setScheduleStartDate(value: SchemaDate): Self = this.set("scheduleStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduleStartDate: Self = this.set("scheduleStartDate", js.undefined)
    
    @scala.inline
    def setStartTimeOfDay(value: SchemaTimeOfDay): Self = this.set("startTimeOfDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTimeOfDay: Self = this.set("startTimeOfDay", js.undefined)
  }
}
