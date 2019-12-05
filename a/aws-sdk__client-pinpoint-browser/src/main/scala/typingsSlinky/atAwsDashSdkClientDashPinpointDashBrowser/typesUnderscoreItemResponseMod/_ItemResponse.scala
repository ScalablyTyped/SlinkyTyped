package typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreItemResponseMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEndpointItemResponseMod._EndpointItemResponse
import typingsSlinky.atAwsDashSdkClientDashPinpointDashBrowser.typesUnderscoreEventItemResponseMod._EventItemResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ItemResponse extends js.Object {
  /**
    * The response received after the endpoint was accepted.
    */
  var EndpointItemResponse: js.UndefOr[_EndpointItemResponse] = js.undefined
  /**
    * A multipart response object that contains a key and value for each event ID in the request. In each object, the event ID is the key, and an EventItemResponse object is the value.
    */
  var EventsItemResponse: js.UndefOr[
    StringDictionary[_EventItemResponse] | (js.Iterable[js.Tuple2[String, _EventItemResponse]])
  ] = js.undefined
}

object _ItemResponse {
  @scala.inline
  def apply(
    EndpointItemResponse: _EndpointItemResponse = null,
    EventsItemResponse: StringDictionary[_EventItemResponse] | (js.Iterable[js.Tuple2[String, _EventItemResponse]]) = null
  ): _ItemResponse = {
    val __obj = js.Dynamic.literal()
    if (EndpointItemResponse != null) __obj.updateDynamic("EndpointItemResponse")(EndpointItemResponse.asInstanceOf[js.Any])
    if (EventsItemResponse != null) __obj.updateDynamic("EventsItemResponse")(EventsItemResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[_ItemResponse]
  }
}

