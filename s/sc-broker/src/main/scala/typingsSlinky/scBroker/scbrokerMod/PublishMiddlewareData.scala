package typingsSlinky.scBroker.scbrokerMod

import typingsSlinky.ncom.mod.ComSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublishMiddlewareData extends js.Object {
  var channel: String = js.native
  var command: js.Object = js.native
  var socket: ComSocket = js.native
}

object PublishMiddlewareData {
  @scala.inline
  def apply(channel: String, command: js.Object, socket: ComSocket): PublishMiddlewareData = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishMiddlewareData]
  }
  @scala.inline
  implicit class PublishMiddlewareDataOps[Self <: PublishMiddlewareData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withChannel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("channel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withCommand(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("command")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSocket(value: ComSocket): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("socket")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

