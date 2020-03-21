package typingsSlinky.dogapi.mod

import typingsSlinky.dogapi.AnonDatehappened
import typingsSlinky.dogapi.dogapiStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventCreateResponse extends js.Object {
  var event: AnonDatehappened
  var ok: Boolean
  var status: ok
}

object EventCreateResponse {
  @scala.inline
  def apply(event: AnonDatehappened, ok: Boolean, status: ok): EventCreateResponse = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EventCreateResponse]
  }
}

