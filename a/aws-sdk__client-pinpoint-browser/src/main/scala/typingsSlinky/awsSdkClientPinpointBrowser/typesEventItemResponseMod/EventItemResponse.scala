package typingsSlinky.awsSdkClientPinpointBrowser.typesEventItemResponseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventItemResponse extends js.Object {
  /**
    * A custom message that is associated with the processing of an event.
    */
  var Message: js.UndefOr[String] = js.native
  /**
    * The status returned in the response as a result of processing the event.
    *
    * Possible values: 400 (for invalid events) and 202 (for events that were accepted).
    */
  var StatusCode: js.UndefOr[Double] = js.native
}

object EventItemResponse {
  @scala.inline
  def apply(): EventItemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventItemResponse]
  }
  @scala.inline
  implicit class EventItemResponseOps[Self <: EventItemResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMessage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Message")(js.undefined)
        ret
    }
    @scala.inline
    def withStatusCode(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusCode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStatusCode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("StatusCode")(js.undefined)
        ret
    }
  }
  
}

