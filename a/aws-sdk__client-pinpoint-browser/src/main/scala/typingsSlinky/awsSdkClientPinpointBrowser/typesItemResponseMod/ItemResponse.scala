package typingsSlinky.awsSdkClientPinpointBrowser.typesItemResponseMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointItemResponseMod.EndpointItemResponse
import typingsSlinky.awsSdkClientPinpointBrowser.typesEventItemResponseMod.EventItemResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemResponse extends js.Object {
  /**
    * The response received after the endpoint was accepted.
    */
  var EndpointItemResponse: js.UndefOr[
    typingsSlinky.awsSdkClientPinpointBrowser.typesEndpointItemResponseMod.EndpointItemResponse
  ] = js.undefined
  /**
    * A multipart response object that contains a key and value for each event ID in the request. In each object, the event ID is the key, and an EventItemResponse object is the value.
    */
  var EventsItemResponse: js.UndefOr[
    StringDictionary[EventItemResponse] | (js.Iterable[js.Tuple2[String, EventItemResponse]])
  ] = js.undefined
}

object ItemResponse {
  @scala.inline
  def apply(
    EndpointItemResponse: EndpointItemResponse = null,
    EventsItemResponse: StringDictionary[EventItemResponse] | (js.Iterable[js.Tuple2[String, EventItemResponse]]) = null
  ): ItemResponse = {
    val __obj = js.Dynamic.literal()
    if (EndpointItemResponse != null) __obj.updateDynamic("EndpointItemResponse")(EndpointItemResponse.asInstanceOf[js.Any])
    if (EventsItemResponse != null) __obj.updateDynamic("EventsItemResponse")(EventsItemResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemResponse]
  }
}

