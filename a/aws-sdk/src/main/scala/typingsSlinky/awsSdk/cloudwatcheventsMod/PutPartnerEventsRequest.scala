package typingsSlinky.awsSdk.cloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutPartnerEventsRequest extends js.Object {
  /**
    * The list of events to write to the event bus.
    */
  var Entries: PutPartnerEventsRequestEntryList = js.native
}

object PutPartnerEventsRequest {
  @scala.inline
  def apply(Entries: PutPartnerEventsRequestEntryList): PutPartnerEventsRequest = {
    val __obj = js.Dynamic.literal(Entries = Entries.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutPartnerEventsRequest]
  }
  @scala.inline
  implicit class PutPartnerEventsRequestOps[Self <: PutPartnerEventsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEntries(value: PutPartnerEventsRequestEntryList): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Entries")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

