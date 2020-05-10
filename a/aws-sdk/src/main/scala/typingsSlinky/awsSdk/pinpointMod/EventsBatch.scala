package typingsSlinky.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventsBatch extends js.Object {
  /**
    * A set of properties and attributes that are associated with the endpoint.
    */
  var Endpoint: PublicEndpoint = js.native
  /**
    * A set of properties that are associated with the event.
    */
  var Events: MapOfEvent = js.native
}

object EventsBatch {
  @scala.inline
  def apply(Endpoint: PublicEndpoint, Events: MapOfEvent): EventsBatch = {
    val __obj = js.Dynamic.literal(Endpoint = Endpoint.asInstanceOf[js.Any], Events = Events.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventsBatch]
  }
  @scala.inline
  implicit class EventsBatchOps[Self <: EventsBatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpoint(value: PublicEndpoint): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Endpoint")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvents(value: MapOfEvent): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Events")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

