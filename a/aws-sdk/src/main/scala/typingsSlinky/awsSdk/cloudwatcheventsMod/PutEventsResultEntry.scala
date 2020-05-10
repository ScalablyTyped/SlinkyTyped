package typingsSlinky.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutEventsResultEntry extends js.Object {
  /**
    * The error code that indicates why the event submission failed.
    */
  var ErrorCode: js.UndefOr[typingsSlinky.awsSdk.cloudwatcheventsMod.ErrorCode] = js.native
  /**
    * The error message that explains why the event submission failed.
    */
  var ErrorMessage: js.UndefOr[typingsSlinky.awsSdk.cloudwatcheventsMod.ErrorMessage] = js.native
  /**
    * The ID of the event.
    */
  var EventId: js.UndefOr[typingsSlinky.awsSdk.cloudwatcheventsMod.EventId] = js.native
}

object PutEventsResultEntry {
  @scala.inline
  def apply(): PutEventsResultEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutEventsResultEntry]
  }
  @scala.inline
  implicit class PutEventsResultEntryOps[Self <: PutEventsResultEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withErrorCode(value: ErrorCode): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorCode")(js.undefined)
        ret
    }
    @scala.inline
    def withErrorMessage(value: ErrorMessage): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutErrorMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ErrorMessage")(js.undefined)
        ret
    }
    @scala.inline
    def withEventId(value: EventId): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventId")(js.undefined)
        ret
    }
  }
  
}

