package typingsSlinky.natsHemera.mod

import typingsSlinky.natsHemera.anon.ExpectedMessages
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClientRequest extends js.Object {
  var error: js.Error = js.native
  var pattern: ClientPattern = js.native
  var payload: HemeraMessagePayload = js.native
  var transport: ExpectedMessages = js.native
}

object ClientRequest {
  @scala.inline
  def apply(
    error: js.Error,
    pattern: ClientPattern,
    payload: HemeraMessagePayload,
    transport: ExpectedMessages
  ): ClientRequest = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientRequest]
  }
  @scala.inline
  implicit class ClientRequestOps[Self <: ClientRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: js.Error): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPattern(value: ClientPattern): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pattern")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withPayload(value: HemeraMessagePayload): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("payload")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransport(value: ExpectedMessages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transport")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

