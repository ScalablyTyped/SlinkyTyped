package typingsSlinky.cometd.mod

import typingsSlinky.cometd.cometdBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SuccessfulHandshakeMessage
  extends BaseMessage
     with HandshakeMessage {
  var authSuccessful: js.UndefOr[`true`] = js.native
  @JSName("clientId")
  var clientId_SuccessfulHandshakeMessage: String = js.native
  var reestablish: Boolean = js.native
  @JSName("successful")
  var successful_SuccessfulHandshakeMessage: `true` = js.native
  var supportedConnectionTypes: js.Array[ConnectionType] = js.native
  @JSName("version")
  var version_SuccessfulHandshakeMessage: String = js.native
}

object SuccessfulHandshakeMessage {
  @scala.inline
  def apply(
    channel: String,
    clientId: String,
    reestablish: Boolean,
    successful: `true`,
    supportedConnectionTypes: js.Array[ConnectionType],
    version: String
  ): SuccessfulHandshakeMessage = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], reestablish = reestablish.asInstanceOf[js.Any], successful = successful.asInstanceOf[js.Any], supportedConnectionTypes = supportedConnectionTypes.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuccessfulHandshakeMessage]
  }
  @scala.inline
  implicit class SuccessfulHandshakeMessageOps[Self <: SuccessfulHandshakeMessage] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withClientId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clientId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withReestablish(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reestablish")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSuccessful(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("successful")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedConnectionTypes(value: js.Array[ConnectionType]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedConnectionTypes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withVersion(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("version")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAuthSuccessful(value: `true`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authSuccessful")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAuthSuccessful: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("authSuccessful")(js.undefined)
        ret
    }
  }
  
}

