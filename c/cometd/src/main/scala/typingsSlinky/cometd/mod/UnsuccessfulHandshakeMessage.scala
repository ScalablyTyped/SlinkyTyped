package typingsSlinky.cometd.mod

import typingsSlinky.cometd.cometdBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnsuccessfulHandshakeMessage
  extends BaseMessage
     with HandshakeMessage {
  @JSName("error")
  var error_UnsuccessfulHandshakeMessage: String = js.native
  var reestablish: js.UndefOr[scala.Nothing] = js.native
  @JSName("successful")
  var successful_UnsuccessfulHandshakeMessage: `false` = js.native
  var supportedConnectionTypes: js.UndefOr[js.Array[ConnectionType]] = js.native
}

object UnsuccessfulHandshakeMessage {
  @scala.inline
  def apply(channel: String, error: String, successful: `false`): UnsuccessfulHandshakeMessage = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], successful = successful.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsuccessfulHandshakeMessage]
  }
  @scala.inline
  implicit class UnsuccessfulHandshakeMessageOps[Self <: UnsuccessfulHandshakeMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withError(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("error")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccessful(value: `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successful")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReestablish(value: scala.Nothing): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reestablish")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReestablish: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reestablish")(js.undefined)
        ret
    }
    @scala.inline
    def withSupportedConnectionTypes(value: js.Array[ConnectionType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedConnectionTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSupportedConnectionTypes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedConnectionTypes")(js.undefined)
        ret
    }
  }
  
}

