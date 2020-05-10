package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemResponse extends js.Object {
  /**
    * The response that was received after the endpoint data was accepted.
    */
  var EndpointItemResponse: js.UndefOr[typingsSlinky.awsSdk.pinpointMod.EndpointItemResponse] = js.native
  /**
    * A multipart response object that contains a key and a value for each event in the request. In each object, the event ID is the key and an EventItemResponse object is the value.
    */
  var EventsItemResponse: js.UndefOr[MapOfEventItemResponse] = js.native
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
    def withEventsItemResponse(value: MapOfEventItemResponse): Self = {
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

