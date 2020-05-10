package typingsSlinky.dogapi.mod

import typingsSlinky.dogapi.AnonDatehappened
import typingsSlinky.dogapi.dogapiStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventCreateResponse extends js.Object {
  var event: AnonDatehappened = js.native
  var ok: Boolean = js.native
  var status: ok = js.native
}

object EventCreateResponse {
  @scala.inline
  def apply(event: AnonDatehappened, ok: Boolean, status: ok): EventCreateResponse = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventCreateResponse]
  }
  @scala.inline
  implicit class EventCreateResponseOps[Self <: EventCreateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEvent(value: AnonDatehappened): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("event")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOk(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ok")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStatus(value: ok): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("status")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

