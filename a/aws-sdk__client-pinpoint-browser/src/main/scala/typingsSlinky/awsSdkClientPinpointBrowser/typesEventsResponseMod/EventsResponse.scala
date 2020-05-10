package typingsSlinky.awsSdkClientPinpointBrowser.typesEventsResponseMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientPinpointBrowser.typesItemResponseMod.ItemResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventsResponse extends js.Object {
  /**
    * A map that contains a multipart response for each endpoint. Each item in this object uses the endpoint ID as the key, and the item response as the value.
    *
    * If no item response exists, the value can also be one of the following: 202 (if the request was processed successfully) or 400 (if the payload was invalid, or required fields were missing).
    */
  var Results: js.UndefOr[StringDictionary[ItemResponse] | (js.Iterable[js.Tuple2[String, ItemResponse]])] = js.native
}

object EventsResponse {
  @scala.inline
  def apply(): EventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventsResponse]
  }
  @scala.inline
  implicit class EventsResponseOps[Self <: EventsResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withResultsIterable(value: js.Iterable[js.Tuple2[String, ItemResponse]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withResults(value: StringDictionary[ItemResponse] | (js.Iterable[js.Tuple2[String, ItemResponse]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Results")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutResults: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Results")(js.undefined)
        ret
    }
  }
  
}

