package typingsSlinky.awsSdkClientPinpointBrowser.typesEventsRequestMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientPinpointBrowser.typesEventsBatchMod.UnmarshalledEventsBatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledEventsRequest extends EventsRequest {
  /**
    * A batch of events to process. Each BatchItem consists of an endpoint ID as the key, and an EventsBatch object as the value.
    */
  @JSName("BatchItem")
  var BatchItem_UnmarshalledEventsRequest: js.UndefOr[StringDictionary[UnmarshalledEventsBatch]] = js.native
}

object UnmarshalledEventsRequest {
  @scala.inline
  def apply(): UnmarshalledEventsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledEventsRequest]
  }
  @scala.inline
  implicit class UnmarshalledEventsRequestOps[Self <: UnmarshalledEventsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchItem(value: StringDictionary[UnmarshalledEventsBatch]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BatchItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBatchItem: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BatchItem")(js.undefined)
        ret
    }
  }
  
}

