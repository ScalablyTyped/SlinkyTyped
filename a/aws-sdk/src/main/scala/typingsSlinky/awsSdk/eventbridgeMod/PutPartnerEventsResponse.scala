package typingsSlinky.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutPartnerEventsResponse extends js.Object {
  /**
    * The list of events from this operation that were successfully written to the partner event bus.
    */
  var Entries: js.UndefOr[PutPartnerEventsResultEntryList] = js.native
  /**
    * The number of events from this operation that could not be written to the partner event bus.
    */
  var FailedEntryCount: js.UndefOr[Integer] = js.native
}

object PutPartnerEventsResponse {
  @scala.inline
  def apply(): PutPartnerEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutPartnerEventsResponse]
  }
  @scala.inline
  implicit class PutPartnerEventsResponseOps[Self <: PutPartnerEventsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntries(value: PutPartnerEventsResultEntryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Entries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEntries: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Entries")(js.undefined)
        ret
    }
    @scala.inline
    def withFailedEntryCount(value: Integer): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedEntryCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFailedEntryCount: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FailedEntryCount")(js.undefined)
        ret
    }
  }
  
}

