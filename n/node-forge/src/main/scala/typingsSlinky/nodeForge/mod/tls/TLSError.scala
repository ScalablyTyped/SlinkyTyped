package typingsSlinky.nodeForge.mod.tls

import typingsSlinky.nodeForge.nodeForgeStrings.client
import typingsSlinky.nodeForge.nodeForgeStrings.server
import typingsSlinky.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TLSError extends Error {
  var alert: Alert = js.native
  var origin: server | client = js.native
  var send: Boolean = js.native
}

object TLSError {
  @scala.inline
  def apply(alert: Alert, message: String, name: String, origin: server | client, send: Boolean): TLSError = {
    val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], send = send.asInstanceOf[js.Any])
    __obj.asInstanceOf[TLSError]
  }
  @scala.inline
  implicit class TLSErrorOps[Self <: TLSError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlert(value: Alert): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alert")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withOrigin(value: server | client): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("origin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSend(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("send")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

