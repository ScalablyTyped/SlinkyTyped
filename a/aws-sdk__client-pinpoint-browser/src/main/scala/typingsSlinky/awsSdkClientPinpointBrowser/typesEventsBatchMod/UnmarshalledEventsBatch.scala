package typingsSlinky.awsSdkClientPinpointBrowser.typesEventsBatchMod

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.awsSdkClientPinpointBrowser.typesEventMod.UnmarshalledEvent
import typingsSlinky.awsSdkClientPinpointBrowser.typesPublicEndpointMod.UnmarshalledPublicEndpoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnmarshalledEventsBatch extends EventsBatch {
  /**
    * The PublicEndpoint attached to the EndpointId from the request.
    */
  @JSName("Endpoint")
  var Endpoint_UnmarshalledEventsBatch: js.UndefOr[UnmarshalledPublicEndpoint] = js.native
  /**
    * An object that contains a set of events associated with the endpoint.
    */
  @JSName("Events")
  var Events_UnmarshalledEventsBatch: js.UndefOr[StringDictionary[UnmarshalledEvent]] = js.native
}

object UnmarshalledEventsBatch {
  @scala.inline
  def apply(): UnmarshalledEventsBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmarshalledEventsBatch]
  }
  @scala.inline
  implicit class UnmarshalledEventsBatchOps[Self <: UnmarshalledEventsBatch] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndpoint(value: UnmarshalledPublicEndpoint): Self = {
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
    def withEvents(value: StringDictionary[UnmarshalledEvent]): Self = {
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

