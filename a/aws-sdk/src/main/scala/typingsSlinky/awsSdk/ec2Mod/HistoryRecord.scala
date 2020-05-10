package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryRecord extends js.Object {
  /**
    * Information about the event.
    */
  var EventInformation: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.EventInformation] = js.native
  /**
    * The event type.    error - An error with the Spot Fleet request.    fleetRequestChange - A change in the status or configuration of the Spot Fleet request.    instanceChange - An instance was launched or terminated.    Information - An informational event.  
    */
  var EventType: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.EventType] = js.native
  /**
    * The date and time of the event, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ).
    */
  var Timestamp: js.UndefOr[js.Date] = js.native
}

object HistoryRecord {
  @scala.inline
  def apply(): HistoryRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryRecord]
  }
  @scala.inline
  implicit class HistoryRecordOps[Self <: HistoryRecord] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventInformation(value: EventInformation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventInformation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventInformation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventInformation")(js.undefined)
        ret
    }
    @scala.inline
    def withEventType(value: EventType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventType")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Timestamp")(js.undefined)
        ret
    }
  }
  
}

