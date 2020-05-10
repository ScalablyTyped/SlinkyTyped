package typingsSlinky.awsSdk.cloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilteredLogEvent extends js.Object {
  /**
    * The ID of the event.
    */
  var eventId: js.UndefOr[EventId] = js.native
  /**
    * The time the event was ingested, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var ingestionTime: js.UndefOr[Timestamp] = js.native
  /**
    * The name of the log stream to which this event belongs.
    */
  var logStreamName: js.UndefOr[LogStreamName] = js.native
  /**
    * The data contained in the log event.
    */
  var message: js.UndefOr[EventMessage] = js.native
  /**
    * The time the event occurred, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var timestamp: js.UndefOr[Timestamp] = js.native
}

object FilteredLogEvent {
  @scala.inline
  def apply(): FilteredLogEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilteredLogEvent]
  }
  @scala.inline
  implicit class FilteredLogEventOps[Self <: FilteredLogEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventId(value: EventId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("eventId")(js.undefined)
        ret
    }
    @scala.inline
    def withIngestionTime(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ingestionTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIngestionTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ingestionTime")(js.undefined)
        ret
    }
    @scala.inline
    def withLogStreamName(value: LogStreamName): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logStreamName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLogStreamName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("logStreamName")(js.undefined)
        ret
    }
    @scala.inline
    def withMessage(value: EventMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("message")(js.undefined)
        ret
    }
    @scala.inline
    def withTimestamp(value: Timestamp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimestamp: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timestamp")(js.undefined)
        ret
    }
  }
  
}

