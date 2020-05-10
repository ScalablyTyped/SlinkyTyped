package typingsSlinky.awsSdkClientPinpointBrowser.typesEventsRequestMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientPinpointBrowser.typesEventsBatchMod.EventsBatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventsRequest extends js.Object {
  /**
    * A batch of events to process. Each BatchItem consists of an endpoint ID as the key, and an EventsBatch object as the value.
    */
  var BatchItem: js.UndefOr[StringDictionary[EventsBatch] | (js.Iterable[js.Tuple2[String, EventsBatch]])] = js.native
}

object EventsRequest {
  @scala.inline
  def apply(): EventsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventsRequest]
  }
  @scala.inline
  implicit class EventsRequestOps[Self <: EventsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBatchItemIterable(value: js.Iterable[js.Tuple2[String, EventsBatch]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("BatchItem")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withBatchItem(value: StringDictionary[EventsBatch] | (js.Iterable[js.Tuple2[String, EventsBatch]])): Self = {
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

