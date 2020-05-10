package typingsSlinky.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryRecordEntry extends js.Object {
  /**
    * Information about the event.
    */
  var EventInformation: js.UndefOr[typingsSlinky.awsSdk.ec2Mod.EventInformation] = js.native
  /**
    * The event type.
    */
  var EventType: js.UndefOr[FleetEventType] = js.native
  /**
    * The date and time of the event, in UTC format (for example, YYYY-MM-DDTHH:MM:SSZ).
    */
  var Timestamp: js.UndefOr[js.Date] = js.native
}

object HistoryRecordEntry {
  @scala.inline
  def apply(): HistoryRecordEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryRecordEntry]
  }
  @scala.inline
  implicit class HistoryRecordEntryOps[Self <: HistoryRecordEntry] (val x: Self) extends AnyVal {
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
    def withEventType(value: FleetEventType): Self = {
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

