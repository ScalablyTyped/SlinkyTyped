package typingsSlinky.awsSdkClientPinpointBrowser.typesEventsBatchMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientPinpointBrowser.typesEventMod.Event
import typingsSlinky.awsSdkClientPinpointBrowser.typesPublicEndpointMod.PublicEndpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventsBatch extends js.Object {
  /**
    * The PublicEndpoint attached to the EndpointId from the request.
    */
  var Endpoint: js.UndefOr[PublicEndpoint] = js.native
  /**
    * An object that contains a set of events associated with the endpoint.
    */
  var Events: js.UndefOr[StringDictionary[Event] | (js.Iterable[js.Tuple2[String, Event]])] = js.native
}

object EventsBatch {
  @scala.inline
  def apply(): EventsBatch = {
    val __obj = js.Dynamic.literal()
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
    def withoutEndpoint: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Endpoint")(js.undefined)
        ret
    }
    @scala.inline
    def withEventsIterable(value: js.Iterable[js.Tuple2[String, Event]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvents(value: StringDictionary[Event] | (js.Iterable[js.Tuple2[String, Event]])): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Events")(js.undefined)
        ret
    }
  }
  
}

