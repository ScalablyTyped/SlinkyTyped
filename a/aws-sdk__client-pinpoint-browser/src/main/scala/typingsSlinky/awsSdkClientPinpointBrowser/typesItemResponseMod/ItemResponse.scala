package typingsSlinky.awsSdkClientPinpointBrowser.typesItemResponseMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointItemResponseMod.EndpointItemResponse
import typingsSlinky.awsSdkClientPinpointBrowser.typesEventItemResponseMod.EventItemResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemResponse extends js.Object {
  /**
    * The response received after the endpoint was accepted.
    */
  var EndpointItemResponse: js.UndefOr[
    typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointItemResponseMod.EndpointItemResponse
  ] = js.native
  /**
    * A multipart response object that contains a key and value for each event ID in the request. In each object, the event ID is the key, and an EventItemResponse object is the value.
    */
  var EventsItemResponse: js.UndefOr[
    StringDictionary[EventItemResponse] | (js.Iterable[js.Tuple2[String, EventItemResponse]])
  ] = js.native
}

object ItemResponse {
  @scala.inline
  def apply(): ItemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemResponse]
  }
  @scala.inline
  implicit class ItemResponseOps[Self <: ItemResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpointItemResponse(value: EndpointItemResponse): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointItemResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndpointItemResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EndpointItemResponse")(js.undefined)
        ret
    }
    @scala.inline
    def withEventsItemResponseIterable(value: js.Iterable[js.Tuple2[String, EventItemResponse]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventsItemResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEventsItemResponse(value: StringDictionary[EventItemResponse] | (js.Iterable[js.Tuple2[String, EventItemResponse]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventsItemResponse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEventsItemResponse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("EventsItemResponse")(js.undefined)
        ret
    }
  }
  
}

