package typingsSlinky.awsSdkClientPinpointBrowser.typesEventsRequestMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientPinpointBrowser.typesEventsBatchMod.EventsBatch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventsRequest extends js.Object {
  /**
    * A batch of events to process. Each BatchItem consists of an endpoint ID as the key, and an EventsBatch object as the value.
    */
  var BatchItem: js.UndefOr[StringDictionary[EventsBatch] | (js.Iterable[js.Tuple2[String, EventsBatch]])] = js.undefined
}

object EventsRequest {
  @scala.inline
  def apply(BatchItem: StringDictionary[EventsBatch] | (js.Iterable[js.Tuple2[String, EventsBatch]]) = null): EventsRequest = {
    val __obj = js.Dynamic.literal()
    if (BatchItem != null) __obj.updateDynamic("BatchItem")(BatchItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventsRequest]
  }
}

